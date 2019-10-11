package ru.testspring.rifle;

public class Rifle {

    public void add(Ammo ammo){
        ammo.loadAmmo();
    }
    public void shot(){
        System.out.println("Babah");
    }
}
