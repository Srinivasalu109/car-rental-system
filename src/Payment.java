public interface Payment {

    public void proceedPayment(String paymentId,double amount);

    public void cancelPayment(String paymentId);

}
