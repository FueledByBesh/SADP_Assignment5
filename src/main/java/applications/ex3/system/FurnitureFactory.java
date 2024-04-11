package applications.ex3.system;

import applications.ex3.model.Chair;
import applications.ex3.model.Sofa;
import applications.ex3.model.Table;

public abstract class FurnitureFactory {

    public FurnitureFactory(){
    }

    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract Table createTable();

}
