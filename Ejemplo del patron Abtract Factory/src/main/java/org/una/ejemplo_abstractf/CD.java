package org.una.ejemplo_abstractf;


public class CD implements Media {
    private String track = " ";

    public void writeOnDisk(String sound){
        track = sound;
    }

    public String readDisk(){
        return track;
    }
}
