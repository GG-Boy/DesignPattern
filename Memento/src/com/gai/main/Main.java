package com.gai.main;

import com.gai.memento.GameRole;
import com.gai.memento.RoleStateCaretaker;

public class Main {

	public static void main(String[] args) {
		//大战boss前
		GameRole gr = new GameRole();
		gr.getInitState();
		gr.stateDisplay();
		//保存进度
//		GameRole backup = new GameRole();
//		backup.setVit(gr.getVit());
//		backup.setAtk(gr.getAtk());
//		backup.setDef(gr.getDef());
		RoleStateCaretaker stateCaretaker = new RoleStateCaretaker();
		stateCaretaker.setMemento(gr.saveState());
		//大战boss时，损耗严重
		gr.fight();
		gr.stateDisplay();
		//恢复之前状态
//		gr.setVit(backup.getVit());
//		gr.setAtk(backup.getAtk());
//		gr.setDef(backup.getDef());
		gr.recoveryState(stateCaretaker.getMemento());
		gr.stateDisplay();
	}

}
