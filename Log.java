package com.algonquin.loggy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Log {
    private String name;
    private String description;
    private Date date;
    private String internalID;
    private String shortCode;

    public Log(String name, String description) {
        this.name = name;
        this.description = description;
        this.date = new Date(); // current date and time
        this.internalID = UUID.randomUUID().toString(); // unique ID
        this.shortCode = generateShortCode();
    }

    private String generateShortCode() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public void create() {
        System.out.println("Log created with name: " + name);
    }

    public void read() {
        System.out.println("Reading log: " + name + ", Description: " + description);
    }

    public void update(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Log updated.");
    }

    public void delete() {
        System.out.println("Log deleted.");
    }

    public abstract void attachFile(String fileName, String fileType, String content, Long size) throws Exception;

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return "Log [name=" + name + ", description=" + description + ", date=" + formatter.format(date) +
                ", internalID=" + internalID + ", shortCode=" + shortCode + "]";
    }
}
