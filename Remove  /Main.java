  
#include <bits/stdc++.h> 
#include<string>
using namespace std; 
  
string removeWord(string str, string word)  
{ 
    // Check if the word is present in string 
    // If found, remove it using removeAll() 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  
    // Return the resultant string 
    return str; 
} 
  
// Driver Code 
int main(int argc, char const *argv[])  
{ 
    // Test Case 1: 
    // If the word is in the middle 
    string string1 ; 
    string word1 = "the"; 
    getline(cin,string1);
   cout<< removeWord(string1, word1) << endl;
    return 0; 
} 