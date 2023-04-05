package Game;

import Armor.Boot;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Entity.Hero;
import Entity.Monster;
import Entity.inventaire;
import Objet.Arme;
import Objet.Artefact;
import Objet.Objet;
import Objet.Potion;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class GameTurn{


    public static void GameTrun() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        //*****************************************************************************
        //**************************     Initialization     ***************************
        //*****************************************************************************
        //map
        char[][] mapentity = null;mapentity = Map.MapEntity(mapentity);
        char[][] map = null;map = Map.Map(map);
        char[][] mapmonster = null;mapmonster = Map.MapMonster(mapmonster);

        //level system
        int xpfight = 0;

        //Commun objet
        Objet[] CommunLoot = Objet.CommunItem();

        //rare objet
        Objet[] RareLoot = Objet.RareItem();

        //epic objet
        Objet[] EpicLoot = Objet.EpicItem();

        //legendary objet
        Objet[] LegendaryLoot = Objet.LegendaryItem();

        // create monster in the forest
        Monster[] TabMonsterForest = Monster.MonsterForest();
        int MonsterInForest = 0;

        //TabMonster with all monster
        ArrayList<Monster> TabMonster = Monster.CreateMonster(mapmonster);

        //Hero creation
        Hero hero = new Hero('P',"",28,15,0,0,0,0,0,0,0);

        //inventory
        inventaire inventory = new inventaire(null, 0, null, 0, null, 0);

        //Flee
        hero.setReturnX(hero.getPosX());
        hero.setReturnY(hero.getPosY());

        Hero.SetHeroClass(hero);//Set Hero Class

        Text.text_intro(); //Introduction text

        // check if Helmet is null or not and if it's null send empty
        for(int i = 0;i < hero.getEqiHelmet().length; i += 1) {if (Objects.isNull(hero.getEqiHelmet()[i])) {hero.setEqiHelmet(new Helmet("vide", "vide","\u001B[37m", 0, 0, 0),i); }}

        // check if Boot is null or not and if it's null send empty
        for(int i = 0;i < hero.getEqiBoot().length; i += 1) {if (Objects.isNull(hero.getEqiBoot()[i])) {hero.setEqiBoot( new Boot("vide", "vide","\u001B[37m", 0, 0, 0),i); }}

        // check if ChestPlate is null or not and if it's null send empty
        for(int i = 0;i < hero.getEqiChestPlate().length; i += 1) {if (Objects.isNull(hero.getEqiChestPlate()[i])) {hero.setEqiChestPlate( new ChestPlate("vide", "vide","\u001B[37m", 0, 0, 0),i); }}

        // check if Legging is null or not and if it's null send empty
        for(int i = 0;i < hero.getEqiLegging().length; i += 1) {if (Objects.isNull(hero.getEqiLegging()[i])) {hero.setEqiLegging( new Legging("vide", "vide","\u001B[37m", 0, 0, 0),i); }}

        // check if EqiArme is null or not and if it's null send empty
        for(int i = 0;i < hero.getEqiArme().length; i += 1) {if (Objects.isNull(hero.getEqiArme()[i])) {hero.setEqiArme(new Arme("vide", "vide","\u001B[37m", 0, 0),i); }}

        // check if Arme is null or not and if it's null send empty
        for(int i = 0;i < hero.getInvArme().length; i += 1) {if (Objects.isNull(hero.getInvArme()[i])) {hero.setInvArme(new Arme("vide", "vide","\u001B[37m", 0, 0),i); }}

        // check if Artefact is null or not and if it's null send empty
        for(int i = 0;i < hero.getInvArtefact().length; i += 1) {if (Objects.isNull(hero.getInvArtefact()[i])) {hero.setInvArtefact(new Artefact("vide", "vide","\u001B[37m", "vide", 0),i); }}

        // check if Potion is null or not and if it's null send empty
        for(int i = 0;i < hero.getInvPotion().length; i += 1) {if (Objects.isNull(hero.getInvPotion()[i])) {hero.setInvPotion( new Potion("vide", "vide","\u001B[37m", 0),i); }}



//*****************************************************************************
//******************************     WHILE     ********************************
//*****************************************************************************


        while (true){

            // finish if your on the 'E'
            if(map[hero.getPosY()][hero.getPosX()-1] == 'E') {
                AsciiArt.DanceFortnite();Text.WIN();break;}

            //chest
            xpfight = Map.Chest(hero,map,mapmonster);

            //*****************************************************************************
            //******************************     FIGHT     ********************************
            //*****************************************************************************

            if (MonsterInForest < 11 && map[hero.getPosY()][hero.getPosX()-1] == 'F') {
                double rand = Math.random()*100;
                if(rand >= 80) {
                    xpfight = -50;
                    xpfight = Fight.fight(hero, TabMonsterForest[MonsterInForest], xpfight, mapmonster);
                    MonsterInForest += 1;
                }
            }
            for(int i = 0;i < TabMonster.size(); i += 1) {
                if(TabMonster.get(i).getPosX() == hero.getPosX()-1 && TabMonster.get(i).getPosY() == hero.getPosY()) {
                    xpfight = Fight.fight(hero, TabMonster.get(i), xpfight, mapmonster);
                    if(xpfight == 0) {
                        mapentity[hero.getPosY()][hero.getPosX() - 1] = ' ';
                        hero.setPosX(hero.getReturnX());
                        hero.setPosY(hero.getReturnY());
                        mapentity[hero.getPosY()][hero.getPosX() - 1] = 'P';
                        break;
                    }
                }
            }

            //if dead break the while
            if(xpfight == -69){break;}

            //drop item
            Objet.DropItem(hero, xpfight, CommunLoot, RareLoot, EpicLoot, LegendaryLoot, scan);

            //XP hero
            hero.setXp(hero.getXp() + xpfight);
            xpfight = 0;


            //level
            hero.LevelUp();

            //print map each loop
            Map.PrintMap(map, mapentity, mapmonster);

            // print text for choose action
            String action = Text.ActionList();

            // if action == leave : leave the game
            if (action.equalsIgnoreCase("leave")){
                System.out.println("end of game");break;}

            //inventory
            else if (action.equalsIgnoreCase("inventory")){
                inventaire.OpenInventory(hero);}

            //print info
            else if (action.equalsIgnoreCase("info")){
                System.out.println("Map info :\r\n"

                        //info map
                        + "F = forest\r\n"+ "X and / = wall\r\n"+ "C = chest\r\n"+ "G = Giga Chest\r\n"+ "E = Exit\r\n"+ "P = Player\r\n"+ "\r\n"

                        //info monster
                        + "Monster :\r\n" + "S = Slime\r\n" + "W = WOlf\r\n" + "D = Dragon\r\n" + "K = KingDragon (Boss)\r\n" + "M = Mother of death (Secret Boss)\r\n"
                        + "\r\n"

                        //info ratiry
                        + "Item Ratiry :\r\n" + "White = Commmun\r\n"+ "Blue = Rare.\r\n"+ "Purple = Epic\r\n" + "Yellow = Legendary");}

            //move
            mapentity = Move.MoveHero(mapentity, map, action, hero);

        }// end while

    }// =end main

}//end Main