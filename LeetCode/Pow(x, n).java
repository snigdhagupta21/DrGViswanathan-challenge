class Solution {
    public double myPow(double x, int n) {
        double res=1.0;
        long pow=n;
        if(pow<0){ 
            pow= -pow;
        }
        while(pow>0){
            if(pow%2==0){
                x= x*x;
                pow=pow/2;
            }
            else{
                res=res*x;
                pow=pow-1;
            }
        }
        if(n<0){
            res= 1.0/(res);
        }
        return res;
        
    }
}
