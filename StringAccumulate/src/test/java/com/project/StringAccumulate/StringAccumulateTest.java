package com.project.StringAccumulate;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringAccumulateTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringAccumulateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StringAccumulateTest.class );
    }
    
    @org.junit.Test
    public void testStringAccumulateValid() throws Exception {
    	StringAccumulate sa = new StringAccumulate();
        Assert.assertNotNull(sa.add("//*|$\n1*2$3"));
        //Assert.assertNull(sa.add("1\n2,-3"));
    }
    
    @org.junit.Test
    public void testStringAccumulateNotValid() throws Exception {
    	try {
    		StringAccumulate sa = new StringAccumulate();
            Assert.assertNull(sa.add("1\n2,-3"));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
