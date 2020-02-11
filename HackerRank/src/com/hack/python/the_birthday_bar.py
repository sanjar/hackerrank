# Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.
# birthday has the following parameter(s):

#s: an array of integers, the numbers on each of the squares of chocolate
#d: an integer, Ron's birth day
#m: an integer, Ron's birth month
#s = [1, 2, 1, 3, 2]
#d = 3
#m = 2
sum1 = 0
count = 0
for i in range(len(s)):
    sum1 = 0
    for j in range(0, m):
        print(j)
        if i+j < len(s):
            sum1 = sum1 + s[i+j]
    if d == sum1:
        count = count + 1

return count