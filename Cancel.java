import java.util.Scanner;


public class Cancel {
    public void Cancel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cancel booking");
        System.out.println("Enter The number of The reservation to be closed : ");
        int number = input.nextInt();
        System.out.println("cancel time booking : ");
        int[] cancel = new int[3];
        {
            for (int i = 0; i < cancel.length; i++) {
                cancel[i] = input.nextInt();
            }
        }
        System.out.println("The fine of 40$");
        System.out.println("Booking has been deleted");
    }
}