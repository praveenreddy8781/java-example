import java.util.*;

public class StockPriceAggregator {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		HashMap<String, Double> symbolAndPriceMap = new HashMap<String, Double>();

		@Override
		public void putNewPrice(String symbol, double price) {
			if (map.containsKey(symbol)) {
				map.put(symbol, map.get(symbol) + 1);
			} else {
				map.put(symbol, 1);
			}
			
			if (symbolAndPriceMap.containsKey(symbol)) {
				symbolAndPriceMap.put(symbol, symbolAndPriceMap.get(symbol) + price);
			} else {
				symbolAndPriceMap.put(symbol, price);
			}
		}

		@Override
		public double getAveragePrice(String symbol) {
			return symbolAndPriceMap.get(symbol) / map.get(symbol);
		}

		@Override
		public int getTickCount(String symbol) {
			return map.get(symbol);
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////
	interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);

				stats.putNewPrice(symbol, price);

			}

			for (String symbol : symbols) {
				System.out.println(
						String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}