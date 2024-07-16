// <!-- Complete the function dataTypeSize() which takes a string as input and returns the size of the data type represented by the given string in byte unit.
// Return -1 if the input data type is invalid. -->
import java.util.*;

class Solution {
    
    static int dataTypeSize(String str) {
      
        
        if(str.equals("Integer")){
            
            return 4;
        }
        
        else if(str.equals("Character")){
            return 1;
        }
        else if(str.equals("Long")){
            return 8;
        }
        
        else if(str.equals("Float")){
            return 4;
        }
        else if(str.equals("Double")){
            return 8;
        }
        
        return -1;
    }
    
    public static void main(String []args){
        
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int res=dataTypeSize(str);
        System.out.println(res);
        
    }
}