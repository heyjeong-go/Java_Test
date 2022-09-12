package TDD_Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import fileProject.*;

public class fileTest extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(fileTest.class); // junit.textui.TestRunner.run 이걸 넣어줘야 자동으로 테스트 확장팩에 들어가는듯
    }

    private fileProject fp = new fileProject();
    private errorCode e = new errorCode();

    // @Before
    // public void beforeTest() {
    // fp = new fileProject();
    // e = new errorCode();
    // }

    @Test // createFile 성공 테스트
    public void testCreateFileSuccess() {
        assertEquals(e.ERROR_SUCCESS, fp.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\test_success.txt")); // 성공
    }

    @Test // createFile 실패 테스트
    public void testCreateFileFail() {
        assertEquals(e.ERROR_INVALID_PARAMETER, fp.createFile("")); // 파라미터 없음
    }

    @Test // createFile - 디렉토리 부분 실패 테스트
    public void testCreateFile_DirectoryFail() {
        assertEquals(e.ERROR_DIRECTORY_NOT_FOUND, fp.createFile("D:\\test")); // 해당 부모 디렉토리가 없으므로 실패
        assertEquals(e.ERROR_DIRECTORY_NOT_FOUND, fp.createFile("test.txt")); // 디렉토리명 없으므로 실패
    }

    @Test // createFile - 파일 부분 실패 테스트
    public void testCreateFile_FileFail() {
        assertEquals(e.ERROR_FILE_NOT_FOUND, fp.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\tt")); // 확장자 실패1
        assertEquals(e.ERROR_FILE_NOT_FOUND, fp.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\tt.")); // 확장자 실패2
        assertEquals(e.ERROR_FILE_NOT_FOUND, fp.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\test.doc"));
    }

    @After
    public void afterTest() {
        System.out.println("End Test");
    }
}
