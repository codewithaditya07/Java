// public class StringClass {
//     public static void main(String[] args) {
//         String s= "hello world";
// System.out.println(s);  
// System.out.println("Length: " + s.length());
// System.out.println("Char at 7: " + s.charAt(7));
// System.out.println("Substring: " + s.substring(7));
// System.out.println("Uppercase: " + s.toUpperCase());
// System.out.println("Uppercase: " + s.toLowerCase());
// System.out.println("Uppercase: " + s.indexOf("o")); 
// System.out.println("Char at 3: " + s.charAt(3));   
 
// String ss=new String("Hello Delhi");
// System.out.println(ss);

// if(s.equals(ss))
//         System.out.println("Equal");
// else
//         System.out.println("Not Equal");
// }
// }
        
public class StringClass {
        public static void main(String[] args) {
                
        StringBuffer SB=new StringBuffer("Hello Delhi");
         System.out.println(SB);
        SB.append(" How Are You");
        System.out.println(SB);

        SB.append(" Whyyyy",2,4);
        System.out.println(SB);
        System.out.println(SB.indexOf("A"));
        }
}