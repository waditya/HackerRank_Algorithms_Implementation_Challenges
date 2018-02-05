#!/bin/python3

import sys

def repeatedString(s, n):
    ##print(s)   
    ##print(n)
    lengthOfString = len(s)  ##length of string
    ##print(lengthOfString)
    position_of_a_in_string = [index for index, value in enumerate(s) if value == 'a']
    ##print(position_of_a_in_string)
    noa = len(position_of_a_in_string)  ##Number of 'a' in string
    quotient = int(n/lengthOfString)    
    remainder = int(n % lengthOfString)
    ##print(quotient)
    ##print(remainder)
    remainder_string = s[: remainder]
    position_of_a_in_remainder_string = [index for index, value in enumerate(remainder_string) if value == 'a']
    noar = len(position_of_a_in_remainder_string) ##Number of 'a' in remainder string
    return(noa*quotient + noar)
    
    

if __name__ == "__main__":
    s = input().strip()
    n = int(input().strip())
    result = repeatedString(s, n)
    print(result)

