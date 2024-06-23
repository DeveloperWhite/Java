package 数组.homework;
/*编写程序，使用一维数组模拟栈数据结构*/
public class stack {
//  要求：
//  这个栈可以存储任何引用类型的数据
//  在栈中提供push方法模拟压栈（栈满了要有提示信息）
//  在栈中提供pop方法模拟弹栈（栈空了也要有提示信息）
// object数组可以存储各种类型，用来存放数据，视作一个容器，属性私有化提供get，set方法

private Object [] elements;
private int index;
//假设默认初始化容量是100
 public stack() {
  this.elements=new Object[100];
  this.index=-1;
 }

 public Object[] getElements() {
  return elements;
 }

 public void setElements(Object[] elements) {
  this.elements = elements;
 }
// 压栈方法
 public void push(Object object){
  if(index>=elements.length-1){
   System.out.println("栈已满，压栈失败");
   return;
  }
//  指针先往上
  index++;
//  赋值
  elements[index]=object;
//  或者
//  elements[++index]=object;
  System.out.println("压栈成功，指针指向"+index);
 }
 // 弹栈方法
 public void pop(){
  if(index<0){
   System.out.println("栈已空，弹栈失败");
   return;
  }
//  取消值
  System.out.println("弹出"+elements[index]);
//  指针往下
  index--;
  System.out.println("弹栈成功，指针指向"+index);
 }

 public static void main(String[] args) {
  stack a=new stack();
  a.push(new Object());
  a.push(new Object());
  a.push(new Object());
  a.push(new Object());
  a.push(new Object());
  a.pop();
 }
}
