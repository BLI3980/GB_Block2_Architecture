package ru.gb.seminar02.templateMethod;

public class Main {
    public static void main(String[] args) {
        LogReader logReader = new PoemReader(data);
        logReader.setCurrentPosition(3);
        for (LogEntry log : logReader.readLogEntry()) {
            System.out.println(log.getText());
        }

    }




    public static String data = """
            У лукоморья дуб зеленый,
            Златая цепь на дубе том.
            И днем, и ночью кот ученый
            Все ходит по цепи круком.
            Идет направо - песнь заводит,
            налево - сказку говорит.""";
}
