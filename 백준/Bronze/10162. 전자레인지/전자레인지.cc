#include <iostream>
using namespace std;
int main() {
	
	int t,left;
	int a=0, b = 0, c = 0;
	cin >> t;

	a = t / 300;
	t -= (t / 300) * 300;

	b = t / 60;
	t-= (t / 60) * 60;

	c = t / 10;
	t -= (t / 10) * 10;

	if (t != 0)cout << -1;
	else cout << a << " " << b << " " << c;

}