// 14. Write a C program to check whether a triangle is Equilateral, Isosceles or Scalene.
// Test Data :
// 50 50 60
// Expected Output :
// This is an isosceles triangle.

public class Sample {
    public static void main(String[] args) {
  
        int a = 40, b = 50, c = 60;
        // if (a == b) {
        //     if (b == c) {
        //         System.out.println("Equilateral");
        //     } else {
        //         System.out.println("Isosceles");
        //     }
        // }

        // else if (a != b) {
        //     if (b == c) {
        //         System.out.println("Isosceles");
        //     } else {
        //         System.out.println("scelean");
        //     }
        // }


        if(a == b && b == c){
            System.out.println("equi");
        }
        else if(a==b && b!=c){
            System.out.println("isolate");
        }
        else if(true && true&& true){
            System.out.println("Scalene");
        }
    }

}

