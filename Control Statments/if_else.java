

public class if_else {
    public static void main(String[] args) {
        //If it is true in the 'if' then if will run, or else statement will run.
        // if (true) {
        //     System.out.println("Inside if");
        // }
        // else{
        //     System.out.println("inside else");
        // }   

        int a = 10;
        int b = 11;
        int c = 12;
        // boolean c  = (a > b);
        // if(c){
        //     System.out.println("inside if");
        // }
        // else{
        //     System.out.println("inside else");
        // }
        if(a == b){
            System.out.println("inside if statement");
        }
        else if(a == c){
            System.out.println("inside else if statement");
        }
        else{
            System.out.println("inside else statement");
        }
    }
}    
