package ru.gb.seminar02.templateMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class implements primitive steps of abstract class algorithm
 */
public class PoemReader extends LogReader {

    private String data;

    public PoemReader(String data) {
        this.data = data;
    }

    public PoemReader() {
    }

    @Override
    public Object getDataSource() {
        return data;
    }

    @Override
    public void setDataSource(Object data) {
        this.data = data.toString();
    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        Scanner scanner = new Scanner(data);
        List<String> logList= new ArrayList<>();
        int counter = 0;
        while (scanner.hasNextLine()) {
            counter++;
            if (counter >= position) {
                position = counter;
                logList.add(scanner.nextLine());
            } else {
                scanner.nextLine();
            }
        }
        return logList;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return new LogEntry(stringEntry);
    }
}
