public class Withdraw extends Transactions{

    public int withdrawId;
    public double withdrawAmount;

    public Withdraw(int withdrawId, double withdrawAmount) {
        super();
        this.withdrawId = withdrawId;
        this.withdrawAmount = withdrawAmount;
    }

    public int getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(int withdrawId) {
        this.withdrawId = withdrawId;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String withdraw(){
        return "An amount of " + getWithdrawAmount() + " has been withdrawn successfully!";
    }

    @Override
    public String update(){
        return "Withdraw transactions have been updated";
    }
}
