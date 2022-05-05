import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class QLKS {

    LinkedList<Khach> khach = new LinkedList<>();


    public boolean checkCMND(int cmnd){
        boolean result = false;
        for (Khach cus:khach
             ) {
            if (cus.getCmnd() == cmnd){
                result = true;
            }
        }
        return result;
    }

    public void add(Khach cus){
        khach.add(cus);
    }

    public int getBill(Khach cus){
        HashMap<String,Integer> room = new HashMap();
        room.put("A", 500);
        room.put("B", 300);
        room.put("C", 100);

        int bill;
        if (cus.getCheckInDay() == cus.getChekOutDay()){
            bill = room.get(cus.getPhong().toString());
        }else {
            bill = (cus.getChekOutDay()-cus.getCheckInDay()) * room.get(cus.getPhong().toString());
        }
        return bill;
    }

    public void delete(int cmnd){
        int i;
        for (i=0; i<= khach.size(); i++){
            if (cmnd == khach.get(i).getCmnd()){
                break;
            }
        }
        khach.remove(i);
    }

    public void checkOut(int cmnd, int checkOutDay){
        int i;
        for (i=0; i<= khach.size(); i++){
            if (cmnd == khach.get(i).getCmnd()){
                break;
            }
        }


        khach.get(i).setChekOutDay(checkOutDay);

        if (checkOutDay<khach.get(i).getCheckInDay()){
            System.out.println("Nhập sai ngày check out");
        }else {
            System.out.println(getBill(khach.get(i)));
        }


    }


}
