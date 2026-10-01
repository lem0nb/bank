import java.util.InputMismatchException;
import java.util.Scanner;
public class bank {
    private static long balance=0;
    private static Scanner scanner = new Scanner(System.in);
    private static long getInput() {
        try {
            System.out.print("请输入:");
            return scanner.nextLong();
        } catch (InputMismatchException e){
            System.out.println("错误：请输入一个整数");
            scanner.nextLine();
            return getInput();
        }
    }
    public static void main(String[] args) {
        System.out.println("欢迎!");
        while (true) {
                System.out.print("""
                        ===请键入数字以选择操作===
                        【1】存款 【2】取款 【3】查询余额 【4】退出
                        """);
                int act = (int) getInput();
                System.out.println("======================");
                switch (act) {
                    case 1->{
                        System.out.println("===存款===");
                        long deposit = getInput();
                        if (deposit>0) {
                        balance += deposit;
                        System.out.println("存款成功!");
                        } else System.out.println("存款金额必须大于0！");
                        System.out.println("=========");
                    }
                    case 2->{
                        System.out.println("===取款===");
                        long withdraw = getInput();
                        if (balance<withdraw && withdraw>0) {
                            System.out.println("错误：余额不足！");
                            System.out.println("=========");
                            break;
                        } else if (withdraw<=0) {
                            System.out.println("错误：取款余额不能小于等于0！");
                            System.out.println("=========");
                            break;
                        }
                        balance -= withdraw;
                        System.out.println("取款成功!");
                        System.out.println("=========");
                    }
                    case 3->{
                        System.out.println("当前余额:"+balance);
                    }
                    case 4->{
                        System.out.println("谢谢使用！");
                        return;
                    }
                    default -> {
                        System.out.println("错误：键入的操作错误");
                    }
                }

        }
    }
}