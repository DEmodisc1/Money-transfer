public class Main {

    public static void main(String[] args) {
        PaymentTerminal unicafe= new PaymentTerminal();
        System.out.println(unicafe);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafe.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafe);
    }
}


