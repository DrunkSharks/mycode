
/**
 * 冒泡排序（平均：O(n²) 最好：O(n) 最坏：O(n²)）
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    //随机生成数组
    public static int[] getRandomArray(int maxSize,int maxValue){
        //随机获取数组长度
        int[] arr = new int[(int) ((maxSize+1)*Math.random())];
        //生成随机数组
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int) ((maxValue+1)*Math.random())-(int)((maxValue+1)*Math.random());
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = getRandomArray(100, 100);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
