import java.util.LinkedList;

public class QLGV {
    private LinkedList<Nguoi> Teacher = new LinkedList<>();

    public void add(Nguoi giaoVien){
        Teacher.add(giaoVien);
    }

    public boolean checkId(String id){
        boolean result = false;
        for (Nguoi giaoVien:Teacher
             ) {
            if (giaoVien.getId().equals(id)){
                result = true;
                break;
            }
        }
        return result;
    }

    public void delete(String id){
        int i = 0;
        for (i=0; i<Teacher.size();i++){
            if (Teacher.get(i).getId().equals(id)){
                break;
            }
        }
        Teacher.remove(i);
    }

    public void show(){
        Teacher.stream().forEach(gv-> System.out.println(gv.toString()));
    }
}
