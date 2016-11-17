package com.java;
 public class ParanthesisCombination {
     public static void main(String[] args) {
          printParenthesis(3);
     }
     static void printParenthesis(int n){
        printParenthesis("",n,n);       
     }

     static void printParenthesis(String s,int open,int close){
         if(open>close)
          return;
         if(open == 0 && close == 0){
             System.out.println(s);
             return;
         }
         if(open < 0 || close<0)
             return;

         printParenthesis(s + "{",open-1,close);
         printParenthesis(s + "}",open,close-1);
     }
}