public class Tiles {
    public static int placeTiles(int n,int m){
        if(n==m)
            return 2;
        if(n<m)
            return 1;
        //vertical placements
        int vert=placeTiles(n-m,m);
        //horizontal placements
        int hori=placeTiles(n-1,m);
        return vert+hori;
    }
    public static void main(String args[]){
        int n=4,m=2;
        int count=placeTiles(n, m);
        System.out.println(count);
    }
    
}
