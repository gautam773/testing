import java.util.Arrays;

public class MedianOfArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
double median = findMedianSortedArrays(num1,num2);
        System.out.println(median);
    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int nums1Length = nums1.length;
            int nums2Length = nums2.length;
            int newArrLength = nums1Length+nums2Length;
            double median = 0.0;
            int[] newArr = new int[newArrLength];
            if(nums1Length>0)
                System.arraycopy(nums1,0,newArr,0,nums1Length);
            if(nums2Length>0)
                System.arraycopy(nums2,0,newArr,nums1Length, nums2Length);
            Arrays.sort(newArr);
            if(newArrLength>1)
            {
                if(newArrLength %2 !=0)
                {
                    median = newArr[(newArrLength/2)];
                }
                else
                {
                    int newMedian = newArrLength/2;
                    int startPos = newMedian-1;
                    int destPos = newMedian;
                    double firstValue = newArr[startPos];
                    double lastValue = newArr[destPos];
                    median = (firstValue +  lastValue) /2;
                }
            }
            else if(newArrLength ==1)
            {
                median = newArr[0];
            }

            return median;

        }
    }


