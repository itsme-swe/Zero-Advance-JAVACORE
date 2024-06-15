/**
 * Static Block
 */
public class StaticBlock {

    static
    {
        System.out.println("Block 1");
    }

    public static void main(String[] args) {

        TestBlock t1 = new TestBlock();
        
        System.out.println("I am the Main body");
    }

    static
    {
        System.out.println("Block 2");
    }
}

class TestBlock
{
    static
    {
        System.out.println("Block 1 of class TestBlock");
    }

    static
    {
        System.out.println("Block 2 of class TestBlock");
    }
}

/*
 ◽Output: 
    
    Block 1
    Block 2
    
    Block 1 of class TestBlock
    Block 2 of class TestBlock
    
    I am the Main body
 */

