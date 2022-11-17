import java.util.Scanner;

public class log_in {
        public void log(){
            Scanner in = new Scanner(System.in);
            int m=4 , n=0 ;
            int x=12345,y=54321,z=98765,u=123456 ;
            System.out.println("Enter The user name:");
            String name = in.next();
            System.out.println("Enter The Password");
            int Password = in.nextInt();

            if ( name.equals("yahya")&& Password == x || name.equals("sallam") && Password == y || name.equals("khaled") && Password == z||name.equals("abood") && Password == u) {
                System.out.println("WELCOME " + name);
            }
            else if (m ==4){
                for (int i = 1; i <=3; i++) {
                    System.out.println("Enter The user name:");
                    name = in.next();
                    System.out.println("Enter The Password");
                    Password = in.nextInt();
                    if ( name.equals("hassan")&& Password == x || name.equals("abdulrhman") && Password == y || name.equals("khaled") && Password == z||name.equals("abood") && Password == u){
                        System.out.println("WELCOME " + name); i=3;}
                    else if (i==3){
                        System.out.println("الرجاء المحاوله بعد 10 دقائق");
                        System.exit(0);
                    }
                }

            }}



        public void exet(){
            System.out.println("شكر لزيارتك نظام حجز الطيران");
            System.exit(0);
        }
    }


