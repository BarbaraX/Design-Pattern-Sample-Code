package Singleton;

public class LazyLoad {
    private LazyLoad(){}

    public static LazyLoad getInstance(){
        return Inner.instance;
    }

    private static class Inner {
        private static final LazyLoad instance = new LazyLoad();
    }
}
