package rpg;

import rpg.battle.Battle;
import rpg.model.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 100, 10);

        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("スライム", 15, 4));
        monsters.add(new Monster("メタルスライム", 100, 10));
        monsters.add(new Monster("キングスライム", 200, 50));

        for (Monster m : monsters) {// 中身を１件ずつ取り出す
            m.showStatus();
        }

        Battle battle = new Battle(hero, monsters);
        battle.start();
    }
}
