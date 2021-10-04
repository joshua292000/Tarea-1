package org.una.ejemplo_abstractf;

public class TapeRecorder implements Recorder {
Tape tapeInside;
    @Override
    public void accept(Media med) {
        tapeInside=(Tape)med;
    }

    @Override
    public void record(String sound) {
        if(tapeInside == null){
            System.out.println("Error: Inserte una cassette");
        }else{
            tapeInside.saveonTape(sound);
        }
    }
}
