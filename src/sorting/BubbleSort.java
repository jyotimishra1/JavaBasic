package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []a={19,36,13,24,6};
        BubbleSort b=new BubbleSort();
        int sorted[]=b.bubble(a);
        for (int i:sorted) {
            System.out.println(i);

        }

    }
    int[] bubble(int []a){
        int []b=new int[a.length];
        for (int i=0;i<a.length-1;i++)
        {
            for (int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
