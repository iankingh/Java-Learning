package java_basics.src.ch01;

public class AnimalOOP2 {
    public static void main(String[] args) {
        // 宣告並實例化
        Animal cat = new Animal();
        System.out.println("尚未給物件屬性值");
        System.out.println("cat 記憶體位址 : " + cat.toString());
        cat.tell();
        System.out.println("------------------------------");
        System.out.println("給予物件屬性值");
        cat.name = "tom";
        cat.age = 5;
        cat.tell();
        Animal cat2 = null; // 尚未實例化所以沒有分配記憶體位址
        cat2 = cat;
        System.out.println("cat 2記憶體位址 : " + cat2.toString());
    }
}
