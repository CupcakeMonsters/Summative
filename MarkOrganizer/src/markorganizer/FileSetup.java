package markorganizer;
import java.io.*;

public class FileSetup {
    public static BufferedReader reader;
    public static FileReader in;
    public static BufferedReader classReader;
    public static FileReader classIn;
    public static FileWriter writer;
    public static BufferedWriter write;
    
    //Creating the first files the program needs to run
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
    
    //Creates a new file for a class that currently doesn't have one
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
    
    //Method to take array of students' names from file
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
    
    //Method to delete an existing class
    public static void deleteClass(String filePath) throws IOException{
        File delFile = new File(filePath + ".txt");
        if(delFile.delete()){
            System.out.println("Deleted Successfully");
        }
    }
    
    //Saving a newly added class name
    public static void reWriteClass(String[] classes) throws IOException{
        try{
            writer = new FileWriter("Classes.txt");
            write = new BufferedWriter(writer);
            for (String clas : classes){
                write.write(clas);
                write.newLine();
            }
            write.close();
            
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        
        
    }
    
    //Method to read previously saved information from files
    public static String[][] read() throws IOException{
        int lines = 0;
        reader.mark(100000);
        while (reader.readLine() != null) lines++;
        String[][] students = new String[lines][11];//lines -> number of lines in selected data file(amount of students)
        String currStudent = "PlaceHolder";
        int counter = 0;
        reader.reset();
        for(int amtLines = 0; amtLines<lines; amtLines++){
            currStudent = reader.readLine();
            if(currStudent==null){
                break;
            }
            String[] currArr = currStudent.split(", ");//Separating values in the .txt file to have variables
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
    //Method to save updated information to files
    public static void saveData(String filePath, String[][]students) throws IOException{
        if("placeholder".equals(filePath)){}//making sure there is actually a file to save data to
        else{
            for(String[] redo:students){
                for(String change: redo){
                    if(redo.equals("0")){
                        
                    }
                }
            }
            try{
                writer = new FileWriter(filePath + ".txt");
                write = new BufferedWriter(writer);
                for (String[] clas : students){
                    String temp = String.join(", ", clas);
                    write.write(temp);
                    write.newLine();
                }
                write.close();

            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }
}
