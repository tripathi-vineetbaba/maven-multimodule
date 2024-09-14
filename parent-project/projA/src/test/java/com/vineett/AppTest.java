package com.vineett;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
        public void testApp1()
    {
        System.out.println("This is projA AppTest - Test1");
    }
    
        public void testApp2()
    {
        System.out.println("This is projA AppTest - Test2");
    }
    
        public void testApp3()
    {
        System.out.println("This is projA AppTest - Test3");
    }
}
