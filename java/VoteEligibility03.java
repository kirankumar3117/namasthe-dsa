public class VoteEligibility03{
    public static void checkEligibility(int age){
        if(age >= 18){
            System.out.println("Your ELigible");
        }else{
            System.out.println("Your not eligible");
        }
    };
    public static void main(String[] args){
       checkEligibility(24);
    }
}