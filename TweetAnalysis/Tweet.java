import java.util.ArrayList;

public class Tweet{
		private long tweet_id;
		private int polarity;
		private String user_name;
		private String tweet_text;
		
		public Tweet(){ //Default Constructor
			polarity = 0;
			tweet_id = 0;
			user_name = "";
			tweet_text = "";
		}
		
		public Tweet(int polar, long id, String user, String tweet_contents) {
			polarity = polar;
			tweet_id = id;
			user_name = user;
			tweet_text = tweet_contents;
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
		
		
		
	}

}
