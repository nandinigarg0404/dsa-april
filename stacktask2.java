import java.util.Stack;
class stacktask2{
    public static void main(String[] args) {
        Stack<Character> sc=new Stack<>();
        String str="((())))";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                sc.push(str.charAt(i));
            }
        }
        int count=0;
        Stack<Character> ch=new Stack<>();
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)==')'&&!sc.isEmpty()){
                sc.pop();
                count++;

            }
        }
        System.out.println("the depth of paranthesis is:"+count);

    }

}