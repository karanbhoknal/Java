import java.util.*; 
 class DemoHashtable 
 { 
 public static void main(String args[]) 
 { 
 Hashtable<Integer,String> mt=new Hashtable<Integer,String>(); 
 mt.put(1,"January"); 
 mt.put(2,"February"); 
 mt.put(4,"April"); 
 mt.put(5,"March"); 
 System.out.println("Initial Hashtable: "+mt); 
 mt.put(3,"March"); //Inserts, as the pair 
 System.out.println("Updated Hashtable: "+mt); 
 }
 }