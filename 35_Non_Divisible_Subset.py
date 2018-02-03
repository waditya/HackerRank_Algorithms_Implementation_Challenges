#!/bin/python3

import sys

def nonDivisibleSubset(k, arr):
    #print(k)
    #print(arr)
    total = 0
    for i in range(0, len(arr), 1):
        for j in range(i+1, len(arr), 1):
            #print("i, j, i + j :"+str(arr[i])+", "+str(arr[j])+", "+str(arr[i]+arr[j]))
            if (arr[i]+arr[j]) % k != 0:
                total +=1
                #print("Total : "+str(total))
    return(total)

if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    arr = list(map(int, input().strip().split(' ')))
    result = nonDivisibleSubset(k, arr)
    print(result)

