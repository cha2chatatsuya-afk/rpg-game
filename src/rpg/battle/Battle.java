package rpg.battle;

import java.util.List;

import rpg.model.Hero;
import rpg.model.Monster;

public class Battle {
    // フィールド（そのクラスで何を登場させたいか）
    private Hero hero;
    private List<Monster> monsters;
    private Monster winMonster;

    // コンストラクタ
    public Battle(Hero hero,List<Monster> monsters) {
        this.hero = hero;
        this.monsters =monsters;
    }

    // メソッド
    // *バトルを進行させるメソッド */
    public void start() {
        this.hero.showStatus();

        for(Monster m :monsters){
            if(!this.hero.isAlive()){
                break;
            }
            fight(m);
        }
        showResult();
        
        

    }

    //*敵と戦うメソッド */
    private void fight (Monster monster){
        System.out.println(this.hero.getName() + "は" + monster.getName() + "に遭遇した");
        monster.showStatus();
        while (this.hero.isAlive() && monster.isAlive()) {
            this.hero.attack(monster);
            monster.showStatus();

            if (!monster.isAlive()) {
                System.out.println(monster.getName()+"は倒れた！");
                break;
            }

            monster.attack(this.hero);
            this.hero.showStatus();

            if (!this.hero.isAlive()) {
                System.out.println(this.hero.getName()+"は倒れた！");
                this.winMonster =monster;
                break;
            }
        }
    }
        
    

    private void showResult() {
        if (this.hero.isAlive()) {
            System.out.println("全員撃破！");
            System.out.println(this.hero.getName() + "の大勝利！");
        } else {
            System.out.println( "GAME OVER");
            System.out.println(this.winMonster.getName()+"に敗れた…");
        }
    }

}
