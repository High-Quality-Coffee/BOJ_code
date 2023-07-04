#include <stdio.h>
int main()
{
	int arr[8],a=0,b=0,c=0;

	for (int i = 0;i < 8;i++) {
		scanf("%d", &arr[i]);
	}

	for (int i = 0;i < 7;i++) {
		if (arr[i] == arr[i + 1] + 1)
			a++;
		else if (arr[i] == arr[i + 1] - 1)
			b++;
		else
			c++;
	}

	if (a == 7)
		printf("descending");
	if (b == 7)
		printf("ascending");
	if (c > 0 || a > 0 && b > 0)
		printf("mixed");

	return 0;
}