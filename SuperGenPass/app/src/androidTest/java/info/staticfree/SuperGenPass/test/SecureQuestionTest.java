package info.staticfree.SuperGenPass.test;

import junit.framework.TestCase;

import info.staticfree.SuperGenPass.SecureQuestion;

public class SecureQuestionTest extends TestCase {
    private SecureQuestion sq;

    public void setUp() throws Exception {
        super.setUp();
        sq = new SecureQuestion();
    }

    public void testVerify() {
        assertEquals(true, sq.verify("wdy"));
    }

    //public void testVerify2()throws Exception{
        //(true, sq.verify("WDY"));
    //}
}