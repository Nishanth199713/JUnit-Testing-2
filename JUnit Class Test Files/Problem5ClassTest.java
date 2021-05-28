package Homework5;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest { 


	Problem5Class obj5;
	Problem5ServerData mockobj;
	double total;
	
	@Before
	public void setUp() throws Exception {
		
		obj5 = new Problem5Class();
		mockobj = EasyMock.createStrictMock(Problem5ServerData.class);
		
	}
	
	@Test
	@FileParameters("src/Homework5/Problem5TestCaseTable.csv")
	
	
	public void testfor3(int testCaseNo,double total,boolean existingMember,boolean	validDiscount,	boolean validCoupon	,double discount, double result, String bpNumber,String MCDC) {


	
		EasyMock.expect(mockobj.getTotal()).andReturn(total);
		EasyMock.replay(mockobj);
	
		assertEquals(result,obj5.calcTotal(mockobj, existingMember, validDiscount, validCoupon),0.005);	
	}

}
