
class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("***每次必做的方法 創建一個 Person 物件");
        System.out.println("***每次必做的方法 給年齡預設值 0 ");
    }

    public Person(String name) {
        this();
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public void call() {
        System.out.println("姓名 : " + this.name + " 年齡 : " + this.age);
    }

}

class ThisTestPerson {

    public static void main(String[] args) {
        Person person = new Person("jim ", 20);
        person.call();

    }

}
