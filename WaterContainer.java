public class WaterContainer {

    public static void main(String args[]){
        int height[]={1,8,6,2,5,4,8,3,7};
        int area=0,min, maxArea=0;
        int len = height.length;
        int i=0,j=len-1;
        while(i<j){
          min = Math.min(height[i],height[j]);
          area = min*(j-i);
          if(area>maxArea){
            maxArea = area;
          }
          if(height[i]<height[j])
          i++;
          else if(height[i]==height[j]){
              if(height[i+1]>=height[j-1]){
                i++;
              }
              else j--;
          }
          else
          j--;
        }

        System.out.print(maxArea);
    }
    
}
