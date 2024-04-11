// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        genericDisplay(10);
        genericDisplay("Software Devolpment");
        genericDisplay(true);
        genericDisplay(3.14);

    }
    static<T> void genericDisplay(T element){
        System.out.println(element);
    }
}

