import java.util.Random;
public class StocksGameV2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int cheepStockMinValue = 5;
		int cheepStockMaxValue = 10;
		//----------------------------
		int mediumStockMinValue = 50;
		int mediumStockMaxValue = 100;
		//-----------------------------
		int adequateStockMinValue = 500;
		int adequateStockMaxValue = 1000;
		//-----------------------------
		int highStockMinValue = 5000;
		int highStockMaxValue = 10000;
		//-----------------------------
		int inflatedStockMinValue = 50000;
		int inflatedStockMaxValue = 1000000;
		
		int flexableStockMinValue = 5;
		int flexableStockMaxValue = 600000;
				
		//------------------------------
		int cheepStock1 = (int)(Math.random() * (cheepStockMaxValue-cheepStockMinValue+1)+cheepStockMinValue);
		
		int mediumStock1 = (int)(Math.random() *  (mediumStockMaxValue-mediumStockMinValue+1)+mediumStockMinValue);
		
		int adequateStock1 = (int)(Math.random() * (adequateStockMaxValue-adequateStockMinValue+1)+adequateStockMinValue);
		
		int highStock1 = (int)(Math.random() * (highStockMaxValue-highStockMinValue+1) + highStockMinValue);
		
		int inflatedStock1 = (int)(Math.random() * (inflatedStockMaxValue-inflatedStockMinValue+1) + inflatedStockMinValue);
		
		int flexableStock1 = (int)(Math.random() * (flexableStockMaxValue-flexableStockMinValue+1) + flexableStockMinValue);
		//------------------------------
		
		/*
		 * AIMON Stock = flexableStock1, Direxion Gold Miners = inflatedStock1, highStock1 = highStock1, adequateStock1 = adequateStock1, mediumStock1 = mediumStock1, cheepStock1 = cheepStock1
		 */
		
		System.out.println("Aymaan's Shaikh Stock Generator!");
		System.out.println("\n");
		System.out.println("AIMON Stock: $" + flexableStock1 );
		System.out.println("Direxion Gold Miners: $" + inflatedStock1);
		System.out.println("highStock1 "+highStock1);
		System.out.println("adequateStock1 "+adequateStock1);
		System.out.println("mediumStock1 "+mediumStock1);
		System.out.println("cheepStock1 "+cheepStock1);
		
		System.out.println("----------------------------------");
		System.out.println(flexableStock1);
		System.out.println(inflatedStock1);
		System.out.println(highStock1);
		System.out.println(adequateStock1);
		System.out.println(mediumStock1);
		System.out.println(cheepStock1);
			
	}
}
