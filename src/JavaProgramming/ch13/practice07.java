package JavaProgramming.ch13;

import java.io.*;
import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        File f = new File(args[1]);
        if(!f.createNewFile()) {
            System.out.println("Target file already exists");
            System.out.println("Overwrite?(y/n)");
            String answer = sc.nextLine();
            if (answer.equals("n")) System.exit(0);
            else if (!answer.equals("y")) {
                System.out.println("error");
                System.exit(0);
            }
        }
        System.out.print("Source file: ");
        String sf = sc.next();
        System.out.print("Target file: ");
        String tf = sc.next();

        FileReader fr = new FileReader("file/" + sf);
        String text = "";
        int i;
        while ((i = fr.read()) != -1) {
            text += (char) i;
        }

        FileWriter fw = new FileWriter("file/" + tf);
        fw.write(text);

        System.out.println("Copy has been completed");

        fr.close();
        fw.close();


    }
}
