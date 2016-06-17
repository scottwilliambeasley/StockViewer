package view;

import java.awt.Paint;

import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.XYDataset;

public class CustomCandlestickRenderer extends CandlestickRenderer {

    @Override
    public Paint getItemPaint(int row, int column) {
        boolean isStockDirectionUpward = checkIfStockPriceIsRising(row, column);
        Paint candlestickColor = getAppropriateColorForCandlestick(isStockDirectionUpward);
        return candlestickColor;
    }
    
    private Paint getAppropriateColorForCandlestick(boolean isStockDirectionUpward){
    	if (isStockDirectionUpward) {
    		return getUpPaint();
    	} else {
    		return getDownPaint();
    	}
    
    }

	private boolean checkIfStockPriceIsRising(int row, int column) {
		OHLCDataset highLowData = getOHLCDatasetFromPlot();
        int series = row, item = column;

        Number yOpen = highLowData.getOpen(series, item);
        Number yClose = highLowData.getClose(series, item);
        
        boolean stockDirectionIsUpwards = yClose.doubleValue() > yOpen.doubleValue();
		return stockDirectionIsUpwards;
	}

	private OHLCDataset getOHLCDatasetFromPlot() {
		XYDataset dataset = getPlot().getDataset();
        OHLCDataset highLowData = (OHLCDataset) dataset;
		return highLowData;
	}

}

