 class linearSearch
{
    public static void main(String[] args) {

        int arr []= {10,20,30,40,65,45,66,85};
        int number =60;

        Boolean flag= false;
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]==number)
            {
                flag=true;
                System.out.println("Number found at index :"+i);
            }
        }
        if(flag==false)
        {
            System.out.println("Number Not found.....");
        }
    }
}
