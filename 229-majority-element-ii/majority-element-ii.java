class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            majorityElement(new int[1]);
        }
    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> elements = new ArrayList<Integer>();
        int count1 = 0;
        int element1 = Integer.MIN_VALUE;

        int count2 = 0;
        int element2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (element1 == num) {
                count1++;
            } else if (element2 == num) {
                count2++;
            } else if (count1 == 0) {
                count1 = 1;
                element1 = num;
            } else if (count2 == 0) {
                count2 = 1;
                element2 = num;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (element1 == num) {
                count1++;
            }

            if (element2 == num) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            elements.add(element1);
        }

        if (count2 > n / 3) {
            elements.add(element2);
        }

        return elements;
    }
}