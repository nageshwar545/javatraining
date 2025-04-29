package Assignment4;

interface  Addition {
    public int addNumbers(int i, int j, int k);
}
public class LambdaAdditionDemo {
    public static void main(String[] args) {
        Addition addition =   (i, j, k) -> i + j + k;
        System.out.println(addition.addNumbers(2,4, 3));
        Addition ref = addition::addNumbers;
        System.out.println(ref.addNumbers(4,3, 4));
     }
}
