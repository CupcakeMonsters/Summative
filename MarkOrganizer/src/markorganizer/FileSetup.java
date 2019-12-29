package markorganizer;
import java.io.*;

public class FileSetup {
    public static BufferedReader reader = null;
    public static FileReader in = null;
    public static void bubbleSort(Double[] a) {
    boolean sorted = false;
    double temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
}  
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
        String[][] students = new String[3][2];
        String currStudent = "PlaceHolder";
        int counter = 0;
        
        while(true){
            
            currStudent = reader.readLine();
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
