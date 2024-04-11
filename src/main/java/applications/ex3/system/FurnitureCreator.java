package applications.ex3.system;

import applications.ex3.model.Chair;
import applications.ex3.model.Sofa;
import applications.ex3.model.Table;

public class FurnitureCreator {

    private final FurnitureFactory factory;

    public FurnitureCreator(FurnitureFactory factory){
        this.factory=factory;
    }

    public Chair createChair(){
        return factory.createChair();
    }

    public Sofa createSofa(){
        return factory.createSofa();
    }

    public Table createTable(){
        return factory.createTable();
    }
}
