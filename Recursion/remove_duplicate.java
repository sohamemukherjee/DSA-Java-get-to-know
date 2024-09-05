public class remove_duplicate{
    public static boolean[] map = new boolean[26];
    
    public static void remove(String str,int i, String newString){
        
        if(i==str.length()){
            System.out.println(newString);
            return;
        }
        char ch=str.charAt(i);
        if (map[ch-'a']){
            remove(str, i+1, newString); 
        }else{
            newString+=ch;
            map[ch-'a']=true;
            remove(str, i+1 , newString);
        }
    }
    public static void main(String[] args) {
        String nString="abbccddaa";
        remove(nString, 0, "");
    }
}