public class Text01 {
    public static void main(String[] args) {
        //去除所有空格
        String str=" hello world ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim().length());
        System.out.println(str.trim());
        //正则表达式去除空格
        System.out.println(str.replaceAll("\\s", ""));

    }

}
