package sortalgo;

public class BubbleSort implements SortExample{
    @Override
    public int[] sort(int[] data) {
        int num;
        for (int i=data.length-1;i>=0;i--){
            for (int j=0;j<data.length-1;j++){
                num=j+1;
                if (data[j]>data[num]){
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
        return data;
    }


}
