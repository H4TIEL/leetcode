#include <iostream>

int climbStairs(int n)
{
    unsigned int one, two = 1;

    for(int i = 0; i <= n; i++)
    {
        unsigned int temp = one;
	one = one + two;
	two = temp;
    }

    return one;
}


int main()
{
    std::cout<<climbStairs(2)<<std::endl;
    return 0;
}
