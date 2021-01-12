package ListandSet;

import java.util.ArrayList;
import java.util.List;

    public class list {
        public static void main(String[] args) {
            List list=new ArrayList();
            list.add(1);
            list.add("hello world");
            list.add(true);
            list.add(1);
            System.out.println("当前集合的元素个数"+list.size());
            //遍历list中的所有元素
            for (int i=0;i<list.size();i++){
                System.out.println("输出集合内含的元素："+list.get(i));
            }
        }
    }

