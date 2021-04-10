Naive approach (Brute-Force)

Time-Complexity

In the worst case search string n the length of the pattern string m

| a | a | a | a | a | a | a | a | d |
|---|---|---|---|---|---|---|---|---|


| a | a | a | d |
|---|---|---|---|


O([n - m + 1] * m) 

n - m + 1 last index we can start search from for the entire pattern string

m length of pattern string

Longest prefix that is also a suffix

O(n)
