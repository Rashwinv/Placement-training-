#include <stdio.h>

// Function to calculate factorial using recursion
int factorial(int n)
{
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}

int main()
{
    int n, ways;
    printf("Enter the number of days left to join Google: ");
    scanf("%d", &n);

    ways = factorial(n);

    printf("Number of ways he can meet his girlfriends is: %d", ways);

    return 0;
}
