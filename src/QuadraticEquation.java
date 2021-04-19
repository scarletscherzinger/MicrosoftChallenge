// Question.
// Given a, b, c for a quadratic expression ax2 + bx + c = 0.
// Write a function getX that returns the larger of the values for X, i.e. if x1 = -2 and x2 = 5, getX should return 5.

// Answer:
// We can calculate the roots of a Quadratic Equation by using the formula: x = (-b ± √(b2-4ac)) / (2a).
// The ± sign indicates that there will be two roots:
// root1 = (-b + √(b2-4ac)) / (2a).
// root2 = (-b - √(b2-4ac)) / (2a).

import java.lang.Math;


public class QuadraticEquation {

    private static double getX(int a, int b, int c) {

        double root1;
        double root2;


        // The term b2-4ac is known as the determinant of a quadratic equation. It specifies the nature of roots. That is,
        // if determinant > 0, roots are real and different.
        // if determinant == 0, roots are real and equal
        // if determinant < 0, roots are complex and different

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // Both roots are real and different.
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        if (root1 > root2) {
            return root1;
        }
        else if (root2 > root1) {
            return root2;
        }else{
            throw new IllegalArgumentException("The roots are distinct and imaginary.");
        }

    }

    public static void main(String args[]) {
        System.out.println(getX(1, -3, -10));
    }


}
