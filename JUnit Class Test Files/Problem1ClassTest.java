package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	Problem1Class prob1;
	
	@Before
	public void setUp() throws Exception {
		prob1 = new Problem1Class();
	}

	@FileParameters("src/Homework5/Problem1TestCaseTable.csv")
	@Test
		public void testDetermine(int testCaseNo, boolean cruiseEngaged,double distance,int timer, boolean expRed, 
				boolean expYellow, boolean expGreen,int exptimer)
		{
	
	//prb1.setGreenLight(expGreen);
	//prb1.setRedLight(expRed);

	//prb1.setYellowLight(expYellow);
	prob1.setTimer(timer);
	prob1.setWarnings(cruiseEngaged, distance);
	assertEquals(expRed,prob1.isRedLight());
	assertEquals(expYellow,prob1.isYellowLight());
	assertEquals(expGreen,prob1.isGreenLight());
	assertEquals(exptimer,prob1.getTimer());


	}
}