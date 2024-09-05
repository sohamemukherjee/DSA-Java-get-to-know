public class rev_string {
    public static void print_rev(String str,int i){
        if(i<0){
            return;
        }
        System.out.print(str.charAt(i));
        print_rev(str,i-1);

    }
    public static void main(String args[]){
        String str = "Hello World";
        print_rev(str,str.length()-1);
    }
}
