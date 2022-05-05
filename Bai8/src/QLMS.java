import java.util.TreeMap;
import java.util.regex.Pattern;

public class QLMS {
    private TreeMap<Integer,TheMuonSach> danhSachMuon = new TreeMap<Integer, TheMuonSach>();

    public boolean checkCode(Integer code){
        return danhSachMuon.containsKey(code);
    }

    public void add(TheMuonSach theMuonSach){
        if (!checkCode(theMuonSach.getCode())){
            danhSachMuon.put(theMuonSach.getCode(),theMuonSach);
        } else {
            System.out.println("Thẻ đã tòn tại");
        }
    }


    public void delete(Integer code){
        if (checkCode(code)){
            danhSachMuon.remove(code);
        } else {
            System.out.println("Thẻ không tồn tại");
        }
    }


    public void search(Integer code){
        if (checkCode(code)){
            String data = danhSachMuon.get(code).toString();
            System.out.println(data);
        } else {
            System.out.println("Thẻ không tồn tại");
        }
    }

    public boolean checkDate(String date){
        boolean result = true;

        Pattern codePattern = Pattern.compile("[0-9]+-[0-9]+-[0-9]{4}");
        result = codePattern.matcher(date).matches();

        if (result){
            int day = Integer.valueOf(date.split("-")[0]);
            int month = Integer.valueOf(date.split("-")[1]);
            //int year = Integer.valueOf(date.split("/")[2]);



            if (day<1||day>31||month<1||month>12) {
                result = false;
            }
        }
        //boolean logic = day<1||day>31||month<1||month>12;
        return result;
    }

}
