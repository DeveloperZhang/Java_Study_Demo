package FileBase;

import java.io.File;
import java.io.IOException;

public class FileBaseTest {
    public static void test(){
        File file = new File("a.txt");
        File file1 = new File("dir/a.txt");
        File dir = new File("dir");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        try {
            file.createNewFile();
            dir.mkdir();
            file1.createNewFile();
            String[] fileList = dir.list();
            for (String fileName:
                 fileList) {
                System.out.println(fileName);
            }
            File[] fileList1 = File.listRoots();
            for (File fileName:
                    fileList1) {
                System.out.println(fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
