class Solution(object):
    def idealArrays(self, n, maxValue):
        """
        :type n: int
        :type maxValue: int
        :rtype: int
        """
        MOD = 10**9 + 7
        fact = [1] * (n + 1)
        inv = [1] * (n + 1)
        for i in range(1, n + 1):
            fact[i] = fact[i - 1] * i % MOD
        inv[n] = pow(fact[n], MOD - 2, MOD)
        for i in range(n - 1, 0, -1):
            inv[i] = inv[i + 1] * (i + 1) % MOD

        def nCr(a, b):
            if b > a:
                return 0
            return fact[a] * inv[b] % MOD * inv[a - b] % MOD

        from collections import defaultdict

        dp = [defaultdict(int) for _ in range(n + 1)]
        for i in range(1, maxValue + 1):
            dp[1][i] = 1

        for length in range(1, n):
            for val in dp[length]:
                count = dp[length][val]
                for mult in range(2 * val, maxValue + 1, val):
                    dp[length + 1][mult] = (dp[length + 1][mult] + count) % MOD

        result = 0
        for length in range(1, n + 1):
            total = sum(dp[length].values()) % MOD
            result = (result + total * nCr(n - 1, length - 1)) % MOD

        return result
