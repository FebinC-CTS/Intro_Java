//Exception Propagation

class TestExceptionPropagation1{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }
   catch(Exception e){
    System.out.println("exception handled");
    }  
  }  
}

public class Exception4{
  public static void main (String args[]){  
    TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
    obj.p();  
    System.out.println("normal flow...");  
  }
}  

// In the above example exception occurs in the m() method where it is not handled, 
// so it is propagated to the previous n() method where it is not handled, 
// again it is propagated to the p() method where exception is handled.