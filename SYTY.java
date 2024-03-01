import SY.SYMarks;
import TY.TYMarks;
import java.io.*;
class SYTY 
{ 
 int rollno; 
 int ComputerTotal, MathsTotal, ElecTotal, Theory, Practicals; 
 String name; 
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
 public SYTY() 
 {} 
 public SYTY(int rollno,String name) throws Exception 
 { 
 this.rollno = rollno; 
 this.name = name; 
 
 System.out.println("Enter SY marks: "); 
 
 System.out.println("\nEnter computer marks"); 
 ComputerTotal = Integer.parseInt(br.readLine()); 
 
 while((ComputerTotal<0 || ComputerTotal>100)) 
 { 

 ComputerTotal = Integer.parseInt(br.readLine()); 

 } 
 
 System.out.println("\nEnter maths marks"); 
 MathsTotal=Integer.parseInt(br.readLine()); 
 
 while((MathsTotal<0 || MathsTotal>100)) 
 { 
 
 MathsTotal=Integer.parseInt(br.readLine()); 
 } 
 System.out.println("\nEnter electronics marks"); 
 ElecTotal = Integer.parseInt(br.readLine()); 
 
 while((ElecTotal<0 || ElecTotal>100)) 
 { 

 ElecTotal = Integer.parseInt(br.readLine()); 
 } 
 SYMarks sy = new SYMarks(ComputerTotal, MathsTotal, ElecTotal); 
 System.out.print("\nEnter TY marks: "); 
 
 System.out.print("\nEnter theory marks "); 

 Theory = Integer.parseInt(br.readLine()); 
 
 while((Theory<0 || Theory>100)) 
 { 
 Theory = Integer.parseInt(br.readLine()); 
 } 
 System.out.print("\nEnter practicals marks "); 
 Practicals = Integer.parseInt(br.readLine()); 
 
 while((Practicals<0 || Practicals>100)) 
 { 

 Practicals = Integer.parseInt(br.readLine()); 
 } 
 TYMarks ty = new TYMarks(Theory, Practicals); 
 
 CalculateGrade(); 
 } 
 
 
 public void getdata() throws Exception 
 { 
 System.out.println("\nEnter number of students: "); 

 int n=Integer.parseInt(br.readLine()); 
 
 SYTY object[]=new SYTY[n]; 
 
 for(int i=0; i<n; i++) 
 { 
 System.out.println("\nEnter name: "); 
 String name = br.readLine(); 
 
 System.out.println("\nEnter roll no: "); 
 int roll = Integer.parseInt(br.readLine()); 
 
 object[i] = new SYTY(roll,name); 

 } 
 } 
 
 
 public void CalculateGrade() 
 { 
 double percentage; 
 
 percentage = (ComputerTotal+ MathsTotal + ElecTotal + Theory + 
Practicals)/5; 
 System.out.println("Result:"); 
 
 if(percentage >= 70) 
 System.out.println("Grade:A"); 

 else if(percentage >= 60) 
 System.out.println("Grade:B"); 
 
 else if(percentage >= 50) 
 System.out.println("Grade:C"); 
 
 else if(percentage >= 40) 
 System.out.println("Grade:PASS"); 
 else 
 System.out.println("Grade:FAIL\n\tTry Again.........."); 
 } 
 
 public static void main(String args[]) throws Exception 
 { 
 SYTY st = new SYTY(); 
 st.getdata(); 
 } 
}