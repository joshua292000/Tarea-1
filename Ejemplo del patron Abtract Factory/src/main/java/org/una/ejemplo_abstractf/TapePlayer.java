package org.una.ejemplo_abstractf;

public class TapePlayer implements Player {
    Tape tapeInside;

    @Override
    public void accept(Media med) {
        tapeInside=(Tape)med;
    }

    public void play(){
        if(tapeInside==null){
            System.out.println(("Error: Inserte un cassette."));
        }else{
            System.out.println(tapeInside.readTape());
        }
    }
}
