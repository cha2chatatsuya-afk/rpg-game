package rpg.model;

public class Hero extends Character {

    // コンストラクタ
    public Hero(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    // メソッド
    // *相手（引数）のhpを自分のattackPower+2減らす */
    @Override
    public void attack(Character target) {
        int damage = this.attackPower + 2;

        System.out.println(this.name + "の会心の一撃！");
        System.out.println(target.getName() + "に" + damage + "のダメージ！");
        target.hp = target.hp - damage;
    }

}
