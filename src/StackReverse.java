
import java.util.Stack;

public class StackReverse {
    static class stack{
        public void reverse(Stack<Integer> sr){

            int t=sr.pop();
            if(sr.isEmpty()){
                System.out.println(t);
                return;
            }
            reverse(sr);
            System.out.println(t);

        }
        public void pushBottom(Stack<Integer> s,int value){
            int t=s.peek();

            s.pop();
            if(s.isEmpty()){
                s.push(value);
                s.push(t);
                return ;
            }
            pushBottom(s,value);

            s.push(t);

        }
    }
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        stack st=new stack();
        st.pushBottom(s,5);
        st.reverse(s);
//        while(!s.isEmpty()){
//          System.out.println(s.peek());
//            s.pop();
//      }
//        System.out.println(s);

//        System.out.println(s);
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

        }
    }



