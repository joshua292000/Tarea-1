package org.una.ejemplo_abstractf;


public class CDRecorder implements Recorder {
    CD cDInside;

    public void accept(Media med){
        cDInside = (CD) med;
    }

    public void record(String sound){
        if(cDInside == null){
            System.out.println("Error: No hay CD.");

        }else{
            cDInside.writeOnDisk(sound);
        }
    }
}
