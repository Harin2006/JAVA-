import java.util.ArrayList;
public class sub_array_in_array{
    static void subarray(ArrayList<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.print("all are non empty subarrays\n");
        subarray(arr);
    }
}
