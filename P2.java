import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Booking BO=new Booking();
        print print=new print();
        log_in log=new log_in();
        log.log();
        System.out.println("enter 1 = (booking) or 2 = (enquiry) or 3 = (exet)");
        int x=input.nextInt();
        switch (x){
            case 1:
                System.out.println("1-(Add another book)  2-(Cancel Booking)   3-(Print Booking)");
                        int ao=input.nextInt();
                        switch (ao){
                        case 1: BO.Personal();break;
                                case 2: BO.Cancel();break;
                                case 3: BO.print();break;

                                }
                                break;
                                case 2 :
                                BO.enquiry();break;

            case 3:
                System.exit(0);

                                }

                                }
                                }
