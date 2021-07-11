package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readXlsxFromPath;

public class XlsxFileTest {

    @Test

    void xlsxFile() {
    String xlsxFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.xlsx";
    String expectedData = "И лучше выдумать не мог.";

    String actualData = readXlsxFromPath(xlsxFilePath);
    assertThat(actualData, containsString(expectedData));

}
}

