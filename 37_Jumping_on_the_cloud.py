#!/bin/python3

import sys

def jumpingOnClouds(c):
    #print(c)
    counter = 0
    for i in range(0,len(c) - 2 ,1):
        #print("Cloud Number : "+str(i)+" Cloud Type : "+str(c[i])+" Next Cloud Type : "+str(c[i+1])+" Next-2-Next Cloud Type : "+str(c[i+2])+" Counter : "+str(counter))
        if c[i+1]==1:
            i = i + 1
            counter = counter + 1
        elif (c[i+1]==0) and (c[i+2]==0):
            counter = counter + 1
        else:
            counter = counter + 1
    return(counter - 1)        
                    

if __name__ == "__main__":
    n = int(input().strip())
    c = list(map(int, input().strip().split(' ')))
    result = jumpingOnClouds(c)
    print(result)

