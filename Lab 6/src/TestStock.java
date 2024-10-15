
public class TestStock {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		System.out.println("Stock Name: " + stock.name);
		System.out.println("Stock Symbol: " + stock.symbol);
		System.out.printf("Price-Change Percentage: %.2f%%", 
			stock.getChangePercent());
	}
}
