public class CardValidator {

    public String identifyCardBrand(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            return "Unknown";
        }

        if (cardNumber.startsWith("4")) {
            return "Visa";
        }

        if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
            return "American Express";
        }

        if (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") ||
            cardNumber.startsWith("54") || cardNumber.startsWith("55")) {
            return "MasterCard";
        }

        int prefix = Integer.parseInt(cardNumber.substring(0, 4));
        if (prefix >= 2221 && prefix <= 2720) {
            return "MasterCard";
        }

        if (cardNumber.startsWith("300") || cardNumber.startsWith("301") || cardNumber.startsWith("302") ||
            cardNumber.startsWith("303") || cardNumber.startsWith("304") || cardNumber.startsWith("305") ||
            cardNumber.startsWith("36") || cardNumber.startsWith("38") || cardNumber.startsWith("39")) {
            return "Diners Club";
        }

        if (cardNumber.startsWith("6011") || cardNumber.startsWith("65")) {
            return "Discover";
        }

        prefix = Integer.parseInt(cardNumber.substring(0, 6));
        if (prefix >= 622126 && prefix <= 622925) {
            return "Discover";
        }

        prefix = Integer.parseInt(cardNumber.substring(0, 3));
        if (prefix >= 644 && prefix <= 649) {
            return "Discover";
        }

        if (cardNumber.startsWith("2014") || cardNumber.startsWith("2149")) {
            return "EnRoute";
        }

        prefix = Integer.parseInt(cardNumber.substring(0, 4));
        if (prefix >= 3528 && prefix <= 3589) {
            return "JCB";
        }

        if (cardNumber.startsWith("8699")) {
            return "Voyager";
        }

        if (cardNumber.startsWith("6062")) {
            return "HiperCard";
        }

        if (cardNumber.startsWith("50")) {
            return "Aura";
        }

        return "Unknown";
    }

    public static void main(String[] args) {

        CardValidator validator = new CardValidator();
        System.out.println(validator.identifyCardBrand("SET CARD NUMBER HERE"));
    }
}