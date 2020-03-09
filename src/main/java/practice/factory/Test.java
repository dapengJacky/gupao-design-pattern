package practice.factory;


import java.util.Scanner;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字A");
        String numberA =scanner.nextLine();
        System.out.println("输入运算符");
        String operationType =scanner.nextLine();
        System.out.println("输入数字B");
        String numberB =scanner.nextLine();
        Operation operation = OperationFactory.getOperation(AddOperation.class);
        operation.numberA=numberA;
        operation.numberB=numberB;
        System.out.println("运算结果为"+operation.operationResult());

    }
}
