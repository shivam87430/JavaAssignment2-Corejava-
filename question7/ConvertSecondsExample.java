package Questions.question7;

public class ConvertSecondsExample {
    public void convertSeconds(int seconds) {
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = (seconds % 3600) % 60;
        System.out.println("time is :" + hours + "," + minutes + "," + seconds);
    }

    public static void main(String[] args) {
        ConvertSecondsExample convertSecondsExample = new ConvertSecondsExample();
        convertSecondsExample.convertSeconds(86399);
    }

}
