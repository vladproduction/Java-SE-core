package vladproduction.com.while_;

public class WHILE_FOR {

    public static void main(String[] args) {
        WHILE_FOR loopsWHILE_for = new WHILE_FOR();
        //loopsWHILE_for.largestPowerOf2(64);
        //loopsWHILE_for.finiteSum(6);
        //loopsWHILE_for.finiteProduct(4);
        //loopsWHILE_for.rulerFunction(9);

    }
    public void largestPowerOf2(int n) {
        int power = 1;
        while (power <= n / 2)
            power = 2 * power;
        System.out.println(power);
    }
    public void finiteSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++)//{ new string but without only one
            sum += i;
            System.out.println(sum); //as result

    }
    public void finiteProduct(int n){
        int product = 1;
        for (int i = 1; i <= n; i++)
            product *= i;
        System.out.println(product);
    }
    public void rulerFunction(int n){
        String ruler = "Ruler";
        for (int i = 0; i <= n; i++){
            ruler = ruler + " " + i;           // + " " + ruler
            System.out.println(ruler);
        }
    }
}
