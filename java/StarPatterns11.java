
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

    //right angle star pattern 
    public static void rightAngleStarPattern(int n){
        for(int i=0; i<n;i++){
            String row = "";
            for(int j=0;j<=i;j++){
                row += "*";
            }
            System.out.println(row);
        }
    }

     //right angle number pattern 
    public static void rightAngleNumberPattern(int n){
        for(int i=0; i<n;i++){
            String row = "";
            for(int j=0;j<=i;j++){
                row += (j+1);
            }
            System.out.println(row);
        }
    }

     //right triangle repeated number pattern 
    public static void rightTrianleRepatedNummberPattern(int n){
        for(int i=0; i<n;i++){
            String row = "";
            for(int j=0;j<=i;j++){
                row += (i + 1);
            }
            System.out.println(row);
        }
    }

    public static void reverseRightAngledTriangleIncreasingNumbers(int n){
        for( int i=n;i >0;i--){
            String row = "";
            for(int j = 0; j < i; j++){
                row += (j + 1);
            }
            System.out.println(row);
        }
    }

    public static void main(String[] args){
        // nxnStar(4);
        // rightAngleStarPattern(4);
        // rightAngleNumberPattern(4);
        // rightTrianleRepatedNummberPattern(4);
        // reverseRightAngledTriangleIncreasingNumbers(4);
    }
}