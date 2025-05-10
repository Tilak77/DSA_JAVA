public class Linear_and_Binary_search{
    public static void main(String[] args) {

        int nums[] ={2, 4, 5, 6, 8, 10, 12};
        int target= 8;

        // int nums[]= new int[1000];
        // int target=500;
        
        int result1= linearSearch(nums, target);

        int result2= binarySearch(nums, target);

         

        if (result1 != -1){
            System.out.println("Element Found at Index: "+ result1);
        }
        else{
            System.out.println("Element Not Found!!");
        }
        // System.out.println(nums.length);

        if (result2 != -1){
            System.out.println("Element Found at Index: "+ result2);
        }
        else{
            System.out.println("Element Not Found!!");
        }
    }

    public static int linearSearch(int[] nums, int target){
        
        int steps = 0;

        for(int i=0; i<nums.length; i++){
            steps++;
            if (nums[i] == target){
                System.out.println("Steps taken by Linear Search: "+ steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear Search: "+ steps);
        return -1;
    }        


    public static int binarySearch(int[] nums, int target){
        // [2,4,5,6,8,10,12]
        // target= 8

        int start = 0;
        int end = nums.length -1 ;
        int steps = 0;


        while(start<=end){
            int mid = (start + end)/2;
            steps++;
            if(nums[mid] == target){
                System.out.println("Steps taken by Binary Search: "+ steps);
                return mid;
            } 

            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        System.out.println("Steps taken by Binary Search: "+ steps);
        return -1;
    }   
}
