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
        if((action.equals("Up") || action.equals("uP") || action.equals("up") || action.equals("UP"))
        	|| (action.equals("Down") || action.equals("down") || action.equals("DOWN") || action.equals("DOwn"))
        	|| (action.equals("Right") || action.equals("right") || action.equals("RIGHT") || action.equals("RIght"))
        	|| (action.equals("Left") || action.equals("left") || action.equals("LEFT") || action.equals("LEft"))
        	||  (action.equals("move"))){
        	
        		Hero1.setReturnX(Hero1.getPosX());
        		Hero1.setReturnY(Hero1.getPosY());
        	
        	if (action.equals("Up") || action.equals("uP") || action.equals("up") || action.equals("UP"))  {
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
        	if (action.equals("Down") || action.equals("down") || action.equals("DOWN") || action.equals("DOwn")) {
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
        	if (action.equals("Right") || action.equals("right") || action.equals("RIGHT") || action.equals("RIght")) {
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
        	if (action.equals("Left") || action.equals("left") || action.equals("LEFT") || action.equals("LEft") ) {
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
			if (action.equals("move")) {
	        	System.out.println("Where do you want to go ?");
	        	System.out.println("Up");
	        	System.out.println("Down");
	        	System.out.println("Right");
	        	System.out.println("Left");
	        	System.out.println("cancel (return to menu of choose)");
				Scanner sc3 = new Scanner(System.in);
		        String str3 = sc3.nextLine();
		        
	        	if (str3.equals("cancel")){return mapentity;}
	        	
		    	//*****************************************************************************
		    	//********************************     UP     *********************************
		    	//*****************************************************************************
	        	if (str3.equals("Up") || str3.equals("uP") || str3.equals("up") || str3.equals("UP"))  {
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
	        	if (str3.equals("Down") || str3.equals("down") || str3.equals("DOWN") || str3.equals("DOwn")) {
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
	        	if (str3.equals("Right") || str3.equals("right") || str3.equals("RIGHT") || str3.equals("RIght")) {
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
	        	if (str3.equals("Left") || str3.equals("left") || str3.equals("LEFT") || str3.equals("LEft") ) {
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
