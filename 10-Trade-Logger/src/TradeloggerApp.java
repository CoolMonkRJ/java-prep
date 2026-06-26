import java.util.Scanner;

public class TradeloggerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        tradeservice service = new tradeservice();

        int choice;
        while (true) {

            System.out.println("\n====================================");
            System.out.println("         TRADE LOGGER");
            System.out.println("====================================");
            System.out.println("1. Add Trade");
            System.out.println("2. Display All Trades");
            System.out.println("3. Search Trade");
            System.out.println("4. Remove Trade");
            System.out.println("5. Total Portfolio PnL");
            System.out.println("6. Best Trade");
            System.out.println("7. Worst Trade");
            System.out.println("8. Exit");
            System.out.print("\nEnter Choice : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter Trade ID : ");
                    int tradeId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Symbol : ");
                    String symbol = sc.nextLine();

                    System.out.print("Enter Trade Type (BUY/SELL) : ");
                    String type = sc.nextLine();

                    TradeType tradeType;

                    try {

                        tradeType = TradeType.valueOf(type.toUpperCase());

                    } catch (IllegalArgumentException e) {

                        System.out.println("Invalid Trade Type!");
                        break;
                    }

                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Entry Price : ");
                    double entryPrice = sc.nextDouble();

                    System.out.print("Enter Exit Price : ");
                    double exitPrice = sc.nextDouble();

                    trade newTrade = new trade(
                            tradeId,
                            symbol,
                            tradeType,
                            quantity,
                            entryPrice,
                            exitPrice
                    );

                    service.addTrade(newTrade);

                    break;
                case 2:

                    service.displayAllTrades();

                    break;

                case 3:

                    System.out.print("Enter Trade ID : ");
                    int searchId = sc.nextInt();

                    trade foundTrade = service.searchTradeById(searchId);

                    if (foundTrade != null) {

                        System.out.println("\nTrade Found\n");
                        foundTrade.display();

                    } else {

                        System.out.println("Trade Not Found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Trade ID : ");
                    int removeId = sc.nextInt();

                    service.removeTrade(removeId);

                    break;

                case 5:

                    double totalPnL = service.calculationTotalPnl();

                    System.out.println("\nTotal Portfolio PnL : " + totalPnL);

                    break;

                case 6:

                    trade bestTrade = service.findBestTrade();

                    if (bestTrade != null) {

                        System.out.println("\n===== BEST TRADE =====");

                        bestTrade.display();

                    } else {

                        System.out.println("No Trades Available.");

                    }

                    break;

                case 7:

                    trade worstTrade = service.findWorstTrade();

                    if (worstTrade != null) {

                        System.out.println("\n===== WORST TRADE =====");

                        worstTrade.display();

                    } else {

                        System.out.println("No Trades Available.");

                    }

                    break;

                case 8:

                    System.out.println("\nThank You for using Trade Logger ❤️");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice!");

            }
        }
    }
}