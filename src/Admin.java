
public class Admin implements  Bill,CarRegistration{

    private String adminId;

    private String adminName;

    private String adminRole;

    private int yearsOfeExperience;

    public void makeBill(int billNo,double retailFee,double fine,String totalAmount){}

    public void deleteBill(int billNo){}

    public void updateBill(int billNo,double retailFee,double fine ,String totalAmount){}

    public void viewCarDetails(String regNo){}

    public void addCarDetails(String regNo,String company,String carModel,double rentPerHour,String isAvailable){}

    public void editCarDetails(String regNo,String company,String carModel,double rentPerHour,String isAvailable){}

    public void deleteCarDetails(int regNo){}



}
