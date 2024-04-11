package applications.ex3.system;

import applications.ex3.model.Chair;
import applications.ex3.model.Sofa;
import applications.ex3.model.Table;

public class TraditionalMetalFactory extends FurnitureFactory{

    @Override
    public Chair createChair() {
        return new Chair("Traditional","Metal",10.5f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Traditional","Metal",20.2f);
    }

    @Override
    public Table createTable() {
        return new Table("Traditional","Metal",13.6f);
    }
}
