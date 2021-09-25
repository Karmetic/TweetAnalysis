package tweetanalysis;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TweetCollection {
	
	public static void TweetData() throws IOException {
		String tc;
		BufferedReader br = new BufferedReader(new FileReader("./trainingProcessed.txt"));
		ArrayList<Tweet> tweetCollection = new ArrayList<Tweet>();
		String [] tokenizedTweet;
		
		while ((tc = br.readLine()) != null) {
			tokenizedTweet = tc.split(",");
			Tweet tw = new Tweet(Integer.parseInt(tokenizedTweet[0]), Long.parseLong(tokenizedTweet[1]), tokenizedTweet[2], tokenizedTweet[3]);
			tweetCollection.add(tw);
		  }
		
		br.close();
	
		
	}
	
	public void TweetManipulation() {
		
	}

	public void IdSearch() {
		
	}
	
	public void UserSearch() {
		
	}
	
	public void IdCollection() {
		
	}
	
	public void TweetPrediction() {
		
	}
	
	public void AccuracyCheck() {
		
	}
	
	public void TweetUpdate() {
		
	}
}
