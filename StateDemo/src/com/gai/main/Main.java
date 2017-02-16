package com.gai.main;

import com.gai.work.Work;

public class Main {

	public static void main(String[] args) {
		Work emergencyProject = new Work();
		emergencyProject.setHour(9);
		emergencyProject.writeProgram();
		emergencyProject.setHour(12);
		emergencyProject.writeProgram();
		emergencyProject.setHour(13);
		emergencyProject.writeProgram();
		emergencyProject.setFinished(false);
		emergencyProject.setHour(20);
		emergencyProject.writeProgram();
		emergencyProject.setHour(22);
		emergencyProject.writeProgram();
	}
	
}
