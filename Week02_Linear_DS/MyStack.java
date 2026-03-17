package cs_study.Week02_Linear_DS;

public class MyStack {
  private int[] stack;
  private int top; // 가장 최근에 추가된 데이터의 위치, 포인터로 사용한다.
  private int capacity;

  public MyStack(int size) {
    this.capacity = size;
    this.stack = new int[capacity];
    this.top = -1;
  }

  public void push(int data) {
    if (top >= capacity - 1) {
      System.out.println("스택 꽉 참");
      throw new StackOverflowError("스택오버플로우");
    }
    top++;
    stack[top] = data;
  }

  public boolean isEmpty() { // top이 -1인지 판단하는 메서드, -1이라면 아무것도 없는것이므로 false로 반환한다.
    if (top == -1) {
      return true;
    }
    return false;
  }

  public int pop() {
    if (isEmpty()) {
      return -1;
    } else {
      int num = stack[top];
      top--;
      return num;
    }
  }

  public int peek() {
    if (isEmpty()) {
      return -1;
    } else {
      int num = stack[top];
      return num;
    }
  }
}