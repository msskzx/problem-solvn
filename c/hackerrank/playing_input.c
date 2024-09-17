// https://www.hackerrank.com/challenges/playing-with-characters/problem?isFullScreen=true

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char ch;
    scanf("%c", &ch);
    printf("%c\n", ch);
    getchar();
    
    char str[100];
    scanf("%s", str);
    printf("%s\n", str);
    getchar();
    
    char sent[100];
    fgets(sent, sizeof(sent), stdin);
    printf("%s\n", sent);

    return 0;
}
