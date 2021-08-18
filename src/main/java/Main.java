import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Travel destination1 = new Travel();
        destination1.getActivities();
        System.out.println(" Activities that can be done in the Trip:"+"\n");
        for (int i=0; i < destination1.getActivities().length;i++){
            System.out.println(destination1.getActivities()[i].getIdActivity()+": " + destination1.getActivities()[i].getName() + ", Price: $ " + destination1.getActivities()[i].getPrice());
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Select the activities to do in the trip: ");

        Activity selectedActivity = destination1.getActivities()[sc.nextInt()-1];
        destination1.addActivities(selectedActivity);

        for(int i = 0; i <destination1.getSelectedActivities().size(); i++){
            Activity var = (Activity)destination1.getSelectedActivities().get(i);
            System.out.println(var.getName() +", Price is $ " + var.getPrice());
        }

        System.out.println("\n" + "Total price of the activities selected is $ " + destination1.totalPrice());

        System.out.println("\n"+"List of Hotels in the Destiny: ");
        for( int i = 0; i <destination1.getHotel().length; i++){
            Hotel var = (Hotel)destination1.getHotel()[i];
            System.out.println(i+1 + ": " +var.getHotelName() + " , Price: "+ var.getRoomPrice());
        }
        System.out.println("\n"+"Select the Hotel to stay: ");
        int selectedHotel = sc.nextInt()-1;
        Hotel var = (Hotel)destination1.getHotel()[selectedHotel];
        System.out.println(var.getHotelName() +", Price: "+ var.getRoomPrice());

        System.out.println("\n"+"Enter the number of stay days at the Hotel");
        destination1.setStayDays(sc.nextInt());

        Hotel var1 = (Hotel)destination1.getHotel()[selectedHotel];
        double totalPrice = destination1.getStayDays()* var.getRoomPrice() + destination1.totalPrice();
        System.out.println("The Total Price of the Trip: $ "+ totalPrice);

    }
}
