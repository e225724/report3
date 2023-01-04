package jp.ac.uryukyu.ie.e225724;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test void warriorAttackTest() {
        int HeroHp = 100;
        int HeroAttack = 100;
        int EnemyHp = 10;
        Warrior Warriore = new Warrior("デモ戦士", HeroHp, HeroAttack);
        Enemy Enemy = new Enemy("スライムもどき", EnemyHp, 10);
        for (int count=0; count<3; count++) {
            Warriore.attackWithWeponSkill(Enemy);
            assertEquals(Enemy.getHitPoint(), (EnemyHp - HeroAttack*1.5*(count+1)));
        }
        
    }
}