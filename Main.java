package com.algonquin.loggy;

public class Main {

    public static void main(String[] args) {
        Log log = null;

        // Test for a TextLog
        log = new TextLog("First Log", "A detailed description of my day");
        try {
            log.attachFile("note.txt", "TXT", "Sample text", 512L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log created: " + log + "\n");

        // Test for an ImageLog
        log = new PhotoLog("Coffee Break", "Had a cup of coffee");
        try {
            log.attachFile("coffee.png", "PNG", "Image content", 1024L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log created: " + log + "\n");

        // Test for a VideoLog
        log = new VideoLog("Bike Ride", "Went for a bike ride");
        try {
            log.attachFile("biking.mp4", "MP4", "Video content", 2048L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log created: " + log + "\n");
    }
}
