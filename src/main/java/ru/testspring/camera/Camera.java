package ru.testspring.camera;

public class Camera {
    private CameraRoll cameraRoll;

    public Camera(CameraRoll cameraRoll){
        this.cameraRoll = cameraRoll;
    }

    public Camera(){}

    public void setCameraRoll(CameraRoll cameraRoll){
        this.cameraRoll = cameraRoll;
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void doPhotograph(){
        System.out.println("Сфоткал");
        cameraRoll.processing();
    }
}
