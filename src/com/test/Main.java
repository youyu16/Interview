package com.test;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if(num==0){
                System.out.println("none");
                return;
            }
        String s1 = sc.next();
        boolean isLength=true;
        boolean isDic=true;
        for(int i=0;i<num-1;i++){
            String s2 = sc.next();
            if(s1.charAt(0)==s2.charAt(0)&&s1!=null&&s2!=null){
                s1=s1.substring(1);
                s2=s2.substring(1);
            }
            if(s1.charAt(0)>s2.charAt(0)){
                isDic=false;
            }
            if(s1.length()>s2.length()){
                isLength=false;
            }
            s1=s2;
        }
        if(isLength&&isDic){
            System.out.println("both");
        }else if(isLength){
            System.out.println("lengths");
        }else if(isDic){
            System.out.println("lexicographically");
        }else{
            System.out.println("none");
        }
        sc.close();
    }
}
