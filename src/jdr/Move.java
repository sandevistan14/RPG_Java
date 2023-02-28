package jdr;

import java.util.Scanner;

import entity.Hero;

public class Move {
	public static char[][] MoveHero(char[][] mapentity,char[][] map,String action, Hero Hero1) {
		//*****************************************************************************
    	//******************************     MOOVE     ********************************
    	//*****************************************************************************
        	
	    	//*****************************************************************************
	    	//********************************     UP     *********************************
	    	//*****************************************************************************
        if((action.equalsIgnoreCase("Up"))
        	|| (action.equalsIgnoreCase("Down"))
        	|| (action.equalsIgnoreCase("Right"))
        	|| (action.equalsIgnoreCase("Left"))
        	||  (action.equalsIgnoreCase("move"))){
        	
        		Hero1.setReturnX(Hero1.getPosX());
        		Hero1.setReturnY(Hero1.getPosY());
        	
        	if (action.equalsIgnoreCase("Up"))  {
        		if (map[Hero1.getPosY()-1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()-1][Hero1.getPosX()-1] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
	        		Hero1.setPosY(Hero1.getPosY() - 1 );
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
        	}
        	
	    	//*****************************************************************************
	    	//*******************************     DOWN     ********************************
	    	//*****************************************************************************
        	if (action.equalsIgnoreCase("Down") || action.equalsIgnoreCase("down") || action.equalsIgnoreCase("DOWN") || action.equalsIgnoreCase("DOwn")) {
        		if (map[Hero1.getPosY()+1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()+1][Hero1.getPosX()-1] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
        		Hero1.setPosY(Hero1.getPosY() + 1 );
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
        		
        	}
        	
        	
	    	//*****************************************************************************
	    	//******************************     RIGHT     ********************************
	    	//*****************************************************************************
        	if (action.equalsIgnoreCase("Right")) {
        		if (map[Hero1.getPosY()][Hero1.getPosX()] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
        		Hero1.setPosX(Hero1.getPosX() + 1 );
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
        	}
        	
        	
	    	//*****************************************************************************
	    	//*******************************     LEFT     ********************************
	    	//*****************************************************************************
        	if (action.equalsIgnoreCase("Left")) {
        		if (map[Hero1.getPosY()][Hero1.getPosX()-2] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()-2] == '/') {
        			System.out.print("\n");
        			System.out.print("A wall block your way");
        			System.out.print("\n");}
        		else {
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
        		Hero1.setPosX(Hero1.getPosX() - 1 );
        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
        	}
        	
	    	//*****************************************************************************
	    	//******************************     ELSE     *********************************
	    	//*****************************************************************************
			if (action.equalsIgnoreCase("move")) {
	        	System.out.println("Where do you want to go ?");
	        	System.out.println("Up");
	        	System.out.println("Down");
	        	System.out.println("Right");
	        	System.out.println("Left");
	        	System.out.println("cancel (return to menu of choose)");
				Scanner sc3 = new Scanner(System.in);
		        String str3 = sc3.nextLine();
		        
	        	if (str3.equalsIgnoreCase("cancel")){return mapentity;}
	        	
		    	//*****************************************************************************
		    	//********************************     UP     *********************************
		    	//*****************************************************************************
	        	if (str3.equalsIgnoreCase("Up"))  {
	        		if (map[Hero1.getPosY()-1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()-1][Hero1.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
		        		Hero1.setPosY(Hero1.getPosY() - 1 );
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//*******************************     DOWN     ********************************
		    	//*****************************************************************************
	        	if (str3.equalsIgnoreCase("Down")) {
	        		if (map[Hero1.getPosY()+1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()+1][Hero1.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
		        		Hero1.setPosY(Hero1.getPosY() + 1 );
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//******************************     RIGHT     ********************************
		    	//*****************************************************************************
	        	if (str3.equalsIgnoreCase("Right")) {
	        		if (map[Hero1.getPosY()][Hero1.getPosX()] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
		        		else {
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
		        		Hero1.setPosX(Hero1.getPosX() + 1 );
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//*******************************     LEFT     ********************************
		    	//*****************************************************************************
	        	if (str3.equalsIgnoreCase("Left")) {
	        		if (map[Hero1.getPosY()][Hero1.getPosX()-2] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()-2] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
		        		Hero1.setPosX(Hero1.getPosX() - 1 );
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
			}//end if move
			
        }//end of if all move
        return mapentity;
	}
}
