package client;

import jappo.Jappo;
import jappo.JappoBuilder;
import jappo.model.SingleLog;

public class JappoClientMain {
    public static void main(String[] args) throws Exception {

//        System.out.println(getDataFromDatabaseOrSomethingLikeThat("localhost", 9889));

                SingleLog singleLog = new SingleLog("sdaf", System.nanoTime(), System.nanoTime());
        SingleLog btnLog = new SingleLog();
        btnLog.setLabelOfTestedElement("label");
        btnLog.setTimeOfExecution(System.nanoTime());
        btnLog.setTimeOfResult(System.nanoTime());

        Jappo jappo = new JappoBuilder().setServerAddress("localhost").setServerPort(9898).createJappo();
        jappo.addLog(singleLog);
        jappo.addLog(btnLog);
        jappo.sendLogs();
    }


}
