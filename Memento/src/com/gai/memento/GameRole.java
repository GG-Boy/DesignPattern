package com.gai.memento;
/**
 * 游戏角色类
 */
public class GameRole {

	private int vit;//生命力
	private int atk;//攻击力
	private int def;//防御力
	
	//状态显示
	public void stateDisplay() {
		System.out.println("角色当前状态：");
		System.out.println("体力： "+vit);
		System.out.println("攻击力： "+vit);
		System.out.println("防御力： "+vit);
	}
	
	//获得初始状态
	public void getInitState() {
		vit = 100;
		atk = 100;
		def = 100;
	}
	
	//战斗
	public void fight() {
		vit = 0;
		atk = 0;
		def = 0;
	}
	
	//保存角色状态
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);
	}
	
	//恢复角色状态
	public void recoveryState(RoleStateMemento memento) {
		vit = memento.getVit();
		atk = memento.getAtk();
		def = memento.getDef();
	}
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
}
