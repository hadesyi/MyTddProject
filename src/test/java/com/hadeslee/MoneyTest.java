package com.hadeslee;

import junit.framework.TestCase;

/**
 * Project: MyTddProject
 * FileName: MoneyTest
 * Date: 2016-08-05
 * Time: 오후 4:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTest extends TestCase {
    // TODO: 2016-08-05
    /*
    1. $5+10CHF=$10 (환율 2:1)
    2. $5*2=$10 --완료
    3. amount를 private으로 만들기
    4. Dollar 부작용(side effect?)
    5. Money 반올림
    * */

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

class Dollar {
    int amount = 10;

    Dollar(int amount) {
        this.amount = amount;

    }

    void times(int muiltiplier) {
        amount *= muiltiplier;
    }


}

