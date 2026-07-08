package rpg.model;

public class Character {
    //フィールド
    private String name;
    private int hp;
    private int attackPower;

    //コンストラクタ
    public Character(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    //メソッド
    //*相手（引数）のhpを自分のattackPower分減らす */
    public void attack(Character target){
        System.out.println(this.name+"の攻撃！");
        System.out.println(target.getName()+"に"+this.getAttackPower()+"のダメージ！");
        target.hp=target.hp-this.attackPower;
        
    }
    //*このキャラのhpが０以上かを判定して返す */
    public boolean isAlive(){
        if(this.hp>0){
            return true;
        }
        return false;
    }

    //*このキャラの名前と現在のhpを表示する */
    public void showStatus(){
        System.out.println(this.name+"のHPは"+hp+"です。");
    }

    //*このキャラのnameを返す */
    public String getName(){
        return this.name;
    }

    //*このキャラのattackPowerを返す */
    public int getAttackPower(){
        return this.attackPower;
    }
}
