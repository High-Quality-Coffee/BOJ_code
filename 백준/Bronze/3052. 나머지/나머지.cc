#include <iostream>
using namespace std;
int main()
{
	int num[10];
	int arr[10];
	for (int i = 0;i < 10;i++) {
		cin >> num[i];
	}

	for (int i = 0;i < 10;i++)
		arr[i] = num[i] % 42;

	int i = 0;
	for (int index = 0;index < 10;index++) {
		for (int index1 = i;index1 < 9;index1++) {
			if (arr[index] == arr[index1 + 1]) {
				arr[index1 + 1] = 42;
			}
		}
		i++;
	}

	int count = 0;

	for (int j = 0;j < 10;j++) {
		if (arr[j] == 42)
			count++;
	}

	cout << 10 - count;

}
