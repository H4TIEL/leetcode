def add_binary(a: str, b: str) -> str:
    addition = []
    carry = 0
    pad_length = max(len(a), len(b))
    a = a.zfill(pad_length)
    b = b.zfill(pad_length)
    list_a = list(a)
    list_b = list(b)

    for index in reversed(range(pad_length)):
        if int(list_a[index]) == 1 and int(list_b[index]) == 1:
            carry = 1
            result = int(list_a[index]) ^ int(list_b[index])
        else:
            result = int(list_a[index]) ^ int(list_b[index]) ^ carry

        addition.append(result)

    addition.append(carry)
    return str(addition)


print(add_binary('11', '1'))
