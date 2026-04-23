import java.util.Stack;
class balancedpara_stack {

    public static void main(String[] args) {
        char[] arr = {'[', '{', '(', '}', ']'};
        Stack<Character> sc=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='['||arr[i]=='{'||arr[i]=='('){
                sc.push(arr[i]);
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==')'||arr[j]=='}'||arr[j]==']'){
                if(sc.peek()=='('){
                    sc.pop();
                }
                else if(sc.peek()=='{'){
                    sc.pop();
                }
                else if(sc.peek()=='['){
                    sc.pop();
                }

            }
        }
        if(sc.isEmpty()){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }

}
