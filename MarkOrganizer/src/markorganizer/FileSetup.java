package markorganizer;
import java.io.*;

public class FileSetup {
    public static BufferedReader reader;
    public static FileReader in;
    
    public static void start(){
        try{
            File dataFile = new File("data.txt");
            if(!dataFile.exists()) {
                System.out.println("File not found, creating file.");
                dataFile.createNewFile(); //creating it
            } 
            else{
                System.out.println("File found.");
            }
            
            in = new FileReader(dataFile);
            reader = new BufferedReader(in);
        }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }
    
    public static String[][] read() throws IOException{
        int lines = 0;
        reader.mark(100000);
        while (reader.readLine() != null) lines++;
        System.out.println(lines+"lines");
        String[][] students = new String[3][100];//lines -> number of lines in selected data file
        String currStudent = "PlaceHolder";
        int counter = 0;
        reader.reset();
        for(int amtLines = 0; amtLines<lines; amtLines++){
            currStudent = reader.readLine();
            System.out.println(currStudent);
            if(currStudent==null){
                break;
            }
            String[] currArr = currStudent.split(", ");
            students[counter][0] = currArr[0];
            students[counter][1] = currArr[1];
            counter++;
        }
        
        reader.close();
        return students;
    }
    
}
