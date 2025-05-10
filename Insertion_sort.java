public class Insertion_sort {
    public static void main(String[] args) {
        int nums[] = { 4, 1, 5, 2, 3 };

        System.out.println("Before Selection Sorting: ");
        for (int num : nums) {
            System.out.print(num+"  ");
        }

    //    i=1 index;
    // key=i;
    
        for(int i=1; i<nums.length; i++){
            int key=nums[i];
            int j=i-1;

            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]= key;
        }

        System.out.println();
        System.out.println("After Selection Sorting: ");
        for(int num: nums){
        System.out.print(num+"  ");
        }
    }
}
