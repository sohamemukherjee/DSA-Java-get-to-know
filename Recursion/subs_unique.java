import java.util.HashSet;

public class subs_unique {
    public static void  subsequences(String str, int i, String newString, HashSet<String> set){
        if (i == str.length()){
            if(set.contains(newString))
                return;
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr=str.charAt(i);
        //to be
        subsequences(str, i+1, newString+curr,set);

        //not to be
        subsequences(str, i+1, newString,set);
    }
    
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "",set);
        }
}
