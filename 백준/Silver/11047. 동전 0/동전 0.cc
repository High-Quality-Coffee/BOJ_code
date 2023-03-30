//#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
//#include <cmath>
using namespace std;



int main() {
	int n, k,num;
	int money[10] = {};
	int result = 0;

	cin >> n >> k;

	for (int i = 0; i < n; i++) {
		cin >> money[i];
	}

	for (int i = n-1;i >=0; i--) {
		if (k / money[i] >= 1) {
			num = i;//num으로 저장하기
			break;
		}
	}

	for (int i = num; i >= 0; i--) {
		result += k / money[i];
		k -= k / money[i] * money[i];
	}

	cout << result;

	return 0;

}