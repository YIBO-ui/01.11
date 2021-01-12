package ListandSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(85);
        set.add("hello world");
        set.add(88.55f);
        set.add(false);
        set.add(85);

        System.out.println("集合的元素个数为："+set.size());

        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println("集合内含的元素："+iterator.next());
        }
    }
}


