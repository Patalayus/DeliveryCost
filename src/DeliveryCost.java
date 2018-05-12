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
            public double first = 2.00;
            public double second = 0.50;
            public double third = 0.20;
            public double fourth = 1.00;
        }
        System.out.println("What type of service are you using?z\n1. Registered Delivery, 1st Class\n2. Standard 1st Class\n3. Standard 2nd Class\n4. 48 Hrs Recorded Delivery");
        Scanner sc = new Scanner(System.in);
        double delivery1 = 0.00;
        int answer1 = sc.nextInt();

        System.out.println("By how much is your product over the weight per unit?\n1. 1 Unit\n2. 2 Units\n3. 3 Units\n4. 4 Units\n5. Over 4 Units");

        int check5 = 0;
        int answer2 = sc.nextInt();
        if(answer1==1){
            delivery1 += 7.15;
            if(answer2==1){
                delivery1 += 2.00;
            }if(answer2==2){
                delivery1 += 4.00;
            }if(answer2==3){
                delivery1 += 6.00;
            }if(answer2==4){
                delivery1 += 8.00;
            }if(answer2==5){
                check5 = 1;
                delivery1 += 10.00;
            }
        }else if(answer1==2){
            delivery1 += 5.00;
            if(answer2==1){
                delivery1 += 0.50;
            }if(answer2==2){
                delivery1 += 1.00;
            }if(answer2==3){
                delivery1 += 1.50;
            }if(answer2==4){
                delivery1 += 2.00;
            }if(answer2==5){
                check5 = 1;
                delivery1 += 2.50;
            }
        }else if(answer1==3){
            delivery1 += 2.20;
            if(answer2==1){
                delivery1 += 0.20;
            }if(answer2==2){
                delivery1 += 0.40;
            }if(answer2==3){
                delivery1 += 0.60;
            }if(answer2==4){
                delivery1 += 0.80;
            }if(answer2==5){
                check5 = 1;
                delivery1 += 1.00;
            }
        }else if(answer1==4){
            delivery1 += 6.20;
            if(answer2==1){
                delivery1 += 1.00;
            }if(answer2==2){
                delivery1 += 2.00;
            }if(answer2==3){
                delivery1 += 3.00;
            }if(answer2==4){
                delivery1 += 4.00;
            }if(answer2==5){
                check5 = 1;
                delivery1 += 5.00;
            }
        }
        if(check5 == 0){
            System.out.println("Delivery Cost: £" + delivery1);
        }else if(check5 == 1){
            System.out.println("Your delivery cost is over £"+ delivery1);
        }else{
            System.out.println("Please enter a valid input");
        }
    }
}
