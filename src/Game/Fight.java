package Game;


import java.util.Scanner;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.Boot;
import Entity.Hero;
import Entity.Monster;
import Entity.inventaire;
import Objet.Arme;
import Objet.Artefact;
import Objet.Objet;
import Objet.Potion;

public class Fight{

    public static int fight(Hero hero,Monster monster,int xp,char[][] mapmonster) throws InterruptedException {


        boolean Flee = true; // for FLee
        if(xp == -50) {Flee = false;} //to know that the player can't Flee

        //text
        char premierCaractere = Text.StartFightMessage(monster);

        //speed
        boolean speed = false;
        if(monster.getSpeed() > hero.getSpeed()){speed = true;}

        //for the speed
        if(speed == true) {

            int Defhero = hero.getDefense() + hero.getEqiBoot()[0].getBonusDefense()+hero.getEqiChestPlate()[0].getBonusDefense() + hero.getEqiHelmet()[0].getBonusDefense() + hero.getEqiLegging()[0].getBonusDefense();
            int MonsterDommage = monster.getDommage()- (Defhero/10);

            speed = false;
            System.out.print("\n");
            System.out.println("The Monster Have more speed than you so he attack in first !");
            System.out.print("\n");
            System.out.println("The "+ monster.getName() +" attack you and inflict you "+ MonsterDommage +" dommages");
            System.out.print("\n");
            hero.setLife(hero.getLife() - MonsterDommage);
            Thread.sleep(2000);}
        else {
            System.out.println("\n");
            System.out.print("You have more speed than the Monster so you attack in first !");
            System.out.println("\n");}

        // While fight
        while(true) {

            // boolean to know if you have attacked
            boolean act = false;

            // if you kill the monster
            if (monster.getLife() < 1) {
                System.out.print("\n");
                System.out.print("Congrats you kill the monster !");
                System.out.print("\n");
                System.out.print("You earn "+ monster.getXp()+" xp !");
                System.out.print("\n");
                System.out.print("\n");
                monster.setPosX(0); monster.setPosY(0); //bug correction for not fight a dead Monster
                Thread.sleep(3000);//sleep
                xp = monster.getXp();//get Xp from monster
                mapmonster[hero.getPosY()][hero.getPosX()-1] = ' ';// erase the monster on the map
                break;
            }
            if(premierCaractere == 'M') {AsciiArt.PrintMotherOfDeath(monster);}
            if(premierCaractere == 'K') {AsciiArt.PrintDragonKing(monster);}
            if(premierCaractere == 'D') {AsciiArt.PrintRedEyesDragon(monster);}
            if(premierCaractere == 'W') {AsciiArt.PrintWolf(monster);}
            if(premierCaractere == 'S') {double num = Math.random()*100;
                if(num > 90) {AsciiArt.PrintMiddleFinger(monster);}
                if(num <= 90) {AsciiArt.PrintSlime(monster);}}


            AsciiArt.PrintAction(hero,Flee);//show possible actions

            //if you get kill : Game Over
            if (hero.getLife() < 1) {
                AsciiArt.PrintDead();
                xp = -69;// to know that you have been killed in the return
                break;}

            //print the sprite

            @SuppressWarnings("resource")
            Scanner sc4 = new Scanner(System.in);
            String str4 = sc4.nextLine();



            if(str4.equalsIgnoreCase("Inv")){
                inventaire.OpenInventory(hero);
            }

            else if(str4.equalsIgnoreCase("Attack")) {//if Attack
                int HeroDommage = (hero.getDommage() + hero.getEqiArme()[0].getBonusDommage()) - (monster.getDefense()/10);
                for(int Artefact = 0;Artefact < hero.getInvArtefact().length; Artefact += 1) {
                    if(hero.getInvArtefact()[Artefact].getBonusName().equalsIgnoreCase("Dommage")) {
                        HeroDommage += hero.getInvArtefact()[Artefact].getBonus();
                    }
                }

                hero.setLife(hero.getEqiArme()[0].getDrainOfLife()+hero.getLife());
                if(hero.getLife()>hero.getMaxHP()) {
                    hero.setLife(hero.getMaxHP());
                }

                monster.setLife(monster.getLife()- (HeroDommage));
                System.out.print("\n");
                System.out.print("You attack "+ monster.getName() +" and inflict "+ HeroDommage +" dommages");
                System.out.print("\n");
                act = true;
            }

            else if(str4.equalsIgnoreCase("Flee") && Flee == true) {xp = 0;break;}//if Flee if possible


            //monster Attack
            int DefHero = hero.getDefense() + hero.getEqiBoot()[0].getBonusDefense()+hero.getEqiChestPlate()[0].getBonusDefense() + hero.getEqiHelmet()[0].getBonusDefense() + hero.getEqiLegging()[0].getBonusDefense();
            int MonsterDommage = monster.getDommage()- (DefHero/10);
            if ((!(monster.getLife() < 1)) && act == true) {
                System.out.print("\n");
                System.out.print("The "+ monster.getName() +" attack you and inflict you "+ MonsterDommage +" dommages");
                System.out.print("\n");
                hero.setLife(hero.getLife() - MonsterDommage);
                Thread.sleep(2000);
            }

        }// end of while for fight
        return xp;
    }
}