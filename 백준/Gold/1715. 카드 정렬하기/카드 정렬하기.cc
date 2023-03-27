#include <iostream>
#include <queue>

//우선순위 큐의 개념을 알고있어야하는 문제
//우선순위 큐를 <queue>헤더를 사용하여 쉽게 사용할 수 있음_구글링통해학습
//문제풀이방식_유튜브를통해학습_홀로학습하는노력필요
//자료구조 공부필요
//알고리즘 공부 필요
using namespace std;
int main() {
	int n, a, b;
	int arr[100000] = {};
	int sum = 0;

	cin >> n;
	for (int i = 0; i < n; i++) cin >> arr[i];

	if (n == 1) {
		cout << 0;
		return 0;
	}

	priority_queue<int, vector<int>, greater<int>>pq;

	for (int i = 0; i < n; i++) {
		pq.push(arr[i]);
	}
	
	while (!pq.empty()) {
		a = pq.top();
		pq.pop(); 
		b = pq.top();
		pq.pop();
		sum += (a + b);
		if (!pq.empty())pq.push(a + b);
	}

	cout << sum;
	
	return 0;
}
