class Solution {
    public int countEven(int num) {
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            int digitSum = 0;
            int n = i;

            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }

            if (digitSum % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}
