package andersen_lesson1;

public class MainApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange\n" +"Banana\n"+"Apple");
    }

    public static void checkSumSign() {
        int a = 5, b = 8;

        if((a + b) >= 0) {
            System.out.println("\nSum is positive");
        } else {
            System.out.println("\nSum is negative");
        }
    }

    public static void printColor(){
        int value = 50;

        if (value <= 0) {
            System.out.println("\nRED");
        } else if (value > 0 || value < 100) {
            System.out.println("\nYellow");
        } else if (value > 100) {
            System.out.println("\nGreen");
        }
    }

    public static void compareNumbers(){
        int a = 62, b = 37;

        if (a >= b) {
            System.out.println("\na >= b");
        } else {
            System.out.println("\na < b");
        }
    }
}

