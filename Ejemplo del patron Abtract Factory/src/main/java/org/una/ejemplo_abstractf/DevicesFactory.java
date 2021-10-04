package org.una.ejemplo_abstractf;

public interface DevicesFactory {
    public Player createPlayer();
    public Recorder createRecorder();
    public Media createMedia();
}
