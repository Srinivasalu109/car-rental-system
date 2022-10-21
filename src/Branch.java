public class Branch {

    private String branchId;

    private String branchName;

    private String branchAddress;

    public Manager manager;

    public void displayBranchDetails(String branchId){}

    public void openBranch(String branchId,String branchName,String branchAddress,String manager){}

    public void appointManager(String managerId,String managerName,String branch){}

    public void removeManager(String managerId){}

    public void updateManagerDetails(String managerId,String managerName,String branch){}

}
