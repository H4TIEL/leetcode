#include <iostream>
using namespace std;

typedef unsigned long long ull;
int sqrt(int x)
{
    ull start = 1, end = x;
    ull midpoint;
    int root;

    while(start <= end)
    {
	    midpoint =  start + (end - start)/2;

	    cout << "start: " << start << " end: " << end << " midpoint: " << midpoint << endl;

	    if(midpoint * midpoint == x)
	    {
		    return midpoint;
	    }
	    else if(midpoint * midpoint < x)
	    {
		    root = midpoint;
		    start = midpoint + 1;
	    }
	    else
	    {
		    end = midpoint - 1;
	    }
	 
    }

    return root;
}

int main()
{
	int root = sqrt(15);
	cout << "square root: " << root << endl;
	return 0;
}
