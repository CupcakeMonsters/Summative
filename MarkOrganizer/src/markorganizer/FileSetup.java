package markorganizer;
import java.io.*;

public class FileSetup {
    public static BufferedReader reader;
    public static FileReader in;
    public static BufferedReader classReader;
    public static FileReader classIn;
    
    public static void start(String filePath){
        try{
            File dataFile = new File(filePath + ".txt");
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
    
    public static void getClasses(){
        try{
            File classFile = new File("Classes.txt");
            if(!classFile.exists()) {
                System.out.println("Classes not found, creating file.");
                classFile.createNewFile(); //creating it
            } 
            else{
                System.out.println("File found.");
            }
            
            classIn = new FileReader(classFile);
            classReader = new BufferedReader(classIn);
        }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }
    
    public static String[] classList()throws IOException{
        
        int lines = 0;
        classReader.mark(100000);
        while (classReader.readLine() != null) lines++;
        String[] classes = new String[lines];
        classReader.reset();
        for (int i = 0; i < lines; i++){
            classes[i] = classReader.readLine();
        }
        return classes;
    }
    
    public static String[][] read() throws IOException{
        int lines = 0;
        reader.mark(100000);
        while (reader.readLine() != null) lines++;
        String[][] students = new String[lines][11];//lines -> number of lines in selected data file
        String currStudent = "PlaceHolder";
        int counter = 0;
        reader.reset();
        for(int amtLines = 0; amtLines<lines; amtLines++){
            currStudent = reader.readLine();
            if(currStudent==null){
                break;
            }
            String[] currArr = currStudent.split(", ");
            int studcounter = 0;
            for (String text: currArr){
                students[counter][studcounter] = currArr[studcounter];
                studcounter++;
            }            
            counter++;
        }
        
        reader.close();
        return students;
    }
    
}
