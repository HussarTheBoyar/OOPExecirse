public class HocSinh {
    private String name;
    private int age;
    private String Lop;

    public HocSinh(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        Lop = lop;
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

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Lop='" + Lop + '\'' +
                '}';
    }
}
