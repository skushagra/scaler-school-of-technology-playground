public class baseconversion {
    public static String base1_to_base2(int to, int num){
        String res = "";
        while(num > 0) {
            res = (num%to) + res;
            num /= to;
        }
        return res;
    }
    public static void main(String[] args) {
        int base_to = 2;
        int num = 41;
        System.out.println(base1_to_base2(base_to, num));
    }
}
