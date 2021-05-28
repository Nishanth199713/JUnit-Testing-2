package Homework5;

public class Problem3Class {

	public double calcTotal (double total, boolean existingMember, boolean validDiscount, boolean validCoupon) {
		double discount;	
		if (total >= 500.00)
			discount = 0.0750;
		else
			if (total > 375.00)
				discount = 0.050;
			else
				if (total >= 250.00)
					discount = 0.0250;
				else
					discount = 0.0125;
	return (existingMember && (validDiscount || validCoupon)) ? (total * (1-discount) * 1.0825):total * 1.0825 ;
	}
}