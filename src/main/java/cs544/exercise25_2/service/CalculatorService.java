package cs544.exercise25_2.service;

/**
 * User: franc
 * Date: 19/09/2018
 * Time: 2:46
 */
public class CalculatorService implements ICalculator {
    private int value = 0;

    public void setValue(int value) {
        this.value = value;
    }
    public synchronized int calc(char operator, int number) {
        if (operator == '+')
            value = value + number;
        if (operator == '-')
            value = value - number;
        if (operator == '*')
            value = value * number;
        if (operator == '/')
            value = value / number;
        return value;
    }
}
