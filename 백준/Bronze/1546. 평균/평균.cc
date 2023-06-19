#include <iostream>
using namespace std;

int main() {
	int val;
	cin >> val;
	int num[1000];

	for (int i = 0;i < val;i++) {
		cin >> num[i];
	}

	int max = num[0];

	for (int i = 0;i < val - 1; i++) {
		if (max < num[i + 1])
			max = num[i + 1];
	}

	double num1[1000];

	for (int i = 0;i < val;i++) {
		num1[i] = (num[i] / (double)max * 100);
	}

	double sum = 0;

	for (int i = 0;i < val;i++) {
		sum += num1[i];
	}

	cout << sum / val;
}