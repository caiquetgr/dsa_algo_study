package br.com.caiqueborges.arrays.exercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {

    @MethodSource("testParams")
    @ParameterizedTest
    void shouldMergeArraysSorted(int[] a, int[] b, int[] expectedResult) {
        int[] result = MergeSortedArrays.mergeSorted(a, b);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> testParams() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{0, 3, 4, 31},
                        new int[]{4, 6, 30},
                        new int[]{0, 3, 4, 4, 6, 30, 31}
                ),
                Arguments.arguments(
                        new int[]{4, 6, 30},
                        new int[]{0, 3, 4, 31},
                        new int[]{0, 3, 4, 4, 6, 30, 31}
                ),
                Arguments.arguments(
                        new int[]{},
                        new int[]{0, 2},
                        new int[]{0, 2}
                )
        );
    }

}