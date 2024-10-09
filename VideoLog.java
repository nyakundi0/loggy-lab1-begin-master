package com.algonquin.loggy;

public class VideoLog extends Log {
    public VideoLog(String name, String description) {
        super(name, description);
    }

    @Override
    public void attachFile(String fileName, String fileType, String content, Long size) throws Exception {
        if (!fileType.equalsIgnoreCase("MP4") && !fileType.equalsIgnoreCase("AVI")) {
            throw new Exception("Invalid file type for video log. Only 'MP4' or 'AVI' are allowed.");
        }
        System.out.println("Video file attached: " + fileName);
    }
}
