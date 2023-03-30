//#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
//#include <cmath>
using namespace std;

int main() {

	int n, count = 0;
	int five, three;

	cin >> n;

	

	if (n % 5 % 3 == 0) {
		five = n / 5;
		three = n % 5 / 3;
		cout << five + three;
		count++;
	}
	else {
		for (int i = (n/5)-1; i >= 0; i--) {
			if ((n - (5 * i)) % 3 == 0) {
				three = (n - (5 * i)) / 3;
				cout << i + three;
				count++;
				break;
			}
		}
	}

	if (count == 0)cout << -1;

	return 0;

}