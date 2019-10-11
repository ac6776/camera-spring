package ru.testspring.camera;

public class BWCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 black and white frame");
    }
}
