import javax.swing.JFrame;

import model.Model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.xy.*;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testIt extends JFrame {
       
    public static void main(String[] args) {
    	String stock = "GOOG";
		Pattern stockPattern = Pattern.compile("[A-Z]*");
		Matcher match = stockPattern.matcher(stock);
		boolean stockIsValid = match.find();
    System.out.println(stockIsValid);
    }
}
