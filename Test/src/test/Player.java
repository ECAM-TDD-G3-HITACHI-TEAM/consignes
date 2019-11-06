package test;

public class Player extends Entity {

		
		public Player(int pdv, int attack, int bullet) {
			this.hp = pdv;
			this.attack = attack;
			this.bullet = bullet;
		}
		
		public void attack(Entity enemy, AttaqueStrat regen) {
			
			this.setHp(this.getHp()+regen.getValue());
			enemy.setHp(enemy.getHp()-this.getAttack());
			int attack = this.getAttack();
			System.out.println("l'enemi à perdu" + attack + "hp");
		}
		
		public void reload() {
			this.bullet =+ 1;
		}
}
