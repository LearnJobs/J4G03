package day19.java;

class Recursion {
    int func (int n) {
        int result;
        if (n == 1)
            return 1;
        result = func (n - 1);
        return result;
    }
} 

class Output {
    public static void main(String args[]) {
        Recursion obj = new Recursion() ;
        System.out.print(obj.func(5));
    }
}


