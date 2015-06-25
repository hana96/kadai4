import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;


public class IsOpenNowTest {

	@Test
	public void test() {
		try {
			assertTrue(IsOpenNow.fileRead("text/open.txt"));// test�t�H���_��open.txt������
			assertTrue(IsOpenNow.isOpenNow(Calendar.MONDAY, 20));
			assertFalse(IsOpenNow.isOpenNow(Calendar.SUNDAY, 11));
			assertFalse(IsOpenNow.isOpenNow(Calendar.MONDAY, 26));
			assertTrue(IsOpenNow.fileRead("text/open1.txt"));// test�t�H���_��open1.txt������
			assertTrue(IsOpenNow.isOpenNow(Calendar.MONDAY, 25));
			assertFalse(IsOpenNow.isOpenNow(Calendar.THURSDAY, 11));
			assertFalse(IsOpenNow.isOpenNow(Calendar.MONDAY, 6));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
