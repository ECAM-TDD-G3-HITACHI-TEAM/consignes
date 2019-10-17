package test;

public class Mob extends Entity {
	
	
	public Mob(int pdv, int att, int balles) {
		this.hp = pdv;
		this.att = att;
		this.balles = balles;
	}
	
	
	public void attaque(Entity enemy) {
		
		this.sethp(this.gethp()+2);
		enemy.sethp(enemy.gethp()-this.getatt());
		System.out.println("vous perdez" + this.getatt() + "hp");
	}
	public void recharge() {
		this.balles =+ 1;
	}
	public int rng() {
		int random = (int )(Math.random() * 3 + 1);
		return random;
	}
}
