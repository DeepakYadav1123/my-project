public class AccessModifier {

    public String str_1 = "I am a public member";

    void printFromClass() {
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.printFromClass();
        System.out.println("Outside class: " + obj.str_1);
    }
}     