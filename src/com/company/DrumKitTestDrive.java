package com.company;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d= new DrumKit();
        d.snare= false;
        d.playSnare();
        d.playTopHat();
        if(d.snare==true){
            d.playSnare();
        }
    }
    public static class DrumKit{
        boolean topHat= true;
        boolean snare = true;

        void playSnare(){
            System.out.println("бах бах ба-бах");
        }
        void playTopHat(){
            System.out.println("динь динь ди-динь");

        }

    }
}
