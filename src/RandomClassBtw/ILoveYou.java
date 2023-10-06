package RandomClassBtw;

public class ILoveYou {

        public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                System.out.println("Я тебя люблю Ир");
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
