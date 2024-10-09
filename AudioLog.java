package com.algonquin.loggy;

public class AudioLog extends Log {
    public AudioLog(String name, String description) {
        super(name, description);
    }

    @Override
    public void attachFile(String fileName, String fileType, String content, Long size) throws Exception {
        if (!fileType.equalsIgnoreCase("MP3") && !fileType.equalsIgnoreCase("WAV")) {
            throw new Exception("Invalid file type for audio log. Only 'MP3' or 'WAV' are allowed.");
        }
        System.out.println("Audio file attached: " + fileName);
    }
}
