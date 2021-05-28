package Homework5;

public class Problem1Class {
	
	boolean redLight, yellowLight, greenLight;
	int timer;

	public void setWarnings (boolean cruiseEngaged, double distance) {
//		redLight=yellowLight=greenLight=false;
		if (cruiseEngaged) {
			greenLight= (distance > 500.0);
			yellowLight=(distance <= 500.0) && (distance > 75.0);
			redLight=(distance < 150.0) && ((distance >= 50.0) || (timer != 1));
			timer = (distance >= 50.0) ? timer: timer==1 ? 0:1;
		}
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}
}