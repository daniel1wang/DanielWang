import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    // Method to create a CSV file with given content
    public static void generateCSV(String filePath, String[][] content) throws IOException {
        try (var writer = Files.newBufferedWriter(Path.of(filePath))) {
            for (String[] row : content) {
                StringBuilder lineBuilder = new StringBuilder();
                for (String cell : row) {
                    lineBuilder.append(cell.trim()).append(",");
                }
                lineBuilder.replace(lineBuilder.length() - 1, lineBuilder.length(), "\n");
                writer.write(lineBuilder.toString());
            }
        }
    }

    // Method to read content from a CSV file and return as a 2D array
    public static String[][] readCSV(String filePath) throws IOException {
        List<String[]> content = new ArrayList<>();
        var dataReader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = dataReader.readLine()) != null) {
            String[] row = line.split(",");
            content.add(row);
        }

        dataReader.close();
        return content.toArray(new String[0][]);
    }

    // Method to get a specific row from a CSV file
    public static String[] getRow(String filePath, int rowNumber) throws IOException {
        String[][] content = readCSV(filePath);
        String[] row = new String[0];

        if (rowNumber >= 0 && rowNumber < content.length) {
            row = content[rowNumber];
        }

        return row;
    }

    // Method to print the content of a CSV file to the console
    public static void printCSV(String filePath) throws IOException {
        String[][] content = readCSV(filePath);

        for (String[] row : content) {
            for (int col = 0; col < row.length - 1; col++) {
                System.out.print(row[col] + ",");
            }
            System.out.println(row[row.length - 1]);
        }
    }

    public static void main(String[] args) throws IOException {
        // Example usage
        String inputFile = "example.csv";

        System.out.println("Original CSV content:");
        printCSV(inputFile);

        System.out.println("\nContent of row 1:");
        String[] row1 = getRow(inputFile, 1);
        for (String cell : row1) {
            System.out.print(cell + ",");
        }
    }
}
