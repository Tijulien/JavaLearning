public class ParcBot {
    public static void main(String[] args) {
        sayHello();
        sayBye();
    }
    private static void sayHello(){
        String welcomeSentence = "Hello, recevez les bienvenues ";
        System.out.println(welcomeSentence);
      }
    private static void sayBye(){
        String goodByeSentence = ("Bye, recevez les aurevoirs ");
        System.out.println(goodByeSentence);
    }
}
