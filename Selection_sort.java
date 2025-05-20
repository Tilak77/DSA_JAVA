public class Selection_sort {
    public static void main(String[] args) {
        int nums[] = { 4, 1, 5, 2, 3 };
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Selection Sorting: ");
        for (int num : nums) {
            System.out.print(num+"  ");
        }

        for (int i = 0; i < size-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println();
            for (int num : nums) {
            System.out.print(num+"  ");

            //Git Hello
        
        }
    }
        System.out.println();
        System.out.println("After Selection Sorting: ");
        for(int num: nums){
        System.out.print(num+"  ");
        }
    }
}
