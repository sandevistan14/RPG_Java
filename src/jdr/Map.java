package jdr;

import java.util.ArrayList;

import entity.Hero;
import entity.Monster;

public class Map{
	public static char[][] MapEntity(char[][] mapentity){

		char[][] mapent = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		mapentity = mapent;
		return mapentity;
	}
	
	
	
	
	
	
	
	public static char[][] Map(char[][] map){
		 char[][] map1 = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/','.','.','G','X','F','F','F','.','C','X','X','X','X','E','X','.','.','C','.','.','.','X','X','C','X','.','.','G','/',},
				 {'/','.','.','.','X','F','F','X','X','X','X','X','X','X','.','X','.','X','X','X','X','.','.','.','.','X','.','.','.','/',},
				 {'/','.','.','.','X','F','F','X','.','.','.','C','X','X','.','X','.','.','.','.','X','.','X','X','.','.','.','.','.','/',},
				 {'/','.','.','.','X','F','F','X','.','X','.','X','X','X','.','X','X','X','.','.','.','.','X','X','.','X','.','.','.','/',},
				 {'/','F','X','X','X','F','F','X','.','X','.','X','C','.','.','.','.','X','.','.','X','.','C','X','.','X','X','X','.','/',},
				 {'/','F','X','C','.','.','F','X','.','X','.','X','X','.','.','.','.','X','C','X','X','.','X','X','.','X','.','.','.','/',},
				 {'/','F','F','F','.','.','.','X','.','X','.','X','X','.','X','X','.','X','X','X','.','.','.','X','.','X','.','.','.','/',},
				 {'/','F','F','F','F','.','.','X','.','X','.','.','.','.','X','X','.','.','.','.','.','S','.','.','.','X','.','X','X','/',},
				 {'/','F','F','F','.','.','.','X','.','X','X','X','X','X','X','X','X','X','X','X','.','.','.','X','.','X','.','.','G','/',},
				 {'/','F','.','.','.','.','.','F','F','X','.','.','.','.','C','X','.','.','C','X','X','.','X','X','.','X','.','.','.','/',},
				 {'/','F','.','X','X','X','.','F','F','X','.','.','.','.','.','X','.','.','.','.','.','.','.','.','.','X','.','.','X','/',},
				 {'/','.','.','X','.','X','.','.','F','X','C','.','.','.','.','.','.','.','.','X','.','X','.','X','.','X','.','.','X','/',},
				 {'/','.','.','X','.','F','F','.','.','X','G','.','.','.','.','X','X','X','.','X','C','X','.','X','.','X','X','.','X','/',},
				 {'/','.','.','X','.','X','F','F','.','X','C','.','.','.','.','X','.','X','.','X','.','X','.','X','.','.','.','.','.','/',},
				 {'/','.','.','X','X','X','F','F','F','X','.','.','.','.','.','X','.','X','.','X','.','X','.','X','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','F','F','F','X','.','.','.','.','.','X','.','X','.','X','.','X','.','X','X','X','X','X','.','/',},
				 {'/','X','X','.','.','.','.','F','F','X','X','X','X','X','.','X','.','X','.','X','.','.','.','.','.','X','.','.','.','/',},
				 {'/','C','.','.','.','.','F','F','F','F','F','F','G','X','.','X','.','X','.','X','.','.','.','.','.','.','.','.','C','/',},
				 {'/','X','X','.','.','F','F','F','F','F','F','X','X','X','.','X','X','X','.','X','X','X','X','X','.','X','.','.','.','/',},
				 {'/','.','.','.','F','F','F','F','X','X','X','X','.','C','.','C','.','.','.','.','.','C','X','C','.','X','.','.','.','/',},
				 {'/','.','.','.','F','F','F','F','.','.','.','.','.','.','.','.','.','X','X','X','X','X','X','X','.','X','X','X','X','/',},
				 {'/','F','F','F','F','F','F','F','X','X','X','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','F','F','F','F','F','F','F','F','F','F','X','X','X','.','X','X','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','F','F','F','F','F','X','.','X','F','F','F','F','X','.','X','C','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','X','.','X','X','F','X','.','X','F','F','F','F','X','.','X','.','X','.','X','X','.','X','.','.','X','.','G','.','/',},
				 {'/','.','.','.','X','F','X','C','X','F','F','F','F','X','.','X','.','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','.','.','.','X','F','X','X','X','F','F','F','F','X','.','X','.','.','.','.','.','.','X','.','.','X','.','.','.','/',},
				 {'/','C','G','C','X','F','F','F','F','F','F','F','F','X','.','X','.','.','.','X','X','X','X','.','.','.','.','.','.','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		map = map1;
		return map;
	}
	
	
	
	public static char[][] MapMonster(char[][] mapmonster){
		 
		 char[][] mapmonster1 = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ','W',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','D',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','D',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ','S',' ','/',},
				 {'/','S',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S',' ','W',' ','W','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','/',},
				 {'/',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		 mapmonster = mapmonster1;
		 return mapmonster;
		 
	}
	public static void PrintMap(char[][] map,char[][] mapentity, char[][]mapmonster) {
		 for(int i = 0;i < map.length; i += 1) {
			 for(int k = 0;k < map[i].length; k += 1) {
				 if(map[i][k] == 'E') {
					 System.out.print(AsciiArt.ANSI_PURPLEBACKGROUND + map[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else if(mapentity[i][k] == 'P' && map[i][k] == 'F') {
					 System.out.print(AsciiArt.ANSI_GREENBACKGROUND + AsciiArt.ANSI_YELLOW+ mapentity[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else if (mapentity[i][k] != ' ' && mapentity[i][k] != '/') {
					 System.out.print(AsciiArt.ANSI_YELLOWBACKGROUND + mapentity[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else if(mapmonster[i][k] != ' ' && mapmonster[i][k] != '/' ) {
					 System.out.print( AsciiArt.ANSI_RED  + mapmonster[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else {
					 if(map[i][k] == 'C') {
						 System.out.print(AsciiArt.ANSI_YELLOW + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'G') {
						 System.out.print(AsciiArt.ANSI_BLUE  + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if (mapentity[i][k] == '/') {
							 System.out.print(map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'F') {
						 System.out.print(AsciiArt.ANSI_GREEN  + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'X'){
						 System.out.print(map[i][k]);
					 }
					 else{
						 System.out.print(map[i][k]);
					 }
				 }
			 }
			 System.out.print("\n");
		 }
	}
	
	public static boolean checkSurroundings(Hero hero, char[][] map) {
	    int posX = hero.getPosX()-1;
	    int posY = hero.getPosY();
	    // Vérifie les 9 cases autour du héros
	    for (int i = posY - 1; i <= posY + 1; i++) {
	        for (int j = posX - 1; j <= posX + 1; j++) {
	            // Vérifie si la case est en dehors de la carte
	            if (i < 0 || i >= map.length || j < 0 || j >= map[i].length) {
	                return false;
	            }
	            

	            // Vérifie si la case n'est pas un espace ou un slash
	            if (map[i][j] != ' ' && map[i][j] != '/') {
	            	return false;
	            }
	        }
	    }

	    // Toutes les cases sont des espaces ou des slashes
	    return true;
	}
}




		 
		 
		 
		 
		 