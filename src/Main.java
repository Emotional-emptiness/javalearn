import java.util.Arrays;

public class Main {
    public void printPrices(float[] prices){
        for(float price : prices) {
            System.out.println(price + " " + "jup.");
        }
    }


    //Test output
    public static void main(String[] args) {
        Main shop = new Main();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}