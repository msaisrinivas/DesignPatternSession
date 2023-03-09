package designpatterns.singleton;

public class Caching {

    private int count = 0;
    private String[] caching_array = new String[10];

    //    private static Caching caching = new Caching(); reference for eager Singleton
    private static Caching caching;

    private Caching() {
    }

    public static Caching getInstance() {
//        return caching;  reference for eager Singleton
        if (caching == null) {
            synchronized (Caching.class) {
                if (caching == null) {
                    caching = new Caching();
                }
            }
        }
        //check with reflection
        return caching;
    }

    public String addValuesIntoCache(String value) {
        if (count < 10) {
            caching_array[count] = value;
            count++;
            return "\"" + value + "\" is added into cache at " + (count - 1);
        }
        return "Cache is full";
    }

}

//enum singleton
//bulpug singleton