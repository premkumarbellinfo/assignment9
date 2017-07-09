package assignment9;

public class Que1 {

	public static void main(String[] args) {
		int [] stockPrices = {458,59,522,867,365,871,87,970,322,999,437,123,330,444,369,593,920,205,352,380,561,16,916,482,518,145,266,636,792,589};
		int maxProfit =0;
		int buyDay = 0,SellDay =0;
		String profitshare = null;
		for(int i=0;i< stockPrices.length;i++){
			for(int j=i+1;j< stockPrices.length;j++){
				if(stockPrices[j]-stockPrices[i]>maxProfit){
					maxProfit = stockPrices[j]-stockPrices[i];
					buyDay = i+1;
					SellDay = j+1;
					profitshare = "("+Integer.toString(stockPrices[j])+" - "+Integer.toString(stockPrices[i])+" = "+Integer.toString(stockPrices[j]-stockPrices[i])+")";
				}
			}
		}
		
		System.out.println("buying Day " + buyDay + " Selling day " + SellDay);
		System.out.println("profit gain " + profitshare);
	}

}
