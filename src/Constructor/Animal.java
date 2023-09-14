package Constructor;

public class Animal {
    private Integer paws = 4;
    public void howManyPaws(){
        System.out.println(paws);
    }

    public Animal() {
        System.out.println("animal constructor");
        howManyPaws();
    }
    //    {
//        System.out.println("non-static parent block");
//    }
//    static {
//        System.out.println("static parent block");
//    }
//    public Animal() {
//        System.out.println("parent constructor");
//    }
//    private String gender;
//    public Animal() {
//
//    }
//    public Animal(String gender) {
//        this.gender = gender;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
}
