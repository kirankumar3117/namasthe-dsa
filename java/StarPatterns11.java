
public class StarPatterns11{
    public static void nxnStar(int n){
        for(int i = 0; i < n; i++){
            String row = "";
            for(int j = 0; j < n; j++){
                row += "*";
            }
            System.out.println(row);
        }
    }

    public static void main(String[] args){
        nxnStar(4);
    }
}