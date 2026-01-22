public class Main {
    public static void main(String[] args) {
        int[] array= {2,4,6,8};
        int[] array1 = {3,5,7,9};
        System.out.println("factorial of 5 is: "+factorial(5));
        System.out.println("Fib: "+fib(6));
        System.out.println("Sum of an array:"+sumOfArray(array,0));
        isArraySorted(array1,0);
        minima(array1,array1[0],0);
        maxima(array1,array1[0],0);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-1);
    }
    public static int sumOfArray(int[] array,int n){
        if(n==array.length){
            return 0;
        }
        return array[n]+sumOfArray(array,n+1);
    }
    public static void isArraySorted(int[] array,int n){
        if(n==array.length-1){
            System.out.println("Yes");
            return ;
        }
        if(array[n]>array[n+1]){
            System.out.println("No");
            return;
        }
        if(array[n]<array[n+1])
            isArraySorted(array,n+1);
    }
    public static void maxima(int[] array,int max,int index){
        if(index==array.length){
            System.out.println("Maximum: "+max);
            return;
        }
        if (array[index]>max){
            max=array[index];
        }
        maxima(array,max,index+1);
    }
    public static void minima(int[] array,int min,int index){
        if(index==array.length){
            System.out.println("Minimum: "+min);
            return;
        }
        if (array[index]<min){
            min=array[index];
        }
        minima(array,min,index+1);
    }
}
