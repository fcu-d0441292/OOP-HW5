package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random a=new Random();
		int b;
		b= a.nextInt(2);
		if(b==0){
			p1.setCp(p1.getCp()+500);
			System.out.println("Winner is \""+p1.getName()+"\"");
		}else if(b==1){
			p2.setCp(p2.getCp()+500);
			System.out.println("Winner is \""+p2.getName()+"\"");
		}
	}

}
