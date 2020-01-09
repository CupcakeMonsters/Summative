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
}
