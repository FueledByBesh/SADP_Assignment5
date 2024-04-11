package applications.ex2.system;

public class DataProcessorCreator {
    private DataProcessor processor;

    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    public void processData(Data data) {
        processor.process(data);
    }
}