//#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
//#include <cmath>
using namespace std;

int sum(int *s, int n) {
	int result=0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <= i; j++) {
			result += s[j];
		}
	}
	return result;
}

int main() {

	int n;
	int p[1000] = {};
	int value;
	int result = 0;

	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> p[i];
	}

	
	for (int i = 0; i < n-1; i++) {
		for (int j = i + 1; j< n; j++) {
			if (p[i] > p[j]) {
				value = p[i];
				p[i] = p[j];
				p[j] = value;
			}
		}
	}


	cout<<sum(p,n);

	return 0;

}