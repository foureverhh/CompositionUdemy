package Udemy;

public class Main {

    public static void main(String[] args)
    {
	// write your code here

        Dimension dimension = new Dimension(10,10,5);
        Case theCase = new Case("2288","Dell","248",dimension);

        //Rosolution nativeRosoluton = new Rosolution(20,25);
        Monitor monitor = new Monitor("27 inch Beast","Acer",27,new Rosolution(2540,1280));

        MotherBoard motherBoard = new MotherBoard("B3-200","ASUS",4,6,"v2.44");

        PC pc = new PC(theCase,monitor,motherBoard);

        pc.getMonitor().drawPixelAt(1500,1200,"red");

        pc.getMotherBoard().loadProgram("Window 1.0");

        pc.getTheCase().pressPowerButton();
    }
}
