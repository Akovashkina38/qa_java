package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Family family;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public Lion (Family family) {

        this.family = family;
    }
   public void getKittensFamily() {

        family.getKittens();
   }
    public List<String> getFood() throws Exception {
        return family.getFood("Хищник");
    }
    public boolean doesHaveMane() {

        return hasMane;
    }
}