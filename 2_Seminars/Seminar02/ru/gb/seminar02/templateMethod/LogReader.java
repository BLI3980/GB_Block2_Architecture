package ru.gb.seminar02.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * A base class for log reading algorithm
 */
public abstract class LogReader {
    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    // Non-abstract method which will be inherited by child classes as it is automatically
    public Iterable<LogEntry> readLogEntry() {
        List<LogEntry> loglist = new ArrayList<>();
        for (String str : readEntries(currentPosition)) {
            loglist.add(parseLogEntry(str));
        }
        return loglist;
    }

    // Abstract methods which will be overloaded in child classes
    public abstract Object getDataSource();
    public abstract void setDataSource(Object data);
    protected abstract Iterable<String> readEntries(Integer position);
    protected abstract LogEntry parseLogEntry(String stringEntry);
}
