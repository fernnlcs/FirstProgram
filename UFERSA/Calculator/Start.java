// import jdk.internal.vm.PostVMInitHook;
import ufersa.Calculator;

public class Start {
    public static void main (String[] args) {
        Calculator blueCalculator = new Calculator();

        double result = blueCalculator.add(1.25, 2.50);

        System.out.println("The result is " + result);
    }
}