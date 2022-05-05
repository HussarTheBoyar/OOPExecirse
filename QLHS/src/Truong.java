import java.util.ArrayList;
import java.util.LinkedList;

public class Truong {
    private LinkedList<HocSinh> Lop = new LinkedList<>();

    public void add(HocSinh hocSinh){
        Lop.add(hocSinh);
    }

    public void show20(){
        System.out.println("Học sinh trên 20 tuổi");
        Lop.stream().filter(hocsinh->hocsinh.getAge()>=20).forEach(hocSinh -> System.out.println(hocSinh.toString()));
    }

    public void showAgeCountry(){
        System.out.println("Học sinh trên 23 tuổi và quê ở DN");
        Lop.stream().filter(hocSinh -> (hocSinh.getAge()>=23 && hocSinh.getCountry().equals("DN"))).forEach(hocSinh -> System.out.println(hocSinh.toString()));
    }


}
