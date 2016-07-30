package Homework3;

import java.util.Scanner;

public class JavaMethod {
	public static void main(String[] args) {

	
		FullfeldgeClass temp = new FullfeldgeClass();
		temp.Death();
		temp.Life();
		temp.Hereafter();
		temp.WelcomeLife();
		temp.ViturousDeath();

		System.out.println(" ");

		// this is encapsulation
		temp.setHappiness("this color is blue");
		temp.setLove("once again, I'm setting this to hi");
		temp.setWealth("this color is set to red");
		temp.setHealth(200);
		System.out.println(temp.getHappiness() + " " + temp.getHealth() + " " + temp.getWealth() + " " + temp.getLove());

		System.out.println(" ");
		
		GrandChild inherit = new GrandChild();
		inherit.eyecolor();
		inherit.Height();

		System.out.println(" ");


		FullfeldgeClass calculation = new FullfeldgeClass();
		int cage1 = calculation.age(10, 20, 30);
		System.out.println(cage1);
		int cage2 = calculation.age(40, 50, 60);
		System.out.println(cage2);
		int cage3 = calculation.age(70, 80, 90);
		System.out.println(cage3);

		System.out.println(" ");

		// This is an example of Final
		VeryFinal finale = new VeryFinal();
		// Final.cantChangeThis();
		int canitchangen = finale.WontChange;
		char[] wontchange;
		System.out.println("wontchange");
		VeryFinal finale2 = new VeryFinal();
		System.out.println(finale2.WontChange);
		int didntChange = finale.WontChange;
		// f2.cantChangeThis = 30; This can't be set as 30 because it's final is
		// 20
		System.out.println(didntChange);
		System.out.println(finale.WontChange);

		System.out.println(" ");

		// This an example of Super

		Super s1 = new Super();
		SuperSub s2 = new SuperSub();

		s1.getMessage();
		s2.SadMessage();

		s1.setMessage(" got mail");
		s2.setMessage("new mail");

	
		System.out.println(" ");

		// this is a logical statement example

		int num1 = 55;
		int num2 = 25;
		int num3 = 40;
		int num4 = 10;

		if (num2 < num1) {
			System.out.println(num2 + " is lesser than " + num1);
		}
		if (num3 == num4) {
			System.out.println(num1 + " is equal to " + num2);

		} else if (num1 < num2) {
			System.out.println(num1 + " is more than " + num2);
		}

		System.out.println(" ");
		System.out.println( "count to 79 and then stop");
		
		for (int loop1 = 1; loop1 < 80; loop1++)
			System.out.println(loop1);

		
		int loop2 = 60;
		while (loop2 < 100) {
			System.out.println(loop2);
			loop2++;
		}

		// do while
		int loop3 = 20;
		do {
			System.out.println("false");
		} while (loop3 < 0);
		

		
		
		int e3= 100;
		
		try{
			
			int divide = e3/20;
			System.out.println(divide);
		
		}catch(Exception ex){
			System.out.println("you can't dvided by zero");
		}
		
		
		
		ScannerInUse result = new ScannerInUse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age between 10-100: ");
		String agetype = sc.nextLine();
		String result1 = result1.getscannerinuse(agetype);
		System.out.println(result1);
		
	
	}
}
