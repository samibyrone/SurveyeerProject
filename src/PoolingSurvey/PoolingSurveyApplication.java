package PoolingSurvey;

public class PoolingSurveyApplication {

        private final String[] TOPICS;
        private final int[][] RESPONSES = new int[5][10];

        public PoolingSurveyApplication () {
            TOPICS = new String[] {"Education", "Health Sector", "Science", "Art", "Commerce"};
        }


        public String[] getTopics() {
            return TOPICS;
        }

        public int[][] getResponse() {
            return RESPONSES;
        }

        public void RateIssue(int issue, int rating) {
            issue = issue - 1;
            int[] issueToRate = RESPONSES[issue];
            rating = rating - 1;
            issueToRate[rating] = ++issueToRate[rating];
        }

}
