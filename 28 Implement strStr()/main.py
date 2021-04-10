def construct_lps(pattern):
    # initialize list with zeros
    lps = [0 for _ in range(len(pattern))]
    # top pointer index 0
    tp = 0
    # bottom pointer index 1
    bp = 1
    while bp < len(pattern):
        if pattern[tp] == pattern[bp]:
            lps[bp] = tp + 1
            bp += 1
            tp += 1
        else:
            if tp != 0:
                tp = lps[tp - 1]
            else:
                lps[bp] = 0
                bp += 1
    return lps


def kmp(text, pattern):
    lps = construct_lps(pattern)
    tp = 0
    pp = 0
    # loop until end of text string
    while tp != len(text):
        if text[tp] == pattern[pp]:
            tp += 1
            pp += 1
        else:
            if pp == 0:
                tp += 1
            else:
                pp = lps[pp - 1]
        # match is size of pattern
        if pp == len(pattern):
            print(tp - pp)
            pp = lps[pp - 1]


if __name__ == '__main__':
    kmp('aabaaabc', 'aba')
