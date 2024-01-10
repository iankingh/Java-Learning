package JavaBs_Part1.src.ch01;

public class StringTest {
    
    // String不是基本類型
    static String str1 = "";// 生成一個String類型的引用，而且分配記憶體空間來存放"";
    static String str2; // 只生成一個string類型的引用；不分配記憶體空間,預設為null
    public static void main(String[] args) {
        System.out.println("String字串的預設值：" + str1 + "str的默認長度：" + str1.length());
        System.out.println("String字串的預設值：" + str2);

    }
}
