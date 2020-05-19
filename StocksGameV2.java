public class StocksGameV2 {
	
	public static void main(String[] args) {
		
		final String name = "Shaikh's Stock Generator!";
		final String fName = "Aymaan ";
		
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
		int cheepStock2 = (int)(Math.random() * (cheepStockMaxValue-cheepStockMinValue+1)+cheepStockMinValue);
		
		int mediumStock1 = (int)(Math.random() *  (mediumStockMaxValue-mediumStockMinValue+1)+mediumStockMinValue);
		int mediumStock2 = (int)(Math.random() *  (mediumStockMaxValue-mediumStockMinValue+1)+mediumStockMinValue);
		
		int adequateStock1 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		int adequateStock2 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		int adequateStock3 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		//BETA int adequateStock4 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		
		int highStock1 = (int)(Math.random() * (highStockMaxValue-highStockMinValue+1) + highStockMinValue);
		
		int inflatedStock1 = (int)(Math.random() * (inflatedStockMaxValue-inflatedStockMinValue+1) + inflatedStockMinValue);
		
		int flexableStock1 = (int)(Math.random() * (flexableStockMaxValue-flexableStockMinValue+1) + flexableStockMinValue);
		//------------------------------
		
		//------------------------------
		int roundedCheepStock1 = ((cheepStock1 + 99) / 100 ) * 100;
		int roundedCheepStock2 = ((cheepStock2 + 99) / 100 ) * 100;
		
		int roundedMediumStock1 = ((mediumStock1 + 99) / 100 ) * 100;
		int roundedMediumStock2 = ((mediumStock2 + 99) / 100 ) * 100;
		
		int roundedAdequateStock1 = ((adequateStock1 + 99) / 100 ) * 100;
		int roundedAdequateStock2 = ((adequateStock2 + 99) / 100 ) * 100;
		int roundedAdequateStock3 = ((adequateStock3 + 99) / 100 ) * 100;
		//BETA int roundedAdequateStock4 = ((adequateStock4 + 99) / 100 ) * 100;
		
		int roundedHighStock1 = ((highStock1 + 99) / 100 ) * 100;
		
		int roundedInflatedStock1 = ((inflatedStock1 + 99) / 100 ) * 100;
		
		int roundedFlexableStock1 = ((flexableStock1 + 99) / 100 ) * 100;
		//------------------------------
		
		
		System.out.println(fName + name);
		System.out.println("----------------------------------");
		
		System.out.println("Direxion Gold Miners: $" + roundedFlexableStock1);
		System.out.println("Tesla Inc.: $" + roundedInflatedStock1);
		System.out.println("Alphabet Inc. : $" + roundedHighStock1);
		System.out.println("Apple Inc: $" + roundedAdequateStock1);
		System.out.println("Microsoft: $" + roundedAdequateStock2);
		System.out.println("Amazon: $" + roundedAdequateStock3);
		//BETA System.out.println("Dell Inc. $" + roundedAdequateStock4);
		System.out.println("Walmart: $" + roundedMediumStock1);
		System.out.println("Zynga Inc. :" + roundedMediumStock2);
		System.out.println("Yahoo: $" + roundedCheepStock1);
		System.out.println("Coca Cola Co. : $" + roundedCheepStock2);
		
		System.out.println("----------------------------------");
		
		System.out.println("For Table");
		System.out.println("\n");
		
		System.out.println( roundedFlexableStock1);
		System.out.println(roundedInflatedStock1);
		System.out.println(roundedHighStock1);
		System.out.println(roundedAdequateStock1);
		System.out.println(roundedAdequateStock2);
		System.out.println(roundedAdequateStock3);
		//BETA System.out.println(roundedAdequateStock4);
		System.out.println(roundedMediumStock1);
		System.out.println(roundedMediumStock2);
		System.out.println(roundedCheepStock1);
		System.out.println(roundedCheepStock2);
									
	}
	
}
