package JAVA.TOH;

public class thaphanoi {
    public static void solveHanoi(int n, char x, char y, char z) {//cho x: cọc bắt đầu, y:cọc đích, z: cọc trung gian
        if (n == 1) {
            System.out.println("Lay dia thu 1 tu coc " + x + " sang coc " + y);
            return;
        }
        solveHanoi(n - 1, x, z, y);
        System.out.println("Lay dia thu " + n + " tu coc " + x + " sang coc " + y);
        solveHanoi(n - 1, z, y, x);
    }
    public static void main(String[] args) {
        int n = 3; 
        solveHanoi(n, 'A', 'C', 'B'); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        char x,y,z;
        solveHanoi(n,x,y,z);
    }
}
