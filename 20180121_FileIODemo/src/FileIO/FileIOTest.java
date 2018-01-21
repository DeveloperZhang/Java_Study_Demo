package FileIO;

import java.io.*;

public class FileIOTest {
    public static void testInput(){
        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
            byte[] bbuf = new byte[100];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(bbuf)) > 0) {
                System.out.println(new String(bbuf,0,hasRead));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void testReader(){
        try {
            FileReader fr = new FileReader("a.txt");
            char[] chuf = new char[10];
            int hasRead = 0;
            while ((hasRead = fr.read(chuf)) > 0) {
                System.out.println(new String(chuf,0,hasRead));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testOutput(){
        try {
            FileInputStream inputStream = new FileInputStream("a.txt");
            FileOutputStream outputStream = new FileOutputStream("b.txt");
            byte[] bbuf = new byte[10];
            int hasRead = 0;
            while ((hasRead = inputStream.read(bbuf)) > 0) {
                outputStream.write(bbuf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWriter(){
        try {
            FileWriter fileWriter = new FileWriter("c.txt");
            fileWriter.write("静月思-李白\r\n");
            fileWriter.write("床前明月光\r\n");
            fileWriter.write("疑是地上霜\r\n");
            fileWriter.write("举头望明月\r\n");
            fileWriter.write("低头思故乡\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testPrint(){
        try {
            FileOutputStream fos = new FileOutputStream("d.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("普通字符串");
            ps.println(new FileIOTest());
            ps.flush();
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
