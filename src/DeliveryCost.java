import java.util.Scanner;

public class DeliveryCost {

    public static void main(String []args){
        class TypeofService{
            public double RegisteredDelivery1stClass;
            public double Standard1stClass;
            public double Standard2ndClass;
            public double RecordedDelivery;
        }
        class BasicCharge{
            public double registeredstandard = 7.15;
            public double standard = 5.00;
            public double standard2 = 2.20;
            public double recorded = 6.20;
        }
        class ExtraChargeperUnitWeight{
            public double first = 2.0;
            public double second = 0.5;
            public double third = 0.2;
            public double fourth = 1.0;
        }
        System.out.println("What type of service are you using?z\n1. Registered Delivery, 1st Class\n2. Standard 1st Class\n3. Standard 2nd Class\n 4. 48 Hrs Recorded Delivery");
        Scanner sc = new Scanner(System.in);
        double delivery1 = 0.0;
        int answer1 = sc.nextInt();
        if(answer1==1){
            delivery1 += 9.15;
        }else if(answer1==2){
            delivery1 += 5.50;
        }else if(answer1==3){
            delivery1 += 2.40;
        }else if(answer1==4){
            delivery1 += 7.20;
        }
        System.out.println("Delivery Cost: "+delivery1);
    }
}
