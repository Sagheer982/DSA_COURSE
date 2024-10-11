import java.util.Stack;
public class Task_2 {
    public static boolean isBalanced(String  str){

        Stack<Character> stack=new Stack<>();

        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' ){
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && ch==')' || stack.peek()=='{' && ch=='}'||stack.peek()=='[' && ch==']'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
     public static void main(String[] args) {

        String str="{9(y+z}";
        System.out.println(isBalanced(str));
        
        String str2="({[a+b]+c}-1)";
        System.out.println(isBalanced(str2));

     }
}
