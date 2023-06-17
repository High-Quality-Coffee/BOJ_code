#include <iostream>
#include <string>
using namespace std;
int main() {
	string s;
	getline(cin, s);
	int count = 1;

	int index = s.find(' ');

	if (s == " " || s == "") { //공백문자 하나만 입력할때를 대비
		cout << 0;
		return 0;
	}

	int index1 = -1;
	for (int i = 0;;i++) {
		int index = s.find(' ', index1 + 1);
		if (index == -1)
			break;
		index1 = index;
		if (index != 0 && index != s.length() - 1)
			count++;
	}
	cout << count;
}