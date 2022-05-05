public class Nguoi {
    private int cmnd;
    private String name;
    private int age;
    private String job;

    public Nguoi(int cmnd, String name, int age, String job) {
        this.cmnd = cmnd;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "cmnd=" + cmnd +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
