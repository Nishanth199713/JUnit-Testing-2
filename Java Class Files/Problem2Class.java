package Homework5;

public class Problem2Class {

	private boolean memberBonus;
	private double total;

	public void determineMemberBonus (double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, double taxRate) {
		double discount;
		if (cart < 250.00)
			discount = 0.00;
		else
			if (cart <= 750.00)
				discount = 0.050;
			else
				if (cart < 1_200.00)
					discount = 0.075;
				else
					if (cart <= 1_750.00)
						discount = 0.100;
					else
						discount = 0.125;
		total = (1+taxRate)*cart*(1.0-discount);
		
		memberBonus = firstTimeBuyer || goldStatus || (cart > 2_500.00 && bonusPoints > 250);	
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isMemberBonus() {
		return memberBonus;
	}
	public void setMemberBonus(boolean memberBonus) {
		this.memberBonus = memberBonus;
	}
}