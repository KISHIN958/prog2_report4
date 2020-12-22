package jp.ac.uryukyu.ie.e205727;

/**
 * ウォーリアクラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ウォーリア名
     * @param maximumHP ウォーリアのHP
     * @param attack ウォーリアの攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * Heroの攻撃力の1.5倍の固定ダメージを与えるメソッド。
     * @param opponent Enemy
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if (isDead()){
            return;
        }
        double times = 1.5;
        int damage = (int)(getAttack()*times);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }
}