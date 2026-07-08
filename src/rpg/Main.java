package rpg;

import rpg.model.Character;

public class Main {
    public static void main(String[] args) {
        Character hero = new Character("勇者",100 , 10);
        Character slime = new Character("スライム", 30, 3);
        System.out.println(hero.getName()+"は"+slime.getName()+"に遭遇した");
        hero.showStatus();
        slime.showStatus();

        while(hero.isAlive() &&slime.isAlive()){
            hero.attack(slime);
            slime.showStatus();

            if(!slime.isAlive()){
                break;
            }

            slime.attack(hero);
            hero.showStatus();

            if(!hero.isAlive()){
                break;
            }
        }
        
        if(!hero.isAlive()){
            System.out.println(hero.getName()+"は倒れた！");
            System.out.println(slime.getName()+"の勝ち！");
        }else{
            System.out.println(slime.getName()+"は倒れた！");
            System.out.println(hero.getName()+"の勝ち！");
        }
    }
}
