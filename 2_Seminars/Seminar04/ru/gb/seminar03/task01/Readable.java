package ru.gb.seminar03.task01;

import java.io.File;
import java.util.Collection;

/**
 * Interface allows reading data
 */
public interface Readable {
    /**
     * Method of data reading and processing
     * @param file - input data file
     * @return - data collection
     * @throws RuntimeException data processing excemption
     */
    Collection<String> readTextFile(File file) throws RuntimeException;
}
