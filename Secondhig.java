// find the second highest number in the array given by user
class Secondhig
{
    public static void main(String[] A)
    {
        int arr[]=new int[5];
        for(int i=0; i<arr.length; i++)
            arr[i]=new java.util.Scanner(System.in).nextInt();
        for(int i=0; i<arr.length; i++)
            {System.out.print(arr[i]);}
            System.out.println();
            System.out.print(+largestele(arr));
    }
    static int largestele(int arr1[])
    {
        int max=arr1[0];
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]>max)
                max=arr1[i];
        }
        return max;
    }
}
