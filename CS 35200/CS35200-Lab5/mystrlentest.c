
#include <stdio.h>
#include <assert.h>

int mystrlen(char *s);

int main()
{
	char * s = "Hello world";
	assert(mystrlen(s)==11);
	printf("mystrlen test passed\n");
	return 0;
}
