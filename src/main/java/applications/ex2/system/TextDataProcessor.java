package applications.ex2.system;

public class TextDataProcessor extends DataProcessor{

    @Override
    void process(Data data) {
        System.out.println("Processing text data: " + data.getContent());
    }

}
