#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

//substr(index번째 문자부터, count 길이만큼의 문자)
int main() {
	string s;
	cin >> s;
	int size = s.size();
	int count = 0, sum = 0;

	for (int i = 0; i < size; i++) {
		if (stoi(s.substr(i,1)) == 0)count++;
	}
	if (count == 0) {
		cout << -1;
		return 0;
	}

	for (int i = 0; i < size; i++) {
		sum += stoi(s.substr(i, 1));
	}
	if (sum % 3 != 0)cout << -1;
	else if (sum % 3 == 0) {
		sort(s.begin(), s.end(), greater<int>());
		cout << s;
	}





	return 0;

}
