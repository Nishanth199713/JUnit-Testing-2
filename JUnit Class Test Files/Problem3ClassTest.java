package Homework5;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)

public class Problem3ClassTest {
	Problem3Class obj3;
	@Before
	public void setUp() throws Exception {
		obj3 = new Problem3Class();
	}

	@FileParameters("src/Homework5/Problem3TestCaseTable.csv")
	@Test
	public void testfor3(int testCaseNo,double total,boolean existingMember,boolean	validDiscount,	boolean validCoupon	,double discount, double result, String bpNumber,String MCDC) {

		assertEquals(result,obj3.calcTotal(total,existingMember,validDiscount,validCoupon),0.005);
	}

}