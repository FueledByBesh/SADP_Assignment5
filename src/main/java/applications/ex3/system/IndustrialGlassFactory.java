package applications.ex3.system;

import applications.ex3.model.Chair;
import applications.ex3.model.Sofa;
import applications.ex3.model.Table;

public class IndustrialGlassFactory extends FurnitureFactory{

    @Override
    public Chair createChair() {
        return new Chair("Industrial","Glass",15.6f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Industrial","Glass",30.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Industrial","Glass",24.6f);
    }
}
