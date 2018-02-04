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
    
 ## Approach - 2
#!/bin/python3

import sys

def nonDivisibleSubset(k, arr):
    total = 0
    indices = []
    sum_of_products = 0
    arr.sort
    #print(arr)
    for index in range(0, len(arr), 1):
        arr[index]= arr[index]%k
    #print(arr)
    for i in range(0, k, 1):
        index_temp = [index for index, value in enumerate(arr) if value == i]
        indices.append(len(index_temp))
    #indices_1 = [index for index, value in enumerate(arr) if value == 1]
    #print(len(indices_2))
    #print(len(indices_1))
    #print(indices)
    
    ##Add sets of 2 different types
    for j in range(0, len(indices), 1):
        for l in range(j+1, len(indices), 1):
            if (j + l) != k:
                #print(str(j)+ " , "+str(l)+", Sum of indices : "+str(j + l)+str(sum_of_products + (indices[j] * indices[l])))
                sum_of_products = sum_of_products + indices[j] * indices[l]
    ##Add sets within same type
    for m in range(0, len(indices), 1):
        sum_of_products = int(sum_of_products + ((indices[m] * (indices[m] - 1))/2))
    #print(sum_of_products)
    return(sum_of_products)
    

if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    arr = list(map(int, input().strip().split(' ')))
    result = nonDivisibleSubset(k, arr)
    print(result)


