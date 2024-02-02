package samplecode;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LearningMavenTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LearningMavenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LearningMavenTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLearningMaven()
    {
        assertTrue( true );
    }

}
