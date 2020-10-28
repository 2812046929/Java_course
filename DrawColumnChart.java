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
	 * �������������ʾ��һ�������е���״ͼ
	 * ���õ�������jfreechart
	 */
	public static void draw(int[] slots)
	{
//		BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_BGR);
		TextTitle title = new TextTitle("��״ͼ");
		CategoryDataset data = getdata(slots);
		JFreeChart chart = ChartFactory.createBarChart("����������մ�����", "�۱��", "�������", data);
		ChartFrame frame = new ChartFrame("����������մ�����",chart);
		/*frame.pack();
		frame.setVisible(true);*/
		// �Զ����趨����ɫ  
        // chart.setBackgroundPaint(Color.getHSBColor(23,192,223));  
        chart.setBackgroundPaint(Color.WHITE);  
        // ��� plot��3dBarΪCategoryPlot  
        CategoryPlot categoryPlot = chart.getCategoryPlot();  
        // �趨ͼ��������ʾ���ֱ���ɫ  
        categoryPlot.setBackgroundPaint(Color.WHITE);  
        // ������������  
        categoryPlot.setDomainGridlinePaint(Color.RED);  
        // ���������߿ɼ�  
        categoryPlot.setDomainGridlinesVisible(true);  
        // ������������  
        categoryPlot.setRangeGridlinePaint(Color.RED);  
        categoryPlot.setRangeGridlinesVisible(true); 
        // ��Ҫ���࣬�������ɸ���Ч��  
        // BarRenderer3D renderer=(BarRenderer3D) categoryPlot.getRenderer();  
        // ��ȡ������  
        NumberAxis numberaxis = (NumberAxis) categoryPlot.getRangeAxis();  
        // ����������ı�������ʹ�С  
        numberaxis.setLabelFont(new Font("����", Font.CENTER_BASELINE, 20));  
        // ���ô����������ֵ��������ɫ  
        numberaxis.setLabelPaint(Color.BLACK);  
        // ���ô����������������ɫ  
        numberaxis.setTickLabelPaint(Color.BLACK);  
        // ����������ɫ  
        numberaxis.setTickMarkPaint(Color.BLACK);  
        // �������Ĭ�ϼ��ֵ  
        numberaxis.setAutoTickUnitSelection(true);   
        // ��ȡ������  
        CategoryAxis domainAxis = categoryPlot.getDomainAxis();  
        // ���ú�����ı�������ʹ�С  
        domainAxis.setLabelFont(new Font("����", Font.PLAIN, 13));  
        // ���ú����������ֵ��������ɫ  
        domainAxis.setTickLabelPaint(Color.BLACK);  
        // ���ú����������ֵ������  
        domainAxis.setTickLabelFont(new Font("����", Font.PLAIN, 20));  
        // ���ú��������ʾ  
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(0));  
        // ���������˵ײ��������������   
        chart.getLegend().setItemFont(new Font("����", 0, 16));  
        // ����ͼ������  
        Font font = new java.awt.Font("����", java.awt.Font.CENTER_BASELINE, 40);  
        //TextTitle title = new TextTitle("��Ŀ״̬�ֲ�");  
        title.getBackgroundPaint();  
        title.setFont(font);  
        // ���ñ����������ɫ  
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

