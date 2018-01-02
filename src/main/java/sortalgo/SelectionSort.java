package sortalgo;

public class SelectionSort implements SortExample{
    @Override
    public int[] sort(int[] data) {

        for (int i=0;i<data.length;i++){
            int index=i;
            for (int j=i+1;j<data.length;j++){
                if (data[j]<data[index]){
                    index=j;
                    int min =data[index];
                    data[index]=data[i];
                    data[i]=min;
                }
            }
        }
        return data;
    }
}
