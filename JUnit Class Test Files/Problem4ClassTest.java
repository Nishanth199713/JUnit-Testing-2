package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework5.Problem4Class.state;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class prb4;
	
	@Before
	public void setUp() throws Exception {
		prb4 = new Problem4Class();
	}

	@FileParameters("src/Homework5/Problem4TestCaseTable.csv")
	@Test
		public void testDetermine(int testCaseNo, state currentState, 
				boolean C, boolean H, boolean N, boolean S, boolean X,String D,boolean G,state nextState )
		{
	
		prb4.setD("");
		if (H && N) 
		{
			prb4.setG(false);
		}else
		{
			prb4.setG(true);
		}
		
		prb4.setNextState(state.Start);
	prb4.gasPump( currentState, C, H, N, S, X);
	assertEquals(D,prb4.getD());
	assertEquals(G,prb4.isG());
	assertEquals(nextState,prb4.getNextState());
	


	}
}