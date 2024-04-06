package lab.Lab8.P1;
import com.SOF304.yennth.lab.Lab8.P1.B1_TrungBinhCong;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class B1_TrungBinhCongTest {
    private B1_TrungBinhCong trungBinhCong;

    @BeforeEach
    public void setUp() {
        trungBinhCong = new B1_TrungBinhCong();
    }

    @Test
    public void testAverageScoreValid1() {
        assertEquals(8.0, trungBinhCong.averageScore(8, 7, 9));
    }

    @Test
    public void testAverageScoreValid12() {
        assertEquals(10.0, trungBinhCong.averageScore(10, 10, 10));
    }

    @Test
    public void testAverageScoreInValid3() {
        assertEquals(7.0, trungBinhCong.averageScore(11, 8, 7));
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(11, 8, 7);
        });
    }

    @Test
    public void testAverageScoreInValid4() {
        assertEquals(5.0, trungBinhCong.averageScore(-1, 5, 5));
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(-1, 5, 5);
        });
    }

    @Test
    public void testAverageScoreInValid5() {
        assertEquals(5.0, trungBinhCong.averageScore(5, 11, 5));
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(5, 11, 5);
        });
    }

    @Test
    public void testAverageScoreInValid6() {
        assertEquals(5.0, trungBinhCong.averageScore(5, 5, 11));
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(5, 5, 11);
        });
    }

    @Test
    public void testAverageScoreInValid7() {
        trungBinhCong.averageScore(-1, -1, -1);
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(-1, -1, -1);
        });
    }

    @Test
    public void testAverageScoreInValid8() {
        trungBinhCong.averageScore(8, -1, 7);
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(8, -1, 7);
        });
    }

    @Test
    public void testAverageScoreInValid9() {
        trungBinhCong.averageScore(8, 7, -1);
        assertThrows(IllegalArgumentException.class , () -> {
            trungBinhCong.averageScore(8, 7, -1);
        });
    }

    @Test
    public void testAverageScoreValid10() {
        assertEquals(0.0, trungBinhCong.averageScore(0, 0, 0));
    }
}
