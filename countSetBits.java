public class countSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // checking LSB i.e least significant Bit
                count++;
            }

            n = n >> 1; // n right shift right shift 1
        }
        return 0;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(10));
    }
}