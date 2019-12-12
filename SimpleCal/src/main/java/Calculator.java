public class Calculator {
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
class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(2,3,3));
        System.out.println(Calculator.multiply(2,2,2));
    }
}
