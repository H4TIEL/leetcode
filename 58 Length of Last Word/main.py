def length_last_word(string: str) -> int:
    words = string.split()
    if len(words) > 0:
        last_word = words.pop()
        return len(last_word)
    else:
        return 0


if __name__ == '__main__':
    print(length_last_word("Hello World"))
    print(length_last_word(" "))
