package com.gai.state;

import com.gai.work.Work;
//晚间工作状态
public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.isFinished()) {
			w.setState(new RestState());
			w.writeProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("当前时间："+w.getHour()+"点	加班哦，疲累至极");
			} else {
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}
