class Solution{

    static int nextHappy(int n){
        // code here
        while(n <= (int)1e5)
        {
            if(isHappyNumber(++n)) return n;
        }
        return -1;
    }
static boolean isHappyNumber(int n) {
    HashSet<Integer> st = new HashSet<>();
    while (true) {
        n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.contains(n))
            return false;
        st.add(n);
    }
}
static int numSquareSum(int n)
{
    int squareSum = 0;
    while (n!= 0)
    {
        squareSum += (n % 10) * (n % 10);
        n /= 10;
    }
    return squareSum;
}
}