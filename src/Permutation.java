public class Permutation {
    public static void main(String[] args){
        int a = 11;
        int b = 22;
        int c = 33;

        int number = a;
        a = b;
        b = c;
        c = number;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
