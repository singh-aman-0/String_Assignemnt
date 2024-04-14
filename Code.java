Answer:-1

import java.util.*;  

public class Main    
{
    static void removeDuplicate(char str[], int length)   
    {   
        int index = 0;
        for (int i = 0; i < length; i++)   
        {
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }
    
    public static void main(String[] args)   
    {   
        String info = "Physics Wallah is the best";  
       
        char str[] = info.toCharArray();
        
        int len = str.length;   
          
        removeDuplicate(str, len);   
    }   
}


Answer:-2

public class Main {    
     public static void main(String[] args) {    
         
        String string1 = "Great responsibility";    
        int count;    
        
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        
        for(int i = 0; i <string.length; i++)
        {
            count = 1;
            
            for(int j = i+1; j <string.length; j++)
            {
                if(string[i] == string[j] && string[i] != ' ')
                {
                    count++;
                    string[j] = '0';    
                }    
            }    
            
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
    }    
}


Answer :-3

public class Main {    
     public static void main(String[] args) {
        int r,sum=0,temp;
        int n=2552;
        
        temp=n;
        
        while(n>0)
        {
            r=n%10;
            
            sum = (sum*10) + r;
            
            n = n / 10;
        }
        
        if(temp==sum)
        System.out.println("palindrome number ");
        else
        System.out.println("not palindrome"); 
    }    
}


Answer:-4

import java.io.*; 
  
public class Main { 

    static void countCharacterType(String str) 
    { 
        int vowels = 0, consonant = 0, specialChar = 0,  
            digit = 0; 
      
        for (int i = 0; i < str.length(); i++) { 
              
            char ch = str.charAt(i); 
      
            if ( (ch >= 'a' && ch <= 'z') ||  
                (ch >= 'A' && ch <= 'Z') ) { 
      
                // To handle upper case letters 
                ch = Character.toLowerCase(ch); 
      
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') 
                    vowels++; 
                else
                    consonant++; 
            } 
            else if (ch >= '0' && ch <= '9') 
                digit++; 
            else
                specialChar++; 
        } 
          
        System.out.println("Vowels: " + vowels); 
        System.out.println("Consonant: " + consonant); 
        System.out.println("Digit: " + digit); 
        System.out.println("Special Character: " + specialChar); 
    } 
      
    // Driver function. 
    static public void main (String[] args) 
    { 
        String str = "geeks for geeks121"; 
          
        countCharacterType(str); 
    } 
} 


Answer:-5 


import java.util.Scanner;
import java.io.*;

public class String_S {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First String : ");
        String str1 = sc. nextLine();
        System.out.println("Enter a Second String : ");
        String str2 = sc.nextLine();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("This is an anagram");
        }
        else
        {
            System.out.println("This is not a anagram");
        }
  

Answer:-6 

public class Main{
    static int size = 26;
    
    static boolean isLetter(char ch){
        
        if (!Character.isLetter(ch))
        
        return false;
        return true;
    }
    
    static boolean containsAllLetters(String str, int len)  
    {
        str = str.toLowerCase();  
        
        boolean[] present = new boolean[size];
        
        for (int i = 0; i < len; i++)
        {
if (isLetter(str.charAt(i)))   
{  
int letter = str.charAt(i) - 'a';
present[letter] = true;  
}  
}
for (int i = 0; i < size; i++)   
{  
if (!present[i])
return false;  
}
return true;  
} 
public static void main(String args[])  
{  
//string to check  
String str = "Abcdefghijklmnopqrstuvwxyz"; 

int len = str.length();  

if (containsAllLetters(str, len))  

System.out.println("The given string is a pangram string.");  

else  
System.out.println("The given string is not a pangram string.");
}
    
} 


Answer:-7

import java.util.*;
 
public class Main {
    boolean uniqueCharacters(String str)
    {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
                    return true;
    }
 
    public static void main(String args[])
    {
        Main obj = new Main();
        String input = "Aman singh from PW Skills";
 
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }
}


Answer:-8

import java.util.*;
 
public class Main {
    static char getMaxOccurringChar(String str) {
        
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = str.length();
        
        char ans = 0;
        int cnt = 0;
        
        for(int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            
            if(cnt < mp.get(c))
            {
                ans = c;
                cnt = mp.get(c);
            }
        }
         
        return ans;
    }
    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("Max occurring character is: " + getMaxOccurringChar(str));
    }
}