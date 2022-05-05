public class Nguoi {
    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;
    private String name;
    private int age;
    private String hometown;
    private String id;

    public Nguoi(double salary, double bonus, double penaty, String name, int age, String hometown) {
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public double getRealSalary() {
        return realSalary ;
    }

    public void setRealSalary() {
        this.realSalary = salary+bonus-penaty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", penaty=" + penaty +
                ", realSalary=" + realSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
