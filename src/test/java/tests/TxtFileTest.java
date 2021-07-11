package tests;

import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtFileTest {
    @Test

    void txtTest() throws IOException {
        String txtFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.txt";
        String expectedData = "И лучше выдумать не мог.";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData,containsString(expectedData));
    }
}
