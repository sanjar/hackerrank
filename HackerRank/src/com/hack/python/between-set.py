#!/bin/python3

import math
import os
import random
import re
import sys

#You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

#The elements of the first array are all factors of the integer being considered
#The integer being considered is a factor of all elements of the second array
#Sample Input

#2 3
#2 4
#16 32 96
#Sample Output

#3
#
# Complete the 'getTotalX' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#

def getTotalX(a, b):
    a.sort()
    b.sort()
    n=True
    p=True
    count=0
    for i in range(a[-1],b[0]+1):
        n=True
        p=True
        for j in b:
            if j%i!=0:
                n=False
                break
        if n:
            for m in a:
                if i%m==0:
                    continue
                else:
                    p=False
                    break
            if p:
                count = count+1
    return count        


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    brr = list(map(int, input().rstrip().split()))

    total = getTotalX(arr, brr)

    fptr.write(str(total) + '\n')

    fptr.close()
