public class count_2 {
    public static void main(String[] args) {
        int a = 0, x = 0, max = 0, prime = 0;
        System.out.println("1~100之間的質數為:");
        for (a = 2; a < 101; a++) {
            prime = 1;
            for (x = 2; x <= Math.sqrt(a); x++) {
                if (a % x == 0) {
                    prime = 0;
                }
            }
            if (prime == 1) {
                System.out.println(a);
                max = a;
            }
        }
        System.out.println(" ");
        System.out.println("最大質數:"+max);
    }
}

