import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("use following operation : \n to create array : create \n to print array : prnt \n to short accending : acc \n to short decending : dec \n to check index in the array : indx \n to close program : x \n to restart program : reset \n");
        String operation;
        int[] arr=null;
        do{
            System.out.println("enter operation");
            Scanner sc = new Scanner(System.in);
            operation=sc.nextLine();
            switch (operation){
                case "create":
                    arr=createarry();
                    break;
                case "prnt":
                    printarry(arr);
                    break;
                case "acc":
                    short_arr_accending(arr);
                    break;
                case "dec":
                    short_arr_decending(arr);
                    break;
                case "index":
                    binsearch(arr);
                    break;
                default:
                    System.out.println("some unexpected errror occured please retry");
                    break;
            }


        }while(!operation.equals("x"));
    }
    public static int[] createarry(){
        System.out.println("enter the size of array you want to create" );
        Scanner sc =new Scanner(System.in);
        int arrysize =sc.nextInt();
        int[] arr = new int[arrysize];
        for (int z=0;z<arrysize;z++){
            System.out.println("enter element "+(z+1)+"\n");
            arr[z]= sc.nextInt();
        }
        System.out.println("sucessfully created the array");
        return arr;
    }
    public static void printarry(int[] arr){
        System.out.println("the array is :");
        for(int i:arr) {
            System.out.println(i);
        }
    }
    public static void short_arr_accending(int[] arr){
        for (int z=0;z<arr.length;z++) {
            for (int y=z+1;y<(arr.length);y++){
                if(arr[z]>arr[y]){
                   int temp=arr[z];
                   arr[z]=arr[y];
                   arr[y]=temp;
                }
            }
        }
        System.out.println("after shorting");
        printarry(arr);
    }
    public static void short_arr_decending(int[] arr){
        for (int z=0;z<arr.length;z++) {
            for (int y=z+1;y<(arr.length);y++){
                if(arr[z]<arr[y]){
                    int temp=arr[z];
                    arr[z]=arr[y];
                    arr[y]=temp;
                }
            }
        }
        System.out.println("after shorting");
        printarry(arr);
    }
    public static int binsearch(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no you want to search for ");
        int target = sc.nextInt();
        short_arr_accending(arr);
        int start=0;
        int end=arr.length;
        do{
            int mid = (start + (end-start)/2);
            if(arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else if (arr[mid]==target) {
                System.out.println("the searched element is at index " + (mid+1));
                return (mid+1);
            }
        }while(start<=end);
        System.out.println("the no doesnt exists in array \n to find floor enter 0 \n to find celling enter 1 \n else any no to skip ");
        int nexit = sc.nextInt();
        switch (nexit){
            case 0:
                System.out.println("floor is "+arr[end]);
                return arr[end];
            case 1:
                System.out.println("celling is "+arr[start]);
                return arr[start];
            default:
                return -1;
        }
    }
}