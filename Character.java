public class Character {
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
    public void attack(Character target){
        target.hp=target.hp-this.attackPower;
    }
    
    public boolean isAlive(){
        if(this.hp>0){
            return true;
        }
        return false;
    }

    public void showStatus(){
        System.out.println(this.name+"のHPは"+hp+"です。");
    }

    
    public String getName(){
        return this.name;
    }
    public int getattackPower(){
        return this.attackPower;
    }
}
