public class Transfer extends Transactions{

    public int transferId;
    public double transferAmount;

    public Transfer(int transferId, double transferAmount) {
        super();
        this.transferId = transferId;
        this.transferAmount = transferAmount;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String transfer(){
        return "An amount of " + getTransferAmount() + " has been transferred successfully!";
    }

    @Override
    public String update(){
        return "Transfer transactions have been updated";
    }
}
