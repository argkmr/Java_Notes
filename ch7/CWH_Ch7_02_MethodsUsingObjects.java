public class CWH_Ch7_02_MethodsUsingObjects {

    int logic(int [] arr){  // In case of arrays reference is passed in the methods not the copy
        int max = arr[0], n = arr.length;
        for (int i=0; i<n; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] array = {3,2,5,4,1,7,8,6};

        // Making object of class CWH_Ch7_MethodsUsingObjects
        CWH_Ch7_MethodsUsingObjects obj = new CWH_Ch7_MethodsUsingObjects();

        int max = obj.logic(array); // Accessing the method using the object made earlier
        System.out.println(max);

    }
}
