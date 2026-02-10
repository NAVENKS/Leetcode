#include <stdbool.h>

int getNext(int n) {
    int sum = 0;
    while(n > 0) {
        int d = n % 10;
        sum += d * d;
        n /= 10;
    }
    return sum;
}

bool isHappy(int n) {
    int seen[811] = {0};

    while(n != 1) {
        n = getNext(n);
        if(seen[n])
            return false;
        seen[n] = 1;
    }

    return true;
}
