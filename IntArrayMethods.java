public class IntArrayMethods {
    public static int arraySum(int[] a){
        int result = 0;
        for(int i = 0;i<a.length;i++){
            result+=a[i];
        }
        return result;
    }
    public static double arrayMean(int[] a){
        int result = 0;
        for(int i = 0;i<a.length;i++){
            result+=a[i];
        }
        return result/a.length;
    }
    public static int arrayMin(int[] a){
        int minimum = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]<minimum){
                minimum = a[i];
            }
        }
        return minimum;
    }
    public static int arrayMax(int[] a){
        int maximum = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>maximum){
                maximum = a[i];
            }
        }
        return maximum;
    }
    public static boolean[] arrayLocalMin(int[] a){
        boolean[] myList = new boolean[a.length-2];
        for(int i =1;i<a.length-1;i++){
            if(a[i]<a[i-1]&&a[i]<a[i+1]){
                myList[i]=true;
            }else{
                myList[i]=false;
            }
        }
        return myList;
    }
    public static boolean[] arrayLocalMax(int[] a){
        boolean[] myList = new boolean[a.length-2];
        for(int i =1;i<a.length-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                myList[i]=true;
            }else{
                myList[i]=false;
            }
        }
        return myList;
    }
    public static int arrayMode(int[] a ){
        int count = 0;
        int bestCount=0;
        int mode = a[0];
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
                if(count>bestCount){
                    bestCount = count;
                    mode = a[i];
                }
            }
        }
        return mode;
    }
    public static int arrayCount(int[]a,int b){
        int count = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]==b){
                count++;
            }
        }
        return count;
    }
    public static boolean arrayContainsDuplicates(int[] a){
        boolean result = false;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    result = true;
                }
            }
        }
        return result;
    }
    public static boolean arrayAllEqual(int[] a){
        boolean result = false;
        for(int i =0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
    public static double[] arrayRollingAverage(int[] a, int b){
        double total = 0;
        double[] average = new double[a.length];
        for(int i =0;i<a.length;i++){
            total += a[i];
            average[i] = total/(i+1);
        }
        return average;
    }
}
