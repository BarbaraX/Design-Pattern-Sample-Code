package Factory.FactoryMethod;

public class BFactory implements IFactory{

    @Override
    public IProduct create() {
        return new ProductB();
    }
    
}
