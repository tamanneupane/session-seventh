package day5.encapsulation;

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account();
//        account1.name = "Taman";
        account1.setName("Taman");
//        account1.accountNumber = "asdasdasd231";
        account1.setAccountNumber("asdasdasd231");
//        account1.accountType = AccountType.STUDENT;
        account1.setAccountType(AccountType.STUDENT);
//        account1.accountBalance = 20000;
        account1.setAccountBalance(20000);
//        account1.socialSecurityNumber = "tsh441144";
        account1.setSocialSecurityNumber("tsh441144");


        Account account2 = new Account();
//        account1.name = "Taman";
        account2.setName("Tamanasd");
//        account1.accountNumber = "asdasdasd231";
        account2.setAccountNumber("asddasd231");
//        account1.accountType = AccountType.STUDENT;
        account2.setAccountType(AccountType.STUDENT);
//        account1.accountBalance = 20000;
        account2.setAccountBalance(2000);
//        account1.socialSecurityNumber = "tsh441144";
        account2.setSocialSecurityNumber("tsh451144");


//        System.out.println(account1.getSocialSecurityNumber());

        account1.transferBalance(account1, account2, 100);


    }
}
