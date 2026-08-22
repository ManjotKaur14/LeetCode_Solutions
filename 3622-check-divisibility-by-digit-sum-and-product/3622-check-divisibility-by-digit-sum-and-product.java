class Solution {

    public static int SumofDigits(int n){
        if(n<=9)return n;
        return (n%10)+SumofDigits(n/10);
    }
    public static int product(int n){
        if(n<10)return n;
        return (n%10)*product(n/10);
    }
    public boolean checkDivisibility(int n) {
        if(n==10)return true;
        int a = SumofDigits(n);
        int b=product(n);
            return (a+b)%n==0;
    }
}