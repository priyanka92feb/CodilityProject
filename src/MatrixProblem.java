public class MatrixProblem {

    public static void main(String[] args) {
        int[] arr = {6,5,5,6,2,2};
        int[] arr1 = {3,3,3,5,4};
        int[] arr2 = {1,2,5};

        MatrixProblem matrixProblem = new MatrixProblem();
        System.out.println(matrixProblem.solution(arr2));
    }

    public int solution(int[] arr) {
        int i = 0;
        int maxNumElements = 0;
        while(i<arr.length) {
            int c = i;
            int currSize = 0;
            int numElements = 1;
            while(arr[c]>1 && c+1<arr.length && arr[c+1]>1) {
                if(currSize == numElements && currSize <= arr[c+1]) {
                    break;
                }
                if(arr[c] <= arr[c+1] && currSize <= arr[c]) {
                    numElements++;
                    currSize = arr[c];
                    c++;
                } else if(currSize <= arr[c+1]) {
                    numElements++;
                    currSize = arr[c+1];
                    c++;
                } else {
                    break;
                }//maxNumElements >= arr[c+1]
            }
            int minSize = Math.min(numElements, currSize);
            if (minSize > maxNumElements)
                maxNumElements = minSize;
            i = c+1;
        }
        return maxNumElements;
    }
}
