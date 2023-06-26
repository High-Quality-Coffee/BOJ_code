#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int test, repeat[1000];	
	char arr[1000][21];
	cin >> test;

	for (int i = 0;i < test;i++) {
		cin >> repeat[i]>>arr[i];
	}

	for (int i = 0;i < test;i++) {
		for (int j = 0;j < strlen(arr[i]);j++) {
			for (int k = 0;k < repeat[i];k++) 
				cout << arr[i][j];
		}
		cout << endl;
	}
}