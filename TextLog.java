package com.algonquin.loggy;

public class TextLog extends Log {
    public TextLog(String name, String description) {
        super(name, description);
    }

    @Override
    public void attachFile(String fileName, String fileType, String content, Long size) throws Exception {
        if (!fileType.equalsIgnoreCase("TXT")) {
            throw new Exception("Invalid file type for text log. Only 'TXT' files are allowed.");
        }
        System.out.println("Text file attached: " + fileName);
    }
}
