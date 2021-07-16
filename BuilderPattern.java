/*
*  For constructor with over 4 arguments now or in the future.
*  better than JavaBean Pattern https://stackoverflow.com/questions/328496/when-would-you-use-the-builder-pattern
*/
public class BuilderPattern {
    private int a;
    private int b;
    private int c;
    
    private BuilderPattern(Builder builder) {
        // TODO: parameter checking could be done here before actually building the object
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

   public static class Builder {
       private int a;
       private int b;
       private int c;

       public Builder addA(int a) {
           this.a = a;
           return this;
       }

       public Builder addB(int b) {
        this.b = b;
        return this;
       }

       public Builder addC(int c) {
        this.c = c;
        return this;
      }

      public BuilderPattern build() {
          return new BuilderPattern(this);
      }
   } 

   public static void main(String[] args) {
       BuilderPattern obj = new BuilderPattern.Builder().addA(a).addB(b).addC(c).build();
   }
}
