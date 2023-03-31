#include <iostream>
#include <string>
using namespace std;

int Pnumcount(string s, int index, int size) {
	int plus = 0;
	int count = 0;
	for (int i = index; i < size; i++) {
		if (s[i] == '-' || s[i] == '+')break;
		count++;
	}
	
	plus += stoi(s.substr(index,count));
	
	return plus;
}

int Mnumcount(string s, int index, int size) {
	int minus = 0;
	int count = 0;
	for (int i = index; i < size; i++) {
		if (s[i] == '-' || s[i] == '+')break;
		count++;
	}
	
	minus += stoi(s.substr(index, count));
		
	return minus;
}


int Fnumcount(string s) {
	int count = 0;
	int plus = 0;
	for (int i = 0; i < 6; i++) {
		if (s[i] == '-' || s[i] == '+' || s[i] == 0)break;
		count++;
	}
	plus += stoi(s.substr(0,count));
		
	return plus;
}


int main() {
	string s = "";
	int size;
	int plus = 0, minus = 0;

	cin >> s;
	size = s.size();

	for (int i = 0; i < size; i++) {
		if (s[i] == '-') {
			for (int j = i; j < size; j++) { if (s[j] == '+')s[j] = '-'; }
		}
	}


	for (int i = 0; i < size; i++) {
		if (i == 0) { plus += Fnumcount(s); } //첫번째 값 계산
		if (s[i] == '+') { plus += Pnumcount(s, i + 1, size); }
		if (s[i] == '-') { minus += Mnumcount(s, i + 1, size); }
	}

	cout << plus - minus;

	return 0;

}