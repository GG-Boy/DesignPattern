package com.gai.work;

import com.gai.state.ForenoonState;
import com.gai.state.State;

public class Work {

	private State current;
	private double hour;
	private boolean finished;
	
	public Work() {//工作初始状态极为上午工作状态
		current = new ForenoonState();
	}

	public void  writeProgram() {
		current.writeProgram(this);
	}
	
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public void setState(State current) {
		this.current = current;
	}
	
}
