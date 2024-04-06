package lab.Lab7.P1;

import com.SOF304.yennth.lab.Lab7.P1.StudentGrader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateGradeTest {

    @Test
    public void calculateGrade1() {
        StudentGrader student1 = new StudentGrader(35);
        assertEquals("F", student1.calculateGrade());
    }
    @Test
    public void calculateGrade1_1() {
        StudentGrader student1 = new StudentGrader(0);
        assertEquals("F", student1.calculateGrade());
    }
    @Test
    public void calculateGrade1_2() {
        StudentGrader student1 = new StudentGrader(40);
        assertEquals("F", student1.calculateGrade());
    }
    @Test
    public void calculateGrade2() {
        StudentGrader student2 = new StudentGrader(55);
        assertEquals("D", student2.calculateGrade());
    }
    @Test
    public void calculateGrade2_1() {
        StudentGrader student2 = new StudentGrader(41);
        assertEquals("D", student2.calculateGrade());
    }
    @Test
    public void calculateGrade2_2() {
        StudentGrader student2 = new StudentGrader(60);
        assertEquals("D", student2.calculateGrade());
    }

    @Test
    public void calculateGrade3() {
        StudentGrader student3 = new StudentGrader(65);
        assertEquals("C", student3.calculateGrade());
    }

    @Test
    public void calculateGrade3_1() {
        StudentGrader student3 = new StudentGrader(61);
        assertEquals("C", student3.calculateGrade());
    }

    @Test
    public void calculateGrade3_2() {
        StudentGrader student3 = new StudentGrader(70);
        assertEquals("C", student3.calculateGrade());
    }

    @Test
    public void calculateGrade4() {
        StudentGrader student4 = new StudentGrader(75);
        assertEquals("B", student4.calculateGrade());
    }
    @Test
    public void calculateGrade4_1() {
        StudentGrader student4 = new StudentGrader(71);
        assertEquals("B", student4.calculateGrade());
    }
    @Test
    public void calculateGrade4_2() {
        StudentGrader student4 = new StudentGrader(80);
        assertEquals("B", student4.calculateGrade());
    }

    @Test
    public void calculateGrade5() {
        StudentGrader student5 = new StudentGrader(85);
        assertEquals("A", student5.calculateGrade());
    }
    @Test
    public void calculateGrade5_1() {
        StudentGrader student5 = new StudentGrader(81);
        assertEquals("A", student5.calculateGrade());
    }
    @Test
    public void calculateGrade5_2() {
        StudentGrader student5 = new StudentGrader(100);
        assertEquals("A", student5.calculateGrade());
    }

    @Test
    public void calculateGrade6() {
        StudentGrader student6 = new StudentGrader(-10);
        assertEquals("F", student6.calculateGrade());
    }

    @Test
    public void calculateGrade7() {
        StudentGrader student7 = new StudentGrader(105);
        assertEquals("A", student7.calculateGrade());
    }

    @Test
    public void calculateGrade8() {
        StudentGrader student5 = new StudentGrader(-100);
        assertEquals("A", student5.calculateGrade());
        assertThrows(IllegalArgumentException.class , () -> {
            StudentGrader studentNew = new StudentGrader(-1);
        });
    }

    @Test
    public void calculateGrade9() {
        StudentGrader student5 = new StudentGrader(101);
        assertEquals("A", student5.calculateGrade());
        assertThrows(IllegalArgumentException.class , () -> {
            StudentGrader studentNew = new StudentGrader(101);
        });
    }
}
