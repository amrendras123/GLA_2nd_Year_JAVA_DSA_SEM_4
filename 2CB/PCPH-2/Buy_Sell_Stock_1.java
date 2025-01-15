public class Buy_Sell_Stock_1 {
    public int maxProfit(int[] arr) {
        
        int profit=0;
        int min=arr[0];
        int maxP=0;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            profit=arr[i]-min;
            maxP=Math.max(maxP,profit);

        }
        return maxP;
    }
    
}