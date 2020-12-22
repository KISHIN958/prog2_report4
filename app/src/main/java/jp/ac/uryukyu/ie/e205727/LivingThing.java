package jp.ac.uryukyu.ie.e205727;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name LivingThing名
     * @param maximumHP LivingThingのHP
     * @param attack LivingThingの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、LivingThing.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (dead){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
        opponent.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * フィールド変数nameの値を返すgetterメソッド。
     * @return フィールド変数nameの値
     */
    public String getName(){
        return name;
    }
    /**
     * フィールド変数nameを参照するsetterメソッド。
     * @param name Heroの名前
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * フィールド変数hitPointの値を返すgetterメソッド。
     * @return フィールド変数hitPointの値
     */
    public int getHitPoint(){
        return hitPoint;
    }
    /**
     * フィールド変数hitPointを参照するsetterメソッド。
     * @param hitPoint Heroの名前
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * フィールド変数attackの値を返すgetterメソッド。
     * @return フィールド変数attackの値
     */
    public int getAttack(){
        return attack;
    }
    /**
     * フィールド変数attackを参照するsetterメソッド。
     * @param attack Heroの攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * フィールド変数deadの値を返すgetterメソッド。
     * @return フィールド変数deadの値
     */
    public boolean isDead(){
        return dead;
    }
    /**
     * フィールド変数deadを参照するsetterメソッド。
     * @param dead Heroの死亡
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
}