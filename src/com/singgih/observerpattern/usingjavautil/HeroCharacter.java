package com.singgih.observerpattern.usingjavautil;

import com.singgih.observerpattern.withoutjavautil.Observer;
import com.singgih.observerpattern.withoutjavautil.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by singgihrs on 3/9/17.
 */
public class HeroCharacter<T extends Observer> extends Observable {

    public static final boolean ENEMY_ATTACK = true;

    public static final boolean ENEMY_PASSIVE = false;

    private boolean enemyAttacking;

    public void actionChanged() {
        setChanged();
        notifyObservers();
    }

    public void setAction(boolean enemyAttacking) {
        this.enemyAttacking = enemyAttacking;
        actionChanged();
    }

    public boolean isEnemyAttacking() {
        return enemyAttacking;
    }

}
