//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {        // Outer loop
            System.out.println("Outer Loop i = " + i);

            for (int j = 0; j < 2; j++) {    // Inner loop
                System.out.println("    Inner Loop j = " + j);
            }
        }


    }
}