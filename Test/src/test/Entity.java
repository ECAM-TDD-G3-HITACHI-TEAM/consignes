package test;

abstract class Entity {
	int hp;
	int att;
	int balles;
	
	
	
	public int gethp(){
		return this.hp;
	}
	public void sethp(int newhp) {
		this.hp = newhp;
	}
	
	public int getatt(){
		return this.att;
	}
	public void setatt(int newatt) {
		this.hp = newatt;
	}
	
	public int getballes(){
		return this.balles;
	}
	public void setballes(int newballes) {
		this.hp = balles;
	}
}
