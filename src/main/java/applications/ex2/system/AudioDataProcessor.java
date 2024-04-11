package applications.ex2.system;

public class AudioDataProcessor extends DataProcessor{

    @Override
    void process(Data data) {
        System.out.println("Processing audio data: " + data.getContent());
    }

}
