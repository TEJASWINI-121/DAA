class Solution {
public:
    void swap(int &r1,int &r2){
        int t = r1;
        r1 = r2;
        r2 = t;
    }
    void moveZeroes(vector<int>& nums) {
        int zc = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
                swap(nums[i],nums[zc++]);
            }
        }
    }
};