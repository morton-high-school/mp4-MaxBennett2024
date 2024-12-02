public class IntArrayMethods {
    public static int arraySum(int[] a){
        int result = 0;
        for(int i = 0;i<a.length;i++){
            result+=a[i];
        }
        return result;
    }
    public static double arrayMean(int[] a){
        double result = 0;
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
        boolean[] myList = new boolean[a.length];
        myList[0] = false;
        for(int i =1;i<a.length-1;i++){
            if((a[i]<a[i-1])&&(a[i]<a[i+1])){
                myList[i]=true;
            }else{
                myList[i]=false;
            }
        }
        myList[a.length-1] = false;
        return myList;
    }
    public static boolean[] arrayLocalMax(int[] a){
        boolean[] myList = new boolean[a.length];
        myList[0] = false;
        for(int i =1;i<a.length-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                myList[i]=true;
            }else{
                myList[i]=false;
            }
        }
        myList[a.length-1] = false;
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
            for(int j=0;j<a.length-1;j++){
                if(a[i]==a[j+1]){
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
        double[] average = new double[a.length];
        for(int i = 0;i<b;i++){
            average[i] = a[i];
        }
        for(int i =b;i<a.length;i++){
            
        }
        return average;
    }
    public static int[] arrayShift(int[] a, int b){
        for(int i =0;i<a.length;i++){
           if(i+b<a.length){
            a[i+b]=a[i];
        }else{
            a[a.length-i-1]=a[i];
        }
        }
        return a;
    }
    public static int[] arrayReverse(int[] a){
        int[] result = new int[a.length];
        int count = 0;
        for(int i =a.length-1;i>=0;i--){
            result[count] = a[i];
        }
        return result;
    }
}
