from typing import List


def max_profit(prices: List[int]) -> int:
    bp = 0
    sp = 1
    profit = 0
    while sp < len(prices):
        transaction = prices[sp] - prices[bp]
        if transaction > profit:
            profit = transaction
        if prices[sp] < prices[bp]:
            bp = sp

        sp += 1

    return profit


if __name__ == '__main__':
    test = [7, 1, 5, 3, 6, 4]
    print(max_profit(test))
