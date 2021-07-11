package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocxFromPath;


public class DocxFileTest {


    @Test
    void docxFile() throws IOException {
        String docxFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.docx";
        String expectedData = "И лучше выдумать не мог.";

        String actualData = readDocxFromPath(docxFilePath);
        assertThat(actualData, containsString(expectedData));
        }
    }
