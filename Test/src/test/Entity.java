package test;

abstract class Entity {
	
	int hp;
	int attack;
	int bullet;
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int newHp) {
		this.hp = newHp;
	}
	
	public int getAttack(){
		return this.attack;
	}
	
	public void setAttack(int newAttack) {
		this.hp = newAttack;
	}
	
	public int getBullet(){
		return this.bullet;
	}
	
	public void setBullet(int newBullet) {
		this.hp = bullet;
	}
}
