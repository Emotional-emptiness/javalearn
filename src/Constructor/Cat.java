package Constructor;

public class Cat extends Animal {
    private static Integer paws = 4;
    public Cat() {
        System.out.println("cat constructor");
    }

    @Override
    public void howManyPaws() {
        System.out.println("cat howManyPaws method");
        System.out.println(paws);
    }
    //    private String name;
//    private String color;
//    private static String catHouse;
//
////    public Cat(String gender){
////        super(gender);
////    }
//    {
//        System.out.println("non-static child block");
//    }
//    static {
//        catHouse = "Kyiv";
//    System.out.println("static child block");
//    }
//    public Cat(String name, String color) { // , String gender
////        this(gender);
//        this.name = name;
//        this.color = color;
//        System.out.println("child constructor");
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public String toString() {
//        return "name cat: " + getName() + ", color cat: " + getColor();
//    }
}
