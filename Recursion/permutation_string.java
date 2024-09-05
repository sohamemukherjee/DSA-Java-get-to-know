public class permutation_string{
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr= str.substring(0,i)+str.substring(i+1);
            printPerm(newStr, permutation+curr);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
     printPerm(str, ""); 
    }
}