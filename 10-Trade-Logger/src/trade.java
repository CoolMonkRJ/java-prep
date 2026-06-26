public class trade {

    private int tradeId;
    private String symbol;
    private TradeType tradeType;
    private int quantity;
    private double entryPrice;
    private double exitPrice;

    public trade( int tradeId,String symbol,TradeType tradeType ,
                  int quantity, double entryPrice, double exitPrice){
                    this.tradeId = tradeId;
                    this.symbol=symbol;
                    this.tradeType= tradeType;
                    this.quantity= quantity;
                    this.entryPrice= entryPrice;
                    this.exitPrice=exitPrice;
    }


    public  int getTradeId(){
        return tradeId;
    }
    public String getSymbol(){
        return symbol;
    }
    public TradeType getTradeType(){
        return tradeType;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getEntryPrice(){
        return entryPrice;
    }

    public  double getExitPrice(){
        return exitPrice;
    }

    public double calculatePnl(){
        if(tradeType==TradeType.BUY){
            return (exitPrice-entryPrice)*quantity;
        }
        return (entryPrice-exitPrice)*quantity;
    }


    public void display(){
        System.out.println(
                "Trade ID : "+tradeId+
                        "| Symbol "+ symbol +
                "| Type : "+ tradeType  +
        "| Quantity :"+ quantity+
        "| Entry : "+entryPrice +
        "| Exit : "+exitPrice +
        "| PNL  :"+ calculatePnl());
    }
}
