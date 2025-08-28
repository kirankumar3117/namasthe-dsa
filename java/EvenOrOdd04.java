public class EvenOrOdd04{
    public static Boolean evenOrOdd(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Boolean five = evenOrOdd(5);
        System.out.println(five);
    }
}