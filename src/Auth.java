interface Auth{

    public void register(String userId,String userName,String email,String password,String mobileNumber);

    public void login(String email,String password);

    public void logout(String email);

    public void changePassword(String email,String password);

    public void switchAccount(String email,String password);


}