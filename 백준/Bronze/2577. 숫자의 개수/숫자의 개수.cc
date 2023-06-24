#include <iostream>
using namespace std;
int main()
{
	int a, b, c;
	int arr[100];
	int count = 1;
	int arrcount[10] = {};

	cin >> a;
	cin >> b;
	cin >> c;

	int val;
	val = a * b*c;

	int val1 = val;

	while (1) {
		if (val1 / 10 < 1)
			break;
		count++;
		val1 = val1 / 10;
	}

	for (int i = 0;i < count;i++) {
		arr[i] = val % 10;
		val = val / 10;
	}

	for (int i = 0;i < count;i++) {
		switch (arr[i]) {
		case 0:arrcount[0]++;break;
		case 1:arrcount[1]++;break;
		case 2:arrcount[2]++;break;
		case 3:arrcount[3]++;break;
		case 4:arrcount[4]++;break;
		case 5:arrcount[5]++;break;
		case 6:arrcount[6]++;break;
		case 7:arrcount[7]++;break;
		case 8:arrcount[8]++;break;
		case 9:arrcount[9]++;
		}
	}

	for (int i = 0;i < 10;i++) {
		cout << arrcount[i] << endl;
	}

}