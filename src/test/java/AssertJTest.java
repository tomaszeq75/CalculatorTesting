import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {
    @Test
    void stringTest() {
        // given
        String string = "To jest jakiś string";

        //then
        assertThat(string)
                .startsWith("To")
                .endsWith("string")
                .contains(" ");
    }

    @Test
    void stringTest2() {
        // given
        String string = "To jest jakiś string ";

        //then
        assertThat(string)
                .startsWith("To")
                .doesNotEndWith("string")
                .contains(" ");
    }

    @Test
    void listTest() {
        List<String> list = List.of("aaa", "bbb", "ccc");
        List<String> list2 = List.copyOf(list);

        assertThat(list).isEqualTo(list2);
    }

    @Test
    void listTest2() {
        List<String> list = List.of("aaa", "bbb", "ccc");
        List<String> list2 = List.of("bbb", "aaa", "ccc");

        assertThat(list).hasSameElementsAs(list2);
    }

}
