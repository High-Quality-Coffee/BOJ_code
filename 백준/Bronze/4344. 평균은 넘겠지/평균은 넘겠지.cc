#include <iostream>
using namespace std;
int main()
{
	int tcase;
	cin >> tcase;
	int sum[1000] = { 0 };
	double ave[1000];
	double rate[1000];

	for (int i = 0;i < tcase;i++) {
		int score[1000] = { 0 };
		int student;
		cin >> student;
		for (int j = 0;j < student;j++) {
			cin >> score[j];
			sum[i] += score[j];
		}
		ave[i] = (double)sum[i] / student;
		int count = 0;
		for (int k = 0;k < student;k++) {
			if (ave[i] < score[k])
				count++;
		}
		rate[i] = (double)count / student * 100;
	}
	for (int i = 0;i < tcase;i++) {
		cout << fixed;
		cout.precision(3);
		cout << rate[i] << '%' << endl;
	}

}