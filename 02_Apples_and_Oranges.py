#!/bin/python3

import sys

##Declare variables to count the fruits falling inside house

no_of_apples_in_house = 0
no_of_oranges_in_house = 0

s,t = input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
apple = [int(apple_temp) for apple_temp in input().strip().split(' ')]
orange = [int(orange_temp) for orange_temp in input().strip().split(' ')]



##Calculate Number of apples
for i in range(0, m, 1):
    if a + apple[i] >= s and a + apple[i] <= t:        
        no_of_apples_in_house = no_of_apples_in_house + 1

##Calculate Number of Oranges
for j in range(0, n, 1):
    if b + orange[j] >= s and b + orange[j] <= t:
        no_of_oranges_in_house = no_of_oranges_in_house + 1

##Print the result on new line
print(no_of_apples_in_house)
print(no_of_oranges_in_house)
