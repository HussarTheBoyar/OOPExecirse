public class Car extends Vehicle{
    private int Sit;
    private  String Engine;
    private String type = "C";

    public Car(String company, double price, String color, int sit, String engine) {
        super(company, price, color);
        Sit = sit;
        Engine = engine;
    }


    @Override
    public void setID(int code) {
        super.ID = new StringBuilder(type).append(code).toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID='" + ID + '\'' +
                ", Company='" + super.getCompany() + '\'' +
                ", Price=" + super.getPrice() +
                ", Color='" + super.getColor() + '\'' +
                "Sit=" + Sit +
                ", Engine='" + Engine + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
