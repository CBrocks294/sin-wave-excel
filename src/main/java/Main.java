public class Main {
    public static void main(String[] args) {
        int sigfig = 10;
        FileHandling spreadsheet = new FileHandling("hello.csv");
        for (int a = 0; a < 360; a++) {
            spreadsheet.write(String.valueOf(Math.toRadians(a)), String.valueOf(Math.floor(50*Math.sin(Math.toRadians(a))*Math.pow(10,sigfig))/Math.pow(10,sigfig)));
        }
        spreadsheet.close();
    }
}
