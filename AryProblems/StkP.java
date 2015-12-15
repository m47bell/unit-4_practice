//Stock price problem 

public static void main(String [] args){

    stock_prices_yesterday = [10, 7, 5, 8, 11, 9];
	System.out.println(get_max_profit(stock_prices_yesterday));
}

public static int get_max_profit(stock []){
    int max_profit = Integer.Min_Value;;
   
   	for(int i = 0; i < stock_prices_yesterday.length; i++){
   		int j = i+1;
   		int currentProfit = stock_prices_yesterday[j] - stock_prices_yesterday[i];
   		
   		if(currentProfit > maxProfit){
   			maxProfit = currentProfit;
   		}
   	}
   
    return maxProfit;
}