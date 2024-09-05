public class first_and_last {
    public static int first=-1;
    public static int last=1;
    public static void findOcc(String str, int idx, char element){
        if(idx== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr_char=str.charAt(idx);
        if(curr_char == element){
            if(first==-1)
                first=idx;
            else
                last=idx;
        }

        findOcc(str, idx+1, element);
    }
     public static void main(String[] args) {
        String str ="Bananna";
        findOcc(str, 0, 'a');
     }
}
