package ru.gb.seminar03.task01;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Design by Contract programming.
 * Defining the specifications of contracts for the components of a system.
 */
public class ProductService {

    private ArrayList<String> res;

    public void process1() {}

    public void process2() {
        res = null;
    }


    public Collection<String> readTextFile(File file) {

        // PRE-CONDITION
        if (file.exists()) {
            if (file.length() > 5000) {
                throw new RuntimeException("File size is more than 5Mb. Reading is not accepted.");
            }
        } else {
            throw new RuntimeException("File not found.");
        }

        // region WORK WITH DATA
        // TODO: Read data from file ...
        // TODO: implement the logics of method ...
        res = new ArrayList<>();
        res.add("AAAA");
        res.add("BBBB");

        process1();

        // INVARIANT 1
        validateResult(res);

        process2();

        // INVARIANT 2
        validateResult(res);
        // endregion

        // POST-CONDITION
         if (res == null) {
             throw new RuntimeException("Data operation error.");
         }

         // TODO: Return data operation result ...
        return res;
    }

    private void validateResult(Collection<String> res) {
        if (res == null || res.size() == 0) {
            throw new RuntimeException("Incorrect object state.");
        }
    }

}
