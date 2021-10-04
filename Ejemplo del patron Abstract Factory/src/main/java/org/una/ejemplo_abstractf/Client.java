package org.una.ejemplo_abstractf;


public class Client {
    DevicesFactory technology;

    public void selectTechnology (DevicesFactory df){
        technology=df;
    }
    public void test(String song){
        Media media = technology.createMedia();
        Recorder recorder = technology.createRecorder();
        Player player =technology.createPlayer();
        recorder.accept(media);
        System.out.println("Grabando la canción:" + song);
        recorder.record(song);
        System.out.println("Escuchando la canción ");
        player.accept(media);
        player.play();
    }
}
