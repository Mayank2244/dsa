
package Arrays;

import java.util.Scanner;

class productexceptself {
    public int[] proexcself(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pre = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = pre;
            pre *= nums[i];
        }
        int suff = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suff;
            suff = suff * nums[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter array element");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        productexceptself ps = new productexceptself();
        int[] res = ps.proexcself(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);

        }
        sc.close();
    }
}
