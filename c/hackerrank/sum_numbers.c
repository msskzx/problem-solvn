// https://www.hackerrank.com/challenges/sum-numbers-c/problem?isFullScreen=true

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int a;
    int b;
    float c;
    float d;
    
    scanf("%d", &a);
    getchar();
    
    scanf("%d", &b);
    getchar();
    
    scanf("%f", &c);
    getchar();
    
    scanf("%f", &d);
    getchar();
    
    printf("%d %d\n", a + b, a - b);
    printf("%.1f %.1f\n", c + d, c - d);
    
    return 0;
}
