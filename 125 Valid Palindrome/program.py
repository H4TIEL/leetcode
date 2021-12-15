def is_alphanumeric(c):
    return (ord('A') <= ord(c) <= ord('Z') or
            ord('a') <= ord(c) <= ord('z') or
            ord('0') <= ord(c) <= ord('9'))


def is_palindrome(s):
    s = ''.join(c for c in s if is_alphanumeric(c)).lower()
    lp = 0
    rp = len(s) - 1
    while lp < rp:
        if s[lp] != s[rp]:
            return False
        lp += 1
        rp -= 1

    return True


if __name__ == '__main__':
    test = 'A man, a plan, a canal: Panama'
    print(is_palindrome(test))
