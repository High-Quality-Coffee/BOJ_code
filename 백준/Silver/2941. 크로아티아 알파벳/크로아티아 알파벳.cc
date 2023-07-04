#include <iostream>
#include <cstring>
using namespace std;
int main() {
	char arr[101];
	cin >> arr;
	int length = strlen(arr);
	int word = 0;

	for (int i = 0;i < length;i++) {
		if (arr[i] == 'c'&&arr[i + 1] == '=') { word++;	i++;continue; }
		else if (arr[i] == 'c'&&arr[i + 1] == '-') { word++; i++;	continue; }
		else if (arr[i] == 'd'&&arr[i + 1] == 'z'&&arr[i + 2] == '=') { word++; i += 2;	continue; }
		else if (arr[i] == 'd'&&arr[i + 1] == '-') { word++; i++;	continue; }
		else if (arr[i] == 'l'&&arr[i + 1] == 'j') { word++;	i++; continue; }
		else if (arr[i] == 'n'&&arr[i + 1] == 'j') { word++; i++;	continue; }
		else if (arr[i] == 's'&&arr[i + 1] == '=') { word++; i++;	continue; }
		else if (arr[i] == 'z'&&arr[i + 1] == '=') { word++; i++;	continue; }
		else { word++; }
	}
	cout << word;
}