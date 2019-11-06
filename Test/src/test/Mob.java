package test;

public class Mob extends Entity {
	
	
	public Mob(int pdv, int attack, int bullet) {
		this.hp = pdv;
		this.attack = attack;
		this.bullet = bullet;
	}
	
	
	public void attack(Entity enemy) {
		this.setHp(this.getHp()+2);
		enemy.setHp(enemy.getHp()-this.getAttack());
		System.out.println("vous perdez" + this.getAttack() + "hp");
	}
	public void reload() {
		this.bullet =+ 1;
	}
	public int rng() {
		int random = (int )(Math.random() * 3 + 1);
		return random;
	}
}
