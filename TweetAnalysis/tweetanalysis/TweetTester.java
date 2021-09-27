//Ian Fields
//9/27/2021
//Java Tweet Database project
package tweetanalysis;

import java.io.IOException;
import java.util.Scanner;

public class TweetTester {

	public static void main(String[] args) {
		try {
			TweetCollection.TweetData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Shows getTweet by Id functionality by passing in an ID and returning a full tweet
		TweetCollection.getTweet(1467810369);
		
		//Shows tweet manipulation functionality by allowing a user to manually create a tweet (remove function to be improved in later projects)
		{
			//Object creation for scanner and tweet class
			Scanner sc = new Scanner(System.in);
			Tweet tw = new Tweet();
			
			//Variable Declaration
			long ID;
			String userName;
			String tweetText;
			
			System.out.print("Enter in a tweet in the following format: ");
			System.out.print("\n");
			System.out.println("Enter Tweet ID: "); //Entering in a User ID is obviously something that would be randomly, using because I'm tight on time
			tw.setTweet_id(ID = sc.nextLong());
			System.out.println("Enter UserName: ");
			tw.setUser_name(userName = sc.next());
			System.out.println("Enter tweet contents: ");
			tw.setTweet_text(tweetText = sc.next());
			
			TweetCollection.TweetManipulation(tw);
			sc.close();
		}
		
		//Space before username retrieval
		System.out.print("\n");
		
		//Shows username search functionality by passing in a user name and printing all of their tweets
		System.out.println("Currently performing hardcode user search for user: mikecog");
		TweetCollection.UserSearch("mikecog");
		System.out.print("\n");
		
		System.out.print("All Ids currently being retrieved, please wait one moment...");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Shows ID collection functionally by displaying all possible ID's
		TweetCollection.IdCollection();
		System.out.print("\n");
		
		//Shows single tweet prediction functionality by returning "AI's" prediction of a tweet
		System.out.print("Tweet Judged as: " + TweetCollection.TweetPrediction() + " level polarity.");
		System.out.print("\n");
		
		//Shows an overall accuracy check of the full Tweet collection
		System.out.print("The total accuracy of all tweets based on prediction is " + TweetCollection.AccuracyCheck() + "%");
	}
}
