import java.util.ArrayList;

public class firstNegativeInteger {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0;
        int j=0;
        
        ArrayList <Long> neg = new ArrayList<> ();
        long result[] = new long[N-K+1];
        int resIndex=0;
        
        while(j<N){
            if(A[j] < 0){
                neg.add(A[j]);
            }
            
            if(j-i+1 < K){
                j++;
            }
            else if (j-i+1 == K){
                if(neg.size() == 0){
                    result[resIndex++] = 0;
                }
                else{
                    result[resIndex++] = neg.get(0);
                }
                
                if(neg.contains(A[i])){
                    neg.remove(neg.indexOf(A[i]));
                }
                
                i++;
                j++;
            }
        }
        
        return result;
        
        
}
}
