package Homework3;

public class FullfeldgeClass extends ThisAbstract implements BestworldIneterface  {

	private static final int Healh = 0;
	private int Health;
	private String Wealth; 
	private String Love;
	private String Happiness;

	
	public int age(int a, int b, int c){
		int total = a + b - c;
		return total;
	}
	
	public int getHealth() {
		return Health;
	}


	public void setHealth(int Health) {
		this.Health = Health;
	}


	public String getWealth() {
		return Wealth;
	}


	public void setWealth(String Wealth) {
		this.Wealth = Wealth;
	}


	public String getLove() {
		return Love;
	}


	public void setLove(String Love) {
		this.Love = Love;
	}


	public String getHappiness() {
		return Happiness;
	}


	public void setHappiness(String Happiness) {
		this.Happiness = Happiness;
	}
	
	public void Life() {
		System.out.println("Hi I'm life and I'm a beautiful lie");
		
	}

	
	public void Death() {
		System.out.println("I'm the truth that no one likes");
		
	}

	
	public void Hereafter() {
		System.out.println("Garden underneath which rivers flow");
		
	}
	
}
