#include <iostream>
#include <limits>
using namespace std;

int main() {
	int n;
	long long result = 0;
	int length[100000], L[100000];

	cin >> n;

	for (int i = 0; i < n - 1; i++) {
		cin >> length[i];
	}
	
	for (int i = 0; i < n; i++) {
		cin >> L[i];
	}

	for (int i = 0; i < n - 1; i++) {
		if (L[i] < L[i + 1] && i != n - 2) L[i + 1] = L[i];
		
		result +=(long long)L[i] * length[i];
	}

	cout << result;

	return 0;

}