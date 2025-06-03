def solution(array):
    counts = []

    for num in array:
        found = False

        for pair in counts:
            if pair[0] == num:
                pair[1] += 1
                found = True
                break

        if not found:
            counts.append([num, 1])

    max_count = 0
    for pair in counts:
        if pair[1] > max_count:
            max_count = pair[1]

    mode_value = -1
    mode_count = 0

    for pair in counts:
        if pair[1] == max_count:
            mode_count += 1
            mode_value = pair[0]

    if mode_count > 1:
        return -1
    else:
        return mode_value