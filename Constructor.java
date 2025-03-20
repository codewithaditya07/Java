class xyz{

xyz()
    {
      System.out.println("hello i am class xyz");
    }
    void abc()
    {
        System.out.println("hello in am class abc");
    }
}

public class Constructor {
    public static void main(String[] args) {
        xyz ob = new xyz();
        ob.abc();
    }
    
}
