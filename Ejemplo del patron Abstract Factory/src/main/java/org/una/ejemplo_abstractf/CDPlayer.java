package org.una.ejemplo_abstractf;


public class CDPlayer implements Player {
    CD cDInside;

    public void accept(Media med){
        cDInside = (CD) med;
    }

    public void play(){
        if(cDInside == null){
            System.out.println("Error:no CD");
        }else{
            System.out.println(cDInside.readDisk());
        }

    }
}
