import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class CA{
   public static void  main(String [] args){
   	int req=0;
     List<input> str=new ArrayList<input>();
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
      for(int i=1;i<=n;i++){
      	int k=obj.nextInt();
      	str.add(new input (k,i));
      }
      Collections.sort(str, Collections.reverseOrder());
       for(int i=0;i<str.size();i++){
      	  req=req+(str.get(i).getdata())*i+1;
      }
     System.out.println(req); 
      for(int i=0;i<str.size();i++){
      	System.out.printf(str.get(i).getpos()+" ");
      }
}}
 class input implements Comparable<input>{
   	int data;
   	int pos;
input(int data,int pos){
  	this.data=data;
  	this.pos=pos;
  }
  int getpos(){
  	return this.pos;
  }
  int getdata(){
  	return this.data;
  }
@Override
 public int compareTo(input o){
  	//if(o.data!=this.data)
            return this.data-o.data;
  }
//public  String toString(){
 //	return this.pos+" ";
 //}
}
