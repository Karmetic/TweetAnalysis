import java.util.ArrayList;

public class Tweet implements Comparable<Tweet>{
		private long tweet_id;
		private int polarity;
		private String user_name;
		private ArrayList<String> tweet_text;
		
		public Tweet(int polar, long id, String user) {
			polarity = polar;
			tweet_id = id;
			user_name = user;
			tweet_text = new ArrayList<String>();
		}
		
		public int compareTo(Tweet o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}

}
