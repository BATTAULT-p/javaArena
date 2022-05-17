package cleanHello;


public class LessonTwo {

    /** Le programme commence ici */
    public static void main(String[] args) {
        sayHelloTo("world",5);
    }

    /** affiche le message "hello" au destinataire fourni
     *
     * @param who
     */
    private static void sayHelloTo(String elementamodifier,int age) {
        System.out.println("Hello " + elementamodifier);
    }

}