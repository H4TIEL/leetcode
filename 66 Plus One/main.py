def plus_one(digits: list[int]) -> list[int]:
    number = 0
    digits.reverse()
    for index in range(len(digits)):
        number += digits[index] * 10 ** index

    number += 1
    return [int(digit) for digit in str(number)]


if __name__ == '__main__':
    print(plus_one([4, 3, 2, 1]))
