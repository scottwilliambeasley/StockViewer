package view;

import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.Border;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.xy.OHLCDataset;

public class StockDisplayPanel extends JScrollPane{

	JPanel panel;
	JViewport viewport;
	GridBagConstraints gbc;

	public StockDisplayPanel() {
		setViewportBorderProperties();
		viewport = getViewport();
	}

	private void setViewportBorderProperties() {
		Border border = BorderFactory.createTitledBorder("Stock Display Panel");
		setBorder(border);
	}

	public void showStockHistory(OHLCDataset dataset, String stockName) {
		ChartPanel chartPanel = createFullyCustomizedChartPanel(dataset, stockName);
		getViewport().add(chartPanel);
		System.out.println("chart added to panel");
	}

	private ChartPanel createFullyCustomizedChartPanel(OHLCDataset dataset, String stockName) {
		JFreeChart candleChart = ChartFactory.createCandlestickChart("History of " + stockName, "Date", "Stock Points", dataset, true);
		ChartPanel chartPanel = customizeChartColorAndFunctionality(candleChart);

		return chartPanel;
	}

	private ChartPanel customizeChartColorAndFunctionality(JFreeChart candleChart) {
		customizePlotOfChart(candleChart);
		ChartPanel chartPanel = makeMouseZoomableChartPanel(candleChart);

		return chartPanel;
	}

	private void customizePlotOfChart(JFreeChart candleChart) {
		XYPlot plot = candleChart.getXYPlot();
		setPannablePlot(plot);
		setFullyColoredThickCandlestickRenderer(plot);
		setAutorangingForDomainAndRangeOn(plot);
	}

	private ChartPanel makeMouseZoomableChartPanel(JFreeChart candleChart) {
		ChartPanel chartPanel = new ChartPanel(candleChart);
				   chartPanel.setMouseWheelEnabled(true);
				   chartPanel.setMouseZoomable(true);
		return chartPanel;
	}

	private void setAutorangingForDomainAndRangeOn(XYPlot plot) {
		setRangeToAutoranging(plot);
		setDomainToAutoranging(plot);
	}

	private void setDomainToAutoranging(XYPlot plot) {
		ValueAxis domain = plot.getDomainAxis();
				  domain.setAutoRange(false);
	}

	private void setRangeToAutoranging(XYPlot plot) {
		NumberAxis range = (NumberAxis)plot.getRangeAxis();
				   range.setAutoRangeIncludesZero(true);
				   range.setAutoRange(true);
				   range.setUpperMargin(0.0D);
				   range.setLowerMargin(0.0D);
	}

	private void setFullyColoredThickCandlestickRenderer(XYPlot plot) {
		CandlestickRenderer x = new CustomCandlestickRenderer();
							x.setUpPaint(new Color(0, 100, 0));
							x.setAutoWidthMethod(CandlestickRenderer.WIDTHMETHOD_SMALLEST);

		plot.setRenderer(x);
	}

	private XYPlot setPannablePlot(XYPlot plot) {
			   plot.setDomainPannable(true);
			   plot.setRangePannable(true);

		return plot;
	}

}

