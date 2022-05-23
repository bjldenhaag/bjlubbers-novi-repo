public class Calculator {
    int divideResult;

    public int getDivideResult()
    {
        return divideResult;
    }

    public int times(int x, int y) {
        return x * y;
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public void divide(int x, int y) {
        divideResult = x / y;
    }
}
