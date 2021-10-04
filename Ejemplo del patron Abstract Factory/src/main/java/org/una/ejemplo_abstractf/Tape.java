package org.una.ejemplo_abstractf;


public class Tape implements Media {
    private String tape=" ";

    public void saveonTape(String sound){
        tape=sound;
    }

    public String readTape(){
        return tape;
    }
}
