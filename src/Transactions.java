public class Transactions {

    public int transactionId;
    public String transactionData;
    public String transactionType;

    public Transactions(int transactionId, String transactionData, String transactionType) {
        this.transactionId = transactionId;
        this.transactionData = transactionData;
        this.transactionType = transactionType;
    }

    public Transactions() {}

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(String transactionData) {
        this.transactionData = transactionData;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String update(){
        return "Transactions have been updated!";
    }
}
