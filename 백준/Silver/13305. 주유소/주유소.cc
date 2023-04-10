#include <iostream>
using namespace std;

int main() {
	int n;
	unsigned int min=1000000000, result = 0;
	unsigned int length[100000] = {}, L[100000] = {};

	cin >> n;

	for (int i = 0; i < n - 1; i++) {
		cin >> length[i];
	}
	
	for (int i = 0; i < n; i++) {
		cin >> L[i];
		if (min > L[i] && i != (n - 1))min = L[i];
	}

	for (int i = 0; i < n - 1; i++) {
		if (L[i] == min && i != n - 2) {
			L[i] = min; L[i + 1] = min;
		}
		result += L[i] * length[i];
	}

	cout << result;

	return 0;

}