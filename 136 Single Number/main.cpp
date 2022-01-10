#include <iostream>

int main() 
{
  int nums[] = {4, 1, 2, 1, 2};
  int sum = 0;
  for(int i = 0; i < *(&nums + 1) - nums; i++) 
  {
       sum ^= nums[i];
  }

  std::cout<<sum<<std::endl;

  return 0;
}
