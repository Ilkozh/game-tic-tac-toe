import java.util.Scanner;

public class CoffeeMachine {

    public static int availableCups = 9;
    public static int availableWater = 400;
    public static int availableMilk = 540;
    public static int availableCoffeeBeans = 120;
    public static int availableMoney = 550;

    public static Scanner scanner = new Scanner(System.in);
    public static String input;

    public static void main(String[] args) {


        do {
            printUserWantDo();
            input = scanner.next();
            switch (input) {
                case "buy":
                    actionBuy();
                    break;
                case "fill":
                    actionFill();
                    break;
                case "take":
                    actionTake();
                    break;
                case "remaining":
                    actionRemaining();
                    break;
                case "exit":
                    System.exit(0);
            }
        } while (!"exit".equals(input));

    }


    private static void printUserWantDo() {

        System.out.println("Write action (buy, fill, take, remaining, exit):");


    }

    private static void printState() {

        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(availableWater + " ml of water");
        System.out.println(availableMilk + " ml of milk");
        System.out.println(availableCoffeeBeans + " g of coffee beans");
        System.out.println(availableCups + " disposable cups");
        System.out.println("$" + availableMoney + " of money");
        System.out.println();
    }

    private static void actionBuy() {

        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int coffeeSelection = scanner.nextInt();

        switch (coffeeSelection) {
            case 1:
                if (availableCups > 0 && availableWater >= 250 && availableCoffeeBeans >= 16) {
                    System.out.println("I have enough resources, making you a coffee!");
                    availableCups--;
                    availableWater -= 250;
                    availableCoffeeBeans -= 16;
                    availableMoney += 4;
                } else if (availableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else if (availableWater < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (availableCoffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case 2:
                if (availableCups > 0 && availableWater >= 350 && availableMilk >= 75 && availableCoffeeBeans >= 20) {
                    System.out.println("I have enough resources, making you a coffee!");
                    availableCups--;
                    availableCups--;
                    availableWater -= 350;
                    availableMilk -= 75;
                    availableCoffeeBeans -= 20;
                    availableMoney += 7;
                } else if (availableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else if (availableWater < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (availableMilk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (availableCoffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case 3:
                if (availableCups > 0 && availableWater >= 200 && availableMilk >= 100 && availableCoffeeBeans >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");
                    availableCups--;
                    availableWater -= 200;
                    availableMilk -= 100;
                    availableCoffeeBeans -= 12;
                    availableMoney += 6;
                } else if (availableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else if (availableWater < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (availableMilk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (availableCoffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            default:
                System.out.print("Please enter a valid number (1 - espresso, 2 - latte, 3 - cappuccino): ");
        }
    }

    private static void actionFill() {

        System.out.print("Write how many ml of water you want to add: ");
        availableWater += scanner.nextInt();
        System.out.print("Write how many ml of milk you want to add: ");
        availableMilk += scanner.nextInt();
        System.out.print("Write how many grams of coffee you want to add: ");
        availableCoffeeBeans += scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee you want to add: ");
        availableCups += scanner.nextInt();
    }

    private static void actionTake() {

        System.out.println("I gave you $" + availableMoney);
        availableMoney = 0;
    }

    private static void actionRemaining() {

        printState();
    }
}
