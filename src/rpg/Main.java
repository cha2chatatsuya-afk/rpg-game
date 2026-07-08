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
            System.out.println(hero.getName()+"の攻撃！");
            System.out.println(slime.getName()+"に"+hero.getattackPower()+"のダメージ！");
            hero.attack(slime);
            slime.showStatus();

            System.out.println(slime.getName()+"の攻撃！");
            System.out.println(hero.getName()+"に"+slime.getattackPower()+"のダメージ！");
            slime.attack(hero);
            hero.showStatus();
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
