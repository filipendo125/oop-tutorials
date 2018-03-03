class Operation{  
 int data;  

 public Operation() {
   data = 50;
 }

 void change(int data){  
   data = data+100;
 }
}

class ObjectCallB {
 public static void main(String[] args){  
   Operation op = new Operation();  

   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
 }  
} 