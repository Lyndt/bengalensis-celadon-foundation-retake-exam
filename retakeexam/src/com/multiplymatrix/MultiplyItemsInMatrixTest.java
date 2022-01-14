package com.multiplymatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyItemsInMatrixTest {
    @Test
    void multiplyInMatrix() {
        int[][] input = {
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}
        };

        int[][] expected = {
                {1, 3, 12, 4},
                {14, 10, 6, 2},
                {3, 3, 1, 5},
                {18, 0, 10, 6}
        };
        assertArrayEquals(expected, input);
    }

}

