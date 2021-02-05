public class CounterProblem {

    public static void main(String[] args) {
        int[] arr = {3,4,4,6,1,4,4};
        int n = 5;
        int[] result = solution(n,arr);

    }

    private static int[] solution(int n, int[] arr) {
        int[] resInc =  new int[n];
        int max = 0;
        int latestMaxIndex = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=1 && arr[i]<=n) {
                resInc[arr[i]-1]+=1;
                if(max < resInc[arr[i]-1]) {
                    max = resInc[arr[i]-1];
                    latestMaxIndex = arr[i]-1;
                }
            } else if(arr[i] == n+1) {
                resInc = incrementArr(resInc, latestMaxIndex);
            }
        }
        for (int i :resInc)
            System.out.println(i);
        return resInc;
    }

    private static int[] incrementArr(int[] resInc, int latestMaxIndex) {
        int[] resMaximise = new int[resInc.length];
        for(int i=0; i< resMaximise.length; i++)
            resMaximise[i] = resInc[latestMaxIndex];
        return resMaximise;
    }
}
