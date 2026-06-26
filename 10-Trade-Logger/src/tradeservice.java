import java.util.ArrayList;

public class tradeservice {
        private ArrayList<trade> trades = new ArrayList<>();


        public void addTrade(trade trade){
            trades.add(trade);

            System.out.println("Trade Added Succesfully "+trade.getTradeId());
        }


        public void displayAllTrades(){
            System.out.println("\n --------- TRADE HISTORY---------");

            if(trades.isEmpty()){
                System.out.println("No Trades Available");
                return;
            }

            for(trade trade : trades){
                trade.display();
            }
        }

        public trade searchTradeById(int tradeID){
            for(trade currentTrade :trades){
                if(currentTrade.getTradeId()== tradeID){
                    return currentTrade;
                }
            }
            return null;
        }
        public void removeTrade(int tradeID){
            trade tradeToRemove = searchTradeById(tradeID);

            if(tradeToRemove != null){
                trades.remove(tradeToRemove);
                System.out.println("Trade Removed Succesfully");

            }
            else
                System.out.println(
                        "Trade Not Found"
                );
        }

        public double calculationTotalPnl(){
            double totalPnl=0;
            for(trade currentTrade : trades){
                totalPnl+=currentTrade.calculatePnl();
            }
            return totalPnl;
        }

        public trade findBestTrade(){
            if(trades.isEmpty()){
                return null;
            }
            trade bestTrade = trades.get(0);

            for(trade currentTrade : trades){
                if(currentTrade.calculatePnl()> bestTrade.calculatePnl()){
                    bestTrade=currentTrade;
                }
            }
            return bestTrade;
        }

        public trade findWorstTrade(){
            if(trades.isEmpty()){
                return null;
            }

            trade worstTrade = trades.get(0);


            for(trade currentTrade : trades){
                if(currentTrade.calculatePnl()< worstTrade.calculatePnl()){
                    worstTrade=currentTrade;
                }
            }
            return worstTrade;
        }



}
