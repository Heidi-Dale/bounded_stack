/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Heidi
 */
public class Stacks {

    public static void main(String[] args) {
        
        //1.
        Stack s1 = new Stack ();
        
        s1.push("jump");
        s1.push("speak");
        s1.push("leap");
        s1.push("walk");
        s1.push("run");
        s1.push("retreat!");
        s1.push("hop");
        s1.push("skip");
        s1.push("fall");
        s1.push("rollover");
        
       System.out.println("Number of elements is: " + s1.size());
        
       System.out.println("Display first element: ");
       System.out.println(s1.peek());
        
       System.out.println("Pop " + s1.pop());
       
    }
}
