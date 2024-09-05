public class subs {
    public static void  subsequences(String str, int i, String newString){
        if (i == str.length()){
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(i);
        //to be
        subsequences(str, i+1, newString+curr);

        //not to be
        subsequences(str, i+1, newString);
    }
    
    public static void main(String[] args) {
        String str="abc";
        subsequences(str, 0, "");
    }
}
