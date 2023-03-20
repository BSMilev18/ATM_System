public class ATM {

    public int atmId;
    public String atmLocation;
    private String managedBy;

    public ATM(int atmId, String atmLocation, String managedBy) {
        this.atmId = atmId;
        this.atmLocation = atmLocation;
        this.managedBy = managedBy;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public String getAtmLocation() {
        return atmLocation;
    }

    public void setAtmLocation(String atmLocation) {
        this.atmLocation = atmLocation;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    public String accessInfo(){
        Account acc = new Account();
        return "Account of type: " + acc.getAccountType() + " belongs to " + acc.getAccountOwner() + " and was created on " + acc.getDateOfCreation();
    }

    public String transactions(){
        Transactions trans = new Transactions();
        return "ATM has managed a total of " + trans.getTransactionId();
    }
}
