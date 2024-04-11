package applications.ex2.appinterface;

import applications.ex2.system.*;

public class AppEx2 {

    public static void main(String[] args) {
        // Simulate incoming data
        Data textData = new Data("text", "Hello, world!");
        Data audioData = new Data("audio", "Audio content");
        Data videoData = new Data("video", "Video content");

        // Process the data
        DataProcessorCreator processorCreator = new DataProcessorCreator();

        processorCreator.setProcessor(new TextDataProcessor());
        processorCreator.processData(textData);

        processorCreator.setProcessor(new AudioDataProcessor());
        processorCreator.processData(audioData);

        processorCreator.setProcessor(new VideoDataProcessor());
        processorCreator.processData(videoData);

    }
}
