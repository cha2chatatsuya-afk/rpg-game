package rpg.model;

public class Monster extends Character {

    // コンストラクタ
    public Monster(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    // メソッド
    // *相手（引数）のhpを自分のattackPower分減らす */
    @Override
    public void attack(Character target) {
        System.out.println(this.name + "のかみつき！");
        System.out.println(target.getName() + "に" + this.attackPower + "のダメージ！"); 
        target.takeDamage(this.attackPower);
    }
}
