package app;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        String namesOutput = dataHandler.handleData(dataProvider.getProductNames());
        getOutput("Products: " + namesOutput);
        
        String salesOutput = dataHandler.handleData(dataProvider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
