#!/bin/python3

#Import Libraries

import sys

def getMoneySpent(keyboards, drives, s):
    #print(keyboards, drives, s)
    
    ##Declare variables
    total = 0
    flag = False ##Variable for condition when both of the items cannot be purchased
    
    ##Double loops with O(n^2)
    for i in range(0, len(keyboards), 1):
        for j in range(0, len(drives), 1):
            if keyboards[i] + drives[j] > total and keyboards[i] + drives[j] <= s:
                total = keyboards[i] + drives[j]
                flag = True
            elif keyboards[i] + drives[j] > s and total == 0:
                flag = False
    if flag == False:
        return(-1)
    else:
        return(total)

s,n,m = input().strip().split(' ')
s,n,m = [int(s),int(n),int(m)]
keyboards = list(map(int, input().strip().split(' ')))
drives = list(map(int, input().strip().split(' ')))
#  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
moneySpent = getMoneySpent(keyboards, drives, s)
print(moneySpent)
