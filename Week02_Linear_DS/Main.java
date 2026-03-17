package cs_study.Week02_Linear_DS;

public class Main {
  public static void main(String[] args) {
    MyStack stack = new MyStack(20);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.isEmpty());
  }
}
