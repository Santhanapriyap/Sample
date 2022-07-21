package org.sample;

public class ReverseString 
{
public static void main(String[] args) 
{
String str="Priya";
String temp="";
int n=str.length()-1;

for(int i=n; i>=0; i--)
{
	temp=temp+str.charAt(i);
}
System.out.println(temp);
}
}
