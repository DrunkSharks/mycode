
import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int k){
        int left = 0;
        int right = arr.length-1;
        int mid;
        while(left <= right){
            mid = left + ((right - left)>>1);
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    //随机生成数组
    public static int[] getRandomArray(int maxSize,int maxValue){
        //随机获取数组长度
        int[] arr = new int[(int) ((maxSize+1)*Math.random())];
        //生成随机数组
        for(int i = 0;i<arr.length;i++){
            arr[i] = getRandomValue(maxValue);
        }
        return arr;
    }

    public static int getRandomValue(int maxValue){
        return (int) ((maxValue+1)*Math.random())-(int)((maxValue+1)*Math.random());
    }

    public static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = getRandomArray(20, 50);
        Arrays.sort(arr);
        int randomValue = getRandomValue(100);
        int index = binarySearch(arr, randomValue);
        printArray(arr);
        System.out.println("目标值："+randomValue);
        System.out.println("下标值："+index);
    }
}
