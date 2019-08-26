package leetcode;

import java.util.Stack;

/**
 * @ClassName EvalRPN
 * @Description
 * 计算逆波兰式（后缀表达式）的值
 * 运算符仅包含“ +”，“ - ”，“*”和“/”，被操作数可能是整数或其他表达式
 * 例如：
 *    [“2”，“1”，“+”，“3”，“*”]  - >（（2 + 1）* 3） - >9↵[“4”，“13”，“5”，“ /“，”+“]  - >（4 +（13/5）） - > 6
 * 在反向波兰表示法中计算算术表达式的值  。
 * 有效的运算符是+， - ，*，/。每个操作数可以是整数或另一个表达式。
 *
 * 一些例子：
 *
 *   [“2”，“1”，“+”，“3”，“*”]  - >（（2 + 1）* 3） - >9↵[“4”，“13”，“5”，“ /“，”+“]  - >（4 +（13/5）） - > 6
 * @Author Wlison
 * @Date 2019/8/26 20:36
 * @Version 1.0
 **/
public class EvalRPN {

    //test
    public static void main(String[] args) {
        String[] str = {"4", "13", "5", "/", "+"};
        System.out.println(new EvalRPN().evalRPN(str));
    }

    public  int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String opt = "+-*/";
        for (int i = 0; i < tokens.length; i++) {
            if(!opt.contains(tokens[i])){
                stack.push(Integer.valueOf(tokens[i]));
            }else{
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int operate = getOperate(a, b, opt.indexOf(tokens[i]));
                stack.push(operate);
            }
        }
        return stack.pop();
    }
    public  int getOperate(int a,int b,int opt){
        switch (opt){
            case 0:return a+b;
            case 1:return a-b;
            case 2:return a*b;
            case 3:return a/b;
            default:return 0;
        }
    }
}
