class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(n == 0) return new int[]{1};
        if(digits[n - 1] < 9){
            digits[n - 1]++;
            return digits;
        }else{
            int[] newArr = new int[n-1];
            System.arraycopy(digits,0,newArr,0,n-1);
            int[] res = plusOne(newArr);
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = 0;
            return res;
        }
    }
}