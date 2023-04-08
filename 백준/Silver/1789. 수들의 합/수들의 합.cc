#include <iostream>
using namespace std;
int main() {
	long long int sum = 0;
	long long int s,i=1;
	cin >> s;

	for (i; sum <= s; i++) {
		sum += i;
	}

	cout << i-2;


}