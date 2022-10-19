public interface Bill {

    public void makeBill(int billNo,double retailFee,double fine ,String totalAmount);

    public void updateBill(int billNo,double retailFee,double fine,String totalAmount);

    public void deleteBill(int billNo);

}
