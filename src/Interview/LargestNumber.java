package Interview;

class Large {
    public static void main(String arg[])
    {
        int a[]={10,1,4,5,3,2,6};
        int lagest=a[0];
        int small=a[0];
        int j=0;
        for(int i:a)
        {

            if (lagest<i)
            {
                lagest=i;
            }
            if (small>i)
            {
                small=i;
            }
        }
        System.out.println("lagest element "+lagest);
        System.out.println("small element "+small);
    }
}
