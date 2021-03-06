import java.util.Scanner;

public class DeliveryCost {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        /**this is the main menu for the program and will allow for the user
         * to select where they would like to go when it comes to the next stage of the program
        **/
        System.out.println("1. Start Delivery Cost Calculation\n2. Help");
        int option = sc.nextInt();
        if(option==1){
        //this will ask the user what type of service they are using so that the program can calculate a price for them.
        System.out.println("What type of service are you using?\n1. Registered Delivery, 1st Class" +
                "\n2. Standard 1st Class\n3. Standard 2nd Class\n4. 48 Hrs Recorded Delivery");
        double delivery1 = 0.00;
        int answer1 = sc.nextInt();


        //this will ask the user how much weight their particular delivery can gone over.
        System.out.println("By how much is your product over the weight per unit?\n1. 1 Unit" +
                "\n2. 2 Units\n3. 3 Units\n4. 4 Units\n5. Over 4 Units");
        int check5 = 0;
        int answer2 = sc.nextInt();

        //this if statement will execute if the user has selected the primary method of delivery.
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
            //this if statement will execute if the user has selected the secondary method of delivery.
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
            //this if statement will execute if the user has selected the third method of delivery.
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
            //this if statement will execute if the user has selected the fourth method of delivery.
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
            //this if statement will execute if the user has not selected that they are using over 4 units of weight.
        if(check5 == 0){
            System.out.println("Delivery Cost: £" + delivery1);
        }
        //this if statement will execute if the user has selected that they are ordering over 4 units of weight.
        else if(check5 == 1){
            System.out.println("Your delivery cost is over £"+ delivery1);
        }
        //this if statement will execute if the user hasn't selected the correct or valid inputs.
        else{
            System.out.println("Please enter a valid input");
        }}
        else{
            System.out.println("For this program, you will need to enter certain different options for your delivery and" +
                    "\nusing these different options, the program will be able to calculate the cost for your delivery of the different items" +
                    "\nyou will need to enter the type of delivery as well as the extra weight in which the delivery is, over the base weight.");
        }
    }
}
