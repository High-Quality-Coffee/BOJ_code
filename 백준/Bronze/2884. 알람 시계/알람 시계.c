#include <stdio.h>
int main()
{
	int h, m;
	scanf("%d %d", &h, &m);
	if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59)) {
		if (m >= 45)
			m -= 45;

		else if (m < 45) {
			m += 15;
			h -= 1;
		}
	}

	if (h == -1)
		h = 23;
	
	printf("%d %d", h, m);

	return 0;
}