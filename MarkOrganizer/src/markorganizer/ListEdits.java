/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markorganizer;

/**
 *
 * @author Marwan Zeid
 */
public class ListEdits {
    public static String[] removeAtIndex(String[] list, int index){ 
        if (list == null || index < 0 || index >= list.length) { 
  
            return list; 
        } 
  
        // Create another array of size one less 
        String[] output = new String[list.length - 1]; 
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < list.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == index) { 
                continue; 
            } 
  
            // if the index is not 
            // the removal element index 
            output[k++] = list[i]; 
        } 
  
        // return the resultant array 
        
        
        return output;  
    }
   
    public static String[][] sortList(String[][] list){
        int i = 0;
        for (String[] tem : list) {
            String[] min = tem;
            int minId = i;
                for (int j = i+1; j < list.length; j++) {
                    String[] firstlastC = list[j][0].split(" ");
                    String last = firstlastC[1];
                    String[] firstlastM = min[0].split(" ");
                    String lastComp = firstlastM[1];
                    if (last.compareToIgnoreCase(lastComp) < 0) {
                      min = list[j];
                      minId = j;
                    }
                }
            // swapping
            String[] temp = list[i];
            list[i] = min;
            list[minId] = temp;
            i++;
            }
            return list;
    }
}
