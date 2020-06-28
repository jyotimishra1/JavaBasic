package sorting;

public class Smallest {
    public static void main(String[] args) {
        int a[]={10,3,5,1,34,2};
        int shortest=a[0];
        for (int i=0;i<a.length-1;i++)
        {
            if(shortest>a[i])
                shortest=a[i];
        }
        System.out.println("shortest Element "+shortest);
    }
}
