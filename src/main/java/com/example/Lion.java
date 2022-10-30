package com.example;

import java.util.List;

public class Lion implements IFamily {

    boolean hasMane;
    private final IFamily ifamily;
    //public Lion (IFamily ifamily) {
    //    this.ifamily = ifamily;
   // }

    public Lion(String sex, IFamily ifamily) throws Exception {
        this.ifamily = ifamily;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    @Override
   public int getKittens() {
       return ifamily.getKittens();
   }


    public List<String> getFood() throws Exception {
      return ifamily.getFood();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

}