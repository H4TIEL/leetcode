def max_sub_array(array) -> int:
    maximum = array[0]
    current_max = maximum
    for index in range(1, len(array)):
        current_max = max(array[index] + current_max, array[index])
        maximum = max(maximum, current_max)
    return maximum


if __name__ == '__main__':
    sub_array_max = max_sub_array([-2, 1, -3, 4, -1, 2, 1, -5, 4])
    print(sub_array_max)  # 6
