
/**
 * 插入排序
 * 每次从无序列表中取第一个数插入到有序列表形成新的有序列表
 */
public class InsertionSort {

    public static void insertSort(int[] arr){
        if(arr == null || arr.length<2) return;

        for(int i = 1;i<arr.length;i++){
            for(int j = i-1;j>=0 && arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
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
            arr[i] = (int) ((maxSize+1)*Math.random())-(int)((maxSize+1)*Math.random());
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
        int[] arr = getRandomArray(20, 100);
        printArray(arr);
        insertSort(arr);
        printArray(arr);
    }
}
