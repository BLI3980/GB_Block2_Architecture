package ru.gb.seminar02.factoryMethod;

public abstract class BaseLogReaderCreator {

    protected LogReader createLogReader(LogType logType, Object data) {
        LogReader logReader = createLogReaderInstance(logType);
        //TODO: Perform some preparation operations
        logReader.setDataSource(data);
        logReader.setCurrentPosition(2);
        return logReader;
    }
    protected abstract LogReader createLogReaderInstance(LogType logType);
}
