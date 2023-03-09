package designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Caching cache1 = Caching.getInstance();
        Caching cache2 = Caching.getInstance();

        if (cache1 == cache2) {
            System.out.println("Both Caches are same");
        }

        System.out.println(cache1.addValuesIntoCache("value1 from cache1"));
        System.out.println(cache2.addValuesIntoCache("value2 from cache2"));
        System.out.println(cache1.addValuesIntoCache("value3 from cache1"));
        System.out.println(cache2.addValuesIntoCache("value4 from cache2"));
    }
}
