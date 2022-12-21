package myproject;

public class ReturnStatement {
    /* Method with an integer return type and no arguments */  
    public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    /* Driver Code */  
    public static void main(String ar[])   
    {  
        ReturnStatement obj = new ReturnStatement();  
        int result = obj.CompareNum();  
        System.out.println(result);  
    }
}
