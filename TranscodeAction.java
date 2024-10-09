package com.algonquin.loggy;

public class TranscodeAction implements Actionable {
    @Override
    public void performAction() {
        System.out.println("Transcoding video/audio...");
    }
}
