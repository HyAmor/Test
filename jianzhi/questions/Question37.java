package jianzhi.questions;

public class Question37 {
    public int GetNumberOfK(int [] array , int k) {
        int l = 0;
        int ln = 0;
        int rn = 0;
        int r = array.length;
        while(l<r){
            int mid = (l+r)/2;
            if(array[mid]<k){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        ln = l;
        l = 0;
        r = array.length;
        while(l<r){
            int mid = (l+r)/2;
            if(array[mid]<=k){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        rn = l;
        return rn-ln;
    }
}
