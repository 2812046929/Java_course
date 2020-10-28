package exercise03;
import java.awt.Color;
import java.awt.Font;
//import java.awt.image.BufferedImage;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
//import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class DrawColumnChart
{
	/*
	 * 这个程序用来显示上一个程序中的柱状图
	 * 利用第三方库jfreechart
	 */
	public static void draw(int[] slots)
	{
//		BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_BGR);
		TextTitle title = new TextTitle("柱状图");
		CategoryDataset data = getdata(slots);
		JFreeChart chart = ChartFactory.createBarChart("槽中球的最终储备量", "槽编号", "球的数量", data);
		ChartFrame frame = new ChartFrame("槽中球的最终储备量",chart);
		/*frame.pack();
		frame.setVisible(true);*/
		// 自定义设定背景色  
        // chart.setBackgroundPaint(Color.getHSBColor(23,192,223));  
        chart.setBackgroundPaint(Color.WHITE);  
        // 获得 plot：3dBar为CategoryPlot  
        CategoryPlot categoryPlot = chart.getCategoryPlot();  
        // 设定图表数据显示部分背景色  
        categoryPlot.setBackgroundPaint(Color.WHITE);  
        // 横坐标网格线  
        categoryPlot.setDomainGridlinePaint(Color.RED);  
        // 设置网格线可见  
        categoryPlot.setDomainGridlinesVisible(true);  
        // 纵坐标网格线  
        categoryPlot.setRangeGridlinePaint(Color.RED);  
        categoryPlot.setRangeGridlinesVisible(true); 
        // 重要的类，负责生成各种效果  
        // BarRenderer3D renderer=(BarRenderer3D) categoryPlot.getRenderer();  
        // 获取纵坐标  
        NumberAxis numberaxis = (NumberAxis) categoryPlot.getRangeAxis();  
        // 设置纵坐标的标题字体和大小  
        numberaxis.setLabelFont(new Font("宋体", Font.CENTER_BASELINE, 20));  
        // 设置丛坐标的坐标值的字体颜色  
        numberaxis.setLabelPaint(Color.BLACK);  
        // 设置丛坐标的坐标轴标尺颜色  
        numberaxis.setTickLabelPaint(Color.BLACK);  
        // 坐标轴标尺颜色  
        numberaxis.setTickMarkPaint(Color.BLACK);  
        // 丛坐标的默认间距值  
        numberaxis.setAutoTickUnitSelection(true);   
        // 获取横坐标  
        CategoryAxis domainAxis = categoryPlot.getDomainAxis();  
        // 设置横坐标的标题字体和大小  
        domainAxis.setLabelFont(new Font("宋体", Font.PLAIN, 13));  
        // 设置横坐标的坐标值的字体颜色  
        domainAxis.setTickLabelPaint(Color.BLACK);  
        // 设置横坐标的坐标值的字体  
        domainAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 20));  
        // 设置横坐标的显示  
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(0));  
        // 这句代码解决了底部汉字乱码的问题   
        chart.getLegend().setItemFont(new Font("宋体", 0, 16));  
        // 设置图例标题  
        Font font = new java.awt.Font("宋体", java.awt.Font.CENTER_BASELINE, 40);  
        //TextTitle title = new TextTitle("项目状态分布");  
        title.getBackgroundPaint();  
        title.setFont(font);  
        // 设置标题的字体颜色  
        title.setPaint(Color.BLACK);  
        chart.setTitle(title);  
        frame.pack();  
        frame.setVisible(true);  
        
	}
	private static CategoryDataset getdata(int[] slots)
	{
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		for(int i=0;i<slots.length;i++) {
			data.addValue(slots[i], "", ""+(i+1));
		}
		return data;
	}
}

