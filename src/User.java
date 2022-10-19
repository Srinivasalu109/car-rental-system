import java.util.ArrayList;

public class User implements Auth,Payment,Company,AboutCar,Hire{

    private String userId;

    private String userName;

    private String email;

    private String phoneNumber;


    public void register(String userId,String userName,String email,String password,String  mobileNumber){}

    public void login(String email,String password){}

    public void changePassword(String email,String password){}

    public void logout(String email){}

    public void switchAccount(String email,String password){}

    public void proceedPayment(String paymentId,double amount){}

    public void cancelPayment(String paymentId){}

    public void aboutCompany(){}

    public void viewBranches(){}

    public void displayAvailableCars(){}

    public void viewCarDetails(String regNo){}

    public void viewNewModels(){}

    public void searchModel(String modelName){}

    public void hireCar(String regNo,String date,String dueDate){}

}
