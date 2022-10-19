
public class Admin implements  Bill,CarRegistration{

    private String customerId;

    private double retailFee;

    private double fine;

    private int daysElapsed;

    private double totalAmount;

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


    public void makeBill(){}

    public void addBill(){}

    public void deleteBill(){}

    public void cancelBill(){}

    public void viewCarDetails(String regNo){}

    public void addCarDetails(String regNo,String company,String carModel,boolean isAvailable){}

    public void editCarDetails(String regNo,String company,String carModel,boolean isAvailable){}

    public void deleteCarDetails(int regNo){}

    public void cancel(){}


}
