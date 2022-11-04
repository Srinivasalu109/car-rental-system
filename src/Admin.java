import java.util.HashMap;
import java.util.Iterator;

public class Admin {

    private String password;

    static HashMap<String,Branch>branches;


    public void viewRentalCarDetails(){
        Iterator<String >it=Employee.rentalCar.keySet().iterator();
        while(it.hasNext()){
            String key=(String)it.next();

        }
    }

    public void viewSubscriptionCarDetails(){}

    public void viewRentalCarBooking(){}

    public void viewSubscriptionCarBookings(){}

    public static void viewEmployees(){}

    public static void appointManager(){}

    public static void removeManager(){}

    public static void viewManagers(){}

    public static void updateManagerDetails(){}

    public static void openBranch(){}

    public static void closeBranch(){}

    public static void updateBranchDetails(){}


}