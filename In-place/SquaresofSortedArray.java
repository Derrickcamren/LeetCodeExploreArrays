/* Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

 */
public class SquaresofSortedArray {
    //这题必须使用额外的空间维度，不然很难做，反正我没做出来不需要额外空间难度的
    public int[] sortedSquares(int[]A){
        int n=A.length;
        int[] result=new int[n];
        int i=0,j=n-1;
        for(int p=n-1;p>=0;p--){
            if(Math.abs(A[i])>Math.abs(A[j])){
                result[p]=A[i]*A[i];
                i++;
            }
            else{
                result[p]=A[j]*A[j];
                j++;
            }
        }
        return result;
    }
    
}