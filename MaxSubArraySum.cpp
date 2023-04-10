#include<iostream>
#include <vector>
#include <algorithm>

using namespace std;

int maxSubArray(vector<int>& nums) {
    int max_sum = nums[0];
    int curr_sum = nums[0];
    for (int i = 1; i < nums.size(); i++) {
        curr_sum = max(nums[i], curr_sum + nums[i]);
        max_sum = max(max_sum, curr_sum);
    }
    return max_sum;
}

int main() {
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int max_sum = maxSubArray(nums);
    cout << "Maximum contiguous sum is: " << max_sum << endl;
    return 0;
}
