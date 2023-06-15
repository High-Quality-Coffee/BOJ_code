#include <stdio.h>
int main()
{
	int a, n, x, y, first, count = 0;
	scanf("%d", &n);
	a = n;
	x = n / 10;
	y = n % 10;

	if (n < 10)
		n = n * 10;

	while (1) {
		if (x + y >= 10) {
			n = y * 10 + (x + y) % 10;
			first = (x + y) % 10;
			x = y;
			y = first;
			count++;
		}
		else if (x + y < 10) {
			n = y * 10 + (x + y);
			first = x + y;
			x = y;
			y = first;
			count++;
		}
		if (x * 10 + y == a)
			break;
	}
	printf("%d", count);
	return 0;
}