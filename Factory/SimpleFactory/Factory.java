package Factory.SimpleFactory;

//only one factory to produce all products.
//cons: too many if-else
//pros: code to interface instead of implementation, save client code change
public class Factory {
   public static Product create(int type) {
       if(type == 1) {
            return new ProductA();
       } else if(type == 2) {
            return new ProductB();
       }
       return null;
   } 
}
