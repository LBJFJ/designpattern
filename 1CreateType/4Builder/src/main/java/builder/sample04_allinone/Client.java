package builder.sample04_allinone;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Client {

    public static void main(String[] args) {
        testKeySetByBuilder();
    }

    private static void testKeySetByBuilder() {
        Map<Person, Long> hashMap = new ConcurrentHashMap<Person, Long>();
        hashMap.put(new Person.Builder("Jingqi Zhao").favorite("Learning").build(), 5L);
        hashMap.put(new Person.Builder("Jingyu Zhao").favorite("Eat").birthPlace("Zhao Country").build(), 3L);
        hashMap.put(new Person.Builder("Mengtian Luan").favorite("Music").birthPlace("AnHui Provience").build(), 2L);
        
        for(int i=0; i<3; i++) {
            System.out.println(hashMap.keySet());
        }
    }
}
