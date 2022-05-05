public class Truck extends Vehicle{
    private int Weight;
    String type = "T";

    public Truck(String company, double price, String color, int weight) {
        super(company, price, color);
        Weight = weight;
    }

    @Override
    public void setID(int code) {
        super.ID = new StringBuilder(type).append(code).toString();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "ID='" + ID + '\'' +
                ", Company='" + super.getCompany() + '\'' +
                ", Price=" + super.getPrice() +
                ", Color='" + super.getColor() + '\'' +
                "Weight=" + Weight +
                ", type='" + type + '\'' +
                '}';
    }
}
