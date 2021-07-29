package Factory.FactoryMethod;

//Each concrete factory be responsible for creating one specific product
public class AFactory implements IFactory {

    @Override
    public IProduct create() {
        return new ProductA();
    }
    
}
