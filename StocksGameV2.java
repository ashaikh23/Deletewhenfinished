import java.util.Random;
public class StocksGameV2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		//-----------------------------
		int cheepStockMinValue = 100;
		int cheepStockMaxValue = 1000;
		//----------------------------
		int mediumStockMinValue = 1000;
		int mediumStockMaxValue = 10000;
		//-----------------------------
		int adequateStockMinValue = 15000;
		int adequateStockMaxValue = 75000;
		//-----------------------------
		int highStockMinValue = 100000;
		int highStockMaxValue = 500000;
		//-----------------------------
		int inflatedStockMinValue = 500000;
		int inflatedStockMaxValue = 1000000;
		
		int flexableStockMinValue = 100;
		int flexableStockMaxValue = 600000;
				
		//------------------------------
		int cheepStock1 = (int)(Math.random() * (cheepStockMaxValue-cheepStockMinValue+1)+cheepStockMinValue);
		
		int mediumStock1 = (int)(Math.random() *  (mediumStockMaxValue-mediumStockMinValue+1)+mediumStockMinValue);
		
		int adequateStock1 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		int adequateStock2 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		
		int highStock1 = (int)(Math.random() * (highStockMaxValue-highStockMinValue+1) + highStockMinValue);
		
		int inflatedStock1 = (int)(Math.random() * (inflatedStockMaxValue-inflatedStockMinValue+1) + inflatedStockMinValue);
		
		int flexableStock1 = (int)(Math.random() * (flexableStockMaxValue-flexableStockMinValue+1) + flexableStockMinValue);
		//------------------------------
		
		/*
		 * AIMON Stock = flexableStock1, Direxion Gold Miners = inflatedStock1, highStock1 = highStock1, adequateStock1 = adequateStock1, mediumStock1 = mediumStock1, cheepStock1 = cheepStock1
		 *BETA Feature
		 */
		
		int roundedCheepStock1 = ((cheepStock1 + 99) / 100 ) * 100;
		
		int roundedMediumStock1 = ((mediumStock1 + 99) / 100 ) * 100;
		
		int roundedAdequateStock1 = ((adequateStock1 + 99) / 100 ) * 100;
		
		int roundedAdequateStock2 = ((adequateStock2 + 99) / 100 ) * 100;
		
		int roundedHighStock1 = ((highStock1 + 99) / 100 ) * 100;
		
		int roundedInflatedStock1 = ((inflatedStock1 + 99) / 100 ) * 100;
		
		int roundedFlexableStock1 = ((flexableStock1 + 99) / 100 ) * 100;
		
		
		System.out.println("Aymaan's Shaikh Stock Generator!");
		
		System.out.println("----------------------------------");
		System.out.println("TEAMVIEWER: $" + roundedCheepStock1);
		System.out.println("Panasonic: $" + roundedMediumStock1);
		System.out.println("Dell Inc: $" + roundedAdequateStock1);
		System.out.println("Chipotle: $" + roundedAdequateStock2);
		System.out.println("Apple : $" + roundedHighStock1);
		System.out.println("Amazon: $" + roundedInflatedStock1);
		System.out.println("AIMON: $" + roundedFlexableStock1);
		System.out.println("----------------------------------");
		
		System.out.println("----------------------------------");
		System.out.println(roundedCheepStock1);
		System.out.println(roundedMediumStock1);
		System.out.println(roundedAdequateStock1);
		System.out.println(roundedAdequateStock2);
		System.out.println(roundedHighStock1);
		System.out.println(roundedInflatedStock1);
		System.out.println(roundedFlexableStock1);
					
	}
}
