package week5.tute;

interface Equation {
    int numberOfVariables = 1;

    double solve();

    default void printFormula() {
        System.out.println("x^2 + 3x + 1");
    }
}