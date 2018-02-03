#!/bin/python3

import sys

def cutTheSticks(arr):
    flag = True
    count_before_operation = []
    #print("Array : "+str(arr))
    arr.sort()
    while(flag):
        array_length = len(arr)
        count_before_operation.append(array_length)                
        #print("Sorted Array : "+str(arr))
        indices = [index for index, value in enumerate(arr) if value == arr[0]]
        arr = arr[indices[-1]+1 :]
        if len(arr) == 0:
            flag = False
    return(count_before_operation)

if __name__ == "__main__":
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    result = cutTheSticks(arr)
    print ("\n".join(map(str, result)))



