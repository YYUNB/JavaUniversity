package JavaProgramming.ch13;

public class practice04 {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "3.141592"};
        for (int i = 0; i < 3; i++) {
            boolean c = true;
            try {
                int n = Integer.parseInt(stringNumber[i]);

            }
            catch (NumberFormatException e) {
                System.out.println(stringNumber[i] + " cannot be converted to Integer.");
                c = false;
            }
            if(c) System.out.println("Value converted to integer: " + stringNumber[i]);
        }
    }
}
