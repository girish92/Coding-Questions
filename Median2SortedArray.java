

/*

LeetCode

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5


*/

class Median2SortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        // ensure len(nums1) <= len(nums2)
        if(len1 > len2){
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }
        len1 = nums1.length;
        len2 = nums2.length;
        
        int low = 0;
        int high = len1;
        int mid = (len1 + len2 + 1) / 2;
        
        while(low <= high){
            int mid1 = (low + high) / 2;
            int split = mid - mid1;
            
            // low is too small
            if(mid1 < high && nums2[split - 1] > nums1[mid1]){
                low++; 
            }// high is too large
            else if(mid1 > low && nums1[mid1 - 1] > nums2[split]){
                high--;
            }// just nice
            else{
                int maxLeft = 0;
                if(mid1 == 0){
                    maxLeft = nums2[split - 1];
                }else if(split == 0){
                    maxLeft = nums1[mid1 - 1];
                }else{
                    maxLeft = Math.max(nums1[mid1 - 1], nums2[split - 1]);
                }
                if((len1 + len2) % 2 != 0){
                    return maxLeft;
                }
                
                int minRight = 0;
                if(mid1 == len1){
                    minRight = nums2[split];
                }else if(split == len2){
                    minRight = nums1[mid1];
                }else{
                    minRight = Math.min(nums2[split], nums1[mid1]);
                }
                
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}