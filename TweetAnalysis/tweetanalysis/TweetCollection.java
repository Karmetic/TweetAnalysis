package tweetanalysis;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TweetCollection {
	static ArrayList<Tweet> tweetCollection = new ArrayList<Tweet>();
	
	//Reads the datafile line by line and splits the data into an array for each part of the tweet that's being read
	public void TweetData() throws IOException {
		String tc;
		BufferedReader br = new BufferedReader(new FileReader("./trainingProcessed.txt"));
		String [] tokenizedTweet;
		int i = 0;
		while ((tc = br.readLine()) != null) { //Reads data from the txt file line by line and parses the important data out
			tokenizedTweet = tc.split(",");
			Tweet tw = new Tweet(Integer.parseInt(tokenizedTweet[0]), Long.parseLong(tokenizedTweet[1]), tokenizedTweet[2], tokenizedTweet[3]);
			tweetCollection.add(tw);
			i++;
		  }
		
		br.close();
	}
	
	public void TweetAdd(Tweet T)
	{
		tweetCollection.add(T);
	}
	
	public void TweetRemove(Tweet T)
	{
		tweetCollection.remove(T);

	}

	//Gets Tweet using a passed in ID, essentially creates a temporary tweet that only has the ID passed in, and finds where
	//a tweet with that same ID is in the ArrayList, it then fetches the tweet at that location and prints it
	public Tweet getTweet(long idTarget) {
		int index2 = tweetCollection.indexOf(new Tweet(0, idTarget, null, null)); 
		  if (index2 > -1) { 
		   Tweet searched = tweetCollection.get(index2); 
		   System.out.println(searched);
		   return searched;
		  } 
		  else 
		   System.out.println("Tweet not found\n");
		 
		  return null;
	}
	
	//Similar to get with ID, creates a temp tweet with just username passed, it then uses an enhanced
	//for loop to go through tweet by tweet and see if the usernames are equal, if they are, it prints the tweet.
	public void UserSearch(String userName) {
		  int runCheck = 0;
		for(Object T: tweetCollection) {
			  Tweet tempTweet = new Tweet(0, 0, userName, null);
			  if (tempTweet.equals(T))
			  {
				  System.out.print(T);
				  System.out.print("\n");
				  runCheck = runCheck + 1;
			  }
		  } 
			   if (runCheck == 0) {
		System.out.println("User not found");
			   }
	}
	
	//Simply calls a toString that I made that only sends back ids.
	public void IdCollection() {
		for(Object T: tweetCollection) {
			System.out.println((((Tweet) T).idToString()));
		}
	}
	
	public int TweetPrediction() {
		return 4;
	}
	
	public int AccuracyCheck() {
		return 50;
	}
	
	public void TweetUpdate(Tweet T) {
		try(FileWriter fw = new FileWriter("trainingProcesed.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(T.toString());
			    System.out.print("Tweet Added to text file successfully!");
			   
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		
		
	}
}
