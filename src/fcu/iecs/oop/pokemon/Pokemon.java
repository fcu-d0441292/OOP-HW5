package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	
	Pokemon(String name , int cp){
		this.name=name;
		this.cp=cp;
	}

	public String getName() {
		return this.name;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	
}
