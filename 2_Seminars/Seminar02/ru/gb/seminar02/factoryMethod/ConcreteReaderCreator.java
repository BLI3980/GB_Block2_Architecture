package ru.gb.seminar02.factoryMethod;

public class ConcreteReaderCreator extends BaseLogReaderCreator{
    @Override
    protected LogReader createLogReaderInstance(LogType logType) {
        return switch (logType) {
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case System -> new OperationSystemLogEventReader();
            case Database -> new DatabaseReader();
        };
    }
}
