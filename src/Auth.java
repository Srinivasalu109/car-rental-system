interface Auth{

    public void register(String customerId,String email,String password,String permanentAddress,String presentAddress,String mobileNumber);

    public void login(String email,String password);

    public void logout(String email);

    public void changePassword(String email,String password);

    public void switchAccount(String email,String password);

    public void editProfile(String email,String password);

}