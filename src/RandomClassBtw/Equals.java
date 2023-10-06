package RandomClassBtw;

public class Equals {
    public static void main(String[] args) {
        String a2 = "10";
        String b2 = "1" + "0";
        String str = new String("10");
        System.out.println(a2.equals(b2));
        System.out.println(a2 == b2);
        System.out.println(a2.hashCode());
        System.out.println(b2.hashCode());
        System.out.println("a2.equals(str) = " + a2.equals(str));
        System.out.println( a2 == str); // почему выдает false?
        System.out.println("str.hashCode() = " + str.hashCode());
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("System.identityHashCode(a2) = " + System.identityHashCode(a2));
        System.out.println("System.identityHashCode(b2) = " + System.identityHashCode(b2));
    }


}
