#include <iostream>
#include <cstring>
using namespace std;
int main() {
	char ch;
	char arr[16];
	int second = 0;
	cin >> arr;
	int length = strlen(arr);
	for (int i = 0;i < length;i++) {
		if (arr[i] >= 'A'&&arr[i] <= 'C') { second += 3; continue; }
		else if (arr[i] >= 'D'&&arr[i] <= 'F') { second += 4; continue; }
		else if (arr[i] >= 'G'&&arr[i] <= 'I') { second += 5; continue; }
		else if (arr[i] >= 'J'&&arr[i] <= 'L') { second += 6; continue; }
		else if (arr[i] >= 'M'&&arr[i] <= 'O') { second += 7; continue; }
		else if (arr[i] >= 'P'&&arr[i] <= 'S') { second += 8; continue; }
		else if (arr[i] >= 'T'&&arr[i] <= 'V') { second += 9; continue; }
		else if (arr[i] >= 'W'&&arr[i] <= 'Z') { second += 10; continue; }
	}
	cout << second;
}