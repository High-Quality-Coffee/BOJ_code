#include <iostream>
using namespace std;
int main() {
	int num[2];
	cin >> num[0] >> num[1];
	int arr[3];

	num[0] = (num[0] % 10) * 100 + (num[0] / 10 % 10) * 10 + (num[0] / 100);
	num[1] = (num[1] % 10) * 100 + (num[1] / 10 % 10) * 10 + (num[1] / 100);

	if (num[0] > num[1])
		cout << num[0];
	else
		cout << num[1];
}