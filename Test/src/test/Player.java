package test;

public class Perso extends Entity {

		
		public Perso(int pdv, int att, int balles) {
			this.hp = pdv;
			this.att = att;
			this.balles = balles;
		}
		
		
		public void attaque(Entity enemy, AttaqueStrat regenos) {
			
			this.sethp(this.gethp()+regenos.getValue());
			enemy.sethp(enemy.gethp()-this.getatt());
			int att = this.getatt();
			
			System.out.println("l'enemi à perdu" + att + "hp");
		}
		public void recharge() {
			this.balles =+ 1;
		}
}
