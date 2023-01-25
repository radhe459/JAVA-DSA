
package stackImple;

import java.util.*;

public class Imp4 {
    public static void main(String[] args) {
        Stack stc=new Stack();
        //or can also declared as Stack<Integer> stc=new Stack<>();
        System.out.println("Pushed ele : "+stc.push(15));
        System.out.println("Pushed ele : "+stc.push(25));
        System.out.println("Pushed ele : "+stc.push(35));
        System.out.println("Pushed ele : "+stc.push(45));
        System.out.println("Popped ele : "+stc.pop());
        System.out.println("top  ele : "+stc.peek());
        System.out.println("Ele present : "+stc.contains(35));
        System.out.println("Search ele : "+stc.search(25));
        System.out.println("stack print : "+stc);
    }
}
