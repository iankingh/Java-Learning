public class AnimalOOP3 {
    
    public static void main(String[] args) {
        // 宣告並實例化
        Animal cat = new Animal();
        System.out.println("尚未給物件屬性值");
        cat.name = "tom";
        cat.age = 5;
        cat.tell();
        System.out.println("cat 記憶體位址 : " + cat.toString());
        Animal cat2 = new Animal(); // 尚未實例化所以沒有分配記憶體位址
        cat2.name = "咪咪";
        cat2.age = 3;
        cat2.tell();
        System.out.println("cat2 記憶體位址 : " + cat2.toString());
        cat2 = cat;
        System.out.println("cat2 記憶體位址 : " + cat2.toString());

    }
    
}
