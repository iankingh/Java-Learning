package java_basics.src.ch01;


class Emp {
    private long empNo;
    private String ename;
    private String dept; // 部門名稱
    private double salary;

    public Emp() {
        this(1000, "無名氏", null, 0);
    }

    public Emp(long empNo) {
        this(empNo, "新員工", "未定", 0);
    }

    public Emp(long empNo, String ename, String dept) {
        this(empNo, ename, dept, 25000);
    }

    public Emp(long empNo, String ename, String dept, double salary) {
        this.empNo = empNo;
        this.ename = ename;
        this.dept = dept;
        this.salary = salary;
    }

    public String getInfo() {
        return "雇員編號:" + this.empNo +
                " 員工姓名:" + this.ename +
                " 部門名稱: " + this.dept +
                " 基本工資 : " + this.salary;
    }
}

/**
 * ThisTestEmp
 */
class ThisTestEmp {

    public static void main(String[] args) {
        Emp emp = new Emp();
        System.out.println(emp.getInfo());
        Emp emp2 = new Emp(7777);
        System.out.println(emp2.getInfo());
        Emp emp3 = new Emp(8888, "新進小菜雞", "大餅部門");
        System.out.println(emp3.getInfo());
        Emp emp4 = new Emp(9999, "老鳥", "加班加到爆部門", 50000);
        System.out.println(emp4.getInfo());
    }

}