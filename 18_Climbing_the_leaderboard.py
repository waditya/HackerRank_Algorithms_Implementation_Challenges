#!/bin/python3

import sys

def climbingLeaderboard(scores, alice):
    ##Created a list of unique scores in Descending order
    ##We are creating unique list because this problem uses dense ranking mechanism
    
    scores_uniq = scores
    scores_uniq = list(set(scores))
    scores_uniq.sort(key = None, reverse = True)
    ##print(scores_uniq)   ##Debug_Checkpoint - 01
    
    array_for_rankings = []
    
    for i in range(0, len(alice), 1):
        for j in range(0, len(scores_uniq), 1):
            ##print(alice[i] , scores_uniq[j])  ##Debug_Checkpoint - 02
            if alice[i] >= scores_uniq[j]:
                array_for_rankings.append(j + 1)
                break
        if alice[i] < scores_uniq[-1]:
                ##print("Alice has the least score")    ##Debug_Checkpoint - 03
                array_for_rankings.append(len(scores_uniq) + 1)
        ##print(array_for_rankings) ##Debug_Checkpoint - 04
    return(array_for_rankings)

if __name__ == "__main__":
    n = int(input().strip())
    scores = list(map(int, input().strip().split(' ')))
    m = int(input().strip())
    alice = list(map(int, input().strip().split(' ')))
    result = climbingLeaderboard(scores, alice)
    print ("\n".join(map(str, result)))



