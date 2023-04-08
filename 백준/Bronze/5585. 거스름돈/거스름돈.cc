#include <iostream>
using namespace std;
int main() {
	int n, charge,left;
	int result = 0;
	cin >> n;
	charge = 1000 - n;

	result += charge / 500;
	charge -= (charge / 500) * 500;

	result += charge / 100;
	charge -= (charge / 100) * 100;

	result += charge / 50;
	charge -= (charge / 50) * 50;

	result += charge / 10;
	charge -= (charge / 10) * 10;

	result += charge / 5;
	charge -= (charge / 5) * 5;

	result += charge / 1;
	charge -= (charge / 1) * 1;

	cout << result;

	return 0;

}