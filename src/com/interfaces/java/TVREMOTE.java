package com.interfaces.java;

public class TVREMOTE {
    public static void main(String[] args){
        Remote remote = new Television();
        remote.powerOn();
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOff();

    }
}

interface Remote{
    abstract public void volumeUp();
    void volumeDown(); //It is already a type of abstract public
    void powerOff();
    void powerOn();
}

class Television implements Remote{

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On");
    }
}