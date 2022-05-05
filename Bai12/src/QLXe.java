import java.util.*;

public class QLXe {
    private Hashtable Car  = new Hashtable();
    private Hashtable Bike  = new Hashtable();
    private Hashtable Truck  = new Hashtable();




//Add document

    public void addVehicle(Vehicle vehicle){
        if (vehicle instanceof Car) {
            Car.put(vehicle.getID(), vehicle);
        }
        if (vehicle instanceof Bike) {
            Bike.put(vehicle.getID(), vehicle);
        }
        if (vehicle instanceof Truck) {
            Truck.put(vehicle.getID(), vehicle);
        }
    }

//Delete document

    public void deleteVehicle(String code){
        //First char of string take the type
        //The last string is index of doc in stored linkedlist
        String type = code.substring(0,1);

        switch (type){
            case "C":
                Car.remove(code);
                break;
            case "B":
                Bike.remove(code);
                break;
            case "T":
                Truck.remove(code);
                break;
            default:
                System.out.println("Mã sản phẩm không đúng");
        }
    }

//Show information of documents



//Search by ID

    public void searchCode(String code){
        String type = code.substring(0,1);
        String result = "Non-exist";
        switch (type){
            case "C":
                if (Car.containsKey(code)){
                    System.out.println(Car.get(code).toString());
                }else {
                    System.out.println(result);
                }
                break;
            case "B":
                if (Bike.containsKey(code)){
                    System.out.println(Bike.get(code).toString());
                }else {
                    System.out.println(result);
                }
                break;
            case "T":
                if (Truck.containsKey(code)){
                    System.out.println(Truck.get(code).toString());
                }else {
                    System.out.println(result);
                }
                break;
            default:
                System.out.println(result);
                break;
        }

    }

//Search by color
    public void searchByColor(String color){
        ArrayList result = new ArrayList<>();
        String checkCond = new StringBuilder("Color='").append(color).append("'").toString();
        Car.forEach((key, value) -> {
            if (value.toString().contains(checkCond)){
                result.add(Car.get(key));
            }
        });

        Truck.forEach((key, value) -> {
            if (value.toString().contains(checkCond)){
                result.add(Truck.get(key));
            }
        });

        Bike.forEach((key, value) -> {
            if (value.toString().contains(checkCond)){
                result.add(Bike.get(key));
            }
        });

        if (result.isEmpty()){
            System.out.println("Không có xe theo yêu cầu");
        }else {
            result.forEach(obj-> System.out.println(obj.toString()));
        }

    }


}
