package fileProject;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileProject {

    public errorCode e = new errorCode();

    /**
     * @description 파일 생성 메소드
     * @brief .txt 확장자만 생성함, 파일이 존재할 경우 덮어쓰기함
     * @param [in] newFilePath 새로 생성할 파일경로
     * @return int
     *         ERROR_SUCCESS : 파일 생성 성공
     *         ERROR_FILE_NOT_FOUND : 생성한 파일 찾기 실패
     *         ERROR_INVALID_PARAMETER : 파라미터 없음
     *         ERROR_INVALID_FUNCTION : 함수 실패
     * @throws
     * FileNotFoundException         : 생성할 파일을 찾을 수 없는 경우
     *                               IOException : 그 외의 에러
     */
    public int createFile(String newFilePath) {

        if (newFilePath.isEmpty()) {
            return e.ERROR_INVALID_PARAMETER; // 파라미터 빈값들어옴
        }

        Path newFile = Paths.get(newFilePath);
        Path fileDirectory = newFile.getParent(); // 디렉토리만
        Path fileName = newFile.getFileName(); // 파일명

        if (null == fileDirectory) {
            System.out.println("파일 경로를 잘못 입력하였습니다. 다시 입력해주세요.");
            return e.ERROR_DIRECTORY_NOT_FOUND;
        }

        if (null == fileName) {
            System.out.println("파일명을 잘못 입력하였습니다. 다시 입력해주세요.");
            return e.ERROR_FILE_NOT_FOUND;
        }

        try {

            // 디렉토리 생성
            Files.createDirectory(fileDirectory);
            System.out.println("디렉토리 생성 완료 : " + fileDirectory.toString());

        } catch (FileAlreadyExistsException e1) {

            // 디렉토리가 이미 존재할 경우
            e1.toString();
            System.out.println("디렉토리가 이미 존재합니다. : " + fileDirectory.toString());

        } catch (NoSuchFileException e2) {

            // 부모 디렉토리가 존재하지 않을 경우
            e2.toString();
            System.out.println("해당 디렉토리의 루트는 존재하지 않습니다. : " + fileDirectory.toString());
            return e.ERROR_DIRECTORY_NOT_FOUND;

        } catch (IOException e3) {

            // 그 외의 에러
            e3.toString();
            return e.ERROR_INVALID_FUNCTION;
        }

        // 확장자 확인
        int index = fileName.toString().lastIndexOf(".");

        if (0 < index) {

            // 파일이름에서 "." 이후의 문자열이 확장자가 됨
            String fileExtension = fileName.toString().substring(index + 1);

            if (fileExtension.isEmpty()) {
                System.out.println("파일 확장자가 비어있습니다. : " + fileName.toString());
                return e.ERROR_FILE_NOT_FOUND;
            }
            if (0 != fileExtension.compareToIgnoreCase("txt")) {
                System.out.println("파일 확장자 형식이 잘못됐습니다.\n파일명 : " + fileName.toString()
                        + "\n" + "확장자 : " + fileExtension);
                return e.ERROR_FILE_NOT_FOUND;
            }

        } else {
            // 파일이름에서 "." 이후의 문자열이 없다면 확장자가 없다고 판단
            System.out.println("파일 확장자가 없습니다. 파일명 : " + fileName.toString());
            return e.ERROR_FILE_NOT_FOUND;
        }

        try {

            // 파일 생성
            Files.createFile(newFile);
            System.out.println("파일 생성 완료 : " + fileName);

        } catch (FileAlreadyExistsException e4) {

            // 파일이 이미 존재할 경우
            e4.toString();
            System.out.println("해당 파일은 이미 존재합니다. : " + fileName);

        } catch (NoSuchFileException e2) {

            // 해당 디렉토리가 존재하지 않을 경우
            e2.toString();
            System.out.println("디렉토리가 존재하지 않습니다. : " + fileDirectory.toString());
            return e.ERROR_DIRECTORY_NOT_FOUND;

        } catch (IOException e5) {

            // 그 외의 에러
            e5.toString();
            return e.ERROR_INVALID_FUNCTION;
        }

        return e.ERROR_SUCCESS;

    }

    /**
     * @description 파일 쓰기 메소드
     * @brief
     * @param [in] filePath 쓰기를 진행할 파일경로
     *             [in] data 들어갈 내용
     * @return int
     *         ERROR_SUCCESS : 파일 쓰기 성공
     *         ERROR_FILE_NOT_FOUND : 파일 찾기 실패
     *         ERROR_INVALID_PARAMETER : 파라미터 없음
     *         ERROR_INVALID_FUNCTION : 함수 실패
     * 
     * @throws
     * FileNotFoundException         : 생성할 파일을 찾을 수 없는 경우
     *                               IOException : 그 외의 에러
     */
    public int writeFile(String filePath, String data) {

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
