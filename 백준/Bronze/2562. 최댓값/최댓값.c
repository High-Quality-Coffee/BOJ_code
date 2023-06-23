#include <stdio.h>
int main()
{
	int arr[9],max,num;

	for (int i = 0;i < 9;i++) {
		scanf("%d", &arr[i]);
	}

	max = 0;

	for (int i = 0;i < 9;i++) {
		if (max < arr[i]) {
			max = arr[i];
			num = i;
		}
	}

	printf("%d\n", max);
	printf("%d", num+1);

	return 0;
}