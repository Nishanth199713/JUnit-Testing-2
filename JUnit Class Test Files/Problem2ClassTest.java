package Homework5;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {
	Problem2Class obj2;

	@Before
	public void setUp() throws Exception {
		obj2 = new Problem2Class();

	}

	@FileParameters("src/Homework5/Problem2TestCaseTable.csv")
	@Test
	public void testfor2(int testCaseNo,double cart,boolean firsttimeBuyer,boolean	goldStatus,	int bonusPoints,double taxRate, double discount,double total,boolean memberBon, String bpNumber,String MCDC) {

		obj2.determineMemberBonus(cart, firsttimeBuyer, goldStatus,  bonusPoints,  taxRate);

		assertEquals(total,obj2.getTotal(),0.005);
		assertEquals(memberBon,obj2.isMemberBonus());

	}

}