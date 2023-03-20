public class Account extends Bank {

    public String accountType;
    public String accountOwner;
    private String dateOfCreation;
    private double deposit;

    public Account(String accountType, String accountOwner, String dateOfCreation, double deposit) {
        super();
        this.accountType = accountType;
        this.accountOwner = accountOwner;
        this.dateOfCreation = dateOfCreation;
        this.deposit = deposit;
    }

    public Account() {}

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
