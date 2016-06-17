# StockViewer
A simple swing program using a graphing API and an XML API to retrieve and show stock performance.

## Installing this program
In order to use this program, you will need to satisy its dependencies, which are all located within the included pom.xml file.

I used **Apache Maven** for retrieving and satisfying all dependencies, and I recommend you do the same, as this makes this far
simpler than attempting to hunt these down individually.

Just replace the stock `pom.xml` file that Maven will generate with the included one here. Update your local Maven repository afterwards in order to pull the dependencies onto your computer. 

Afterwards, just compile the source code here into bytecode using your Java compiler, and make your JVM execute the compiled 'Run' file.

## Using this program

The program is simple. Just type in the ticker name of the stock you want to view details for into the Stock Adder Panel. 
If retrieving the stock from Yahoo's unofficial YQL stock database is successful, you should see the ticker added to the 
Stock List Panel. 

Double click the ticker in the Stock List Panel to display the performance of the stock over the last year
via a candle chart graphing API, or click it then click 'Remove Stock' to remove it from the list and the data held in memory.

## Playing with the chart

The chart has several functionalities. 

1. Hold CTRL while dragging the mouse to change the viewport of the stock while maintaining the width and height of both axes.
2. Click and drag from one point of the graph to another to isolate the area to your viewport, dynamically changing the axes.
3. You can change the wideness of both the X and Y axes either by using the right-click menu, or your mouse wheel.
4. Finally, you can also save the stock chart as a .png file by right-clicking the chart and clicking **save as**.

## Saving and Restoring Profiles

You can save and restore and any set of stocks, complete with stock data, via the File menu.

