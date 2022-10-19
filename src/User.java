import java.util.ArrayList;

public class User implements Auth,Address,Payment,Company,AboutCar,Hire{
    
    private String customerId;

    private String email;

    private String password;

    private String presentAddress;

    private String permanentAddress;

    private String mobileNumber;

    private double address;

    private double amount;

    private String companyName;

    private String mainBranchLoc;

    private ArrayList<String> branchesAvailable;

    private String companyDetails;

    private String regNo;

    private String company;

    private String carModel;

    private String isAvailable;

    private String mileAge;

    private String pricePerHour;

    private String pricePerDay;

    private String pricePerWeek;

    private String pricePerMonth;

    private String pricePerYear;

    private String acAvailability;

    private String date;

    private String dueDate;

    private ArrayList<String> images;


    public void register(String customerId,String email,String password,String permanentAddress,String presentAddress,String mobileNumber){}

    public void login(String email,String password){}

    public void logout(String email){}

    public void changePassword(String email,String password){}

    public void switchAccount(String email,String password){}

    public void editProfile(String email,String password){}

    public void submitForm(String address){}
    
    public void paymentType(){}

    public void proceedPayment(double amount){}

    public void cancelPayment(){}

    public void aboutCompany(){}

    public void viewAllBranches(){}

    public void displayAvailableCars(){}

    public void viewCarDetails(String regNo){}

    public void viewNewModels(){}

    public void searchModel(String modelName){}

    public void rentFor(String rentalTime){}

    public void hireCar(String regNo){}

    public void submit(){}

    public void cancel(){}

}
