package rpg.battle;

import rpg.model.Hero;
import rpg.model.Monster;

public class Battle {
    //フィールド（そのクラスで何を登場させたいか）
    private Hero hero;
    private Monster monster;

    //コンストラクタ
    public Battle(Hero hero, Monster monster){
        this.hero = hero;
        this.monster =monster;
    }

    //メソッド
    //*ゲームを進行するメソッド */
    public void start(){
        System.out.println(this.hero.getName()+"は"+this.monster.getName()+"に遭遇した");
        this.hero.showStatus();
        this.monster.showStatus();

        while(this.hero.isAlive() &&this.monster.isAlive()){
            this.hero.attack(this.monster);
            this.monster.showStatus();

            if(!this.monster.isAlive()){
                break;
            }

            this.monster.attack(this.hero);
            this.hero.showStatus();

            if(!this.hero.isAlive()){
                break;
            }
        }
    
        showResult();
        
    }
    private void showResult(){
        if(!this.hero.isAlive()){
            System.out.println(this.hero.getName()+"は倒れた！");
            System.out.println(this.monster.getName()+"の勝ち！");
        }else{
            System.out.println(this.monster.getName()+"は倒れた！");
            System.out.println(this.hero.getName()+"の勝ち！");
        }
    }

}
