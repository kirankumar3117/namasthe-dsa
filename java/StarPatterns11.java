
public class StarPatterns11{
    // nxn pattern
    public static void nxnStar(int n){
        for(int i = 0; i < n; i++){
            String row = "";
            for(int j = 0; j < n; j++){
                row += "*";
            }
            System.out.println(row);
        }
    }

    //right angle pattern 
    public static void rightAngleStarPattern(int n){
        for(int i=0; i<n;i++){
            String row = "";
            for(int j=0;j<=i;j++){
                row += "*";
            }
            System.out.println(row);
        }
    }

     //right angle pattern 
    public static void rightAngleNumberPattern(int n){
        for(int i=0; i<n;i++){
            String row = "";
            for(int j=0;j<=i;j++){
                row += (j+1);
            }
            System.out.println(row);
        }
    }

    public static void main(String[] args){
        // nxnStar(4);
        // rightAngleStarPattern(4);
        rightAngleNumberPattern(4);
    }
}