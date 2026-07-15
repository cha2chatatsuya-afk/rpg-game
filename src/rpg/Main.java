package rpg;

import rpg.battle.Battle;
import rpg.model.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者",100 , 10);
        Monster monster = new Monster("スライム", 30, 8);

        Battle battle = new Battle(hero,monster);
        battle.start();
    }
}
