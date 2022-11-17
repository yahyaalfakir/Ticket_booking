import java.util.Scanner;


public class CUN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int enq;
        System.out.println("if you want international enter(1):");
        System.out.println("if you want local enter(2):");
        System.out.println("if you want EXTA(3):");
        enq = in.nextInt();
        switch (enq) {
            case 1: {
                System.out.println("what countries would you like to travel to? ");
                System.out.println(" enter 1 =America, enter 2=Russia, enter 3=Britain, enter 4 =Saudi, enter 5=Turkey");
                Scanner i = new Scanner(System.in);
                int x = i.nextInt();
                if (x == 1) {
                    System.out.println("America");
                    System.out.println("Choose the city you want to go to:");
                    System.out.println("enter 1=New york, enter 2= Washington");
                    int j = i.nextInt();
                    if (j == 1) {
                        System.out.println("NEW York");
                    } else if (j == 2) {
                        System.out.println("WASH");

                    }
                } else if (x == 2) {
                    System.out.println("Russia");
                    System.out.println("Choose the city you want to go to:");
                    System.out.println("enter 1=sanbetrs, enter 2= mocco");
                    int j = i.nextInt();
                    if (j == 1) {
                        System.out.println("sanbetrs");
                    } else if (j == 2) {
                        System.out.println("mocco");


                    }
                } else if (x == 3) {
                    System.out.println("Britain");
                    System.out.println("Choose the city you want to go to:");
                    System.out.println("enter 1=London, enter 2= Britna");
                    int j = i.nextInt();
                    if (j == 1) {
                        System.out.println("London");
                    } else if (j == 2) {
                        System.out.println("Britna");


                    }


                } else if (x == 4) {
                    System.out.println("Saudi");
                    System.out.println("Choose the city you want to go to:");
                    System.out.println("enter 1=Ride, enter 2= Damam");
                    int j = i.nextInt();
                    if (j == 1) {
                        System.out.println("Ride");
                    } else if (j == 2) {
                        System.out.println("Damam");


                    }


                } else if (x == 5) {
                    System.out.println("Turkey");
                    System.out.println("Choose the city you want to go to:");
                    System.out.println("enter 1=Astnbul, enter 2= Ankra");
                    int j = i.nextInt();
                    if (j == 1) {
                        System.out.println("Astnbul");
                    } else if (j == 2) {
                        System.out.println("Ankra");


                    }


                }

                System.out.println("----------------");
                System.out.println("satrday:                                  -     s  sundy:                                         Mondy:                                                  TUESDAY:                                                 ");
                System.out.println("The time: \t2:35PM\t 8:350PM\t 9:00AM     -    The time: \t12:00PM 3:00PM\t 7:00AM            The time: 12:00PM  3:00PM  7:00AM                 The time: \t12:00PM\t 3:00PM\t 7:00AM                                                                            ");
                System.out.println("The translation: Egypt, Malaysia, canada  -     The translation: Egypt, Malaysia, canada        The translation: Egypt, Malaysia, canada                 The translation: Egypt, Malaysia, canada                                                                          ");
                System.out.println("The Price: 2000$                           -    The Price: 2000$                                The Price: 2000$                                         The Price: 2000$                                                            ");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                          ");
                System.out.println(" WENSDAY:                                                THARSDAY:                                            FRIDY:                                                                                                                                               ");
                System.out.println("The time: \t2:35PM\t 8:350PM\t 9:00AM                    The time: \t2:35PM\t 8:350PM\t 9:00AM              The time: \t2:35PM\t 8:350PM\t 9:00AM                                                                                                                                                                                    ");
                System.out.println("The translation: Egypt, Malaysia, canada                 The translation: Egypt, Malaysia, canada           The translation: Egypt, Malaysia, canada                                                                                                                                                                                     ");
                System.out.println(" The Price: 2000$                                        The Price: 2000$                                   The Price: 2000$                                                                                                                                ");
            }
                case 2: {
                System.out.println("welcom to enquiry local");
                int city;
                System.out.println("what city would you like to travel to? ");
                System.out.println(" enter 1 =Sana, enter 2=Tazi, enter 3=IBB, enter 4 =Adan, enter 5=ALhudida");
                    Scanner e=new Scanner(System.in);
               int  m= e.nextInt();
                if (m== 1) {
                    System.out.println("Sana:");

                    }
                    if (m== 2) {
                        System.out.println("Tazi:");

                    }
                    if (m== 3) {
                        System.out.println("IBB:");

                    }
                    if (m== 4) {
                        System.out.println("Adan:");

                    }
                    if (m== 5) {
                        System.out.println("ALhudida:");

                    }


                }

                System.out.println("----------:");
                System.out.println("  satrday:                                                Monday:                                            THARSDAY:                                                                                                                                               ");
                System.out.println("The time: \t2:35PM\t 8:350PM\t 9:00AM                 The time: \t2:35PM\t 8:350PM\t 9:00AM            The time: \t2:35PM\t 8:350PM\t 9:00AM                                                                                                                                                                                    ");
                System.out.println( "The Price: 80000YR                                      The Price: 80000YR                                  The Price: 80000YR  ");

            case 3:{
                System.out.println(" THANKS FOR VISITING US....-_-");
                System.exit(0);
            }
            }


        }

    }

