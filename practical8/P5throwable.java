package practical8;

public class P5throwable {
    public static void main(String[] args) {
        try {
            Checkeligibilty(15);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

            
        }
    }
    //prvate use for class level acess
    private static void Checkeligibilty(int age)throws InvalidAgeException{
        if (age<=0){
            throw new InvalidAgeException ("Age cannot be negative");
        }
        else if (age<=17){
            System.out.println("!!Peson is not eligibable for vote");
        }
        else{
            System.out.println("you are eligible for vote");
        }

    }
}
// define the exception in here 
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
