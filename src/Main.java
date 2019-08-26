import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Wlison
 * @Date 2019/8/26 20:43
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int res = 1;
            while(y!=0){
                if(y%2==1){
                    res=(res*x)%k;
                }
                y/=2;
                x=(x*x)%k;
                System.out.println(res);
            }
            System.out.println(res);
        }
    }
}
