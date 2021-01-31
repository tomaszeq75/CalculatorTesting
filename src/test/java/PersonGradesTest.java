import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonGradesTest {

    @Test
    void getPersonGradesTest() {
        Person person = new Person();
        PersonGrades personGrades = new PersonGrades();
        List<Integer> grades = personGrades.addGrade(person, 1);

        assertTrue(grades.contains(1));
    }

    @Test
    void getPersonGradesTest2() {
        Person person = new Person("mr", "Jan", "Kowalski");
        PersonGrades personGrades = new PersonGrades();
        personGrades.addGrade(person, 2);
        List<Integer> grades = personGrades.addGrade(person, 1);

        assertThat(List.of(1, 2)).hasSameElementsAs(grades);
    }


}
