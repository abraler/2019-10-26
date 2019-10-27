public class Exercise1 {
    public static void shiftDowm(int []a,int size,int index){
        int left=2*index+1;
        while(left<size){
            int min=left;
            int right=2*index+2;
            if(right<size){
                if(a[left]>a[right]){
                    min=right;
                }
            }
            if(a[index]<=a[min]){
                break;
            }
            int t=a[index];
            a[index]=a[min];
            a[min]=t;
            index=min;
            left=2*index+1;
        }
    }
    public static void createHeap(int []a,int size){
        for (int i =(size-1)/2; i >=0 ; i--) {
            shiftDowm(a,size,i);
        }
    }

    public static void main(String[] args) {
        int []a={1,5,3,8,7,6};
        createHeap(a,a.length);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

}
