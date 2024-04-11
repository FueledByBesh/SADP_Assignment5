package applications.ex2.system;

public class Data {
    private String type;
    private Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public Object getContent() {
        return content;
    }
}