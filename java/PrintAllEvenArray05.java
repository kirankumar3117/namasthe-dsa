public class PrintAllEvenArray05{
    public static void main(String[] args){
        int[] arr = {10, 5, 8, 7, 9, 6};
        for(int i=0;i< arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}



