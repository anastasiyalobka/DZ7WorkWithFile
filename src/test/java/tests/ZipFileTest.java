package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTest {

    @Test

    void unZipWithPassword() throws ZipException, IOException {
        String zipFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.zip";
        String unzipFolderPath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/unzip/1.txt";
        String expectedData = "И лучше выдумать не мог.";

        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test

    void unZipNoPassword() throws IOException, ZipException {
        String zipFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/1.zip";
        String unzipFolderPath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/unzip";
        String unzipTxtFilePath = "/Users/anastasiya/IdeaProjects/DZ7WorkWithFile/src/test/resources/files/unzip/1.txt";
        String expectedData = "И лучше выдумать не мог.";

        unzip(zipFilePath,unzipFolderPath);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));


    }
}
