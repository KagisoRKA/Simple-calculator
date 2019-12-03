public class SimpleCalculator {
    public static int add(int... SumNumbers){
        int sum = 0;
        for (int a: SumNumbers){
            sum+=a;
        }
        return sum;
    }
    public static int multiply(int... ProductNumb){
        int product = 1;
        for (int b: ProductNumb) {
            product*=b;
        }
        return product;
    }
}