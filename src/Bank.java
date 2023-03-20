public class Bank {

    public int idCode;
    public String bankLocation;
    public String bankName;
    private String corpAssociates;

    public Bank(int idCode, String bankLocation, String bankName, String corpAssociates) {
        this.idCode = idCode;
        this.bankLocation = bankLocation;
        this.bankName = bankName;
        this.corpAssociates = corpAssociates;
    }

    public Bank() {}

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCorpAssociates() {
        return corpAssociates;
    }

    public void setCorpAssociates(String corpAssociates) {
        this.corpAssociates = corpAssociates;
    }

    public String manages(){
        return "Bank account has been managed!";
    }

    public String maintains(){
        return "ATM has been maintained successfully!";
    }

    public String givesService(){
        return "Customer has been serviced!";
    }

    private String checkInfo(){
        Card card = new Card();
        return "Card with ID -> '" + card.getCardId() + "' has number: " + card.getCardNumber() + " and security code " + card.getSecurityCode();
    }
}
