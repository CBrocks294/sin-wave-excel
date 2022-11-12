import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    String fileName;
    public FileHandling(String fileName){
        this.fileName = fileName;
        try {
            File myFile = new File("./src/main/java/"+fileName);
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        write("Theta", "Sin Value");
    }

    public void edit(String collum1, String collum2, boolean append){
        try {
            FileWriter fileWriting = new FileWriter("./src/main/java/"+fileName,append);
            fileWriting.write(collum1 + "," + collum2 + "\n");
            fileWriting.close();
        } catch (IOException e) {
            System.out.println("File Failed To Write");
            e.printStackTrace();
        }
    }
    public void write(String collum1, String collum2){
        edit(collum1,collum2,false);
    }
    public void append(String collum1, String collum2){
        edit(collum1,collum2,true);
    }
}