package algorithm.leetcode.array;

public class Test1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int num = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(queryTime >= startTime[i] && queryTime <= endTime[i] ){
                num++;
            }
        }
        return num;
    }
}
