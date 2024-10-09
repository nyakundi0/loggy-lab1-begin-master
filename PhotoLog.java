package com.algonquin.loggy;

public class PhotoLog extends Log {
    public PhotoLog(String name, String description) {
        super(name, description);
    }

    @Override
    public void attachFile(String fileName, String fileType, String content, Long size) throws Exception {
        if (!fileType.equalsIgnoreCase("PNG") && !fileType.equalsIgnoreCase("JPEG")) {
            throw new Exception("Invalid file type for photo log. Only 'PNG' or 'JPEG' are allowed.");
        }
        System.out.println("Photo file attached: " + fileName);
    }
}
