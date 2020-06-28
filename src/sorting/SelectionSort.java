package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={14,10,4,36,1,2,3};
        SelectionSort s=new SelectionSort();
        int sorted[]=s.Selection(a);
        System.out.println("Selection sort");
        for (int i:sorted)
        {
            System.out.println(i);
        }

    }
    int [] Selection(int [] a){
        int n=a.length;
        for (int i=0;i<n;i++)
        { int shortest=a[i];
          int index=i;
            for (int j=i;j<n;j++)
            {
                if(shortest>a[j])
                {
                    shortest=a[j];
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        return  a;
    }
}
