package com.algonquin.loggy;

public class TranslateAction implements Actionable {
    @Override
    public void performAction() {
        System.out.println("Translating text...");
    }
}
