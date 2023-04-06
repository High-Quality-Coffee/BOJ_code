#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	int n, swap;
	int max = 0;
	int ascend[100000] = {};
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> ascend[i];
	}

	sort(ascend, ascend + n);
	
	/*for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (ascend[i] > ascend[j]) {
				swap = ascend[i];
				ascend[i] = ascend[j];
				ascend[j] = swap;
			}
		}
	}*/

	int index = n;

	for (int i = 0; i < n; i++) {
		if (max < (ascend[i] * index))max = ascend[i] * index;
		index--;
	}

	cout << max;

	return 0;

}