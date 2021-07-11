package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;


public class PdfFileTest {
    @Test

    void pdfTest() throws IOException {
        String pdfFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.pdf";
        String expectedData = "И лучше выдумать не мог.";

        PDF pdf = getPdf(pdfFilePath);

        assertThat(pdf, PDF.containsText(expectedData));
    }
}
