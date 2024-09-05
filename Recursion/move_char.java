public class move_char{
    public static String move(String str, int i,int count, String newString){
        // code to move the character at index n to the end of the string
        if(str.length() == i){ 
            for(int k=0;k<count;k++){
                newString+='x';            
            }
            return newString;
        }
        char curr=str.charAt(i);
        if (curr == 'x'){
            count++;
            return move(str,i+1,count,newString);
        }
        else{
            newString += curr;
            return move(str,i+1,count,newString);
        }
    }
    public static void main(String args[]) {
        String str="axbcxxd";
        String nstr=move(str,0,0,"");
        System.out.println(nstr);
    }
}