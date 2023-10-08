package JavaProgramming.ch13;

import java.io.*;

public class practice08 {
    public static void main(String[] args) throws Exception {

        int num1[] = {1, 2, 3, 4, 5};
        String str1[] = {"Kim", "Park", "Jung", "Lee"};

        String path = "file/ch13p08";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(num1);
        oos.writeObject(str1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        int num2[] = (int[])ois.readObject();
        String str2[] = (String[])ois.readObject();

        for (int i = 0; i < 5; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(str2[i] + " ");
        }

        ois.close();
    }

}
