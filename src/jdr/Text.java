package jdr;

import java.util.Scanner;

import entity.Monster;

public class Text {
    public static void text_intro() throws InterruptedException {
    	System.out.println("\n");
    	System.out.println("\n");
    	System.out.println("-------------------------------------------------------------|");
          System.out.print("| Welcome to the wolrd of ATTEND, you and your friend decide |"
          			   + "\n| to go to a famous donjon called the 'PFFFF DONJON' this    |"
          		       + "\n| donjon is famous cause of his danger                       |");
    	System.out.println("\n-------------------------------------------------------------|");
    	System.out.println("\n");
    	System.out.println("\n");
    	System.out.println("press enter to continue");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
    	System.out.println("\n");
    	System.out.println("\n");
    }
    public static String ActionList(){
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("What action do you want to do ?");
        System.out.println("- move(up,right,down,left)");
        System.out.println("- inventory");
        System.out.println("- map info");
        System.out.println("- leave (the game)");
        String str = sc.nextLine();
		return str;
    }
    public static char StartFightMessage(Monster monster) {
    	String nom = monster.getName(); 
		 char premierCaractere = nom.charAt(0);

		 if(premierCaractere == 'S') {
			 System.out.print("\n");
			 System.out.println("Oh no ! a slime block your way !");
		 }
		 else if(premierCaractere == 'D') {
			 System.out.print("\n");
			 System.out.println("Oh no ! a Dragon block your way !");
		 }
		 else if(premierCaractere == 'M') {
			 System.out.print("\n");
			 System.out.println("You found the secret boss the mother of death");
		 }
		 else if(premierCaractere == 'W') {
			 System.out.print("\n");
			 System.out.println("Oh no ! An angry wolf block you way !");
		 }
		 return premierCaractere;
    }
}