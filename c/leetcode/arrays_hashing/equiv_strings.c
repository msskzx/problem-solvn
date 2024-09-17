// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

void concatStrHelper(char** a, int size, char* res) {
    res[0] = '\0';

    for (int i = 0; i < size; i++) {
        strcat(res, a[i]);
    }
}

bool arrayStringsAreEqual(char** word1, int word1Size, char** word2, int word2Size) {
    char str1[1001] = "";
    char str2[1001] = "";
    concatStrHelper(word1, word1Size, str1);
    concatStrHelper(word2, word2Size, str2);

    return strcmp(str1, str2) == 0;
}
