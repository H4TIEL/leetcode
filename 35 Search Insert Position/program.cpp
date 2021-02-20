#include <iostream>
#include <chrono>
#include <vector>

using namespace std::chrono;

class Solution {
public:
    static int searchInsert(std::vector<int> &nums, int target) {

        if(target ==0 )
            return 0;

        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            auto midpoint = (start + end ) / 2;

            if(target == nums[midpoint]){
                return midpoint;
            } else {
                if (target < nums[midpoint]){
                    end = midpoint - 1;
                } else {
                    start = midpoint + 1;
                }
            }
        }

        return start;
    }
};

int main() {
    auto start = high_resolution_clock::now();

    std::vector<int> num_vector = {1,3,4,6,8};

    int output = Solution::searchInsert(num_vector, 7);

    std::cout << "Output: " << output << std::endl;

    auto stop = high_resolution_clock::now();
    auto microDuration = duration_cast<microseconds>(stop - start);
    auto milliDuration = duration_cast<milliseconds>(stop - start);

    std::cout << "Time: " << microDuration.count() << "μs" << std::endl;
    std::cout << "Time: " << milliDuration.count() << "ms" << std::endl;
    return 0;
}