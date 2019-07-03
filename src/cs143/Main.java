package cs143;

public class Main {

	public static void main(String[] args) {
		
		int prices[] = {100, 80, 60, 70, 60, 75, 85};
		StockSpan stockSpan = new StockSpan();
		
		for(int i = 0; i < prices.length; i++)
		{
			stockSpan.addPrices(prices[i]);
		}
		
		stockSpan.print();
		

	}

}
