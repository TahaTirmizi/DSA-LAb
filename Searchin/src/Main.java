public class Main {
    public static void main(String[] args) {
        int[] array = {3,8,12,20,25,30};
        int index =binarySearch(array,1);
        if(index!=-1) {
            System.out.println("The given value is at index:" + index);
        }
        else {
            System.out.println("Given doesn't exist in array");
        }
        binarySearchRecursion(array,0,array.length-1,25);
        linearSearch(array,12,0);
        maxima(array,array[0],0);
        minima(array,array[0],0);
    }
    public static int binarySearch(int[] array,int key){
        int low=0;
        int high = array.length-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(array[mid]==key){
                return mid;
            }
            if(key<array[mid]){
                high=mid-1;
            }
            if(array[mid]<key){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void binarySearchRecursion(int[] array,int low,int high,int key){
        int mid= (low+high)/2;
        if(low==high){
            if(array[mid]==key){
                System.out.println("Given is at index "+mid);
                return ;
            }
            System.out.println("Given not found");
            return ;
        }
        if(array[mid]==key){
            System.out.println("Given value is at index "+mid);
            return;
        }
        if(key<array[mid]){
            binarySearchRecursion(array,low,mid-1,key);
        }
        if(array[mid]<key){
            binarySearchRecursion(array,mid+1,high,key);
        }
    }
    public static void linearSearch(int[] array,int key,int index){
        if(index==array.length-1){
            if(array[index]==key){
                System.out.println("Given is at index "+index);
                return;
            }
            System.out.println("Not found");
            return;
        }
        if(array[index]==key){
            System.out.println("Given is at index "+index);
            return;
        }
        linearSearch(array,key,index+1);
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