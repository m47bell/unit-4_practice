//Stock price problem 

public static void main(String [] args){

    stock_prices_yesterday = [10, 7, 5, 8, 11, 9];
	get_max_profit(stock_prices_yesterday);
}

public static int get_max_profit(stock []){
    int maxProfit=0;
    int startPrice=0;
    int sellValue=0;
    int i= 0;
    
	sellValue = Math.max(stock.values);
   	maxProfit = Math.abs(sellValue - startPrice);
  
    return maxProfit;
}