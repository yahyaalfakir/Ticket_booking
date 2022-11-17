import java.util.Scanner;

public class P1 {
    int h ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x[]= {12345,54321,98765,123456} ;
        System.out.println("enter");
        System.out.println("1 = (LOG) or 2 = (EXET)  ");
        int viwu=in.nextInt();
        switch (viwu){

            case 1:
                System.out.println("Enter The user name:");
                String name = in.next();
                System.out.println("Enter The Password");
                int Password = in.nextInt();


                if ( name.equals("yahya")&& Password == x[0] || name.equals("sallam") && Password == x[1] || name.equals("khaled") && Password == x[2] ||name.equals("abood") && Password == x[3]){
                    System.out.println("WELCOME "+name);

                    System.out.println("enter ");
                    System.out.println("1 = (booking_flight) or 2 = (enquiry) or 3 = (exet)");
                    int airline=in.nextInt();
                    switch (airline){

                        case 1:
                            Scanner input=new Scanner(System.in);
                            System.out.println("enter"+"\n"+"1 = (Personal) or 2 = (exit)");
                            int Personal_information=input.nextInt();
                            switch (Personal_information){
                                case 1:
                                    System.out.println("Enter the information . ");
                                    System.out.printf("Enter the name of the traveler : ");
                                    String name1_of_the_traveler=input.next();
                                    String name2_of_the_traveler=input.next();
                                    String name3_of_the_traveler=input.next();
                                    System.out.printf("Enter the surname : ");
                                    String surname=input.next();
                                    System.out.printf("Enter the gender : ");
                                    String gender =input.next();
                                    System.out.printf("Birth date :");
                                    int Birth1_date=input.nextInt();
                                    int Birth2_date=input.nextInt();
                                    int Birth3_date=input.nextInt();
                                    System.out.printf("Passport No :");
                                    int Passport=input.nextInt();
                                    System.out.printf("Enter the Nationality : ");
                                    String Nationality=input.next();
                                    System.out.println("Does the traveler have any disease ? with the name of the disese ?");
                                    String disease=input.next();
                                    String name_disease=input.next();
                                    System.out.println("Do you want to proceed to flight booking ?  OR   Exit ?");
                                    System.out.println("enter "+"\n"+" 1 = (destination) or 2 = (exit)");
                                    int reservation=input.nextInt();
                                    switch (reservation) {
                                        case 1:
                                            System.out.printf("Enter flight no from : ");
                                            String from1 = input.next();
                                            System.out.printf("The country you want to travel to : ");
                                            String from2 = input.next();
                                            System.out.println("flight class : Normal degree  OR   Business degree  OR   Vip degree");
                                            String degree1 = input.next();
                                            String degree2 = input.next();
                                        case 2 :
                                            System.out.println();
                                    }break;
                                case 2:
                                    System.out.println();

                            }break;


                        case 2:
                            int enq;
                            System.out.println("if you want international enter(1):");
                            System.out.println("if you want local enter(2):");
                            enq=in.nextInt();
                            switch (enq){
                                case 1:
                                    System.out.println("welcom to enquiry international");
                                    int countery;
                                    System.out.println("what countries would you like to travel to? ");
                                    System.out.println(" enter 1 =America, enter 2=Russia, enter 3=Britain, enter 4 =Saudi, enter 5=Turkey");
                                    countery=in.nextInt();
                                    switch (countery){
                                        case 1:{
                                            System.out.println("America");
                                            System.out.println("Choose the city you want to go to:");
                                            System.out.println( "enter 1=New york, enter 2= Washington");
                                            int city;
                                            city=in.nextInt();
                                            switch (city) {
                                                case 1:
                                                    System.out.println("satrday:                                  -     s  sundy:                                         Mondy:                                                  TUESDAY:                                                 ");
                                                    System.out.println("The time: \t2:35PM\t 8:350PM\t 9:00AM     -    The time: \t12:00PM 3:00PM\t 7:00AM            The time: 12:00PM  3:00PM  7:00AM                 The time: \t12:00PM\t 3:00PM\t 7:00AM                                                                            ");
                                                    System.out.println("The translation: Egypt, Malaysia, canada  -     The translation: Egypt, Malaysia, canada        The translation: Egypt, Malaysia, canada                 The translation: Egypt, Malaysia, canada                                                                          ");
                                                    System.out.println("The Price: 2000$                           -    The Price: 2000$                                The Price: 2000$                                         The Price: 2000$                                                            ");
                                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                          ");
                                                    System.out.println(" WENSDAY:                                                THARSDAY:                                            FRIDY:                                                                                                                                               ");
                                                    System.out.println("The time: \t2:35PM\t 8:350PM\t 9:00AM                    The time: \t2:35PM\t 8:350PM\t 9:00AM              The time: \t2:35PM\t 8:350PM\t 9:00AM                                                                                                                                                                                    ");
                                                    System.out.println("The translation: Egypt, Malaysia, canada                 The translation: Egypt, Malaysia, canada           The translation: Egypt, Malaysia, canada                                                                                                                                                                                     " );
                                                    System.out.println(" The Price: 2000$                                        The Price: 2000$                                   The Price: 2000$                                                                                                                                "); break;
                                                case 2:


                                            }
                                            break;
                                        }

                                        case 2:
                                            System.out.println("Russia");
                                            System.out.println("Choose the city you want to go to:");
                                            int city2;
                                            city2=in.nextInt();
                                            switch (city2){

                                            }

                                        case 3:
                                            System.out.println("Britain");
                                            System.out.println("Choose the city you want to go to:");
                                            int city3;
                                            city3=in.nextInt();
                                            switch (city3){

                                            }

                                        case 4:
                                            System.out.println("Saudi");
                                            System.out.println("Choose the city you want to go to:");
                                            int city4;
                                            city4=in.nextInt();
                                            switch (city4){

                                            }

                                        case 5:
                                            System.out.println("Turkey");
                                            System.out.println("Choose the city you want to go to:");
                                            int city5;
                                            city5=in.nextInt();
                                            switch (city5){

                                            }


                                    }
                                    break;
                                case 2:
                                    System.out.println("welcom to enquiry local");break;


                                case 3:
                                    System.out.println("EXTA");break;
                            }
                        case 3:
                            System.out.println();
                    }
                }

                else  {
                    System.out.println("You have in Error");
                    System.out.println("Enter the user name");
                    name= in.next();
                    System.out.println("Enter The Password");
                    Password = in.nextInt();
                } break;
            case 3:
                System.out.println();
        }

    }


}

