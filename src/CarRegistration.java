interface CarRegistration {

    public void viewCarDetails(String regNo);

    public void addCarDetails(String regNo,String company,String carModel,double rentPerHour,String isAvailable);

    public void editCarDetails(String regNo,String company,String carModel,double rentPerHour,String isAvailable);

    public void deleteCarDetails(int regNo);

    public void cancel();

}
