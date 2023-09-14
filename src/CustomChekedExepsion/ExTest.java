package CustomChekedExepsion;


public class ExTest {
    public static void main(String[] args) {
        try {
            checkIfItInteger("123");
        } catch (MyExUnchecked exUnchecked) {
            System.out.println("this is string, not int");
        }
    }

    private static void checkIfItInteger(Object s) {
        if (s instanceof Integer) {
            System.out.println((Integer) s);
        } else {
            throw new MyExUnchecked("s object should instanceof Integer class");
        }
    }
}
