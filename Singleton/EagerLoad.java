package Singleton;
//Earger loading with static initialization, thread safe.
public class EagerLoad {
    private static EagerLoad mInner = new EagerLoad();
   
    private EagerLoad(){}

    public static EagerLoad getInstance(){
        return mInner;
    }
}
