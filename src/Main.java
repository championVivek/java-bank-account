//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Account vivekAccount = new Account();

         vivekAccount.setNumber("12345");
         vivekAccount.setBalance(5000.0);
         vivekAccount.setCustomerName("Vivek kumar");
         vivekAccount.setCustomerEmail("vivekkumar@gmail.com");
         vivekAccount.setCustomerPhone("919956565656");

         vivekAccount.depositFunds(200.0);
         vivekAccount.withdrawFunds(100.0);

    }
}