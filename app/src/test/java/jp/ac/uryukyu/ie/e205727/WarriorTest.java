package jp.ac.uryukyu.ie.e205727;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest() {
        int defaultWarriorAttack = 10;
        int wantDamage = (int)(defaultWarriorAttack *1.5);
        Warrior demoWarrior = new Warrior("デモ勇者", 10 , defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 1000, 100);
        for (int i=0; i<3; i++){
            int beforeAtttackEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterAttackEnemyHp = slime.getHitPoint();
            int enemyDamaged = beforeAtttackEnemyHp - afterAttackEnemyHp;
            assertEquals(wantDamage, enemyDamaged);
        }
    }
}