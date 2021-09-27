package tweetanalysis;
import java.util.ArrayList;

public class Tweet{
		private long tweet_id;
		private int polarity;
		private String user_name;
		private String tweet_text;
		
		public Tweet(){ //Default Constructor
			this.polarity = 0;
			this.tweet_id = 0;
			this.user_name = "";
			this.tweet_text = "";
		}
		
		public Tweet(int polar, long id, String user, String tweet_contents) {
			this.polarity = polar;
			this.tweet_id = id;
			this.user_name = user;
			this.tweet_text = tweet_contents;
		}
		
		public boolean equals (Object rhs) {
		if(tweet_id != 0)
			return tweet_id == ((Tweet)rhs).tweet_id;
		else
			return user_name.equals((((Tweet)rhs).user_name));
		
		}
		
			
		public long getTweet_id() {
			return tweet_id;
		}

		public void setTweet_id(long tweet_id) {
			this.tweet_id = tweet_id;
		}

		public int getPolarity() {
			return polarity;
		}

		public void setPolarity(int polarity) {
			this.polarity = polarity;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getTweet_text() {
			return tweet_text;
		}

		public void setTweet_text(String tweet_content) {
			this.tweet_text = tweet_content;
		}
		
		public String toString() {
			return polarity+" "+tweet_id+" "+user_name+" "+tweet_text;
		}
		
		public String idToString() {
			return tweet_id+" ";
		}
		
		
		
	}
