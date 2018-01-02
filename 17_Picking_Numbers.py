#!/bin/python3

import sys

def pickingNumbers(a):
    a.sort()
    #print(a)   ##Debug - 01
    ##Find the element with maximum frequency
    
    counter = 1
    no_of_elements = 0
    ##Space Complexity is O(n^2)
    for i in range(0, len(a), 1):
        counter = 1
        for j in range(i+1,len(a), 1 ):
            #print(a[i], a[j])  ##Debug - 02
            if abs(a[i] - a[j]) <=1:
                counter = counter + 1
                #print(counter) 3#Debug - 03
            else:
                counter = 1
                #print("Else Loop") ##Debug - 04
                #print(counter) ##Debug - 05
                break;
            if counter > no_of_elements:
                no_of_elements = counter
    return(no_of_elements)
            

if __name__ == "__main__":
    n = int(input().strip())
    a = list(map(int, input().strip().split(' ')))
    result = pickingNumbers(a)
    print(result)

