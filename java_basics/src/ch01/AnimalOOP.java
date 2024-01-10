package java_basics.src.ch01;

// 定義一個動物類別 class
class Animal {
    String name; // 動物的姓名
    int age; // 動物的年齡

    public void tell() {
        System.out.println("姓名:" + name + " ; 年齡:" + age);
    }
}
/**
 * AnimalOOP
 */
public class AnimalOOP {
    public static void main(String[] args) {
        // 宣告並實例化
        Animal cat = new Animal();
        System.out.println("尚未給物件屬性值");
        cat.tell();
        System.out.println("------------------------------");
        System.out.println("給予物件屬性值");
        cat.name = "tom";
        cat.age = 5;
        cat.tell();

    }
}
