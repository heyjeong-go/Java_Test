import java.io.*;
import java.util.*;

class FileControl {

    private String strFilePath;

    FileControl(String strFilePath) {
        this.strFilePath = strFilePath;
    }

    public boolean CreateFile() {
        File f = new File(strFilePath);

        try (FileOutputStream fileOutputStream = new FileOutputStream(f, false)) {
            // 확장자가 없어도 성공이 떨어짐.
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    // public boolean WriteFile(String strInput) {

    // return true;
    // }
}

public class FileProject {
    public static void main(String[] args) throws Exception {

        System.out.print("저장할 파일경로와 이름을 적어주세요 : ");
        Scanner sc = new Scanner(System.in);

        FileControl F = new FileControl(sc.next());

        if (F.CreateFile()) {
            System.out.println("CreateFile Success!");
        } else {
            System.out.println("CreateFile Fail...");
        }

    }
}
