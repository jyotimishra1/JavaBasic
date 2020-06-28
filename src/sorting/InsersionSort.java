package sorting;

public class InsersionSort {
    public static void main(String[] args) {
        int[] a={4,3,6,2,3,12,8,5,7};
        InsersionSort is=new InsersionSort();
        int[] sorted=is.Insersion(a);
        System.out.println("Insersion short");
        for (int i:sorted){
            System.out.println(i);
        }
    }
    int[] Insersion(int []a){
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int insert=a[i];
            int index=i;
            for(int j=i-1;j>=0;j--)
            {
                if(insert<a[j])
                {
                    a[j+1]=a[j];
                    index=j;

                }
            }
            a[index]=insert;
        }
        return a;
    }

}
