import java.util.InputMismatchException;
import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        System.out.print("""
                ===欢迎,请键入数字以选择操作===
                【1】存款 【2】取款 【3】查询余额 【4】退出
                操作:""");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 1->{

                    }
                    case 2->{

                    }
                    case 3->{

                    }
                    case 4->{
                        return;
                    }
                    default -> {
                        System.out.println("键入的操作错误");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("键入的操作错误");
            }
        }
    }
}