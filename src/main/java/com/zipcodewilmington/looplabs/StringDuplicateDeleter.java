package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    //helper method
    public long getOccurrence(String string){

        //we have an array
        //array -> stream

       return Arrays.stream(array)

                .filter(stringElement -> stringElement.equals(string))
                .count();

    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(array)
                    .filter(duplicateElement -> getOccurrence(duplicateElement) < maxNumberOfDuplications)
                    .toArray(String[]::new);

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(numberOfDuplicateOccurrences -> getOccurrence(numberOfDuplicateOccurrences) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }
}
