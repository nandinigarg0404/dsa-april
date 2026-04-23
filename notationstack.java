import java.util.Stack;

class notationstack {
    public static void main(String[] args) {
        Stack<Character> sc=new Stack<>();
        String s="a*(b+c-d)";
        String x="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='^'){
                while(sc.peek()!='('){
                    x=x+sc.pop();
                    sc.push(s.charAt(i));
                }
            }
            else if(s.charAt(i)=='*'){
                while(!sc.isEmpty()&&sc.peek()!='('){
                    if(sc.peek()=='/'){
                    sc.pop();
                    sc.push(s.charAt(i));
                }
                else if(sc.peek()=='+'||sc.peek()=='-'){
                    char p=sc.pop();
                    sc.push(s.charAt(i));
                    sc.push(p);
                    x=x+p;
                }   
                }
            }
            else if(s.charAt(i)=='/'){
                while(!sc.isEmpty()&&sc.peek()!='('){
                    if(sc.peek()=='*'){
                    x=x+sc.pop();
                    sc.push(s.charAt(i));
                }
                else if(sc.peek()=='+'||sc.peek()=='-'){
                    char p=sc.pop();
                    sc.push(s.charAt(i));
                    sc.push(p);
                    x=x+p;
                }   
                }
            }
            else if(s.charAt(i)=='+'){
                while(!sc.isEmpty()&&sc.peek()!='('){
                    if(sc.peek()=='-'){
                        x=x+sc.pop();
                        sc.push(s.charAt(i));
                        sc.push('-');
                    }
                    else{
                        sc.push(s.charAt(i));
                    }
                }
            }
            else if(s.charAt(i)=='-'){
                while(!sc.isEmpty()&&sc.peek()!='('){
                    if(sc.peek()=='+'){
                        x=x+sc.pop();
                        sc.push(s.charAt(i));
                        sc.push('+');
                    }
                    else{
                        sc.push(s.charAt(i));
                    }
                }
            }
            else{
                while(!sc.isEmpty()&&sc.peek()!='('){
                    x=x+s.charAt(i);
                }
            }
        }
        System.out.print(sc+" ");
        System.out.println(x);
    }
}
