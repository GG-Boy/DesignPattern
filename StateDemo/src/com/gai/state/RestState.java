package com.gai.state;

import com.gai.work.Work;
//下班休息状态
public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
			System.out.println("当前时间："+w.getHour()+"点	下班回家啦");
	}

}
