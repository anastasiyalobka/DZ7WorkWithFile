package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;


public class XlsFileTest {

    @Test
    void xlsFile() throws IOException {
        String xlsFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.xls";
        String expectedData = "И лучше выдумать не мог.";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));

    }
}
