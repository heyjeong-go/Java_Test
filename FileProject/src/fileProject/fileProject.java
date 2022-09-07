package fileProject;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileProject {

    /**
     * @description 파일 생성 메소드
     * 
     * @param
     * -        Input : newFilePath 새로 생성할 파일경로
     * 
     * @return
     *         - 파일 생성 성공 ERROR_SUCCESS
     *         - 생성한 파일 찾기 실패 ERROR_FILE_NOT_FOUND
     *         - 파라미터 없음 ERROR_INVALID_PARAMETER
     *         - 함수 실패 ERROR_INVALID_FUNCTION
     * 
     * @throws
     * -         생성할 파일을 찾을 수 없는 경우 FileNotFoundException
     *           - 그 외의 에러는 IOException
     */
    public static int createFile(String newFilePath) {

        return 0;
        // if (newFilePath.isEmpty()) {
        // return errorCode.ERROR_INVALID_PARAMETER; // 파라미터 빈값들어옴
        // }

        // File newFile = new File(newFilePath);

        // try (FileOutputStream createFile = new FileOutputStream(newFile, false)) {
        // // 확장자가 없어도 성공이 떨어짐. 이상한걸 적어도 성공이 떨어지네?
        // return errorCode.ERROR_SUCCESS;
        // } catch (FileNotFoundException e) {
        // e.toString();
        // return errorCode.ERROR_FILE_NOT_FOUND;
        // } catch (IOException e) {
        // e.toString();
        // return errorCode.ERROR_INVALID_FUNCTION;
        // }
    }

    /**
     * @description 파일 쓰기 메소드
     * 
     * @param
     * -        Input : filePath 쓰기를 진행할 파일경로
     *          - Input : data 들어갈 내용
     * 
     * @return
     *         - 파일 쓰기 성공 ERROR_SUCCESS
     *         - 파일 찾기 실패 ERROR_FILE_NOT_FOUND
     *         - 파라미터 없음 ERROR_INVALID_PARAMETER
     *         - 함수 실패 ERROR_INVALID_FUNCTION
     * 
     * @throws
     * -         생성할 파일을 찾을 수 없는 경우 FileNotFoundException
     *           - 그 외의 에러는 IOException
     */
    public static int writeFile(String filePath, String data) {

        return 0;
        // if (filePath.isEmpty() || data.isEmpty()) {
        // return errorCode.ERROR_INVALID_PARAMETER;
        // }

        // File writeFile = new File(filePath);

        // if (!writeFile.exists()) {
        // return errorCode.ERROR_FILE_NOT_FOUND;
        // }

        // try {
        // FileOutputStream fos = new FileOutputStream(writeFile); // createFile에서 생성한
        // 객체와 같은건데...이렇게 써도 되는지 모르겠음ㅜ

        // fos.write(data.getBytes());

        // fos.flush();
        // fos.close();

        // return errorCode.ERROR_SUCCESS;
        // } catch (FileNotFoundException e) {
        // e.toString();
        // return errorCode.ERROR_FILE_NOT_FOUND;
        // } catch (IOException e) {
        // e.toString();
        // return errorCode.ERROR_INVALID_FUNCTION;
        // }
    }
}

// class fileTotalLogic {

// public void fileTotal() {

// fileProject fileProject = new fileProject();

// // 하드 코딩으로 파일 경로, 파일명 설정!
// String filepath = "C:\\Users\\ko453\\Desktop\\Study\\test";
// String fileName = "test.txt";
// String inPut = "test용 입니다.";

// Path path = Paths.get(filepath); // 절대 경로 가져오기
// Path newFilePath = path.resolve(fileName); // 절대 경로 + 파일명 합치기

// int ret = errorCode.ERROR_FAIL;

// // 파일 읽기
// ret = fileProject.createFile(newFilePath.toString());

// if (errorCode.ERROR_SUCCESS == ret) {
// System.out.println("createFile Success!");
// } else {
// System.out.println("createFile Fail : " + ret);
// }

// ret = fileProject.writeFile(newFilePath.toString(), inPut);
// // 파일 쓰기
// if (errorCode.ERROR_SUCCESS == ret) {
// System.out.println("writeFile Success!");
// } else {
// System.out.println("writeFile Fail : " + ret);
// }
// }
// }