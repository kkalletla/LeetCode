package solutions;

public class _598_RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {

        int minM = m;
        int minN = n;
        for (int i = 0; i < ops.length; i ++) {
            minM = Math.min((ops[i][0]), minM);
            minN = Math.min((ops[i][1]), minN);
        }

        return minM * minN;
    }
}
