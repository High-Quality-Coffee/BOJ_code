#include <iostream>
#include <cstring>
using namespace std;
int main()
{
	int tcase;
	cin >> tcase;
	int sum[100] = { 0 };

	for (int i = 0;i < tcase;i++) {
		char arr[81] = {};
		cin >> arr;
		int count = 0;

		for (int j = 0;j < strlen(arr);j++) {
			switch (arr[j]) {
			case 'O':count++;sum[i] += count;break;
			case 'X':count = 0;
			}
		}

	}

	for (int i = 0;i < tcase;i++) {
		cout << sum[i] << endl;
	}

}