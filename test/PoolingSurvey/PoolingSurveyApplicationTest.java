package PoolingSurvey;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PoolingSurveyApplicationTest {

        private final PoolingSurveyApplication pollingApplication = new PoolingSurveyApplication();

        @Test
        public void test_that_PollingApplication_exists() {
            assertNotNull(pollingApplication);
        }

        @Test
        public void test_that_PollingApplication_Has_Five_Issues() {
            String [] topics = pollingApplication.getTopics();
            assertEquals(5, topics.length);
        }

        @Test
        public void test_that_PollingApplication_Issues_exists() {
            String [] topics = pollingApplication.getTopics();
            for(String topic : topics) {
                assertNotNull(topic);
            }
        }

        @Test
        public void test_that_PollingApplication_Has_5By10_Tables_For_Responses() {
            int[][] responses = pollingApplication.getResponse();
            assertEquals(5, responses.length);
            for(int[] response : responses) {
                assertNotNull(response);
            }
        }

        @Test
    public void test_that_PollingApplication_Can_Store_Polling_Response() {
        pollingApplication.RateIssue(5, 8);
        pollingApplication.RateIssue(3, 2);
        pollingApplication.RateIssue(4, 1);
        int[][] responses = pollingApplication.getResponse();
        int fifthIssuesResponse = responses[4][7];
        assertEquals(1, fifthIssuesResponse);
        int thirdIssuesResponse = responses[2][1];
        assertEquals(1, thirdIssuesResponse);
        int fourthIssuesResponse = responses[3][0];
        assertEquals(1, fourthIssuesResponse);

        pollingApplication.RateIssue(5, 8);
        fifthIssuesResponse = responses[4][7];
        assertEquals(2, fifthIssuesResponse);

        pollingApplication.RateIssue(3, 2);
        thirdIssuesResponse = responses[2][1];
        assertEquals(2, thirdIssuesResponse);

        pollingApplication.RateIssue(4, 1);
        fourthIssuesResponse = responses[3][0];
        assertEquals(2, fourthIssuesResponse);
    }

}
