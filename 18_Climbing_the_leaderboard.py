#!/bin/python3

import sys

def climbingLeaderboard(scores, alice):
    ##Created a list of unique scores in Descending order
    ##We are creating unique list because this problem uses dense ranking mechanism
    
    scores_uniq = scores
    scores_uniq = list(set(scores))
    scores_uniq.sort(key = None, reverse = True)
    
    ##print("length of sorted scores")
    ##print(len(scores_uniq))
    
    lower_bound = len(scores_uniq) - 1
    upper_bound = -1
    delta = -1
    
    ranking_for_each_round = []
    
    for i in range(0, len(alice), 1):
        #print(alice[i], lower_bound, upper_bound)
        for j in range(lower_bound, upper_bound , delta):
            if alice[i] < scores_uniq[j]:
                rank = j + 1
                ranking_for_each_round.append(rank + 1)
                lower_bound = rank - 1
                break
            elif alice[i] >= scores_uniq[0] and j == 0:
                    #print("Score is larger than the highest score")
                    ranking_for_each_round.append(1)
                    break   
        ##print(ranking_for_each_round[-1])
    return(ranking_for_each_round)
                

if __name__ == "__main__":
    n = int(input().strip())
    scores = list(map(int, input().strip().split(' ')))
    m = int(input().strip())
    alice = list(map(int, input().strip().split(' ')))
    result = climbingLeaderboard(scores, alice)
    print ("\n".join(map(str, result)))
