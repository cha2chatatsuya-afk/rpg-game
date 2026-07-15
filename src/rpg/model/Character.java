package rpg.model;

public abstract class Character {
    //フィールド
    protected String name;
    protected int hp;
    protected int attackPower;

    //コンストラクタ
    public Character(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    //メソッド
    //*相手（引数）のhpを自分のattackPower分減らす */
    public abstract void attack(Character target);

    
    //*自分のhpをdamage分だけ減らす */
    public void takeDamage(int damage){
        this.hp =Math.max(this.hp-damage,0);
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
