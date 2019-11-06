package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player Jack = new Player(100, 10, 0);
		Mob skel = new Mob(30,10,0);
		Game game = new Game(skel, Jack);
		game.Loop(Jack);
	}

}
