import java.util.Stack;
class Stack1 {
    public static void main(String[] args) {
        Stack<String> sc=new Stack<>();
        sc.push("n");
        sc.push("a");
        sc.push("n");
        sc.push("d");
        sc.push("i");
        sc.push("n");
        sc.push("i");
        //System.out.println("name is:"+sc);
        Stack<String> x=new Stack<>();
        while(!sc.isEmpty()){
            x.push(sc.pop());
        }
        while(!x.isEmpty()){
            System.out.println(x.pop());
        }
    }
}
