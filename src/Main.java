
public class Main {
    public static void main(String[] args) {
        //chain of responsibility principle design pattern
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception Occurred !!");
        logProcessor.log(LogProcessor.DEBUG, "Debugging data !!");
        logProcessor.log(LogProcessor.INFO, "Data prepared successfully !!");
    }
}