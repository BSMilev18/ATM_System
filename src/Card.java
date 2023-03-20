public class Card {

    public int cardId;
    public String cardOwner;
    public String cardType;
    private String cardNumber;
    private int securityCode;

    public Card(int cardId, String cardOwner, String cardType, String cardNumber, int securityCode) {
        this.cardId = cardId;
        this.cardOwner = cardOwner;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    public Card() {}

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
