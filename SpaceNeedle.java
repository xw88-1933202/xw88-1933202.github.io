// Xuqing Wu
// 10/5/2019
// CSE142
// TA: Ethan M Knutson
// Assignment #2 PartB
//
// This program will show an image of Space Needle.

public class SpaceNeedle{
   public static final int SIZE=3;
   public static void main(String[] args){
      column();
      hill();
      row();
      valley();
      column();
      cone();
      hill();
      row();
   }
   
   //produce the two column part
   public static void column(){
      for(int i=1;i<=SIZE;i++){
         for(int j=1;j<=3*SIZE;j++){
            System.out.print(" ");
         }
         System.out.print("||");
         System.out.println();
      }
   }
   
   //produce the upper part of top
   public static void hill(){
      for(int i=1;i<=SIZE;i++){
         for(int j=1;j<=-3*i+3*SIZE;j++){
            System.out.print(" ");
         }
         
         System.out.print("__/");
         
         for(int j=1;j<=3*i-3;j++){
            System.out.print(":");
         }
         
         System.out.print("||");
         for(int j=1;j<=3*i-3;j++){
            System.out.print(":");
         }

         System.out.print("\\__");
         System.out.println();
      }
   }
   
   //produce the one-line middle part of top
   public static void row(){
      System.out.print("|");
      for(int i=1;i<=6*SIZE;i++){
         System.out.print("\"");
      }
      System.out.print("|");
      System.out.println();
   }
   
   //produce the lower part of top
   public static void valley(){
      for(int i=1;i<=SIZE;i++){
         
         for(int j=1;j<=2*i-2;j++){
            System.out.print(" ");
         }
         
         System.out.print("\\_");
         
         for(int j=1;j<=i*-2+3*SIZE+1;j++){
            System.out.print("/\\");
         }
         
         System.out.print("_/");
         System.out.println();
      }
   }
      
   //produce the straight body part
   public static void cone(){
      for(int i=1;i<=SIZE*SIZE;i++){
         for(int j=1;j<=2*SIZE+1;j++){
            System.out.print(" ");
         }
         System.out.print("|");
         for(int j=1;j<=SIZE-2;j++){
            System.out.print("%");
         }
         System.out.print("||");
         for(int j=1;j<=SIZE-2;j++){
            System.out.print("%");
         }
         System.out.print("|");
         System.out.println();
      }
   }
}