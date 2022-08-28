import java.io.*;
import java.util.*;

class FileControl {

    private String strFilePath;

    FileControl(String strFilePath) {
        this.strFilePath = strFilePath;
    }

    // File f = new File(strFilePath); // 전역변수로 지정하면 에러남 Exception in thread "main"
    // java.lang.NullPointerException

    /*
     * 파일 생성 메소드
     * 
     * @return 파일 생성이 성공일 경우 true, 실패일 경우 false
     * 
     * @throws 생성할 파일을 찾을 수 없는 경우 FileNotFoundException 에러 발생, 그 외의 에러는 IOException
     * 발생
     */
    public boolean CreateFile() {
        File f = new File(strFilePath);

        try (FileOutputStream CreateFile = new FileOutputStream(f, false)) {
            // 확장자가 없어도 성공이 떨어짐. 이상한걸 적어도 성공이 떨어지네?
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    /*
     * 파일 쓰기 메소드
     * 
     * @return
     * - 파일 쓰기가 성공일 경우 true
     * - 파일 쓰기가 실패 또는 파일이 존재하지 않을 경우 또는 입력할 내용이 없을 경우 false
     * 
     * @throws
     */
    public boolean WriteFile(String strInput) {

        File f = new File(strFilePath);

        if (!f.exists() || 0 > strInput.length()) {
            return false;
        }

        try {
            FileOutputStream fos = new FileOutputStream(f); // CreateFile에서 생성한 객체와 같은건데...이렇게 써도 되는지 모르겠음ㅜ

            fos.write(strInput.getBytes());

            fos.flush(); // flush랑 close 차이..
            fos.close();

            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}

public class FileProject {
    public static void main(String[] args) throws Exception {

        System.out.print("저장할 파일경로와 이름을 적어주세요 : ");
        Scanner scFileName = new Scanner(System.in);

        FileControl F = new FileControl(scFileName.next());
        boolean bRet = false;

        if (F.CreateFile()) {
            System.out.println("CreateFile Success!");
            bRet = true;

        } else {
            System.out.println("CreateFile Fail...");
        }

        if (bRet) {
            // 파일 쓰기 진행
            System.out.print("파일에 저장할 내용을 적어주세요 : ");
            Scanner scInput = new Scanner(System.in);

            if (F.WriteFile(scInput.next())) { // 띄어쓰기 입력 시 띄어쓰기 전 까지만 입력됨. 오잉
                System.out.println("WriteFile Success!");
            } else {
                System.out.println("WriteFile Fail...");
            }
        }
    }
}
