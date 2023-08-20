
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

 public class Main {
        private static final Path BASE_PATH = Paths.get("src/main/resources/folder");

        public static void main(String[] args) {
            createFolders();
            printFilesPathAndContent(BASE_PATH);
        }

        private static void createFolders() {
            int folderNumber = 8;

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                Path currentPath = BASE_PATH;
                for (int i = 1; i <= folderNumber; i++) {
                    currentPath = currentPath.resolve("folder_" + i);
                    Files.createDirectories(currentPath);
                    if (i % 2 == 0) {
                        Path filePath = currentPath.resolve("file_of_folder_" + i);

                        System.out.printf("Input content of file %s :\n", currentPath);
                        String content = reader.readLine();

                        Files.write(filePath, content.getBytes());
                    }
                }
            } catch (IOException e) {
                System.err.println("Failed to create directory or file!" + e.getMessage());
                e.printStackTrace();
            }
        }

        private static void printFilesPathAndContent(Path folderPath) {
            try {
                Files.walk(folderPath)
                        .filter(Files::isRegularFile)
                        .forEach(file -> {
                            System.out.printf("File path:\n%s\n", file);
                            System.out.printf("File content:\n%s\n\n", getFileContent(file));
                        });
            } catch (IOException e) {
                System.err.println("Error traversing directory: " + folderPath + " - " + e.getMessage());
                e.printStackTrace();
            }
        }

        private static String getFileContent(Path path) {
            try {
                List<String> lines = Files.readAllLines(path);
                return String.join(System.lineSeparator(), lines);
            } catch (IOException e) {
                System.err.println("Reading file error: " + path + " - " + e.getMessage());
                e.printStackTrace();
                return "";
            }
        }
    }