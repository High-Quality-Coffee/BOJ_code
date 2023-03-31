#include <iostream>
using namespace std;

int main() {
	int n, value, max = 0, result = 0;
	int count = 0;
	cin >> n;

	int a[50] = {}, b[50] = {};

	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}

	for (int i = 0; i < n; i++) {
		cin >> b[i];
	}

	
	for (int i = 0; i < n-1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (a[i] > a[j]) {
				value = a[i];
				a[i] = a[j];
				a[j] = value;
			}
		}
	}

	
	for (int i = 0; i < n; i++) {
		for (int j=0; j < n; j++) {
			if (b[i] < b[j]) {
				count++;
			}
			else if (b[i] == b[j] && i < j) {
				count++;
			}
		}
		result += (a[count] * b[i]);
		count = 0;
	}

	cout << result;

	return 0;
}