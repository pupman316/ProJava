package com.company;

/**
 * Created by Flores on 7/6/2017.
 */
public class BaseEntity {
    String strName;
    int intMaxHP;
    int intHP;

    // Constructor
    public BaseEntity(String strNewname, int intNewMaxHP){
        this.strName = strNewname;
        this.intMaxHP = intNewMaxHP;
        this.intHP = this.intMaxHP;
    }

    // Public Methods
    public String TakeDamage(int intDamage) {
        this.intHP -= intDamage;

        if (this.intHP > 0) {
            return strName + " has " + this.intHP + " hit points remaining.";
        }
        else {
            return strName + " has no hit points remaining";
        }
    }
}
