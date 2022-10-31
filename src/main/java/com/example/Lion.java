package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

   public int getKittens() {
       return feline.getKittens();
   }


    public List<String> getFood() throws Exception {
      return feline.getFood("Хищник");
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

}