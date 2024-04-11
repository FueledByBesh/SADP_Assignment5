package applications.ex3.system;

import applications.ex3.model.Chair;
import applications.ex3.model.Furniture;
import applications.ex3.model.Sofa;
import applications.ex3.model.Table;

public class ModernWoodFactory extends FurnitureFactory{

    @Override
    public Chair createChair() {
        return new Chair("Modern","Wood",7.3f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Modern","Wood",15.5f);
    }

    @Override
    public Table createTable() {
        return new Table("Modern","Wood",10.7f);
    }
}
