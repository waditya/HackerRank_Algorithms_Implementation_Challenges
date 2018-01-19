#!/bin/python3

import sys

def appendAndDelete(s, t, k):
    # Complete this function
    len_s = len(s)
    len_t = len(t)
    cumulative_operations_counter = 0
    
    if len_s > len_t:
        max_cmp = len_t
    else:
        max_cmp = len_s
        
    for i in range(0, max_cmp, 1):
        if(s[i] != t[i]):
            break
    ##print(s[:i])
    ##print(t[:i])
    if (len_t -i +  len_s - i)<= k:
        return('Yes')
    else:
        return('No')
            

if __name__ == "__main__":
    s = input().strip()
    t = input().strip()
    k = int(input().strip())
    result = appendAndDelete(s, t, k)
    print(result)

