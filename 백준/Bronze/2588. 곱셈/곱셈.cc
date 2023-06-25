#include <stdio.h>
int main()
{
	int a, b, c, d, e;
	scanf("%d", &a);
	scanf("%d", &b);

	c = b / 100;
	d = (b - (c * 100)) / 10;
	e = (b - c*100) - (d * 10);

	printf("%d\n", a*e);
	printf("%d\n", a*d);
	printf("%d\n", a*c);
	printf("%d", a*b);

	return 0;
}