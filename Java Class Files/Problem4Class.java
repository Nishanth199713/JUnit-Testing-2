package Homework5;

public class Problem4Class {

	public enum state {Start,S0,S1,S2,S3};
	
	private state nextState;
	private String D;
	private boolean G;

	public void gasPump(state currentState, boolean C, boolean H, boolean N, boolean S, boolean X) {
		switch (currentState) {
			case Start: {setD("Welcome");G=false;nextState=state.S0;break;}
			case S0: 	{if (S)
							{setD("Ready");G=false;nextState=state.S1;}
						else
							{setD("Welcome");G=false;nextState=state.S0;}
						}
						break;
			case S1:	{if (N)
							{setD("Dispensing");G=false;nextState=state.S2;}
						else
							{setD("Ready");G=false;nextState=state.S1;}
						break;}
			case S2:	{if (!N)
							{setD("Ready");G=false;nextState=state.S1;}
						else 
							if (H)
								{setD("Dispensing");G=true;nextState=state.S2;}
							else
								if (X)
									{setD("Please Pay Cashier");G=false;nextState=state.S3;}
								else
									{setD("Dispensing");G=false;nextState=state.S2;}
							}
						break;
			case S3:	{if (C)
							{setD("Welcome");G=false;nextState=state.S0;}
						else
							{setD("Please Pay Cashier");G=false;nextState=state.S3;}
						}
						break;
		}
	}
		public String getD() {
			return D;
		}

		public void setD(String d) {
			D = d;
		}

		public boolean isG() {
			return G;
		}

		public void setG(boolean g) {
			G = g;
		}

		public state getNextState() {
			return nextState;
		}
		public void setNextState(state nextState) {
			this.nextState = nextState;
		}
}