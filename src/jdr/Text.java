package jdr;

import java.util.Scanner;

import entity.Monster;

public class Text {
    public static void text_intro() throws InterruptedException {
    	System.out.println("\n");
    	System.out.println("\n");
    	System.out.println("-------------------------------------------------------------|");
          System.out.print("| Welcome to the wolrd of Azagorg, you and your friend decide|"
          			   + "\n| to go to a famous donjon called the 'Dark DONJON' this     |"
          		       + "\n| donjon is famous cause of his danger but when you enter the|"
          		       + "\n| donjon you fell asleep and when you wake up all your friend|"
          		       + "\n| juste disapear you need to espace this donjon and quickly  |");
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
    public static void WIN() {
		 System.out.println("");
		 System.out.println("  _____                            _         _ \r\n"
		 		+ " / ____|                          | |       | |\r\n"
		 		+ "| |     ___  _ __   __ _ _ __ __ _| |_ ___  | |\r\n"
		 		+ "| |    / _ \\| '_ \\ / _` | '__/ _` | __/ __| | |\r\n"
		 		+ "| |___| (_) | | | | (_| | | | (_| | |_\\__ \\ |_|\r\n"
		 		+ " \\_____\\___/|_| |_|\\__, |_|  \\__,_|\\__|___/ (_)\r\n"
		 		+ "                    __/ |                      \r\n"
		 		+ "                   |___/   ");
		 System.out.println("__     __         \r\n"
		 		+ "\\ \\   / /         \r\n"
		 		+ " \\ \\_/ /__  _   _ \r\n"
		 		+ "  \\   / _ \\| | | |\r\n"
		 		+ "   | | (_) | |_| |\r\n"
		 		+ "   |_|\\___/ \\__,_|\r\n"
		 		+ "                  ");
		 System.out.println("  __ _       _     _     \r\n"
		 		+ " / _(_)     (_)   | |    \r\n"
		 		+ "| |_ _ _ __  _ ___| |__  \r\n"
		 		+ "|  _| | '_ \\| / __| '_ \\ \r\n"
		 		+ "| | | | | | | \\__ \\ | | |\r\n"
		 		+ "|_| |_|_| |_|_|___/_| |_|"
		 		+ "                  ");
		 System.out.println(" _   _          \r\n"
		 		+ "| | | |         \r\n"
		 		+ "| |_| |__   ___ \r\n"
		 		+ "| __| '_ \\ / _ \\\r\n"
		 		+ "| |_| | | |  __/\r\n"
		 		+ " \\__|_| |_|\\___|"
		 		+ "                  ");
		 System.out.println("                              _ \r\n"
		 		+ "                             | |\r\n"
		 		+ "  __ _  __ _ _ __ ___   ___  | |\r\n"
		 		+ " / _` |/ _` | '_ ` _ \\ / _ \\ | |\r\n"
		 		+ "| (_| | (_| | | | | | |  __/ |_|\r\n"
		 		+ " \\__, |\\__,_|_| |_| |_|\\___| (_)\r\n"
		 		+ "  __/ |                         \r\n"
		 		+ " |___/             ");
    }
    public static char StartFightMessage(Monster monster) throws InterruptedException {
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
		 else if(premierCaractere == 'K') {
			 System.out.println("\n"+AsciiArt.ANSI_RED);
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("The Dragon King......");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n"+AsciiArt.ANSI_RESET);
			 Thread.sleep(3000);//sleep

		 }
		 return premierCaractere;
    }
}