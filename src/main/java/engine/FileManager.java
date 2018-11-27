package engine;

import objects.Instrument;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    public static void createReport(List<Instrument> instruments) throws IOException {
        if (instruments != null) {
            FileWriter writer = new FileWriter(getCurrentPath() + "/report.txt");
            for (Instrument instrument : instruments) {
                writer.append(instrument.toString()).append("\n");
            }
            writer.close();
        }
    }

    private static String getCurrentPath() {
        return new File(".").getAbsolutePath();
    }
}
