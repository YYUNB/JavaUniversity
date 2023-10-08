package JavaProgramming.ch13;

import java.io.*;

public class practice09 {
    public static void main(String[] args) {
        BufferedInputStream srcStream = null;
        BufferedOutputStream destStream = null;
        File srcFile = new File("file/ch13p09_1.jpg");
        File destFile = new File("file/ch13p09_2.jpg");

        try {
            srcStream = new BufferedInputStream(new FileInputStream(srcFile));
            destStream = new BufferedOutputStream(new FileOutputStream(destFile));

            long tenPercent = srcFile.length() / 10;
            long progress = 0;

            System.out.println("Copy ch13p09_1.jpg as file/ch13p09_2.");
            byte[] buf = new byte[1024];  // 한 번 읽는 단위
            int numRead = 0;  // 읽은 바이트 수
            while (true) {
                numRead = srcStream.read(buf, 0, buf.length);
                if(numRead == -1) {  // 파일 끝 도달
                    if (progress > 0) {  // 지난 번에 읽었지만 10%에 도달하지 않아 *가 출력되지 않은 경우
                        System.out.print("*");
                    }
                    break;  // 파일 끝에 도달
                }
                if (numRead > 0) destStream.write(buf, 0, numRead);
                progress += numRead;  // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
                if (progress >= tenPercent) {  // 10% 만큼 읽었다면
                    System.out.print("*");
                    progress = 0;  // * 출력하고 progress를 0으로 리셋
                }
            }
            srcStream.close();
            destStream.close();
        } catch (IOException e) {
            System.out.println("IO error");
        }

    }
}
