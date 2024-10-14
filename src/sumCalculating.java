public class sumCalculating {
    public double sum1(int n) {
        double result=0;
        for (int i = 0; i < n; i++){
            result = result + (1/Math.pow(i+1,3));
        }
        return result;
    }

    public double sum2(int n) {
        double result=0;
        int counter = 0;
        for (int i = 0; counter < n; i++){
           if ((i+1)%2==0){
               counter++;
               result = result + (1/Math.pow(i+1,2));
           }
        }
        return result;
    }
}
