import java.util.Set;
import java.util.TreeMap;

public class QLHS {
    TreeMap HocSinh = new TreeMap();



    public boolean checkSBD(int SBD){
        boolean result = false;
        result = HocSinh.containsKey(SBD);
        return result;
    }

    public void add(HocSinh hocSinh){
        if (!checkSBD(hocSinh.getSBD())){
            HocSinh.put(hocSinh.getSBD(),hocSinh);
        }else {
            System.out.println("SBD bị trùng");
        }
    }

    public void show(){
        Set<Integer> key = HocSinh.keySet();
        for (Integer keyvalue:key
             ) {
            System.out.println(HocSinh.get(keyvalue).toString());
        }
    }

    public void search(int sbd){
        if (HocSinh.containsKey(sbd)){
            System.out.println(HocSinh.get(sbd));
        }else {
            System.out.println("SBD khong ton tai");
        }
    }
}
