class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                area=Math.max(area,height[left] * (right-left));
                left+=1;
            }
            else
            {
                area=Math.max(area,height[right] * (right-left));
                right-=1;
            }
        }
        return area;
    }
}
