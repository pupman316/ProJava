package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Flores on 7/6/2017.
 */
class BaseEntityTest {
    @org.junit.jupiter.api.Test
    void testTakeDamage() {

        int intDamage = 6;
        BaseEntity beTest = new BaseEntity("Testee", 16);

        assertEquals(beTest.TakeDamage(intDamage), "Testee has 10 hit points remaining.");

    }
}