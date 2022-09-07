package TDD_Test;

import org.junit.Test;
import junit.framework.TestCase;
import fileProject.*;

public class fileTest extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(fileTest.class); // junit.textui.TestRunner.run 이걸 넣어줘야 자동으로 테스트 확장팩에 들어가는듯
    }

    @Test
    // @DisplayName //왜 안됨..아오!!
    public void testCreateFile() {
        assertEquals(1, fileProject.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\test.txt")); // 파일 생성 성공
        assertEquals(0, fileProject.createFile("C:\\Users\\ko453\\Desktop\\Study\\test\\test.txt")); // 파일 생성 실패
    }
}
