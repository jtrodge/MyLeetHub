class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        std::vector<int> combine(nums1.size() + nums2.size());
        merge(nums1.begin(), nums1.end(), nums2.begin(), nums2.end(), combine.begin());
        sort(combine.begin(), combine.end());
        int size = combine.size();
        double ans = 0;
        if ((combine.size() % 2) != 0) {
           ans = (double)combine[size / 2];
        }
        else if ((combine.size() % 2) == 0) { 
            ans = (((double)combine[size / 2 - 1] + (double)combine[size / 2]) / 2); 
        }
        return ans;
    }
};