import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    String fileName;
    FileWriter fileWriting;
    public FileHandling(String fileName){
        this.fileName = fileName;
        try {
            File myFile = new File("./src/main/java/"+fileName);
            myFile.createNewFile();
            fileWriting = new FileWriter("./src/main/java/"+fileName);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        write("Theta", "Sin Value");
    }

    public void write(String collum1, String collum2){
        try {
            fileWriting.write(collum1+","+collum2+"\n");
        } catch (IOException e) {
            System.out.println("File Failed To Write");
            e.printStackTrace();
        }
    }

    public void close() {
        try {
        fileWriting.close();
        } catch (IOException e) {
            System.out.println("File Failed to close");
            e.printStackTrace();
        }
    }
}