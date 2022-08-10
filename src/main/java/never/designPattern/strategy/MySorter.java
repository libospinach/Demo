package never.designPattern.strategy;

public class MySorter<T> {
    public void sort(T[] arr,MyComparator<T> myComparator){
        if(arr == null || arr.length ==0){
            return;
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length; j++){
               int res = myComparator.compare(arr[i],arr[j]);
               if(res>0){
                   arr = swap(arr,i,j);
               }
            }
        }
    }

    public T[] swap(T[] arr , int i , int j){
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }
}
