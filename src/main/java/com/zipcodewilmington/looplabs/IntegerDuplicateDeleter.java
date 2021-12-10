package com.zipcodewilmington.looplabs;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }


    public long getOccurrence(int occurrence) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == occurrence) {
                count++;
            }
//                return Arrays.stream(array)
//                        .filter(anotherNumber -> anotherNumber == occurrence)
//                        .count();
//        }
        }
        return count;
    }


        @Override
        public Integer[] removeDuplicates (int maxNumberOfDuplications){

            //given a sorted array
            //given maxNumberOfDuplications
            //compare the first number with the adjacent number

            //turned an array into a stream
//        return Arrays.stream(array)
//                //filter thru our stream -> new variable condition to check our method call (duplicate numbers)
//                .filter(duplicateNumber -> getOccurrence(duplicateNumber) < maxNumberOfDuplications)
//                //convert the stream back to a new Array.
//                .toArray(Integer[]::new);

            int numberOfElements = 0;
            for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
                if (getOccurrence(array[i]) < maxNumberOfDuplications) {
                    numberOfElements++;  // Size of new array
                }
            }
            int tracker = 0;
            Integer[] newArray = new Integer[numberOfElements];
            for (int j = 0; j < array.length; j++) {
                if (getOccurrence(array[j]) < maxNumberOfDuplications) {
                    newArray[tracker] = array[j];  // Place values in new array using tracker
                    tracker++;
                }
            }
            return newArray;
        }


        @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int numberOfElements = 0;
        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
            if (getOccurrence(array[i]) != exactNumberOfDuplications) {
                numberOfElements++;  // Size of new array
            }
        }
        int tracker = 0;
        Integer[] newArray = new Integer[numberOfElements];
        for (int j = 0; j < array.length; j++) {
            if (getOccurrence(array[j]) != exactNumberOfDuplications) {
                newArray[tracker] = array[j];  // Place values in new array using tracker
                tracker++;
            }
        }
        return newArray;


//        return Arrays.stream(array)
//                .filter(exactNumberOfOccurrence -> getOccurrence(exactNumberOfOccurrence) != exactNumberOfDuplications)
//                .toArray(Integer[]::new);

    }


}
