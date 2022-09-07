package TDD_Test;

import org.junit.Test;

import JavaTest.SubDate;
import junit.framework.TestCase;

public class SubDateTest extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(SubDateTest.class); // junit.textui.TestRunner.run 이걸 넣어줘야 자동으로 테스트 확장팩에 들어가는듯
    }

    @Test
    // 년일 구하기~
    public void testGetYearDay() {
        assertEquals(0, SubDate.getYearDay(1));
        assertEquals(365, SubDate.getYearDay(2));

    }

    @Test
    // 윤년 테스트
    public void testLeapYear() {
        assertTrue(SubDate.isLeapYear(0));
        assertFalse(SubDate.isLeapYear(1));
        assertTrue(SubDate.isLeapYear(4));
        assertTrue(SubDate.isLeapYear(1200));
        assertFalse(SubDate.isLeapYear(700));
    }

    @Test
    public void testGetMonthDay() {
        assertEquals(31 + 28, SubDate.getMonthDay(3, false));
        assertEquals(31 + 29, SubDate.getMonthDay(3, true));
    }

    @Test
    public void testGetTotalDay() {
        assertEquals(1, SubDate.getTotalDay("00010101"));
        assertEquals(366, SubDate.getTotalDay("00020101"));
    }

    @Test
    public void testSubDate() {
        assertEquals(1, SubDate.sub("20061231", "20070101"));
        assertEquals(31 + 28 + 30 + 31 + 14,
                SubDate.sub("20070101", "20070515"));
        assertEquals(31 + 29 + 30 + 31 + 14,
                SubDate.sub("20080101", "20080515"));
    }
}