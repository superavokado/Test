public class TEST1 {

    public static void main(String[] args) throws Exception {
        int[] a = {2,1,4,2,3};
        int[] result = removeDuplicates(a);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicates(int[] a) throws Exception {
        int[] resultMas = new int[a.length];
        int index = 0;

        for (int i : a) {
            if (i < 0) {
                throw new Exception("Exception! Element " + i + " < 0!");
            } else {
                if (dontContains(resultMas, i)) {
                    resultMas[index] = i;
                    index++;
                }
            }
        }
        return resultMas;
    }

    public static boolean dontContains (int[] mas, int num) {
        for (int i : mas) {
            if (i == num) {
                return false;
            }
        }
        return true;
    }
}
