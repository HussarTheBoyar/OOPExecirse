import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        QLXe qlXe = new QLXe();
        Scanner input = new Scanner(System.in);
        int carCount, bikeCount, truckCount;
        carCount = bikeCount = truckCount =1;

        String Company;
        double Price;
        String Color;
        
        int Sit;
        String Engine;
        String type = "C";
        int Power;
        int Weight;
        int key;
        String officerKey;


        boolean check = true;

        while (check){
            System.out.println("Nhập vào hoạt động bạn muốn thực hiện");
            System.out.println("1.Nhập thêm xe");
            System.out.println("2.Tìm kiếm xe theo mã");
            System.out.println("3.Tìm kiếm xe theo màu");
            System.out.println("4.Xóa xe theo mã");
            System.out.println("5.Thoát");

            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Nhập hãng");
                    input.skip("\\R?");
                    Company = input.nextLine();
                    //System.out.println(name);

                    System.out.println("Nhập giá");
                    Price = 0;
                    while (Price<=0){
                        try {
                            Price = input.nextInt();
                        }catch (Exception e){
                            System.out.println("Giá là số nguyên dương");
                            //System.out.println(e);
                        }
                    }

                    System.out.println("Nhập màu");
                    input.skip("\\R?");
                    Color = input.nextLine();
                    //System.out.println(name);


                    System.out.println("Chọn kiểu xe muốn nhập:");
                    System.out.println("C: Ô tô");
                    System.out.println("B: Xe máy");
                    System.out.println("T: Xe tải");

                    input.skip("\\R?");
                    officerKey = input.nextLine();

                    switch (officerKey){
                        case "C":
                            System.out.println("nhập hanngx động cơ");
                            input.skip("\\R?");
                            Engine = input.nextLine();
                            System.out.println("Nhập số chỗ ngồi");
                            Sit = 0;
                            while (Sit<=0 || Sit >45){
                                try {
                                    Sit = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Số chỗ phải từ 4-45");
                                    //System.out.println(e);
                                }
                            }
                            Vehicle car = new Car(Company,Price,Color,Sit,Engine);
                            car.setID(carCount);
                            carCount++;
                            qlXe.addVehicle(car);
                            break;
                        case "B":
                            System.out.println("Nhập công suất");
                            Power = 0;
                            while (Power<=0 ){
                                try {
                                    Power = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Công suất phải dương");
                                    //System.out.println(e);
                                }
                            }
                            Vehicle bike = new Bike(Company,Price,Color,Power);
                            bike.setID(bikeCount);
                            bikeCount++;
                            qlXe.addVehicle(bike);
                            break;
                        case "P":
                            System.out.println("Nhập tải trọng");
                            Weight = 0;
                            while (Weight<=0 ){
                                try {
                                    Weight = input.nextInt();
                                }catch (Exception e){
                                    System.out.println("Tải trọng phải dương");
                                    //System.out.println(e);
                                }
                            }
                            Vehicle truck = new Bike(Company,Price,Color,Weight);
                            truck.setID(truckCount);
                            truckCount++;
                            qlXe.addVehicle(truck);
                            break;
                    }

                    break;


                case 2:
                    System.out.println("Nhập mã số xe");
                    input.skip("\\R?");
                    String searchCode = input.nextLine();
                    qlXe.searchCode(searchCode);
                    break;

                case 3:
                    System.out.println("Nhập màu xe");
                    input.skip("\\R?");
                    String searchColor = input.nextLine();
                    qlXe.searchByColor(searchColor);

                    break;

                case 4:
                    System.out.println("Nhập mã xe");
                    input.skip("\\R?");
                    String code = input.nextLine();
                    qlXe.deleteVehicle(code);
                    break;

                case 5:
                    check =false;
                    break;

            }

        }

    }
}
