public class Bike extends Vehicle{
    private int Power;
    String type = "B";

    public Bike(String company, double price, String color, int power) {
        super(company, price, color);
        Power = power;
    }

    @Override
    public void setID(int code) {
        super.ID = new StringBuilder(type).append(code).toString();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "ID='" + ID + '\'' +
                ", Company='" + super.getCompany() + '\'' +
                ", Price=" + super.getPrice() +
                ", Color='" + super.getColor() + '\'' +
                "Power=" + Power +
                ", type='" + type + '\'' +
                '}';
    }
}
