import java.util.Scanner;

public class celling {
    public static void main(String[] args){
        System.out.println("enter the size of array you want to create" );
        Scanner sc =new Scanner(System.in);
        int arrysize =sc.nextInt();
        int[] arr = new int[arrysize];
        for (int z=0;z<arrysize;z++) {
            System.out.println("enter element " + (z + 1) + "\n");
            arr[z] = sc.nextInt();
        }
        System.out.println("the array is :");
        for(int i:arr) {
            System.out.println(i);
        }
        int q=0;
        System.out.println("enter the no you want to search for ");
        int target = sc.nextInt();
        for (int z=0;z<arr.length;z++) {
            for (int y=z+1;y<(arr.length);y++){
                if(arr[z]>arr[y]){
                    int temp=arr[z];
                    arr[z]=arr[y];
                    arr[y]=temp;
                }
            }
        }
        int start=0;
        int end=arr.length;
        if(start<=end){
            do {
                int mid = (start + (end-start)/2);
                if(start<end){
                    if(arr[mid]>target){
                        end=mid-1;
                    }
                }
                else{
                    System.out.println("the closest is "+arr[mid]);
                    break;
                }
                if(start<end){
                    if (arr[mid]<target) {
                        start=mid+1;
                    }
                }
                else{
                    System.out.println("the closest is "+arr[mid]);
                    break;
                }
                if(start<end){
                    if (arr[mid]==target) {
                        System.out.println("the searched element is at index " + mid + 1);
                        break;
                    }
                }
                else{
                    System.out.println("the closest is "+arr[mid]);
                    break;
                }
                }while(q!=-1);
        }


    }
}
