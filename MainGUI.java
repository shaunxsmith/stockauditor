/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behindnumbers;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
//imports for tab Chart Patterns
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.util.Calendar;
import javax.swing.JScrollPane;
import javax.swing.ToolTipManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
 //*
// * @author shaun smith
// */
public class MainGUI extends JFrame implements ActionListener {
    
    private final static String newline = "\n";
    private String voltitle = "Volume Chart";
    //Die after expire date instance
    private Calendar expireDate = Calendar.getInstance();
    //Labels and JTextFields for entry of stock analysis info
    
    final JTextField text1 = new JTextField(10);
    final JTextField text2 = new JTextField(10);
    
    
    final JTextField text3 = new JTextField(10);
    
    final JTextField text4 = new JTextField(10);
    
    final JTextField text5 = new JTextField(10);
    
    final JTextField text6 = new JTextField(10);
    
    final JTextField text7 = new JTextField(10);
    
    final JTextField text8 = new JTextField(10);
    
    final JTextField text9 = new JTextField(10);
    
    final JTextField text10 = new JTextField(10);
    
    final JTextField text11 = new JTextField(10);
    
    final JTextField text12 = new JTextField(10);
    
    final JTextField text13 = new JTextField(10);
    
    final JTextField text14 = new JTextField(10);
    
    final JTextField text15 = new JTextField(10);
    
    final JTextField text16 = new JTextField(10);
    
    final JTextField text17 = new JTextField(10);
    
    final JTextField text18 = new JTextField(10);
    
    final JTextField text19 = new JTextField(10);
    
    final JTextField text20 = new JTextField(10);
    
    final JTextField text21 = new JTextField(10);
    
    final JTextField text22 = new JTextField(10);
    
    final JTextField text23 = new JTextField(10);
    
    final JTextField text24 = new JTextField(10);
    
    final JTextField text25 = new JTextField(10);
    
    final JTextField text26 = new JTextField(10);
    
    final JTextField text27 = new JTextField(10);
    
    final JTextField text28 = new JTextField(10);
    
    final JTextField text29 = new JTextField(10);
    
    final JTextField text30 = new JTextField(10);
    
    final JTextField text33 = new JTextField(10);
    
    final JTextField text34 = new JTextField(10);
    
    final JTextField text35 = new JTextField(10);
    
    final JTextField text36 = new JTextField(10);
    
    final JTextField text37 = new JTextField(10);
    
    final JTextField text38 = new JTextField(10);
    
    final JTextField text39 = new JTextField(10);
    
    final JTextField text40 = new JTextField(10);
    
    final JTextField stockdivpay = new JTextField(10);
    
    final JTextField shareprice = new JTextField(10);
    
    final JTextField cashflow = new JTextField(10);
    
    final JTextField ebitda = new JTextField(10);
    
    final JTextField inexpense = new JTextField(10);
    
    final JTextField principal = new JTextField(10);
    
    final JTextField leasepay = new JTextField(10);
    
    final JTextField taxrate = new JTextField(10);
    //dividend value for quarter 8
    final JTextField divvalueQ8 = new JTextField(10);
    //trailing 12 month pershare earnings
    final JTextField trailpershareearns = new JTextField(10);
    //full year earning estimate
    final JTextField fullyrearnest = new JTextField(10);
    
    final JCheckBox ownerearnings = new JCheckBox("Owner's Earnings Bar Chart");
    final JCheckBox econvalueadded = new JCheckBox("Economic Value Added Bar Chart");
    final JCheckBox econvalueaddedmarketvalueadded = new JCheckBox("Economic Value Added and Market"
            + "Value Added Bar Chart");
    final JCheckBox changefinishgoods = new JCheckBox("Change In Finished Goods Bar Chart");
    final JCheckBox deferrevdailysalesout = new JCheckBox("Days Deferred Revenue to Daily Sales Outstanding"
            + "Bar Chart");
    final JCheckBox doubtfulsales = new JCheckBox("Allowance For Doubtful Acct to "
            + "Change In Sales Bar Chart");
    final JCheckBox tfpayoutratio = new JCheckBox("Trailing to Forward Payout Ratios Bar Chart");
    
    //Button to take user to Report page
    final JButton report = new JButton("Stock Audit Report");
    //Button to take user to Volume Report
    final JButton volreport = new JButton("Pattern Audit Report");
    //Analysis Report Print button for menu bar 
    final JButton print = new JButton("Print Stock Audit Report");
    //Stock Volume Analysis Print button for nenu
    final JButton volprint = new JButton("Print Pattern Audit Report");
    //save button for menu bar
    final JButton save = new JButton("Save");
    
    //clear button for menu bar
    final JButton clear = new JButton("Clear");
    
    
   
    
    //company info for Audit Report
    final JLabel compName = new JLabel("Company Name:",SwingConstants.RIGHT);
    final JTextField compName2 = new JTextField(20);
    final JLabel compAdd = new JLabel("Address(Optional):",SwingConstants.RIGHT);
    final JTextField compAdd2 = new JTextField(20);
    final JLabel compPhone = new JLabel("Phone Number(Optional):",SwingConstants.RIGHT);
    final JTextField compPhone2 = new JTextField(15);
    final JLabel compEmail = new JLabel("Email Address(Optional):",SwingConstants.RIGHT);
    final JTextField compEmail2 = new JTextField(25);
    
    //company info for Volume Report
    final JLabel compNameCP = new JLabel("Company Name:",SwingConstants.RIGHT);
    final JTextField compName2CP = new JTextField(20);
    final JLabel compAddCP = new JLabel("Address(Optional):",SwingConstants.RIGHT);
    final JTextField compAdd2CP = new JTextField(20);
    final JLabel compPhoneCP = new JLabel("Phone Number(Optional):",SwingConstants.RIGHT);
    final JTextField compPhone2CP = new JTextField(15);
    final JLabel compEmailCP = new JLabel("Email Address(Optional):",SwingConstants.RIGHT);
    final JTextField compEmail2CP = new JTextField(25);
    
    
    ImageIcon icon = createImageIcon("images/information-balloon[1].png","information icon");
    //instance of a ToolTip for Revenue Quarter 1
    final JLabel lab1 = new JLabel("Inventory Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab2 = new JLabel("Inventory Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab3 = new JLabel("Cost of Goods Sold Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab4 = new JLabel("Cost of Goods Sold Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab5 = new JLabel("Raw Material Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab6 = new JLabel("Raw Material Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab7 = new JLabel("Work in Progress Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab8 = new JLabel("Work in Progress Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab9 = new JLabel("Finished Goods Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab10 = new JLabel("Finished Goods Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab11 = new JLabel("Accounts Recievable Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab12 = new JLabel("Accounts Recievable Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab13 = new JLabel("Revenue Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab14 = new JLabel("Revenue Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab15 = new JLabel("Net Sales Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab16 = new JLabel("Net Sales Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab17 = new JLabel("Deffered Revenue Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab18 = new JLabel("Deffered Revenue Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab19 = new JLabel("Allowance for Doubtful Accounts"
            + "Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab20 = new JLabel("Allowance for Doubtful Accounts"
            + "Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab21 = new JLabel("Accounts Payable Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab22 = new JLabel("Accounts Payable Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab23 = new JLabel("Net Income Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab24 = new JLabel("Depreciation & Amortization Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab25 = new JLabel("Other non-cash items (Optional) Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab26 = new JLabel("Capitalized Costs Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel lab27 = new JLabel("Net Income Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab28 = new JLabel("Depreciation & Amortization Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab29 = new JLabel("Other non-cash items (Optional) Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab30 = new JLabel("Capitalized Costs Quarter 1:",icon,SwingConstants.RIGHT);
    final JLabel lab33 = new JLabel("Outstanding Shares:",icon,SwingConstants.RIGHT);
    final JLabel lab34 = new JLabel("Current Share Price:",icon,SwingConstants.RIGHT);
    final JLabel lab35 = new JLabel("Invested Capital:",icon,SwingConstants.RIGHT);
    final JLabel lab36 = new JLabel("After Tax Interest Expense:",icon,SwingConstants.RIGHT);
    final JLabel lab37 = new JLabel("After Tax Interest Income:",icon,SwingConstants.RIGHT);
    final JLabel lab38 = new JLabel("Capital Assets:",icon,SwingConstants.RIGHT);
    final JLabel lab39 = new JLabel("Cost of Capital:",icon,SwingConstants.RIGHT);
    final JLabel lab40 = new JLabel("Required Minimum Return:",icon,SwingConstants.RIGHT);
    final JLabel stockdivpayl = new JLabel("Annual Dividend Payout:",icon,SwingConstants.RIGHT);
    final JLabel sharepricel = new JLabel("Current Share Price:",icon,SwingConstants.RIGHT);
    final JLabel cashflowl = new JLabel("Cash Flow:",icon,SwingConstants.RIGHT);
    final JLabel ebitdal = new JLabel("EBITDA:",icon,SwingConstants.RIGHT);
    final JLabel inexpensel = new JLabel("Interest Expense:",icon,SwingConstants.RIGHT);
    final JLabel principall = new JLabel("Debt Principal:",icon,SwingConstants.RIGHT);
    final JLabel leasepayl = new JLabel("Lease Payment:",icon,SwingConstants.RIGHT);
    final JLabel taxratel = new JLabel("Tax Rate:",icon,SwingConstants.RIGHT);
    final JLabel cplab2 = new JLabel("Up Total Volume(1k)for Week 1:",icon,SwingConstants.RIGHT);
    final JLabel cplab3 = new JLabel("Down Total Volume(1k)for Week 1:",icon,SwingConstants.RIGHT);
    final JLabel cplab4 = new JLabel("Up Total Volume(1k)for Week 2:",SwingConstants.RIGHT);
    final JLabel cplab5 = new JLabel("Down Total Volume(1k)for Week 2:",SwingConstants.RIGHT);
    final JLabel cplab6 = new JLabel("Up Total Volume(1k)for Week 3:",SwingConstants.RIGHT);
    final JLabel cplab7 = new JLabel("Down Total Volume(1k)for Week 3 :",SwingConstants.RIGHT);
    final JLabel cplab8 = new JLabel("Up Total Volume(1k)for Week 4:",SwingConstants.RIGHT);
    final JLabel cplab9 = new JLabel("Down Total Volume(1k)for Week 4:",SwingConstants.RIGHT);
    final JLabel cplab10 = new JLabel("Up Total Volume(1k)for Week 5:",SwingConstants.RIGHT);
    final JLabel cplab11 = new JLabel("Down Total Volume(1k)for Week 5:",SwingConstants.RIGHT);
    final JLabel cplab12 = new JLabel("Up Total Volume(1k)for Week 6:",SwingConstants.RIGHT);
   final JLabel cplab13 = new JLabel("Down Total Volume(1k)for Week 6:",SwingConstants.RIGHT);
    final JLabel cplab14 = new JLabel("Up Total Volume(1k)for Week 7:",SwingConstants.RIGHT);
    final JLabel cplab15 = new JLabel("Down Total Volume(1k)for Week 7:",SwingConstants.RIGHT);
    final JLabel cplab16 = new JLabel("Shares Shorted:",icon,SwingConstants.RIGHT);
    final JLabel cplab17 = new JLabel("Stocks Float amount:",icon,SwingConstants.RIGHT);
    final JLabel cplab18 = new JLabel("Stocks Average",icon,SwingConstants.RIGHT);
    final JLabel cplab19 = new JLabel("Daily Share Volume Traded:",icon,SwingConstants.RIGHT);
    final JLabel cplabnet8 = new JLabel("Net Income Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel cplabshprice = new JLabel("Share Price:",icon,SwingConstants.RIGHT);
    final JLabel divvalueQ8l = new JLabel("Dividend Per Share Quarter 8:",icon,SwingConstants.RIGHT);
    final JLabel trailpershareearnsl = new JLabel("Trailing 12 Month Earnings Per Share:",icon,SwingConstants.RIGHT);
    final JLabel fullyrearnestl = new JLabel("Full Year Earnings Estimate:",icon,SwingConstants.RIGHT);
    
    //JTextFields, JLabels, and JButtons for tab Chart Patterns
    //Labels and JTextFields for entry of stock analysis info
    
    //information testarea
    JTextArea cplab1 = new JTextArea(26, 35);
    //Company Analysis textarea
    public JTextArea reptext = new JTextArea(100,35);
    //Volume Analysis textarea
    public JTextArea repvoltext = new JTextArea(100,35);
    
    final JTextField cptext2 = new JTextField(15);
    
    final JTextField cptext3 = new JTextField(15);
    
    final JTextField cptext4 = new JTextField(15);
    
    final JTextField cptext5 = new JTextField(15);
    
    final JTextField cptext6 = new JTextField(15);
    
    final JTextField cptext7 = new JTextField(15);
    
    final JTextField cptext8 = new JTextField(15);
    
    final JTextField cptext9 = new JTextField(15);
    
    final JTextField cptext10 = new JTextField(15);
    
    final JTextField cptext11 = new JTextField(15);
    
    final JTextField cptext12 = new JTextField(15);
    
    final JTextField cptext13 = new JTextField(15);
    
    final JTextField cptext14 = new JTextField(15);
    
    final JTextField cptext15 = new JTextField(15);
    
    final JTextField cptext16 = new JTextField(10);
    
    final JTextField cptext17 = new JTextField(10);
    final JTextField cptext18 = new JTextField(10);
    
    
    final JTextField cptext19 = new JTextField(10);
    final JButton report1 = new JButton("Pattern Audit Report");
    
    final JTextField cptextnet8 = new JTextField(10);
    
    final JTextField cptextshprice = new JTextField(10);
    final JCheckBox cpvg = new JCheckBox("Volume Comparison Bar Chart");
    final JCheckBox cpcashdivcover = new JCheckBox("Cash Dividend Cover "
            + "Bar Chart");
    
       
    // Returns an ImageIcon, or null if the path was invalid. 
protected ImageIcon createImageIcon(String path,
                                           String description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
    
}

    //MainGUI constructor method
   public MainGUI() {
        super("Stock Auditor");
        try {
    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("com.sun.java.swing.plaf.flamingo.FlamingoLookAndFeel".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    //If Nimbus is not available, fall back to cross-platform
    try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception ex) {
        // not worth my time
    }
    
    
}       //makes the clear button transparent except the text
        clear.setOpaque(false);
        clear.setContentAreaFilled(false);
        clear.setBorderPainted(false);
        //makes the save button transparent except the text
        save.setOpaque(false);
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        //makes the print button transparent except the text
        print.setOpaque(false);
        print.setContentAreaFilled(false);
        print.setBorderPainted(false);
        
        //makes the volreport button transparent except the text
        volreport.setOpaque(false);
        volreport.setContentAreaFilled(false);
        volreport.setBorderPainted(false);
        //makes the report button transparent except the text
        report.setOpaque(false);
        report.setContentAreaFilled(false);
        report.setBorderPainted(false);
        //makes the volume print button transparent except the text
        volprint.setOpaque(false);
        volprint.setContentAreaFilled(false);
        volprint.setBorderPainted(false);
        
        setTitle("Stock Auditer by Slapdash, LLC");
          
        GridBagConstraints cpgbc = new GridBagConstraints();
        cpgbc.anchor = GridBagConstraints.NORTHWEST;
        cpgbc.insets = new Insets(0,0,0,10);
        
        //gridbag constraint anchored on the west
        GridBagConstraints gbc = new GridBagConstraints();
        //aligns text to left of form
        gbc.anchor = GridBagConstraints.WEST;
        //insets for gridbag anchored on the west
        gbc.insets = new Insets(0,0,0,5);
        
        //gridbag constraint anchored on the east
        GridBagConstraints gbc1 = new GridBagConstraints();
        //aligns text to left of form
        gbc1.anchor = GridBagConstraints.WEST;
        //insets for gridbag anchored on the west
        gbc1.insets = new Insets(0,0,0,10);
        
        //aligns label to the right next to the text box
        lab1.setPreferredSize(new Dimension(350, 15));
        lab2.setPreferredSize(new Dimension(350, 15));
        lab3.setPreferredSize(new Dimension(350, 15));
        lab4.setPreferredSize(new Dimension(350, 15));
        lab5.setPreferredSize(new Dimension(350, 15));
        lab6.setPreferredSize(new Dimension(350, 15));
        lab7.setPreferredSize(new Dimension(350, 15));
        lab8.setPreferredSize(new Dimension(350, 15));
        lab9.setPreferredSize(new Dimension(350, 15));
        lab10.setPreferredSize(new Dimension(350, 15));
        lab11.setPreferredSize(new Dimension(350, 15));
        lab12.setPreferredSize(new Dimension(350, 15));
        lab13.setPreferredSize(new Dimension(350, 15));
        lab14.setPreferredSize(new Dimension(350, 15));
        lab15.setPreferredSize(new Dimension(350, 15));
        lab16.setPreferredSize(new Dimension(350, 15));
        lab17.setPreferredSize(new Dimension(350, 15));
        lab18.setPreferredSize(new Dimension(350, 15));
        lab19.setPreferredSize(new Dimension(350, 15));
        lab20.setPreferredSize(new Dimension(350, 15));
        lab21.setPreferredSize(new Dimension(350, 15));
        lab22.setPreferredSize(new Dimension(350, 15));
        lab23.setPreferredSize(new Dimension(350, 15));
        lab24.setPreferredSize(new Dimension(350, 15));
        lab25.setPreferredSize(new Dimension(350, 15));
        lab26.setPreferredSize(new Dimension(350, 15));
        lab27.setPreferredSize(new Dimension(350, 15));
        lab28.setPreferredSize(new Dimension(350, 15));
        lab29.setPreferredSize(new Dimension(350, 15));
        lab30.setPreferredSize(new Dimension(350, 15));
        lab33.setPreferredSize(new Dimension(350, 15));
        lab34.setPreferredSize(new Dimension(350, 15));
        lab35.setPreferredSize(new Dimension(350, 15));
        lab36.setPreferredSize(new Dimension(350, 15));
        lab37.setPreferredSize(new Dimension(350, 15));
        lab38.setPreferredSize(new Dimension(350, 15));
        lab39.setPreferredSize(new Dimension(350, 15));
        lab40.setPreferredSize(new Dimension(350, 15));
        compName.setPreferredSize(new Dimension(350, 15));
        compAdd.setPreferredSize(new Dimension(350, 15));
        compEmail.setPreferredSize(new Dimension(350, 15));
        compPhone.setPreferredSize(new Dimension(350, 15));
        
        //label alignment for the Pattern Analysis tab
        stockdivpayl.setPreferredSize(new Dimension(350, 15));
        sharepricel.setPreferredSize(new Dimension(350, 15));
        cashflowl.setPreferredSize(new Dimension(350, 15));
        ebitdal.setPreferredSize(new Dimension(350, 15));
        inexpensel.setPreferredSize(new Dimension(350, 15));
        principall.setPreferredSize(new Dimension(350, 15));
        leasepayl.setPreferredSize(new Dimension(350, 15));
        taxratel.setPreferredSize(new Dimension(350, 15));
        cplab2.setPreferredSize(new Dimension(350, 15));
        cplab3.setPreferredSize(new Dimension(350, 15));
        cplab4.setPreferredSize(new Dimension(350, 15));
        cplab5.setPreferredSize(new Dimension(350, 15));
        cplab6.setPreferredSize(new Dimension(350, 15));
        cplab7.setPreferredSize(new Dimension(350, 15));
        cplab8.setPreferredSize(new Dimension(350, 15));
        cplab9.setPreferredSize(new Dimension(350, 15));
        cplab10.setPreferredSize(new Dimension(350, 15));
        cplab11.setPreferredSize(new Dimension(350, 15));
        cplab12.setPreferredSize(new Dimension(350, 15));
        cplab13.setPreferredSize(new Dimension(350, 15));
        cplab14.setPreferredSize(new Dimension(350, 15));
        cplab15.setPreferredSize(new Dimension(350, 15));
        cplab16.setPreferredSize(new Dimension(350, 15));
        cplab17.setPreferredSize(new Dimension(350, 15));
        cplab18.setPreferredSize(new Dimension(350, 15));
        cplab19.setPreferredSize(new Dimension(350, 15));
        cplabnet8.setPreferredSize(new Dimension(350, 15));
        cplabshprice.setPreferredSize(new Dimension(350, 15));
        compNameCP.setPreferredSize(new Dimension(350, 15));
        compAddCP.setPreferredSize(new Dimension(350, 15));
        compPhoneCP.setPreferredSize(new Dimension(350, 15));
        compEmailCP.setPreferredSize(new Dimension(350, 15));
        divvalueQ8l.setPreferredSize(new Dimension(350, 15));
        trailpershareearnsl.setPreferredSize(new Dimension(350, 15));
        fullyrearnestl.setPreferredSize(new Dimension(350, 15));
        
        JTabbedPane jtp = new JTabbedPane();
        //JTabbedPane tbar = new JTabbedPane();
       
        //creates an instance of JPanel and an instance of GridBagLayout so the 
        //labels and text boxes will align on form for Audit Analysis tab
        JPanel p = new JPanel(new GridBagLayout());
        //panel for Volume Audit background info
        JPanel pp = new JPanel();
        //panel for scrollPane
        JPanel pz = new JPanel();
        //panel for Volume Audit text 
        JPanel pt = new JPanel(new GridBagLayout());
        //panel for Audit and Pattern Analysis information
        JPanel apinfo = new JPanel();
        //creates rep panel for textarea company analysis
        JPanel rep = new JPanel();
        //creates repvol panel for textarea volumen analysis textarea
        JPanel repvol = new JPanel();
        
        JPanel repscroll = new JPanel();
        
        //expiration date for bomb
        expireDate.set(2015, 9, 15);
    //get current date for bomb
    if(Calendar.getInstance().after(expireDate)){
        System.exit(0);
    }
        
        //LineWrap, WrapStyple and Font for Company Analysis
        reptext.setFont(new Font("Serif", Font.ITALIC, 16));
        reptext.setLineWrap(true);
        reptext.setWrapStyleWord(true);
        reptext.setEditable(false);
        ////LineWrap, WrapStyple and Font for Volume Analysis textarea
        repvoltext.setFont(new Font("Serif", Font.ITALIC, 16));
        repvoltext.setLineWrap(true);
        repvoltext.setWrapStyleWord(true);
        repvoltext.setEditable(false);
        
        //LineWrap, WrapStyple and Font for Information Textarea
        cplab1.setLineWrap(true);
        cplab1.setWrapStyleWord(true);
        cplab1.setEditable(false);
        //sets the background color for JTextArea
        cplab1.setBackground(Color.LIGHT_GRAY);
        //sets the background color for volume pattern analysis
        //pt.setBackground(Color.LIGHT_GRAY);
        //sets font for JTextArea
        cplab1.setFont(new Font("New Times Roman",Font.ROMAN_BASELINE,12));
        //creats instance for new scroll bar for information textarea
        JScrollPane scrollPane = new JScrollPane(cplab1);
        //creates instance for new scroll bar for company analysis textarea
        JScrollPane scrollPane1 = new JScrollPane(reptext);
        //creates instance for new scroll bar for volumen analysis textarea
        JScrollPane scrollPanelvol = new JScrollPane(repvoltext);
        //creates scrollpane for stock analysis panel p
        JScrollPane scrollPanel2 = new JScrollPane();
        //creates scrollpane for volume analysis panel pp
        JScrollPane scrollPanel3 = new JScrollPane();
        
        JScrollPane scrollPanel4 = new JScrollPane();
        
        //asignes vertical scrollbar to scrollPane instance information textarea
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(900, 580));
        //asignes vertical scrollbar to scrollPane instance for company analysis textarea
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setPreferredSize(new Dimension(600, 550));
        //asignes vertical scrollbar to scrollPane instance for volumen analysis textarea
        scrollPanelvol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanelvol.setPreferredSize(new Dimension(600, 550));
        //asignes vertical and horizontal scrollbars to scrollPane2 for stock analysis panel
        scrollPanel2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel2.setPreferredSize(new Dimension(900, 900));
        //asignes vertical and horizontal scrollbars to scrollPane3 for volume analysis panel
        scrollPanel3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel3.setPreferredSize(new Dimension(900, 900));
        
        scrollPanel4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel4.setPreferredSize(new Dimension(900, 900));
        //p.setPreferredSize(new Dimension(1000,500));
        //pp.setPreferredSize(new Dimension(700,600) );
        pt.setPreferredSize(new Dimension(1400,700));
        //tab for Audit Analysis input and Audit Report output
        jtp.addTab("Stock Audit",scrollPanel2);
        //tab for Pattern Analysis input and Volume Report
        jtp.addTab("Pattern Audit",scrollPanel3);
        //tab for read me file coontent
        jtp.addTab("Stock and Pattern Audit Information", apinfo);
        getContentPane().add(jtp);
        //adding rep panel to jtp frame tab
        
        
        jtp.addTab("Report", repscroll);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //add JPanels to JPanels for scrollPane and JTextFields
        pz.add(scrollPane,BorderLayout.NORTH);
        apinfo.add(pz);
        //pp.add(pt);
        //addes panel p to the scrollPanel2
        scrollPanel2.add(p);
        //addes panel pp to the scrollPanel scrollPanel3
        scrollPanel3.add(pt);
        //makes the scrollPanel2 visible with content from panel p
        scrollPanel2.setViewportView(p);
        //makes the scrollPanel3 visible with content from panel pp
        scrollPanel3.setViewportView(pt);
        //adds company analysis textarea to rep panel
    rep.add(scrollPane1);
        //adds volume analysis textarea to rep panel
    rep.add(scrollPanelvol);
    repscroll.add(rep);
    
    
        //repscroll.add(rep);
        //repscroll.add(repvol);
      
        
        
        
        
        
        //sets the background color of the check boxes
        //ownerearnings.setBackground(Color.);
        
        
        //creates menu for volume and audit reports
        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenu reportmenu = new JMenu("Report");
        this.setJMenuBar(menubar);
        //adds buttons volume and audit report to menu
        menubar.add(filemenu);
        menubar.add(reportmenu);
        //adding report button to the Report menu item
        reportmenu.add(report);
        //adding volume report to the Report menu item
        reportmenu.add(volreport);
        //clear button
        filemenu.add(clear);
        //adding save report to the File menu item
        filemenu.add(save);
        //adding print to the File menu item
        filemenu.add(print);
        //adding print to the File menu item
        filemenu.add(volprint);
        
        
        getContentPane().add(menubar,BorderLayout.NORTH);
        
        //p.setBackground(Color.lightGray);
        //p1.setBackground(Color.lightGray);
        //pp.setBackground(Color.lightGray);
        
        //company phone lab
        gbc.gridx = 2;
        gbc.gridy = 3;
        p.add(compPhone, gbc);
        //company phone text
        gbc.gridx = 3;
        gbc.gridy = 3;
        p.add(compPhone2, gbc);
        //company email lab
        gbc.gridx = 2;
        gbc.gridy = 2;
        p.add(compEmail, gbc);
        //company email text
        gbc.gridx = 3;
        gbc.gridy = 2;
        p.add(compEmail2, gbc);
        //company add optional lab
        gbc.gridx = 2;
        gbc.gridy = 1;
        p.add(compAdd, gbc);
        //company add opt text
        gbc.gridx = 3;
        gbc.gridy = 1;
        p.add(compAdd2, gbc);
        //company name lab
        gbc.gridx = 2;
        gbc.gridy = 0;
        p.add(compName, gbc);
        //company name text
        gbc.gridx = 3;
        gbc.gridy = 0;
        p.add(compName2, gbc);
        //inventory qrt 1
        gbc.gridx = 1;
        gbc.gridy = 0;
        p.add(lab1, gbc);
        
        //inventory qrt 1
        gbc.gridx = 2;
        gbc.gridy = 0;
        p.add(text1, gbc);
        //inventory qrt 8
        gbc.gridx = 1;
        gbc.gridy = 1;
        p.add(lab2, gbc);
        //inventory qrt 8
        gbc.gridx = 2;
        gbc.gridy = 1;
        p.add(text2, gbc);
        //cost of goods sold qrt 1
        gbc.gridx = 0;
        gbc.gridy = 2;
        p.add(lab3, gbc);
        //cost of goods sold qrt 1
        gbc.gridx = 1;
        gbc.gridy = 2;
        p.add(text3, gbc);
        //cost of goods sold qrt 8
        gbc.gridx = 0;
        gbc.gridy = 3;
        p.add(lab4, gbc);
        //cost of goods sold qrt 8
        gbc.gridx = 1;
        gbc.gridy = 3;
        p.add(text4, gbc);
        //raw material qrt 1
        gbc.gridx = 1;
        gbc.gridy = 4;
        p.add(lab5, gbc);
        //raw material qrt 1
        gbc.gridx = 2;
        gbc.gridy = 4;
        p.add(text5, gbc);
        //raw material qrt 8
        gbc.gridx = 1;
        gbc.gridy = 5;
        p.add(lab6, gbc);
        //raw material qrt 8
        gbc.gridx = 2;
        gbc.gridy = 5;
        p.add(text6, gbc);
        //work in progress qrt 1
        gbc.gridx = 0;
        gbc.gridy = 6;
        p.add(lab7, gbc);
        //work in progress qrt 1
        gbc.gridx = 1;
        gbc.gridy = 6;
        p.add(text7, gbc);
        //work in progress qrt 8
        gbc.gridx = 0;
        gbc.gridy = 7;
        p.add(lab8, gbc);
        //work in progress qrt 8
        gbc.gridx = 1;
        gbc.gridy = 7;
        p.add(text8, gbc);
        //finished goods qrt 1
        gbc.gridx = 1;
        gbc.gridy = 8;
        p.add(lab9, gbc);
        //finished goods qrt 1
        gbc.gridx = 2;
        gbc.gridy = 8;
        p.add(text9, gbc);
        //finished goods qrt 8
        gbc.gridx = 1;
        gbc.gridy = 9;
        p.add(lab10, gbc);
        //finished goods qrt 8
        gbc.gridx = 2;
        gbc.gridy = 9;
        p.add(text10, gbc);
        //acct recievable qrt 1
        gbc.gridx = 0;
        gbc.gridy = 10;
        p.add(lab11, gbc);
        //acct recievable qrt 1
        gbc.gridx = 1;
        gbc.gridy = 10;
        p.add(text11, gbc);
        //acct recievable qrt 8
        gbc.gridx = 0;
        gbc.gridy = 11;
        p.add(lab12, gbc);
        //acct recievable qrt 8
        gbc.gridx = 1;
        gbc.gridy = 11;
        p.add(text12, gbc);
        //revenue qrt 1
        gbc.gridx = 1;
        gbc.gridy = 12;
        p.add(lab13, gbc);
        //revenue qrt 1
        gbc.gridx = 2;
        gbc.gridy = 12;
        p.add(text13, gbc);
        //revenue qrt 8
        gbc.gridx = 1;
        gbc.gridy = 13;
        p.add(lab14, gbc);
        //revenue qrt 8
        gbc.gridx = 2;
        gbc.gridy = 13;
        p.add(text14, gbc);
        //sales qrt 1
        gbc.gridx = 0;
        gbc.gridy = 14;
        p.add(lab15, gbc);
        //sales qrt 1
        gbc.gridx = 1;
        gbc.gridy = 14;
        p.add(text15, gbc);
        //sales qrt 8
        gbc.gridx = 0;
        gbc.gridy = 15;
        p.add(lab16, gbc);
        //sales qrt 8
        gbc.gridx = 1;
        gbc.gridy = 15;
        p.add(text16, gbc);
        //deffered revenue qrt 1
        gbc.gridx = 1;
        gbc.gridy = 16;
        p.add(lab17, gbc);
        //deferred revenue qrt 1
        gbc.gridx = 2;
        gbc.gridy = 16;
        p.add(text17, gbc);
        //deferred revenue qrt 8
        gbc.gridx = 1;
        gbc.gridy = 17;
        p.add(lab18, gbc);
        //deferred revenue qrt 8
        gbc.gridx = 2;
        gbc.gridy = 17;
        p.add(text18, gbc);
        //allowance for doubtful accts qrt 1
        gbc.gridx = 0;
        gbc.gridy = 18;
        p.add(lab19, gbc);
        //allowance for doubtful accts qrt 1
        gbc.gridx = 1;
        gbc.gridy = 18;
        p.add(text19, gbc);
        //allowance for doubltful acct qrt 8
        gbc.gridx = 0;
        gbc.gridy = 19;
        p.add(lab20, gbc);
        //allowance for doubtful acct qrt 8
        gbc.gridx = 1;
        gbc.gridy = 19;
        p.add(text20, gbc);
        //acct payable qrt 1
        gbc.gridx = 1;
        gbc.gridy = 20;
        p.add(lab21, gbc);
        //acct payable qrt 1
        gbc.gridx = 2;
        gbc.gridy = 20;
        p.add(text21, gbc);
        //acct payable qrt 8
        gbc.gridx = 1;
        gbc.gridy = 21;
        p.add(lab22, gbc);
        //acct payable qrt 8
        gbc.gridx = 2;
        gbc.gridy = 21;
        p.add(text22, gbc);
        //net income qrt 8
        gbc.gridx = 0;
        gbc.gridy = 23;
        p.add(lab23, gbc);
        //net income qrt 8
        gbc.gridx = 1;
        gbc.gridy = 23;
        p.add(text23, gbc);
        //depreciation & amortization qrt 8
        gbc.gridx = 0;
        gbc.gridy = 27;
        p.add(lab24, gbc);
        //depreciation & amortization qrt 8
        gbc.gridx = 1;
        gbc.gridy = 27;
        p.add(text24, gbc);
        //other non-cash items (optional) qrt 8
        gbc.gridx = 1;
        gbc.gridy = 29;
        p.add(lab25, gbc);
        //other non-cash items (optional) qrt 8
        gbc.gridx = 2;
        gbc.gridy = 29;
        p.add(text25, gbc);
        //avg annual amount of capitalized spending qrt 8
        gbc.gridx = 1;
        gbc.gridy = 25;
        p.add(lab26, gbc);
        //avg annual amount of capitalized spending qrt 8
        gbc.gridx = 2;
        gbc.gridy = 25;
        p.add(text26, gbc);
        //net income qrt 1
        gbc.gridx = 0;
        gbc.gridy = 22;
        p.add(lab27, gbc);
        //net income qrt 1
        gbc.gridx = 1;
        gbc.gridy = 22;
        p.add(text27, gbc);
        //depriciation & amortization qrt 1
        gbc.gridx = 0;
        gbc.gridy = 26;
        p.add(lab28, gbc);
        //depriciation & amortization qrt 1
        gbc.gridx = 1;
        gbc.gridy = 26;
        p.add(text28, gbc);
        //other non-cash items (option) qrt 1
        gbc.gridx = 1;
        gbc.gridy = 28;
        p.add(lab29, gbc);
        //other non-cash items (option) qrt 1
        gbc.gridx = 2;
        gbc.gridy = 28;
        p.add(text29, gbc);
        //average annual amount of capitalized spending qrt 1
        gbc.gridx = 1;
        gbc.gridy = 24;
        p.add(lab30, gbc);
        //average annual amount of capitalized spending qrt 1
        gbc.gridx = 2;
        gbc.gridy = 24;
        p.add(text30, gbc);
        //outstanding shares
        gbc.gridx = 2;
        gbc.gridy = 6;
        p.add(lab33, gbc);
        //outstanding shares
        gbc.gridx = 3;
        gbc.gridy = 6;
        p.add(text33, gbc);
        //current share price
        gbc.gridx = 2;
        gbc.gridy = 7;
        p.add(lab34, gbc);
        //current share price
        gbc.gridx = 3;
        gbc.gridy = 7;
        p.add(text34, gbc);
        //invested capital
        gbc.gridx = 2;
        gbc.gridy = 9;
        p.add(lab35, gbc);
        //invested capital
        gbc.gridx = 3;
        gbc.gridy = 9;
        p.add(text35, gbc);
        //after tax interest expense
        gbc.gridx = 2;
        gbc.gridy = 10;
        p.add(lab36, gbc);
        //after tax interest expense
        gbc.gridx = 3;
        gbc.gridy = 10;
        p.add(text36, gbc);
        //after tax interest income
        gbc.gridx = 2;
        gbc.gridy = 12;
        p.add(lab37, gbc);
        //after tax interest income
        gbc.gridx = 3;
        gbc.gridy = 12;
        p.add(text37, gbc);
        //capital
        gbc.gridx = 2;
        gbc.gridy = 13;
        p.add(lab38, gbc);
        //capital
        gbc.gridx = 3;
        gbc.gridy = 13;
        p.add(text38, gbc);
        //cost of capital
        gbc.gridx = 2;
        gbc.gridy = 15;
        p.add(lab39, gbc);
        //cost of capital
        gbc.gridx = 3;
        gbc.gridy = 15;
        p.add(text39, gbc);
        //required minimum return
        gbc.gridx = 2;
        gbc.gridy = 16;
        p.add(lab40, gbc);
        //required minimum return
        gbc.gridx = 3;
        gbc.gridy = 16;
        p.add(text40, gbc);
        //owner's earnings bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 18;
        p.add(ownerearnings, gbc);
        //economic value added bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 19;
        p.add(econvalueadded, gbc);
        //economic value added and market value added bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 20;
        p.add(econvalueaddedmarketvalueadded, gbc);
        //percentage change in finished goods bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 21;
        p.add(changefinishgoods, gbc);
        //deferred revenue vs daily sales outstanding bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 22;
        p.add(deferrevdailysalesout, gbc);
        //allowance for doubltful accounts to change in sales bar chart check box
        gbc.gridx = 3;
        gbc.gridy = 23;
        p.add(doubtfulsales, gbc);
        
        //Listener for button to take the user to Report
        report.addActionListener(this);
        
        //Add the button Report to GUI
        gbc.gridx = 1;
        gbc.gridy = 40;
        
        //p1.add(report);
        report.setPreferredSize(new Dimension(100,30));
        
        //start of gridbox design for Chart Pattern
        
        //enter up total volume for week 1
        cpgbc.gridx = 0;
        cpgbc.gridy = 0;
        pt.add(cplab2, cpgbc);
        //enter up total volume for week 1
        cpgbc.gridx = 1;
        cpgbc.gridy = 0;
        pt.add(cptext2, cpgbc);
        //enter down total volume for week 1
        cpgbc.gridx = 0;
        cpgbc.gridy = 1;
        pt.add(cplab3, cpgbc);
        //enter down total volume for week 1
        cpgbc.gridx = 1;
        cpgbc.gridy = 1;
        pt.add(cptext3, cpgbc);
        //enter up total volume for week 2
        cpgbc.gridx = 1;
        cpgbc.gridy = 2;
        pt.add(cplab4, cpgbc);
        //enter up total volume for week 2
        cpgbc.gridx = 2;
        cpgbc.gridy = 2;
        pt.add(cptext4, cpgbc);
        //enter down total volume for week 2
        cpgbc.gridx = 1;
        cpgbc.gridy = 3;
        pt.add(cplab5, cpgbc);
        //enter down total volume for week 2
        cpgbc.gridx = 2;
        cpgbc.gridy = 3;
        pt.add(cptext5, cpgbc);
        //enter up total volume for week 3
        cpgbc.gridx = 0;
        cpgbc.gridy = 4;
        pt.add(cplab6, cpgbc);
        //enter up total volume for week 3
        cpgbc.gridx = 1;
        cpgbc.gridy = 4;
        pt.add(cptext6, cpgbc);
        //enter down total volume for week 3
        cpgbc.gridx = 0;
        cpgbc.gridy = 5;
        pt.add(cplab7, cpgbc);
        //enter down total volume for week 3
        cpgbc.gridx = 1;
        cpgbc.gridy = 5;
        pt.add(cptext7, cpgbc);
        //enter up total volume for week 4
        cpgbc.gridx = 1;
        cpgbc.gridy = 6;
        pt.add(cplab8, cpgbc);
        //enter up total volume for week 4
        cpgbc.gridx = 2;
        cpgbc.gridy = 6;
        pt.add(cptext8, cpgbc);
        //enter down total volume for week 4
        cpgbc.gridx = 1;
        cpgbc.gridy = 7;
        pt.add(cplab9, cpgbc);
        //enter down total volume for week 4
        cpgbc.gridx = 2;
        cpgbc.gridy = 7;
        pt.add(cptext9, cpgbc);
        //enter up total volume for week 5
        cpgbc.gridx = 0;
        cpgbc.gridy = 8;
        pt.add(cplab10, cpgbc);
        //enter up total volume for week 5
        cpgbc.gridx = 1;
        cpgbc.gridy = 8;
        pt.add(cptext10, cpgbc);
        //enter down total volume for week 5
        cpgbc.gridx = 0;
        cpgbc.gridy = 9;
        pt.add(cplab11, cpgbc);
        //enter down total volume for week 5
        cpgbc.gridx = 1;
        cpgbc.gridy = 9;
        pt.add(cptext11, cpgbc);
        //enter up total volume for week 6
        cpgbc.gridx = 1;
        cpgbc.gridy = 10;
        pt.add(cplab12, cpgbc);
        //enter up total volume for week 6
        cpgbc.gridx = 2;
        cpgbc.gridy = 10;
        pt.add(cptext12, cpgbc);
        //enter down total volume for week 6
        cpgbc.gridx = 1;
        cpgbc.gridy = 11;
        pt.add(cplab13, cpgbc);
        //enter down total volume for week 6
        cpgbc.gridx = 2;
        cpgbc.gridy = 11;
        pt.add(cptext13, cpgbc);
        //enter up total volume for week 7
        cpgbc.gridx = 0;
        cpgbc.gridy = 12;
        pt.add(cplab14, cpgbc);
        //enter up total volume for week 7
        cpgbc.gridx = 1;
        cpgbc.gridy = 12;
        pt.add(cptext14, cpgbc);
        //enter down total volume for week 7
        cpgbc.gridx = 0;
        cpgbc.gridy = 13;
        pt.add(cplab15, cpgbc);
        //enter down total volume for week 7
        cpgbc.gridx = 1;
        cpgbc.gridy = 13;
        pt.add(cptext15, cpgbc);
        //enter amount of shares shorted
        cpgbc.gridx = 1;
        cpgbc.gridy = 14;
        pt.add(cplab16, cpgbc);
        //enter amount of shares shorted
        cpgbc.gridx = 2;
        cpgbc.gridy = 14;
        pt.add(cptext16, cpgbc);
        //enter stocks float amount
        cpgbc.gridx = 1;
        cpgbc.gridy = 15;
        pt.add(cplab17, cpgbc);
        //enter stocks float amount
        cpgbc.gridx = 2;
        cpgbc.gridy = 15;
        pt.add(cptext17, cpgbc);
        //enter stocks average
        cpgbc.gridx = 0;
        cpgbc.gridy = 16;
        pt.add(cplab18, cpgbc);
        //enter stocks average
        cpgbc.gridx = 1;
        cpgbc.gridy = 16;
        pt.add(cptext18, cpgbc);
        //daily shares volume traded
        cpgbc.gridx = 0;
        cpgbc.gridy = 17;
        pt.add(cplab19, cpgbc);
        //daily shares volume traded
        cpgbc.gridx = 1;
        cpgbc.gridy = 17;
        pt.add(cptext19, cpgbc);
        //stock's annual dividend payout label
        cpgbc.gridx = 1;
        cpgbc.gridy = 18;
        pt.add(stockdivpayl, cpgbc);
        //stock's annual dividend payout text
        cpgbc.gridx = 2;
        cpgbc.gridy = 18;
        pt.add(stockdivpay, cpgbc);
        //current share price label
        cpgbc.gridx = 1;
        cpgbc.gridy = 19;
        pt.add(sharepricel,cpgbc);
        //current share price text
        cpgbc.gridx = 2;
        cpgbc.gridy = 19;
        pt.add(shareprice, cpgbc);
        //cashflow label
        cpgbc.gridx = 0;
        cpgbc.gridy = 20;
        pt.add(cashflowl, cpgbc);
        //cashflow text
        cpgbc.gridx = 1;
        cpgbc.gridy = 20;
        pt.add(cashflow, cpgbc);
        //EBITDA Label
        cpgbc.gridx = 0;
        cpgbc.gridy = 21;
        pt.add(ebitdal, cpgbc);
        //EBITDA Text
        cpgbc.gridx = 1;
        cpgbc.gridy = 21;
        pt.add(ebitda, cpgbc);
        //Lease Payment Label
        cpgbc.gridx = 1;
        cpgbc.gridy = 22;
        pt.add(leasepayl, cpgbc);
        //Lease Payment
        cpgbc.gridx = 2;
        cpgbc.gridy = 22;
        pt.add(leasepay, cpgbc);
        //Interest Expense Label
        cpgbc.gridx = 1;
        cpgbc.gridy = 23;
        pt.add(inexpensel, cpgbc);
        //Interest Expense
        cpgbc.gridx = 2;
        cpgbc.gridy = 23;
        pt.add(inexpense, cpgbc);
        //Principal Label
        cpgbc.gridx = 0;
        cpgbc.gridy = 24;
        pt.add(principall, cpgbc);
        //Principal Text
        cpgbc.gridx = 1;
        cpgbc.gridy = 24;
        pt.add(principal, cpgbc);
        //Tax Rate Label
        cpgbc.gridx = 0;
        cpgbc.gridy = 25;
        pt.add(taxratel, cpgbc);
        //Tax Rate Text
        cpgbc.gridx = 1;
        cpgbc.gridy = 25;
        pt.add(taxrate, cpgbc);
        
        
        
        //company name label for Volume Report
        cpgbc.gridx = 2;
        cpgbc.gridy = 0;
        pt.add(compNameCP, cpgbc);
        //company name text for Volume Report
        cpgbc.gridx = 3;
        cpgbc.gridy = 0;
        pt.add(compName2CP, cpgbc);
        //company address label for Volume Report
        cpgbc.gridx = 2;
        cpgbc.gridy = 1;
        pt.add(compAddCP, cpgbc);
        //company address text for Volume Report
        cpgbc.gridx = 3;
        cpgbc.gridy = 1;
        pt.add(compAdd2CP, cpgbc);
        //company phone label for Volume Report
        cpgbc.gridx = 2;
        cpgbc.gridy = 2;
        pt.add(compPhoneCP, cpgbc);
        //company phone text for Volume Report
        cpgbc.gridx = 3;
        cpgbc.gridy = 2;
        pt.add(compPhone2CP, cpgbc);
        //company email address label for Volume Report
        cpgbc.gridx = 2;
        cpgbc.gridy = 3;
        pt.add(compEmailCP, cpgbc);
        //company email address text for Volume Report
        cpgbc.gridx = 3;
        cpgbc.gridy = 3;
        pt.add(compEmail2CP, cpgbc);
        //net income label pattern analysis
        cpgbc.gridx = 2;
        cpgbc.gridy = 5;
        pt.add(cplabnet8, cpgbc);
        //net income text pattern analysis
        cpgbc.gridx = 3;
        cpgbc.gridy = 5;
        pt.add(cptextnet8, cpgbc);
        //current shareprice label pattern analysis
        cpgbc.gridx = 2;
        cpgbc.gridy = 6;
        pt.add(cplabshprice, cpgbc);
        //current shareprice text pattern analysis
        cpgbc.gridx = 3;
        cpgbc.gridy = 6;
        pt.add(cptextshprice, cpgbc);
        //dividend value quatrter 8 label
        cpgbc.gridx = 2;
        cpgbc.gridy = 8;
        pt.add(divvalueQ8l, cpgbc);
        //dividend value quarter 8 text box
        cpgbc.gridx = 3;
        cpgbc.gridy = 8;
        pt.add(divvalueQ8, cpgbc);
        //trailing 12 month per share earnings label
        cpgbc.gridx = 2;
        cpgbc.gridy = 9;
        pt.add(trailpershareearnsl, cpgbc);
        //trailing 12 month per share earnings text box
        cpgbc.gridx = 3;
        cpgbc.gridy = 9;
        pt.add(trailpershareearns, cpgbc);
        //full year earning estimate label
        cpgbc.gridx = 2;
        cpgbc.gridy = 11;
        pt.add(fullyrearnestl, cpgbc);
        //full year earning estimate text box
        cpgbc.gridx = 3;
        cpgbc.gridy = 11;
        pt.add(fullyrearnest, cpgbc);
        //volume graph checkbox
        cpgbc.gridx = 3;
        cpgbc.gridy = 13;
        pt.add(cpvg, cpgbc);
        //cash dividend cover ratio
        cpgbc.gridx = 3;
        cpgbc.gridy = 14;
        pt.add(cpcashdivcover, cpgbc);
        //trailing to forward payout ratio checkbox
        cpgbc.gridx = 3;
        cpgbc.gridy = 15;
        pt.add(tfpayoutratio, cpgbc);
        
        
        
        
        //Listener for button to take user to Volume Report
        volreport.addActionListener(this);
        
        save.addActionListener(this);
        print.addActionListener(this);
        volprint.addActionListener(this);
        clear.addActionListener(this);
        
        
        report1.setPreferredSize(new Dimension(100, 30));
        
        
        //end of gridbox design for Chart Pattern
        
        //Adds the ActionListener to print button
    print.addActionListener(new ActionListener() {
        //Overrides actionPerformed method for print button
        @Override
        public void actionPerformed(ActionEvent e) {
            //Adds header and footer to Company Analysis Printed Report
            MessageFormat header = new MessageFormat("Stock Audit Report");
            MessageFormat footer = new MessageFormat("Stock Audit Report");
            try {
                //Calls printer method for JTextArea
                reptext.print(header, footer);
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
           }
    });
    
    volprint.addActionListener(new ActionListener() {
        //Overrides actionPerformed method for print button
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Adds header and footer to Volume Analysis Report When Printed
            MessageFormat volheader = new MessageFormat("Pattern Audit Report");
            MessageFormat volfooter = new MessageFormat("Pattern Audit Report");
            try {
                //Calls printer method for JTextArea
                repvoltext.print(volheader, volfooter);
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
           }
    });
    
    clear.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
       
        text1.setText("");   text4.setText(""); text22.setText("");
        text2.setText("");   text5.setText(""); text23.setText("");
        text3.setText("");   text7.setText(""); text24.setText("");
        text6.setText("");   text8.setText(""); text25.setText("");
        text9.setText("");  text10.setText(""); text26.setText("");
        text11.setText(""); text12.setText(""); text27.setText("");
        text13.setText(""); text14.setText(""); text28.setText("");
        text15.setText(""); text16.setText(""); text29.setText("");
        text17.setText(""); text18.setText(""); text30.setText("");
        text19.setText(""); text20.setText(""); text33.setText("");
        text21.setText(""); text34.setText(""); text35.setText("");
        text36.setText(""); text37.setText(""); text38.setText("");
        text39.setText(""); text40.setText(""); cptext2.setText("");
        cptext3.setText("");    cptext4.setText("");    cptext5.setText("");
        cptext6.setText("");    cptext7.setText("");    cptext8.setText("");
        cptext9.setText("");    cptext10.setText("");   cptext11.setText("");
        cptext12.setText("");   cptext13.setText("");   cptext14.setText("");
        cptext15.setText("");   cptext16.setText("");   cptext17.setText("");
        cptext18.setText("");   cptext19.setText("");
        stockdivpay.setText("");
        shareprice.setText(""); cashflow.setText("");   ebitda.setText("");
        inexpense.setText("");  principal.setText("");  leasepay.setText("");
        taxrate.setText("");    compName2.setText("");  compAdd2.setText("");
        compPhone2.setText(""); compEmail2.setText(""); compName2.setText("");
        compPhone2CP.setText("");   compAdd2CP.setText(""); compEmail2CP.setText("");
        reptext.setText(""); repvoltext.setText("");    cptextnet8.setText("");
        cptextshprice.setText("");  cpvg.setSelected(false); 
        cpcashdivcover.setSelected(false);
        compName2CP.setText("");
        //textfield.setText(null); //or use this
    }
});
    
    save.addActionListener(new ActionListener() {
       
       @Override
         public void actionPerformed(ActionEvent arg0) {
            saveAs();
         }

   });
        //ToolTipManager to control when the ToolTip will appear and
       //how long the ToolTip will stay on the screen
        ToolTipManager.sharedInstance().setInitialDelay(0);
        ToolTipManager.sharedInstance().setDismissDelay(3000);
        
        //ToolTip for Revenu quarter 1
        lab13.setToolTipText("<html>Total amount of money received by the <br/>"
                + "company for goods or services provided during quarter 1.<br/>"
                + "Revenu is found on the Income Statement.</html>)");
        lab14.setToolTipText("<html>Total amount of money received by the <br/>"
                + "company for goods or services provided during quarter 8.<br/>"
                + "Revenu is found on the Income Statement.</html>)");
        //ToolTip for Accounts Payable quarter 1
        lab21.setToolTipText("<html>Money owed by a business to suppliers<br/>"
                + "for quarter 1."
                + "This is shown as a liability on the<br/>"
                + " company's Balance Sheet.</html>");
        //ToolTip for Accounts Payable quarter 8
        lab22.setToolTipText("<html>Money owed by a business to suppliers<br/>"
                + "for quarter 8."
                + "This is shown as a liability on the<br/>"
                + " company's Balance Sheet.</html>");
        //ToolTip for Other-Non Cash Items quarter 1
        lab29.setToolTipText("<html>Depreciation and amortization are two <br/>"
                + "most common examples of Non-Cash Items. It is a feature<br/>"
                + "of the Income Statement. This is for quarter 1.</html>");
        //ToolTip for Other-Non Cash Items quarter 8
        lab25.setToolTipText("<html>Depreciation and amortization are two <br/>"
                + "most common examples of Non-Cash Items. It is a feature<br/>"
                + "of the Income Statement. This is for quarter 8.</html>");
        //ToolTip for Outstanding Shares
        lab33.setToolTipText("<html>Stock currently held by all shareholders,<br/>"
                + "including share blocks held by institutional investors and <br/>"
                + "investors, and restricted shares owned by the company's<br/>"
                + "officers and insiders.</html>");
        //Tooltip for Current Share Price
        lab34.setToolTipText("<html>The market value or the price at which<br/>"
                + "the stock is currently being sold in the market</html>");
        //ToolTip for Invested Capital
        lab35.setToolTipText("<html>The total amount of money given to a company<br/>"
                + "by shareholders, bondholders, and all other interested parties.<br/>"
                + "Determined by adding total debt and lease obligations to amount <br/>"
                + "of equity in firm and then subtrading the non-operating cash and <br/>"
                + "investments. This will NOT be listed on financial statements.</html>");
        //ToolTip for After Tax Interest Expense
        lab36.setToolTipText("<html>The Interest Payable for any type of borrowing such<br/>"
                + "as bonds, loans, convertile debt or lines of credit. <br/>"
                + "This should be a line item on a company's balance sheet.<br/>"
                + "If it is payed it will appear as a 'Curren Asset', if it is<br/>"
                + "not payed, it will appear in the 'Current Liability'</html>");
        //ToolTip for After Tax Interest Income
        lab37.setToolTipText("<html>The amount of money that an individual or <br/>"
                + "company has left over after all federal, state, and withholding<br/>"
                + "taxes have been deducted from taxable income. This is found on <br/>"
                + "an Income Sheet.</html>");
        //ToolTimp for Capital Assests
        lab38.setToolTipText("<html>Factories, machinery, and/or equipment owned<br/>"
                + "by a business and used in production to generate wealth<br/>"
                + "through investment. This is found on the Balance Sheet.</html>");
        //ToolTip for Cost of Capital
        lab39.setToolTipText("<html>The cost of funds used for financing a business. <br/>"
                + "Cost of capital depends on the mode of financing used – it refers to<br/>"
                + " the cost of equity if the business is financed by equity,<br/>"
                + " or to the cost of debt, if it is financed through loans or bonds.</html>");
        //ToolTip for Required Minimum Return
        lab40.setToolTipText("<html>The minimum required annual percentage earned by an <br/>"
                + "investment.</html> ");
        //ToolTip for Volume Up
        cplab2.setToolTipText("<html>If stock closes at a price higher than the <br/>"
                + "previous day's closing price, all of the volume of stock traded that<br/>"
                + "day is counted as Volume Up. This is tracked for 7 days<br/>"
                + "and 7 weeks.</html>");
        //ToolTip for Volume Down
        cplab3.setToolTipText("<html>If stock closes at a price lower than the <br/>"
                + "previous day's closing price, all of the volume of stock traded that<br/>"
                + "day is counted as Volume Down. This is tracked for 7 days<br/>"
                + "and 7 weeks</html>");
        //ToolTip for Stock Average Audit Tab
        lab18.setToolTipText("<html>Add together the value of stock at the end of quarter 1<br/>"
                + "and the end of quarter 8. Then divid the sum by two</html>");
        //ToolTip for Stock Average Chart Patern/Volume Tab
        cplab18.setToolTipText("<html>Add together the value of stock at the end of quarter 1<br/>"
                + "and the end of quarter 8. Then divid the sum by two</html>");
        //ToolTip for Daily Share Volume Traded in Audit Tab
        lab19.setToolTipText("<html>The average amount of individual <br/>"
                + "securityes traded in a day</html>");
        //ToolTip for Daily Share Volume Traded in Chart Patern/volume Tab
        cplab19.setToolTipText("<html>The average amount of individual <br/>"
                + "securityes traded in a day</html>");
        //ToolTip for EBITDA
        ebitdal.setToolTipText("<html>Earnings Before Interest,Taxes,Depreciation<br/>"
                + "and Amortization can be used <br/>"
                + "to analyze and compare the profitability of companies and industries<br/>"
                + "by eliminating the effects of financing and accounting discretions.</html>");
        //ToolTip for Debt Principal
        principal.setToolTipText("<html>The amount a company borrowed or part of the <br/>"
                + "amount borrowed, which remains unpaid excluding interest.</html>");
        //ToolTip for Tax Rate
        taxrate.setToolTipText("<html>The percentage at which an individual or <br/>"
                + "corporation is taxed on corporations earning. Found on the <br/>"
                + "Income Statement</html>");
        //ToolTip for Shares Shorted Audit Tab
        lab16.setToolTipText("<html>The amount of stock that was sold, which the"
                + "<br/>seller doesn't own, but has promised to deliver. You borrow<br/>"
                + "the stock and then sell the stock to a buyer, then repay the person that <br/>"
                + "borrowed you the stock back for the stock.</html>");
        //ToolTip for Shares Shorted Chart Patern/Volume Tab
        cplab16.setToolTipText("<html>The amount of stock that was sold, which the"
                + "<br/>seller doesn't own, but has promised to deliver. You borrow<br/>"
                + "the stock and then sell the stock to a buyer, then repay the person that <br/>"
                + "borrowed you the stock back for the stock.</html>");
        //ToolTip for Stock's Float Amount Audit Tab
        lab17.setToolTipText("<html>The amount of shares available for trading.<br/>"
                + "This is calculated by subtracting closely held shares and restricted <br/>"
                + "stock from a firm's total outstanding shares.</html>");
        //ToolTip for Stock's Float Amount Chart Patern/Volume
        cplab17.setToolTipText("<html>The amount of shares available for trading.<br/>"
                + "This is calculated by subtracting closely held shares and restricted <br/>"
                + "stock from a firm's total outstanding shares.</html>");
        //ToolTip for Annaul Dividend Payout
        stockdivpay.setToolTipText("<html>The amount of cash that a company sends <br/>"
                + "to its shareholders, per year, in the form of dividends.</html>");
        //ToolTip for Share Price Audit Tab
        shareprice.setToolTipText("<html>The price at which a security is presently<br/>"
                + "traded.");
        //ToolTip for Share Price Chart Patern/volume Tab
        cplabshprice.setToolTipText("<html>The price at whcih a security is presently<br/>"
                + "traded.");
        //ToolTip for Lease Payment
        leasepay.setToolTipText("<html>The lease rate multiplied by the number of <br/>"
                + "payment periods. This is found under long-term debt on the balance<br/>"
                + "sheet</html>");
        //ToolTip for Interest Expense
        inexpense.setToolTipText("<html>This is an non-operating expense shown on the <br/>"
                + "Income Statement. Represents interest payable on any type of <br/>"
                + "borrowings such as bonds, loans, convertible debt or lines of <br/>"
                + "credit.</html>");
        //ToolTip for Economic Value Added Barchart
        econvalueadded.setToolTipText("<html>This chart measures the financial<br/>"
                + "performance based on residual wealth, which is calculated<br/>"
                + "by deducting cost of capital from operating profit</html>");
        //ToolTip for Economic Value Added to Market Value Added Barchart
        econvalueaddedmarketvalueadded.setToolTipText("<html>This chart shows the<br/>"
                + "difference between current market value of a company and the capital<br/>"
                + "contributed by investors. If positive, the company has added value.<br/>"
                + "If negative the company has decreased value</html>");
        //ToolTip for Days Deferred Rev to Daily Sales Outstanding Barchart
        deferrevdailysalesout.setToolTipText("<html>This chart shows the calculation used<br/>"
                + "by a company to estimate its average collection period. It shows how <br/>"
                + "well a companies accounts receivables are being managed.</html>");
        //ToolTip for Volume Comparison Barchart
        cpvg.setToolTipText("<html>This chart compares the total amount of Up Volume<br/>"
                + "to the total amount of Down Volume, within a seven week period</html>");
        //ToolTip for Cash Dividend Cover Barchat
        cpcashdivcover.setToolTipText("<html>This chart indicates the capacity<br/>"
                + "of an organization to pay dividends out of profits</html>");
        //ToolTip for Cost of Good Sold Quarter 1
        lab3.setToolTipText("<html>Costs that go into the production of the<br/>"
                + "products sold by the company in quarter 1, including cost of materials,<br/>"
                + "labor, and excluding indirect expenses, like distribution cost<br/>"
                + "and sales force costs. This can be found on the Income Statement.</html>");
        //ToolTip for Cost of Good Sold Quarter 1
        lab4.setToolTipText("<html>Costs that go into the production of the<br/>"
                + "products sold by the company in quarter 8, including cost of materials,<br/>"
                + "labor, and excluding indirect expenses, like distribution cost<br/>"
                + "and sales force costs. This can be found on the Income Statement.</html>");
        //ToolTip for Work-In Progress Quarter 1
        lab7.setToolTipText("<html>This is the total value of the materials and labor<br/>"
                + "for unfinished products, in quarter 1. Work-In Progress can be <br/>"
                + "found on the Balance Sheet.</html>");
        //ToolTip for Work-In Progress Quarter 8
        lab8.setToolTipText("<html>This is the total value of the materials and labor<br/>"
                + "for unfinished products, in quarter 8. Work-In Progress can be <br/>"
                + "found on the Balance Sheet.</html>");
        //ToolTip for Accounts Recievable Quarter 1
        lab11.setToolTipText("<html>This is the amount of money owed by customers<br/>"
                + "for goods or services that have been delivered or used, but<br/>"
                + "have not yet paid for during quarter 1<br/>. "
                + "It can be found on Balance Sheet.</html>");
        //ToolTip for Accounts Recievable Quarter 8
        lab12.setToolTipText("<html>This is the amount of money owed by customers<br/>"
                + "for goods or services that have been delivered or used, but<br/>"
                + "have not yet paid for during quarter 8<br/>. "
                + "It can be found on Balance Sheet.</html>");
        //ToolTip for Net Sales Recieved in Quarter 1
        lab15.setToolTipText("<html>This is the amount a company receives from the<br/>"
                + "sale of its products, after deducting discounts, returns of<br/>"
                + "products by customers and damaged, missing, or stolen products<br/>"
                + "during quarter 1. Net Sales provides the most accurate calculation<br/>"
                + "of what a company has received or expects to receive in revenue<br/>"
                + "from sales. It can be found on the Income Statement.</html>");
        //ToolTip for Net Sales Recieved in Quarter 8
        lab16.setToolTipText("<html>This is the amount a company receives from the<br/>"
                + "sale of its products, after deducting discounts, returns of<br/>"
                + "products by customers and damaged, missing, or stolen products<br/>"
                + "during quarter 8. Net Sales provides the most accurate calculation<br/>"
                + "of what a company has received or expects to receive in revenue<br/>"
                + "from sales. It can be found on the Income Statement.</html>");
        //ToolTip for Allowance for Doubtful Account Quarter 1
        lab19.setToolTipText("<html>This is a contra-asset account that records the portion<br/>"
                + "of a company's receivables, which it expects may not be collected, durring"
                + "quarter 1,<br/>"
                + "an estimate of the amount of Accounts Receivable, which are expected to not<br/>"
                + "be paid. It is found on the Balance Sheet.</html>");
        //ToolTip for Allowance for Doubtful Account Quarter 8
        lab20.setToolTipText("<html>This is a contra-asset account that records the portion<br/>"
                + "of a company's receivables, which it expects may not be collected, durring"
                + "quarter 8,<br/>"
                + "an estimate of the amount of Accounts Receivable, which are expected to not<br/>"
                + "be paid. It is found on the Balance Sheet.</html>");
        //ToolTip for Net Income Quarter 1
        lab27.setToolTipText("<html>This is the total earnings, reflecting revenues adjusted for<br/>"
                + "cost of doing business, depreciation, interest, taxes and other expenses<br/>"
                + "in quarter 1. It can be found on the Income Statement.</html>");
        //ToolTip for Net Income Quarter 8
        lab23.setToolTipText("<html>This is the total earnings, reflecting revenues adjusted for<br/>"
                + "cost of doing business, depreciation, interest, taxes and other expenses<br/>"
                + "in quarter 8. It can be found on the Income Statement.</html>");
        //ToolTip for Net Income Quarter 8 on Chart Patern/Volume Tab
        cplabnet8.setToolTipText("<html>This is the total earnings, reflecting revenues adjusted for<br/>"
                + "cost of doing business, depreciation, interest, taxes and other expenses<br/>"
                + "in quarter 8. It can be found on the Income Statement.</html>");
        //ToolTip for Depreciation and Amortization in Quarter 1
        lab28.setToolTipText("<html>Amortization is the spreading out of capital expenses for intangible<br/>"
                + "assests over a specific period of time. Matches asset expense with revenue it generates,<br/>"
                + "during quarter 1. Depreciation is the spreading out of capital expenses for tangible<br/>"
                + "assests for quarter 1. Both can be found on the Income Statement.</html>");
        //ToolTip for Depreciation and Amortization in Quarter 8
        lab24.setToolTipText("<html>Amortization is the spreading out of capital expenses for intangible<br/>"
                + "assests over a specific period of time. Matches asset expense with revenue it generates,<br/>"
                + "during quarter 8. Depreciation is the spreading out of capital expenses for tangible<br/>"
                + "assests for quarter 8. Both can be found on the Income Statement.</html>");
        //ToolTip for Inventory in Quarter 1
        lab1.setToolTipText("<html>This is the raw materials, work-in progress and completed finished goods<br/>"
                + "that are considered to be ready for sale, in quarter 1. This can be found on the Balance"
                + "Sheet.");
        //ToolTip for Inventory in Quarter 8
        lab2.setToolTipText("<html>This is the raw materials, work-in progress and completed finished goods<br/>"
                + "that are considered to be ready for sale, in quarter 8. This can be found on the Balance"
                + "Sheet.");
        //ToolTip for Raw Material in Quarter 1
        lab5.setToolTipText("<html>This is the material or substances used in the primary production<br/>"
                + "of manufacturing of a product in quarter 1. They are often referred to as commodities."
                + "It can be found on the Balance Sheet.</html>");
        //ToolTip for Raw Material in Quarter 8
        lab6.setToolTipText("<html>This is the material or substances used in the primary production<br/>"
                + "of manufacturing of a product in quarter 8. They are often referred to as commodities."
                + "It can be found on the Balance Sheet.</html>");
        //ToolTip for Finished Goods in Quarter 1
        lab9.setToolTipText("<html>This is materials or products which have received the final increments<br/>"
                + "of value through manufacturing or processing, which are being held in inventory<br/>"
                + "for delivery, sale, or use, in quarter 1. It can be found on the Balance Sheet.</html>");
        //ToolTip for Finished Goods in Quarter 8
        lab10.setToolTipText("<html>This is materials or products which have received the final increments<br/>"
                + "of value through manufacturing or processing, which are being held in inventory<br/>"
                + "for delivery, sale, or use, in quarter 8. It can be found on the Balance Sheet.</html>");
        //ToolTip for Revenue in Quarter 1
        lab13.setToolTipText("<html>The income that a company receives from its normal business<br/>"
                + "activities, usually from the sale of goods and services in quarter 1. It can be<br/>"
                + "found in the Income Statement.</html>");
        //ToolTip for Revenue in Quarter 8
        lab14.setToolTipText("<html>The income that a company receives from its normal business<br/>"
                + "activities, usually from the sale of goods and services in quarter 8. It can be<br/>"
                + "found in the Income Statement.</html>");
        //ToolTip for Deferred Revenue in Quarter 1
        lab17.setToolTipText("<html>This is money received for goods or services which have not been<br/>"
                + "delivered in quarter 1. It is recorded as a liability until delivery is made, then it is converted<br/>"
                + "into revenue. It can be found on the Balance Sheet.</html>");
        //ToolTip for Deferred Revenue in Quarter 8
        lab18.setToolTipText("<html>This is money received for goods or services which have not been<br/>"
                + "delivered in quarter 8. It is recorded as a liability until delivery is made, then it is converted<br/>"
                + "into revenue. It can be found on the Balance Sheet.</html>");
        //ToolTip for Capitalized Costs Quarter 1
        lab30.setToolTipText("<html>This is when capitalized costes are not expensed in the quarter 1,<br/>"
                + "when they occured, but are recognized over a period of time via depreciation or <br/>"
                + "amortization. These are found on the Balance Sheet.</html>");
        //ToolTip for Capitalized Costs Quarter 8
        lab26.setToolTipText("<html>This is when capitalized costes are not expensed in the quarter 8,<br/>"
                + "when they occured, but are recognized over a period of time via depreciation or <br/>"
                + "amortization. These are found on the Balance Sheet.</html>");
        //ToolTip for Dividend Per Share
        divvalueQ8l.setToolTipText("<html>The total amount of money that a company is paying<br/>"
                + "shareholders as dividends per share, in quarter 8.</html>");
        //ToolTip for Trailing 12 Month Earnings Per Share
        trailpershareearnsl.setToolTipText("<html>The sum of a company's earnings per share for<br/>"
                + "the previous 12 months.</html>");
        //ToolTip for Full Years Earnings Estimate
        fullyrearnestl.setToolTipText("<html>An estimate for a company's future annual earnings.<br/>"
                + "Future earnings estimates are arguably the most important input when valuing a company.</html>");
        //ToolTip for Owner's Earnings Bar Chart
        ownerearnings.setToolTipText("<html>A chart comparing reported earnings and depreciation,<br/>"
                + "depletion, amortization, and certain other non-cash charges plus the average annual<br/>"
                + "amount of capitalized expenditures for plant and equipment.</html>");
        //ToolTip for Change In Finished Goods Bar Chart
        changefinishgoods.setToolTipText("<html>This chart shows the changes in Finished Goods between<br/>"
                + "quater 1 to 8.");
        //ToolTip for Days Deferred Revenue to Daily Sales Outstanding
        deferrevdailysalesout.setToolTipText("<html>This chart compares Days Deferred Revenue, which<br/>"
                + "is payments in advance for unearned revenue and Daily Sales Outstanding, which<br/>"
                + "is how long it takes to collect money owed from the company's customers.</html>");
        //ToolTip for Allowance for Doubtful Accouts to Change In Sales Bar Chart
        doubtfulsales.setToolTipText("<html>This chart compares the amount of account receivables that<br/>"
                + "will be written off as doubtful accounts to the change in sales.</html>");
        //ToolTip for Cashflow
        cashflowl.setToolTipText("<html>This is the amount in the cashflow account<br/>"
                + "from financing, operations, investing, donations, or gifts. It can be "
                + "<br/>found on the Cashflow Statement.</html>");
        //ToolTip for Debt Principal
        principall.setToolTipText("<html>This is the amount a company barrowed, or part<br/>"
                + "of the amount borrowed, which remains unpaid, excluding interest. The principal<br/>"
                + " payment is a reduction of a liability, such as Notes Payable or Loans Payable, <br/>"
                + "which is reported on the balance sheet. The principal payment will also be reported<br/>"
                + " as a cash outflow on the Cash Flows Statement.</html>");
        //Tooltip for Tax Rate
        taxratel.setToolTipText("<html>This is the percentage at which an individual or corporation is taxed<br/>"
                + "on corporations earnings. It can be found on the Income Statement.</html>");
        //Tooltip for Annaul Dividend Payout
        stockdivpayl.setToolTipText("<html>This is the amount of cash that a company pays to its shareholders<br/>"
                + "in the form of a dividend.");
        //ToolTip for Share Price
        shareprice.setToolTipText("<html>The price at which a security is presently<br/>"
                + "traded.");
        //ToolTip for Lease Payment
        leasepay.setToolTipText("<html>This is the lease rate multiplied by the number<br/>"
                + "of payment periods. It is found under long-term debt on the Balance Sheet.</html>");
        //ToolTip for Interest Expense
        inexpense.setToolTipText("<html>This is non-operating expense shown on the Income Statement.<br/>"
                + "It represents interest payable on any type of borrowings, such as bonds, loans, <br/>"
                + "convertible debt or lines of credit.</html>");
        //ToolTip for Trailing to Forward Payout Ratios Bar Chart
        tfpayoutratio.setToolTipText("<html>This chart compares the Trailing Dividend Payout Ratio<br/>"
                + "and the Forward dividend Payout Ratios.</html>");
           
    }
   
   
   //gets the content text file
   public void getFile(){  
        try {
            File file = new File("\\Users\\shaun smith\\Documents\\"
                    + "NetBeansProjects\\BehindNumbers\\src\\Resources\\ContextFile.txt");
            String path = file.getAbsolutePath();
            //File path = new File("ContextFile.txt");
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            cplab1.read(br,null);
            br.close();
            cplab1.requestFocus();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   }
   @Override 
   public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(report)) {
            
            int count1 = 0;
            
            try {
                
                
                if("".equals(text1.getText())){
                    
                    
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Inventory field");
                    //generates the error dialog message
                   
                    text1.requestFocusInWindow();
                    
                }
                
                else if("".equals(text2.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Inventory field");
                    //generates the error dialog message
                    text2.requestFocusInWindow();
                }
                
                else if("".equals(text3.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Cost of Goods Sold field");
                    //generates the error dialog message
                    text3.requestFocusInWindow();
                }
                
                else if("".equals(text4.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Cost of Goods Sold field");
                    //generates the error dialog message
                    text4.requestFocusInWindow();
                }
                
                else if("".equals(text5.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Raw Material field");
                    //generates the error dialog message
                    text5.requestFocusInWindow();
                }
                
                else if("".equals(text6.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Raw Material field");
                    //generates the error dialog message
                    text6.requestFocusInWindow();
                }
                
                else if("".equals(text7.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Work in Progress field");
                    //generates the error dialog message
                    text7.requestFocusInWindow();
                }
                
                else if("".equals(text8.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Work in Progress field");
                    //generates the error dialog message
                    text8.requestFocusInWindow();
                }
                
                else if("".equals(text9.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Finished Goods field");
                    //generates the error dialog message
                    text9.requestFocusInWindow();
                }
                
                else if("".equals(text10.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Finished Goods field");
                    //generates the error dialog message
                    text10.requestFocusInWindow();
                }
                
                else if("".equals(text11.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Accounts Recievable field");
                    //generates the error dialog message
                    text11.requestFocusInWindow();
                }
                
                else if("".equals(text12.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Accounts Recievable field");
                    //generates the error dialog message
                }
                
                else if("".equals(text13.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Revenue field");
                    //generates the error dialog message
                    text13.requestFocusInWindow();
                }
                
                else if("".equals(text14.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Revenue field");
                    //generates the error dialog message
                    text14.requestFocusInWindow();
                }
                
                else if("".equals(text15.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Sales field");
                    //generates the error dialog message
                    text15.requestFocusInWindow();
                }
                
                else if("".equals(text16.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Sales field");
                    //generates the error dialog message
                    text16.requestFocusInWindow();
                }
                
                else if("".equals(text17.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Deffered Revenue field");
                    //generates the error dialog message
                    text17.requestFocusInWindow();
                }
                
                else if("".equals(text18.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Deffered Revenue field");
                    //generates the error dialog message
                    text18.requestFocusInWindow();
                }
                
                
                else if("".equals(text21.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 1 Accounts Payable field");
                    //generates the error dialog message
                    text21.requestFocusInWindow();
                }
                
                
                else if("".equals(text22.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "into the Quarter 8 Accounts Payable field");
                    //generates the error dialog message
                    text22.requestFocusInWindow();
                }
                
                
                else if("".equals(compName2.getText())){
                    JOptionPane.showMessageDialog(compName2,"Please enter a company"
                            + "name into the Company Name field");
                    //generates the error dialog message
                    compName2.requestFocusInWindow();
                }
                
                
                else if("".equals(text19.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Allowance for Doubtful Accounts "
                            + "Quarter 1 field");
                    //generates the error dialog message
                    text19.requestFocusInWindow();
                }
                
                
               else if("".equals(text20.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Allowance for Doubtful Accounts "
                            + "Quarter 8 field");
                    //generates the error dialog message
                    text20.requestFocusInWindow();
                }
                
                
               else if("".equals(text23.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Net Income "
                            + "Quarter 8 field");
                    //generates the error dialog message
                    text23.requestFocusInWindow();
                }
                
                
               else if("".equals(text24.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Depreciation Amortization "
                            + "Quarter 8 field");
                    text24.requestFocusInWindow();
                }
                
                
               else if("".equals(text26.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount in Average annual "
                            + "amount of capitalized spending on plant, "
            + "machinery, equipment (and presumably research and development)Quarter 8 field");
                    //generates the error dialog message
                    text26.requestFocusInWindow();
                }
                
                
               else if("".equals(text27.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Net Income "
                            + "Quarter 1 field");
                    //generates the error dialog message
                    text27.requestFocusInWindow();
                }
                
                
               else if("".equals(text28.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount"
                            + "in the Depreciation Amortization "
                            + "Quarter 1 field");
                    //generates the error dialog message
                    text28.requestFocusInWindow();
                }
                
                
               else if("".equals(text30.getText())){
                   JOptionPane.showMessageDialog(this,"Please enter an amount in Average annual "
                            + "amount of capitalized spending on plant, "
            + "machinery, equipment (and presumably research and development)Quarter 1 field");
                    //generates the error dialog message
                   text30.requestFocusInWindow();
                }
                
                
               else if("".equals(text40.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter an amount in the Required Minimum"
                            + "Return field");
                    //generates the error dialog message
                    text40.requestFocusInWindow();
                }
                
               else if(!"".equals(text34.getText())) {
                    Double shareprice = Double.parseDouble(text34.getText());
                }
                
                  //SwingUtilities.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                //new Report().setVisible(true);
            //}
        //});
     
     //gets company name from company name field
     
      //pulls deferred revenue from text field Quarter 1
    Double txt17 = Double.parseDouble(text17.getText());
    //pulls deferred revenue from text field Quarter 8
    Double txt18 = Double.parseDouble(text18.getText());
    //pulls account recievables from text field Quarter 1
    Double txt11 = Double.parseDouble(text11.getText());
    //pulls account recievables from text field Quarter 8
    Double txt12 = Double.parseDouble(text12.getText());
    //pulls revenue from text field Quarter 1
    Double txt13 = Double.parseDouble(text13.getText());
    //pulls revenue from text field Quarter 8
    Double txt14 = Double.parseDouble(text14.getText());
    //pulls inventory from text field Quarter 1
    Double txt1 = Double.parseDouble(text1.getText());
    //pulls inventory from text field Quarter 8
    Double txt2 = Double.parseDouble(text2.getText());
    //pulls cost of goods sold from text field Quarter 1
    Double txt3 = Double.parseDouble(text3.getText());
    //pulls cost of goods sold from text field Quarter 8
    Double txt4 = Double.parseDouble(text4.getText());
    //pulls sales from text field Quarter 1
    Double txt15 = Double.parseDouble(text15.getText());
    //pulls sales from text field Quarter 8
    Double txt16 = Double.parseDouble(text16.getText());
    //pulls raw materials from text field Quarter 1
    Double txt5 = Double.parseDouble(text5.getText());
    //pulls raw materials from text field Quarter 8
    Double txt6 = Double.parseDouble(text6.getText());
    //pulls work in progress from text field Quarter 1
    Double txt7 = Double.parseDouble(text7.getText());
    //pulls work in progress from text field Quarter 8
    Double txt8 = Double.parseDouble(text8.getText());
    //pulls finished goods from text field Quarter 1
    Double txt9 = Double.parseDouble(text9.getText());
    //pulls finished goods from text field Quarter 8
    Double txt10 = Double.parseDouble(text10.getText());
    //pulls Allowance for Doubtful Accounts Quarter 1
    Double txt19 = Double.parseDouble(text19.getText());
    //pulls Allowance for Doubtful Accounts Quarter 8
    Double txt20 = Double.parseDouble(text20.getText());
    //pulls Allowance for Accounts Payable Quarter 1
    Double txt21 = Double.parseDouble(text21.getText());
    //pulls Allowance for Accounts Payable Quarter 8
    Double txt22 = Double.parseDouble(text22.getText());
    //pulls Net Income from text field Quarter 8
    Double txt23 = Double.parseDouble(text23.getText());
    //pulls Depreciation and Amortization from text field Quarter 8
    Double txt24 = Double.parseDouble(text24.getText());
    //pulls Additional Working Capital from text field Quarter 8
    Double txt25 = Double.parseDouble(text25.getText());
    //pulls amount of capitalized spending on plant, "
    //machinery, equipment (and presumably research and development) Quarter 8
    Double txt26 = Double.parseDouble(text26.getText());
    //pulls Net Income from text fiel Quarter 1
    Double txt27 = Double.parseDouble(text27.getText());
    //pulls Depreciation and Amortization from text field Quarter 1
    Double txt28 = Double.parseDouble(text28.getText());
    //pulls Additional Working Capital from text field Quarter 1
    Double txt29 = Double.parseDouble(text29.getText());
    //pulls amount of capitalized spending on plant, "
    //machinery, equipment (and presumably research and development) Quarter 1
    Double txt30 = Double.parseDouble(text30.getText());
    //pulls outstanding shares
    Double outstanshare = Double.parseDouble(text33.getText());
    //pulls current share price
    Double  curshareprice = Double.parseDouble(text34.getText());
    //pulls invested capital
    Double   investcap = Double.parseDouble(text35.getText());
    //pulls after tax interest expense
    Double   afttaxinex = Double.parseDouble(text36.getText());
    //pulls after tax interest income
    Double   afttaxinin = Double.parseDouble(text37.getText());
    //pulls capital
    Double   cap = Double.parseDouble(text38.getText());
    //pulls cost of capital
    Double   costofcap = Double.parseDouble(text39.getText());
    //pulls required minimum return
    Double   reqminret = Double.parseDouble(text40.getText());
    
    
    
    //pulls company name from text field
    String compN2 = compName2.getText();
    //pulls company address (optional) from text field
    String compAd = compAdd2.getText();
    //pulls company phone number (optional)from text field
    String compPh = compPhone2.getText();
    //pulls company email from text field
    String compEm = compEmail2.getText();
    
    //calls the ReportMethods() to calculate deferred revenue
                  //for Quarter 1 & 8
                  ReportMethods x = new ReportMethods();
                  double defRev  = x.deffRev(txt17, txt18);
                  
                  //calls the ReportMethods() to calculate change in Days in Deferred Revenue
                  ReportMethods ae = new ReportMethods();
                  double cdaysdefrev = ae.cdaysDefrev(txt11,txt12,txt13,txt14,txt17,txt18);
                  
                  //calls the ReportMethods() to calculate deferred revenue for Quarter 8
                  ReportMethods af = new ReportMethods();
                  double daysdefrev8 = af.daysDefrev8(txt14,txt18);
                  
                  
                  //calls the ReportMethods() to calculate the percentage change in
                  //Daily Sales Outstanding
                  ReportMethods k = new ReportMethods();
                  double dsoav = k.daysSalOutAvg(txt11,txt12,txt13,txt14);
                  
                  //calls the ReportMethods() to calculate the percentage change in
                  //Daily Sales Inventory
                  ReportMethods o = new ReportMethods();
                  double dsiav = o.daysSalInvAvg(txt1,txt2,txt3,txt4);
                  
                  //calls the ReportMethods() to calculate the percentage change in
                  //Sales
                  ReportMethods p = new ReportMethods();
                  double salav = p.salesAvg(txt15, txt16 );
                  
                  //calls the ReportMethods() to calculate the percentage change in
                  //Daily Sales Inventory for Raw Materials
                  ReportMethods ss = new ReportMethods();
                  double rawmatavg = ss.rawmatAvg(txt5,txt6,txt3,txt4);
                      
                  //calls the ReportMethods() to calculate the percentage change in
                  //Daily Sales Inventory for Work In Progress
                  ReportMethods v = new ReportMethods();
                  double workinprogavg = v.workInProgAvg(txt7,txt8,txt3,txt4);
                  
                  //calls the ReportMethods() to calculate the percentage change in
                  //Daily Sales Inventory for Finished Goods
                  ReportMethods aa = new ReportMethods();
                  double finishgoodsavg = aa.finishGoodsAvg(txt10,txt4,txt9,txt3);
                  
                  //calls the ReportMethods() to calculate Inventory Days
                  ReportMethods ab = new ReportMethods();
                  double invday = ab.invDays(txt3,txt4,txt1,txt2);
                  
                  //calls the ReportMethods() to calculate Receivables Days
                  ReportMethods ac = new ReportMethods();
                  double recday = ac.recdays(txt13,txt14,txt11,txt12);
                  
                  //calls the ReportMethods() to calculate Allowance for Doubtful
                  //Accounts
                  ReportMethods ad = new ReportMethods();
                  double allowdoubtful = ad.allowDoubtful(txt19,txt20,txt11,txt12);
                  //calls the ReportMethods() to calculate Days Payables Outstanding
                  //Average
                  ReportMethods ag = new ReportMethods();
                  double dayspayoutavg = ag.dayspayOutavg(txt3,txt4,txt21,txt22);
                  //calls the ReportMethods() to calculate Cash Conversion Cycle
                  ReportMethods n = new ReportMethods();
                  double cashconcycle = n.cashconCycle(dayspayoutavg, dsoav, dsiav);
                  //calls the ReportMethods() to calculate Owner's Earnings
                  ReportMethods rp = new ReportMethods();
                  double ownerearn8 = rp.ownerEarnings8(txt23, txt24, txt25, txt26);
                  //calls the ReportMethods() to calculate Owner's Earnings
                  ReportMethods rl = new ReportMethods();
                  double ownerearn1 = rl.ownerEarnings1(txt27, txt28, txt29, txt30);
                  //calls the ReportMethods() to calculate the Market Value Added
                  ReportMethods rm = new ReportMethods();
                  double mva = rm.markValAve(outstanshare, curshareprice,investcap);
                  //calls the ReportMethods() to calculate the Economic Value Added
                  ReportMethods mr = new ReportMethods();
                  double eva = mr.econValAdd(txt23, afttaxinex, afttaxinin, cap, costofcap,
                          reqminret);
                  
                  //clears the old text before printing report
                  reptext.setText("");
                  reptext.setText("");
                  //prints report title
                  reptext.append("Stock Audit Report");
                  //printes the company name
                  reptext.append(compN2+newline);
                  //prints the company address
              reptext.append(compAd+newline);
              //prints the company email address
               reptext.append(compEm+newline);
               //prints the company phone number
               reptext.append(compPh+newline);
               //prints a boarder
               reptext.append("***********************************"
                       + "***********************\n\n");
               
               //tests for Deffered Revenue
               if(defRev < 0) {
                   
                   //constraint to two desimal points
                   BigDecimal defRevNum = new BigDecimal(defRev);
                   defRevNum = defRevNum.setScale(2,RoundingMode.DOWN);
                
            reptext.append("The decrease in Deferred Revenue "+ defRevNum+"% means demand for the companies products are"
                    + " decreasing or the company is recognizing invoices as revenue before they ship the product to the customer.\n"
                    + " Weight = 10\n\n");
           
                    count1 = count1 + 10;
            
            }
          else {
                   
                   //constraint to two desimal points
                   BigDecimal defRevNum = new BigDecimal(defRev);
                   defRevNum = defRevNum.setScale(2,RoundingMode.DOWN);
                   
            reptext.append("The increase in Deferred Revenue means "+defRevNum+"% demand for the companies products are\n"
                    + " increasing or the companany is invoicing their customers affectivly as products are shipped.\n"
                    + " Weight = 20\n\n");
                    
                    count1 = count1 + 20;
            
        }       //tests for positive or negative percentage of change in Daily Sales Outstanding
               if (dsoav > 0) {
                   
                   //constraint to two desimal points
                   BigDecimal dsoavNum = new BigDecimal(dsoav);
                   dsoavNum = dsoavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The percentage of change in the Daily Sales Outstanding is "+ dsoavNum+". "
                           + "This shows an increase and may indicate that payment terms are becoming less "
                           + "conservative, which could be due to looser payment terms. This could be a negative "
                           + "sign of more aggressive revenue recognition. \nWeight = 10\n\n");
                   
                           count1 = count1 + 10;
               }
               
               else {
                   
                   //constraint to two desimal points
                   BigDecimal dsoavNum = new BigDecimal(dsoav);
                   dsoavNum = dsoavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The percentage of change in the Daily Sales Outstanding is " + dsoavNum+". "
                           + "This shows a decrease in and may indicate that payment terms are becoming more "
                           + "conservative, which could be due to tighter payment terms. This can be a positive "
                           + "sign of less aggressive revenue recognition.\n Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
               
               if (txt16 <= dsiav) {
                   
                   //constraint to two desimal points
                   BigDecimal dsiavNum = new BigDecimal(dsiav);
                   dsiavNum = dsiavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("There is an increase in Daily Sales in Inventory of "+dsiavNum+" this "
                           + "could be seen as a negative, because there is not an equal or greater increase "
                           + "in percentage of sales "+txt16+" during the same time period of time. \nWeight = 15\n\n");
                   
                           count1 = count1 + 10;
               }
               else {
                   
                   //constraint to two desimal points
                   BigDecimal dsiavNum = new BigDecimal(dsiav);
                   dsiavNum = dsiavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("There is a decrease in the percentage of Daily Sales in Inventory,in "
                           + "the amount of "+dsiavNum+". This is compared to the percentage increase "
                           + "in sales "+txt16+", during the same time period of time. Sales is increasing\n "
                           + "and the perceentage of "
                           + "Daily Sales in Iventory is decreasing, this could be a good sign indicating better "
                           + "management. \nWeight = 20\n\n");
                   
                   count1 = count1 + 20;
               }
               //tests if Raw Materials percentage is greater than Work In Progress and Finished Goods
               if (rawmatavg > workinprogavg && rawmatavg > finishgoodsavg ) {
                   
                   //constraint to two desimal points
                   BigDecimal rawmatavgNum = new BigDecimal(rawmatavg);
                   rawmatavgNum = rawmatavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal workinprogavgNum = new BigDecimal(workinprogavg);
                   workinprogavgNum = workinprogavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal finishgoodsavgNum = new BigDecimal(finishgoodsavg);
                   finishgoodsavgNum = finishgoodsavgNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The percentage change in Raw Materials "+rawmatavgNum+"% is "
                           + "greater than the percentage change in Work In Progress "+workinprogavgNum+" "
                           + "and Finished Goods "+finishgoodsavgNum+". This is a positive sign, which "
                           + "shows that the company probably knows business in the future will be "
                           + "increasing.\n Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
               
               else  {
                   
                   //constraint to two desimal points
                   BigDecimal rawmatavgNum = new BigDecimal(rawmatavg);
                   rawmatavgNum = rawmatavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal workinprogavgNum = new BigDecimal(workinprogavg);
                   workinprogavgNum = workinprogavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal finishgoodsavgNum = new BigDecimal(finishgoodsavg);
                   finishgoodsavgNum = finishgoodsavgNum.setScale(2,RoundingMode.DOWN);
                   
               reptext.append("The percentage change in Raw Materials "+rawmatavgNum+"% is "
                           + "less than the percentage change in Work In Progress "+workinprogavgNum+" "
                           + "and Finished Goods "+finishgoodsavgNum+". This is a negative sign, which "
                           + "shows that the company probably knows business in the future will be "
                           + "decreasing. \nWeight = 10\n\n");
               
                           count1 = count1 + 10;
           }
               if (allowdoubtful < 0) {
                   
                   //constraint to two desimal points
                   BigDecimal allowdoubtfulNum = new BigDecimal(allowdoubtful);
                   allowdoubtfulNum = allowdoubtfulNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal salavNum = new BigDecimal(salav);
                   salavNum = allowdoubtfulNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("If the percentage of Allowance for Doubltful Accounts "+ allowdoubtfulNum+" drops "
                           + "sharply relative to the companies gross Sales percentage of chang "+salavNum+" this may indicate "
                           + "an atificial increase to revenues and the company's earnings. The company "
                           + "most likely didn't record enought bad debt expence to maintain its' "
                           + "previous reserve levels, and as a result, its' lower expenses has brought "
                           + "higher operating margins and higher net income. \nWeight = 10\n\n");
                   
                           count1 = count1 + 10;
               }
               
               else {
                   
                   //constraint to two desimal points
                   BigDecimal allowdoubtfulNum = new BigDecimal(allowdoubtful);
                   allowdoubtfulNum = allowdoubtfulNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal salavNum = new BigDecimal(salav);
                   salavNum = salavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("If the percentage of Allowance for Doubltful Accounts "+ allowdoubtfulNum+" increases "
                           + "sharply relative to the companies gross Sales percentage of chang "+salavNum+" this may indicate "
                           + "a need to audit the company's earnings a little closer.\n Weight = 5\n\n");
                   
                           count1 = count1 + 5;
               }
               
               if (cdaysdefrev < 0) {
                   
                   //constraint to two desimal points
                   BigDecimal daysdefrev8Num = new BigDecimal(daysdefrev8);
                   daysdefrev8Num = daysdefrev8Num.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal cdaysdefrevNum = new BigDecimal(cdaysdefrev);
                   cdaysdefrevNum = cdaysdefrevNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The Days in Deferred Revenue from Quarter 8 is "+daysdefrev8Num+" and the change in Days"
                           + "in Deferred Revenue relative to the Daily Sales Outstanding is equal to "+cdaysdefrevNum+", which "
                           + "shows a decline. When the change shows a decline, the company is generating less Deferred "
                           + "Revenue relative to the terms it is offering for its' customers. This may generate revenue "
                           + "upfront, but it is only borrowing revenue from the future, which will cause an inevitable decline."
                           + " \nWeight = 10\n\n");
                   
                           count1 = count1 + 10;
               }
               else {
                   
                   //constraint to two desimal points
                   BigDecimal daysdefrev8Num = new BigDecimal(daysdefrev8);
                   daysdefrev8Num = daysdefrev8Num.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal cdaysdefrevNum = new BigDecimal(cdaysdefrev);
                   cdaysdefrevNum = cdaysdefrevNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The Days in Deferred Revenue from Quarter 8 is "+daysdefrev8Num+" and the change in Days "
                           + "in Deferred Revenue relative to the Daily Sales Outstanding is "+cdaysdefrevNum+", which "
                           + "shows an increase. When the cahnge shows a increase, the company is generating more deferred "
                           + "revenue relative to the terms it is offering its' customers. This is a positive sign, "
                           + "which will cause an increase in revenue in the future.\n Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
               //test to see if the Finished Goods Percentage of Change is greater than the percentage of change
               //in Sales, Raw Materials, and Work In Progress
               if (finishgoodsavg > salav && salav >rawmatavg && salav > workinprogavg) {
                   
                   //constraint to two desimal points
                   BigDecimal rawmatavgNum = new BigDecimal(rawmatavg);
                   rawmatavgNum = rawmatavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal workinprogavgNum = new BigDecimal(workinprogavg);
                   workinprogavgNum = workinprogavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal finishgoodsavgNum = new BigDecimal(finishgoodsavg);
                   finishgoodsavgNum = finishgoodsavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal salavNum = new BigDecimal(salav);
                   salavNum = salavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The percentage change in Finished Goods "+finishgoodsavgNum+" % is greater "
                           + "than the percentage change in Sales "+salavNum+"%. The percentage increase in "
                           + "Sales is greater than the percentage increase in Raw Materials "+rawmatavgNum+"%, and "
                           + "the percentage increase in Work In Progress"+workinprogavgNum+"%. This is a "
                           + "negative sign, which could lead to inventory write-downs, poor earnings, "
                           + "lower cash flow, and a decline in stock price. \nWeight = 10\n\n");
                   
                           count1 = count1 + 10;
               }
               else {
                   
                   //constraint to two desimal points
                   BigDecimal rawmatavgNum = new BigDecimal(rawmatavg);
                   rawmatavgNum = rawmatavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal workinprogavgNum = new BigDecimal(workinprogavg);
                   workinprogavgNum = workinprogavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal finishgoodsavgNum = new BigDecimal(finishgoodsavg);
                   finishgoodsavgNum = finishgoodsavgNum.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal salavNum = new BigDecimal(salav);
                   salavNum = salavNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The percentage change in Finished Goods "+finishgoodsavgNum+"% is less "
                           + "than the percentage change in Sales "+salavNum+"%. The percentage increase in "
                           + "Sales is greater than the percentage increase in Raw Materials"+rawmatavgNum+"%, and "
                           + "the percentage increase in Work In Progress "+workinprogavgNum+"%. This could be considered "
                           + "as a positive sign, showing the good management of inventory and sales promotion.\n "
                           + " Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
               
               //constraint to two desimal points
                   BigDecimal dayspayoutavgNum = new BigDecimal(dayspayoutavg);
                   dayspayoutavgNum = dayspayoutavgNum.setScale(2,RoundingMode.DOWN);
               
               reptext.append("A company's average payable period,Days Payable Outstanding(DPO), tells how long it takes a company to "
                       + "pay its invoices from trade creditors, such as suppliers. DPO is typically looked at either quarterly or "
                       + "yearly. The Days Payable Outstanding average is "+dayspayoutavgNum+". Most company's DPO is about 30, this means "
                       + "that it takes them a month to pay their vendors. DPO can vary by industry, and a company can compare its "
                       + "DPO to the industry average to see if it is paying its vendors too quickly or too slowly.\n\n");
               
               //constraint to two desimal points
               if (cashconcycle > 0) {
                   BigDecimal cashconcycleNum = new BigDecimal(cashconcycle);
                   cashconcycleNum = cashconcycleNum.setScale(2,RoundingMode.DOWN);
               
               reptext.append("Cash Conversion Cycle is a metric that expresses the length of time in days, that it takes for a company to convert "
                       + "resource inputs into cash flows. The Cash Conversion Cycle attempts to measure the amount of time "
                       + "each net input dollar is tied up in the production and sales process before it is converted into cash"
                       + " through sales to customers. In other words it measures how long a firm will be deprived"
                       + " of cash if it increases its investment in resources in order to expand customer sales. In other words, it is "
                       + "a measure of the liquidity risk entailed by growth. However, shortening this cycle can create a "
                       + "negative cycle by collecting from customers before they pay suppliers, which is not always sustainable. "
                      +"This companies Cash Conversion "
                       + "Cycle equals "+cashconcycleNum+"\n Weight = 20\n\n");
               
                       count1 = count1 + 20;
               }
               if (cashconcycle < 0) {
                   
                   BigDecimal cashconcycleNum = new BigDecimal(cashconcycle);
                   cashconcycleNum = cashconcycleNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The companies Cash Conversion Cycle "+cashconcycleNum+" is negative which carries a risk.\n"
                           + "Weight = 5\n\n");
                   
                   count1 = count1 + 5;
               }
               
               //constraint to two desimal points
                   BigDecimal ownerearn1Num = new BigDecimal(ownerearn1);
                   ownerearn1Num = ownerearn1Num.setScale(2,RoundingMode.DOWN);
                   
                   //constraint to two desimal points
                   BigDecimal ownerearn8Num = new BigDecimal(ownerearn8);
                   ownerearn8Num = ownerearn1Num.setScale(2,RoundingMode.DOWN);
               
               //Showing the companies Owner's Earnings for Quarter 1 & 8
               reptext.append("The Owner's Earning formula calculation should ideally show that a company would "
                       + "appear to be as well positioned or better positioned than past examples of growth in "
                       + "that industry. What you don't want, is to think that a growing "
                       + "company can produce as much free cash flow as a mature company or that a mature "
                       + "company can grow as fast as a young company. You need to be realistic in the way "
                       + "you look at a company's cash flow needs and opportunities for growth\n.This company's "
                       + "Quarter 1 Owner's Earnings are equal to "+ownerearn1Num+" and it's Quarter 8 Owner's Earnings are equal to "+ownerearn8Num+"\n\n");
               

               //tests for Market Value Added and prints out the results
               if (mva > 0) {
                   
                   //constraint to two desimal points
                   BigDecimal mvaNum = new BigDecimal(mva);
                   mvaNum = mvaNum.setScale(2,RoundingMode.DOWN);
                   
                   
                   reptext.append("The result of the Market Value Added calculation "+mvaNum+" is a "
                           + "positive value indicates that the company has created wealth for its' shareholders.\n"
                           + "Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
               
               else {
                   
                   BigDecimal mvaNum = new BigDecimal(mva);
                   mvaNum = mvaNum.setScale(2,RoundingMode.DOWN);
                   
                   
                   reptext.append("The result of the Market Value Added calculation "+mvaNum+" is "
                           + "a negative value indicates the value of management actions and investments are less than the "
                           + "value of capital contributed to the company by the capital market.\n Weight = 10\n\n");
                   
                           count1 = count1 + 10;
               }
               
               //economic value added test
               if (eva >= reqminret) {
                   
                   BigDecimal evaNum = new BigDecimal(eva);
                   evaNum = evaNum.setScale(2,RoundingMode.DOWN);
                   
                   reptext.append("The Economic Value Added (EVA) formula was devised by Stern Stewart & Co.. The formula attemps to capture the true economic "
                           + "profit of a company.  It does this by looking at the return on net assets and the net operating "
                           + "profit after taxes.  This companies EVA is eaual to "+evaNum+". This amount is equal or above the required "
                           + "minimum return so it is positive.\n Weight = 20\n\n");
                   
                           count1 = count1 + 20;
               }
                   else {
                   
                   BigDecimal evaNum = new BigDecimal(eva);
                   evaNum = evaNum.setScale(2,RoundingMode.DOWN);
                   
                           reptext.append("The Economic Value Added (EVA) formula was devised by Stern Stewart & Co.. The formula attemps to capture the true economic "
                           + "profit of a company.  It does this by looking at the return on net assets and the net operating "
                           + "profit after taxes.  This companies EVA is equal to "+evaNum+". This amount is below the required "
                           + "minimum return so it is negative.\n Weight = 10\n\n");
                           
                                count1 = count1 + 10;
                           }
               
               //tests owner's earnings
               if (ownerearn1 > ownerearn8) {
                 
                   reptext.append("This companies Owner's Earnings,Quarter 1 is equal to "+ownerearn1Num+" vs.Quarter 8's"
                           + "Owner's Earnings "+ownerearn8+
                           " show they are decreasing, which means the value of the "
                           + "company is decreasing.\n Weight = 10\n\n");
                   
                           count1 = count1 + 10;
                           
               }
                   else {
                           reptext.append("This company's Owner's Earnings,Quarter 1 is equal to "+ownerearn1Num+" vs.Quarter 8's "
                                   + "Owner's Earnings "+ownerearn8+" "
                                   + "show they are increasing, which means the valueof the company is increasing.\n Weight = 20\n\n");
                           
                                   count1 = count1 + 20;
                                   
                           }
               
               //Calls the totalRating method and passes the total for count1
                  totalRating(count1);
                  
                //Owner's Earnings Q1 vs. Q8 Bar Chart
        if(ownerearnings.isSelected()) {
        
        try {
            
                 final String series1 = "Owner's Earnings Quarter 1";
        final String series2 = "Owner's Earnings Quarter 8";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(ownerearn1, series1, category1);
        
        dataset.addValue(ownerearn8, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Owner Earnings Comparison",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setSize(10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
               
               //Economic Value Added Bar Chart
        if(econvalueadded.isSelected()) {
        
        try {
            
                 final String series1 = "Economic Value Added";
        final String series2 = "Required Min Return";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(eva, series1, category1);
        
        dataset.addValue(reqminret, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Economic Value Added Ration",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setBounds(60,60,10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        
        //Economic Value Added vs Market Value Added Bar Chart
        
        if(econvalueaddedmarketvalueadded.isSelected()) {
        
        try {
            
                 final String series1 = "Economic Value Added";
        final String series2 = "Market Value Added";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(eva, series1, category1);
        
        dataset.addValue(mva, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Economic Value Added and Market Value Added Comparison",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setBounds(80,80,10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        
        //Economic Value Added vs Market Value Added Bar Chart
        
        if(changefinishgoods.isSelected()) {
        
        try {
            
                 final String series1 = "Finished Goods";
        final String series2 = "Raw Materals";
        final String series3 = "Work In Progress";
        final String series4 = "Sales";
        

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(finishgoodsavg, series1, category1);
        
        dataset.addValue(rawmatavg, series2, category1);
        
        dataset.addValue(workinprogavg, series3, category1);
        
       dataset.addValue(salav, series4, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Percentage Change In Finished Goods",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.GREEN, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp3 = new GradientPaint(
            0.0f, 0.0f, Color.pink, 
            0.0f, 0.0f, Color.lightGray
        );
        
        
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);
        renderer.setSeriesPaint(3, gp3);
        

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setBounds(85,85,10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        if(deferrevdailysalesout.isSelected()) {
        
        try {
            
                 final String series1 = "Days Defered Revenue";
        final String series2 = "Deferred Rev Relative Daily Sales Outstanding";
        
        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(daysdefrev8, series1, category1);
        
        dataset.addValue(cdaysdefrev, series2, category1);
        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Days Deferred Rev To Defer Rev Relative Daily Sales Outstanding", // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        
        
        
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        
        

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setBounds(85,85,10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        
        if(doubtfulsales.isSelected()) {
        
        try {
            
                 final String series1 = "Allowance For Doubtful Accounts";
        final String series2 = "Change In Sales";
        
        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(allowdoubtful, series1, category1);
        
        dataset.addValue(salav, series2, category1);
        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Allowance For Doubtful Accounts to Change In Sales", // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        
        
        
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        
        

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setBounds(85,85,10,10);
                 frame.setVisible(true);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
            //catches any errors not caught by if statements
            } catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
            
            
            
        }
        //if statement for volume report menu selection
    if (evt.getSource().equals(volreport)) {
        
        int count = 0;
            
            try {
    //start of testing if statements for Chart Pattern JTextFields
                
                if("".equals(compName2CP.getText())){
                    JOptionPane.showMessageDialog(compName2CP,"Please enter a company"
                            + "name into the Company Name field");
                    //generates the error dialog message
                    compName2CP.requestFocusInWindow();
                    
                }
                
                else if (cptext2.getText().isEmpty()){
                   JOptionPane.showMessageDialog(cptext2,"Please enter a number "
                            + "for the up total volume for week 1");
                    //checks if a number was entered into the Cost of Goods Sold
                    //field
                   cptext2.requestFocusInWindow();
                }
                
                
                else if ("".equals(cptext3.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for the down total volume for week 1");
                    //generates the error dialog message
                    cptext3.requestFocusInWindow();
                }
                
                else if("".equals(cptext4.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for the up total volume for week 2");
                    //generates the error dialog message
                    cptext4.requestFocusInWindow();
                }
                
                else if("".equals(cptext5.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 2");
                    //generates the error dialog message
                    cptext5.requestFocusInWindow();
                }
                
                else if("".equals(cptext6.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for up total volume for week 3");
                    //generates the error dialog message
                    cptext6.requestFocusInWindow();
                }
                
                else if("".equals(cptext7.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 3");
                    //generates the error dialog message
                    cptext7.requestFocusInWindow();
                }
                
                else if("".equals(cptext8.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for up total volume for week 4");
                    //generates the error dialog message
                    cptext8.requestFocusInWindow();
                }
                
                else if("".equals(cptext9.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 4");
                    //generates the error dialog message
                    cptext9.requestFocusInWindow();
                }
                
                else if("".equals(cptext10.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for up total volume for week 5");
                    //generates the error dialog message
                    cptext10.requestFocusInWindow();
                }
                
                else if("".equals(cptext11.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 5");
                    //generates the error dialog message
                    cptext11.requestFocusInWindow();
                }
                
                else if("".equals(cptext12.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for up total volume for week 6");
                    //generates the error dialog message
                    cptext12.requestFocusInWindow();
                }
                
                else if("".equals(cptext13.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 6");
                    //generates the error dialog message
                    cptext13.requestFocusInWindow();
                }
                
                else if("".equals(cptext14.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for up total volume for week 7");
                    //generates the error dialog message
                    cptext14.requestFocusInWindow();
                }
                
                else if("".equals(cptext15.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter a number "
                            + "for down total volume for week 7");
                    //generates the error dialog message
                    cptext15.requestFocusInWindow();
                }
                
                else if ("".equals(cptext16.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter the number of "
                            + "for amount of Shares Shorted");
                    //generates the error dialog message
                    cptext16.requestFocusInWindow();
                }
                 
                else if ("".equals(cptext17.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter the number of "
                            + "stocks Float Amount");
                    //generates the error dialog message
                    cptext17.requestFocusInWindow();
                }
                 
                else if ("".equals(cptext18.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter the "
                            + "Stocks Average");
                    //generates the error dialog message
                    cptext18.requestFocusInWindow();
                }
                 
                else if ("".equals(cptext19.getText())){
                    JOptionPane.showMessageDialog(this,"Please enter the "
                            + "Daily Shares Volume Traded");
                    //generates the error dialog message
                    cptext19.requestFocusInWindow();
                }
                
                else if ("".equals(cptextnet8.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter "
                            + "an amount for Net Income:");
                    text23.requestFocusInWindow();
                }
                
                else if ("".equals(cptextshprice.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter "
                            + "an amount for Current Share Price:");
                    text34.requestFocusInWindow();
                }
                
                else if ("".equals(stockdivpay.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter "
                            + "an amount for Stock's Annual Dividend Payout:");
                    stockdivpay.requestFocusInWindow();
                }
                 
                else if ("".equals(cashflow.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter "
                            + "an amount for Cashflow:");
                    cashflow.requestFocusInWindow();
                }
                else if ("".equals(divvalueQ8.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter"
                            + "an amount for Dividend Value Quarter 8:");
                    divvalueQ8.requestFocusInWindow();
                }
                else if ("".equals(trailpershareearns.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter"
                            + "an amount for Trailing 12 Month Per Share"
                            + "Earnings:");
                    trailpershareearns.requestFocusInWindow();
                }
                else if ("".equals(fullyrearnest.getText())) {
                    JOptionPane.showMessageDialog(this,"Please enter"
                            + "an amount for Full Year Earning Estimate:");
                    fullyrearnest.requestFocusInWindow();
                }
            
                
                //end of testing if statements for Chart Pattern JTextFields
                
    
    //starts of getText() methods for Chart Pattern tab
    Double vol2 = Double.parseDouble(cptext2.getText());
    
    Double vol3 = Double.parseDouble(cptext3.getText());
    
    Double vol4 = Double.parseDouble(cptext4.getText());
    
    Double vol5 = Double.parseDouble(cptext5.getText());
    
    Double vol6 = Double.parseDouble(cptext6.getText());
    
    Double vol7 = Double.parseDouble(cptext7.getText());
    
    Double vol8 = Double.parseDouble(cptext8.getText());
    
    Double vol9 = Double.parseDouble(cptext9.getText());
    
    Double vol10 = Double.parseDouble(cptext10.getText());
    
    Double vol11 = Double.parseDouble(cptext11.getText());
    
    Double vol12 = Double.parseDouble(cptext12.getText());
    
    Double vol13 = Double.parseDouble(cptext13.getText());
    
    Double vol14 = Double.parseDouble(cptext14.getText());
    
    Double vol15 = Double.parseDouble(cptext15.getText());
    
    Double vol16 = Double.parseDouble(cptext16.getText());
    
    Double vol17 = Double.parseDouble(cptext17.getText());
    
    Double vol18 = Double.parseDouble(cptext18.getText());
    
    Double vol19 = Double.parseDouble(cptext19.getText());
    
    Double sharSh = Double.parseDouble(cptext16.getText());
    
    Double flo = Double.parseDouble(cptext17.getText());
    
    Double adsvt = Double.parseDouble(cptext18.getText());
    
    Double stockdivpayout = Double.parseDouble(stockdivpay.getText());
    
    Double sharprice = Double.parseDouble(cptextshprice.getText());
    
    Double netincome = Double.parseDouble(cptextnet8.getText());
    
    Double cashflowt = Double.parseDouble(cashflow.getText());
    
    Double inexpenset = Double.parseDouble(inexpense.getText());
    
    Double ebitdat = Double.parseDouble(ebitda.getText());
    
    Double leasepayt = Double.parseDouble(leasepay.getText());
    
    Double principalt = Double.parseDouble(principal.getText());
    
    Double taxratet = Double.parseDouble(taxrate.getText());
    
    Double divQ8 = Double.parseDouble(divvalueQ8.getText());
    
    Double trailpershare = Double.parseDouble(trailpershareearns.getText());
    
    Double fullyrearn = Double.parseDouble(fullyrearnest.getText());
    
    //end of getText() for Chart Pattern tab
    //pulls company name from text field
    String compN2CP = compName2CP.getText();
    //pulls company address (optional) from text field
    String compAdCP = compAdd2CP.getText();
    //pulls company phone number (optional)from text field
    String compPhCP = compPhone2CP.getText();
    //pulls company email from text field
    String compEmCP = compEmail2CP.getText();
    
    
                  ReportMethods z = new ReportMethods();
                  double volR = z.volRatio(
                         vol2,vol3, vol4, vol5, vol6, vol7, vol8, vol9, vol10,
                         vol11, vol12, vol13, vol14, vol15);
                  System.out.println("volume ="+volR);
                  //calls method in ReportMethods class to compare the amount of 
                  //shares shorted to the amount of stock floated
                  ReportMethods b = new ReportMethods();
                  double compShFlo = b.compShorFlo(sharSh, flo);
                  
                  //calls method in ReportMethods class to calculate the Short Interest
                  //devided by the Average Daily Share Volume Traded
                  ReportMethods c = new ReportMethods();
                  double compShAV = c.compShorAvgD(sharSh, adsvt);
                  
                  //calculates the Dividend Yield
                  ReportMethods f = new ReportMethods();
                  double divyield = f.divYield(sharprice, stockdivpayout);
                  
                  //calculates the time it will take to doulbe your money via
                  //dividend
                  ReportMethods h = new ReportMethods();
                  double timedoubmone = h.timedoubleMoney(divyield);
                  
                  //calculates the Earnings Test
                  ReportMethods i = new ReportMethods();
                  double earntest = i.coverageRatio(netincome, stockdivpayout);
                  
                  ReportMethods j = new ReportMethods();
                  double divcover = j.divCover(cashflowt, netincome);
                  //calculates the dedt ratio
                  ReportMethods l = new ReportMethods();
                  double princeindebt = l.princeIndebt(inexpenset,ebitdat,leasepayt,
                  principalt,taxratet);
                  //calculates total volume up
                  ReportMethods m = new ReportMethods();
                 double totalvolup = m.volumeAmountUp(vol2, vol4, vol6,vol8, vol10, vol12, vol14);
                 //calculates total volume down
                 ReportMethods n = new ReportMethods();
                 double totalvoldown = n.volumeAmountDown(vol3, vol5, vol7,  vol9, vol11, vol13, vol15);
                 
                 ReportMethods s = new ReportMethods();
                 double payoutratio = s.payoutRatio(divQ8, trailpershare);
                 
                 ReportMethods o = new ReportMethods();
                 double forwardpayoutratio = o.forwardpayoutRatio(divQ8, fullyrearn);
                 
                  //Report s = new Report();
                  //s.chartPattern(compN2CP, compAdCP, compPhCP, compEmCP, volR, compShFlo, 
                          //compShAV, divyield, timedoubmone, earntest, divcover,princeindebt);
                 
                 //clears the textarea makes sure it doesn't print the samething again
                  repvoltext.setText("");
                  repvoltext.setText("");
                  //company info
               repvoltext.append("Volumen Analysis Report\n");
               repvoltext.append(compN2CP + newline);
               repvoltext.append(compAdCP+newline);
               repvoltext.append(compPhCP+newline);
               repvoltext.append(compEmCP+newline);
               repvoltext.append("***********************************"
                       + "******************************************\n\n");
               
                  
               //tests for Shared Interest compared to Float
               if (compShFlo > 40 && compShFlo < 50) {
                   
                   //constraint to two desimal points
                   BigDecimal compShFloNum = new BigDecimal(compShFlo);
                   compShFloNum = compShFloNum.setScale(2,RoundingMode.DOWN);
               
               repvoltext.append("The Shared Interest is equal to " + compShFloNum + "% which is over 40% but under 50% so it is a good idea "
                       + "to be cautions, if you are shorting the stock, because there is a risk that good news "
                       + "will make the stock rise quickly.\n Weight = 10\n\n");
               //calls mediumDemand method for company summary
                       
                       //adds to final company rating
                       count = count + 10;
           }
               else if (compShFlo > 50) {
                   //constraint to two desimal points
                   BigDecimal compShFloNum = new BigDecimal(compShFlo);
                   compShFloNum = compShFloNum.setScale(2,RoundingMode.DOWN);
                   
                       repvoltext.append("The Shared Interest is equal to " + compShFloNum +"% which is over 50%, this means you should be "
                               + "very carful, if you are shorting the stock, because there is a greater risk that any positive news can send "
                               + "share's price up dramatically when demand exceeds supply.\n Weight = 20\n\n");
                       //call highDemand() method for company summary
                               
                               //adds to final company rating
                               count = count + 20;
                       }
                       else  {
                   //constraint to two desimal points
                   BigDecimal compShFloNum = new BigDecimal(compShFlo);
                   compShFloNum = compShFloNum.setScale(2,RoundingMode.DOWN);
                   
                            repvoltext.append("The Shared Interst is equal to " +compShFloNum+"% which is under 40%, this means there is a "
                                    + "low risk of demand exceeding supply at this time.\n Weight = 5\n\n");
                            //calls lowDemand() method for company summary
                            
                            //adds to final company rating
                            count = count + 5;
           }
               //testing Days-to-Cover ratio
               if ( compShAV > 2) {
                   
                   //constraint to two desimal points
                   BigDecimal compShAVNum = new BigDecimal(compShAV);
                   compShAVNum = compShAVNum.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("With a Days-to-Cover ratio of " +compShAVNum+"%, If a previously lagging stock "
                           + "turns very bullish, the buying action of "
                           + "short sellers can result in extra upward momentum and increased loss for short "
                           + "sellers who are slow to close out their positions. The longer the days to recover "
                           + "the more pronounced this effect can be, which could result in a sharp rise in price.\n "
                           + "Weight = 20\n\n");
                   
                   
                   //adds to count for company rating
                   count = count + 20;
               }
               else {
                   
                   //constraint to two desimal points
                   BigDecimal compShAVNum = new BigDecimal(compShAV);
                   compShAVNum = compShAVNum.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("With a Days-to-Cover ratio of "+compShAVNum+"%, it could indicate how tough it would "
                           + "be if all the short sellers were required to cover at once. If days to cover is low "
                           + "there is likley enough volume to allow short sellers to exit easily.\n Weight = 10\n\n");
                   
                   
                   //adds to count for company rating
                   count = count + 10;
               }
               
               //tests for Volume Ratio
               if (volR >= 1) {
                   
                   //constraint to two desimal points
                   BigDecimal volRNum = new BigDecimal(volR);
                   volRNum = volRNum.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The Volume Ratio is "+volRNum+ " There is more buying pressure than selling pressure, "
                           + "but a ratio that is declining from 1.5 to 1.2 will probably end up below 1.0 because "
                           + "this signal indicates intenese selling presure from larg institutions.\n Weight = 20\n\n");
                   
                   //adds to company rating
                   count = count + 20;
               }
               else  {
                   
                   //constraint to two desimal points
                   BigDecimal volRNum = new BigDecimal(volR);
                   volRNum = volRNum.setScale(2,RoundingMode.DOWN);
                   
               repvoltext.append("The Volume Ratio is eqaul to "+volRNum+". There is heavier selling than buying pressure.\n"
                       + "Weight = 10\n\n");
               
               //adds to company rating
               count = count + 10;
               }
               
               //tests for Dividend Yield
               if (divyield >= 4) {
                   
                   BigDecimal stdivyield = new BigDecimal(divyield);
                   stdivyield = stdivyield.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The companies Dividend Yield is equal to "+stdivyield+", which is higher or equal to 4%. "
                           + "This means the stock price has went lower and the yield has become larger, which is a "
                           + "positive sign.  This also protects the stock from short sellers.\n Weight = 20\n\n");
                   
                   //adds to the company rating
                   count = count + 20;
               }
               else {
                   
                   BigDecimal stdivyield = new BigDecimal(divyield);
                   stdivyield = stdivyield.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The companies Dividend Yield is equal to "+stdivyield+", which is lower then 4%. "
                           + "This means the stock price has went higher and the yield has become smaller, which is a "
                           + "negative sign. This exposes the stock to short sellers.\n Weight = 10\n\n");
                   
                   //adds to the company rating
                   count = count + 10;
               }
               
               //show how long it would take to double your money relieing only on a dividend for a return on investment
               BigDecimal stimedoubmone = new BigDecimal(timedoubmone);
                   stimedoubmone = stimedoubmone.setScale(2,RoundingMode.DOWN);
               
               repvoltext.append("It would take you "+stimedoubmone+" to double your money, if you relied only on the stock "
                       + "dividend to make a return on your money. If you reinvested your dividend, which is a good "
                       + "idea, you would double your money faster.\n\n");
               
               //calculates the Earnings Test
               if (earntest >= 2) {
                   
                   BigDecimal cearntest = new BigDecimal(earntest);
                   cearntest = cearntest.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The Earning Test or Coverage Ratio is equal to "+cearntest+", which means the companies income "
                           + "is at least twice the size of the dividend.  If there is a downturn and the "
                           + "companies income were to be cut in half, the company would still be able to afford to "
                           + "still provide a dividend.\n Weight = 20\n\n");
                   
                   //adds to company ratiing
                   count = count + 20;
                  
               }
               
               else {
                   
                   BigDecimal cearntest = new BigDecimal(earntest);
                   cearntest = cearntest.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The Earning Test or Coverage Ratio is equal to "+cearntest+", which means the companies income "
                           + "is less then twice the size of the dividend.  If there is a downturn and the "
                           + "companies income were to be cut in half, the company may not be able to afford to "
                           + "provide a dividend.\n Weight = 10\n\n");
                   
                   //adds to company rating
                   count = count + 10;
               }
                   //calculates the Dividend Cover Ratio
                   if (divcover > 1) {
                       
                       BigDecimal cashdivcover = new BigDecimal(divcover);
                   cashdivcover = cashdivcover.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("Earnings is a slave to accounting rules requiring "
                           + "them to take a lot of noncash deductions, which reduces the "
                           + "companies income through no money ever changing hands. Cash "
                           + "flow on the other hand, deals with only the amount of actual money "
                           + "that a company spends and recieves that is why the companies cash cover ratio is equal to "
                   +cashdivcover+", which shows that cashflow is bigger than net income. This means that cashflow will "
                           + "most likely be able to cover incase of a downturn.\n Weight = 20\n\n");
                   
                   //adds to the company rating
                   count = count + 20;
                   }
                   
                   else {
                       
                       BigDecimal cashdivcover = new BigDecimal(divcover);
                   cashdivcover = cashdivcover.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("Earnings is a slave to accounting rules requiring "
                           + "them to take a lot of noncash deductions, which reduces the "
                           + "companies income through no money ever changing hands. Cash "
                           + "flow on the other hand, deals with only the amount of actual money "
                           + "that a company spends and recieves that is why the companies cash cover ratio is equal to "
                   +cashdivcover+", which shows that cashflow is smaller then net income. This means that cashflow may "
                           + "not be able to cover in a downturn.\n Weight = 10\n\n");
                   
                   //adds to the company rating
                   count = count + 10;
                   
                   }
                   
                   //calculates compan's debt level
                   if (princeindebt >= 1.1) {
                       
                       BigDecimal princeindebtt = new BigDecimal(princeindebt);
                   princeindebtt = princeindebtt.setScale(2,RoundingMode.DOWN);
                       
                       repvoltext.append("The EBITDA Coverage Ratio clarifys a companys debt level by "
                               + "including EBITDA, Lease Payments, Interst Expense, Principal, and "
                               + "Tax Rate. Principal is adjusted to pre-tax basis new companies should "
                               + "look for a ratio of 1.25 and above. This company's ratio is in the target range"
                               + " "+princeindebtt+". Established companies should look "
                               + "for a ratio of 1.1 and above.\n Weight = 20\n\n");
                       
                       //adds to the company rating
                       count = count + 20;
                   }
                   else {
                       
                   BigDecimal princeindebtt = new BigDecimal(princeindebt);
                   princeindebtt = princeindebtt.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("The EBITDA Coverage ratio clarifys a companys debt level by "
                               + "including EBITDA, Lease Payments, Interst Expense, Principal, and "
                               + "Tax Rate. Principal is adjusted to pre-tax basis new companies should "
                               + "look for a ratio of 1.25 and above. This company's ratio is NOT in the target range "
                               + " "+princeindebtt+". Established companies should look"
                               + "for a ratio of 1.1 and above.\n Weight = \n\n");
                   
                   //adds to the company rating
                   count = count + 5;
                   }
                   
                   if (payoutratio < 60) {
                       
                       BigDecimal payoutratio2 = new BigDecimal(payoutratio);
                   payoutratio2 = payoutratio2.setScale(2,RoundingMode.DOWN);
                       
                       repvoltext.append("This company has a safe trailing dividend payout ratio of "+payoutratio2+"% "
                               + "The trailing dividend payout ratio takes into account the most current or "
                               + "quarter 8 dividend value and the trailing 12 month pershare earnings. \n"
                               + "Weight = 20\n\n");
                       
                       //adds to the company rating
                       count = count + 20;
                   }
                   
                   else {
                       
                       BigDecimal payoutratio3 = new BigDecimal(payoutratio);
                   payoutratio3 = payoutratio3.setScale(2,RoundingMode.DOWN);
                       
                       repvoltext.append("This company does not have a safe trailing dividend payout ratio of "
                       +payoutratio3+"% The trailing dividend payout ratio takes into account the most current or "
                               + "quarter 8 dividend value and the trailing 12 month pershare earnings.\n"
                               + "Weight = 10\n\n");
                       
                       //add to the company rating
                       count = count + 10;
                   }
                  
                   if (forwardpayoutratio < 60) {
                       
                       BigDecimal forwardpayoutratio2 = new BigDecimal(forwardpayoutratio);
                   forwardpayoutratio2 = forwardpayoutratio2.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("This company has a safe forward dividend payout ratio is equal to "+forwardpayoutratio2+"% "
                           + "The forward dividend payout ratio takes into account the most current or quarter 8 "
                           + "dividend value and the forward year earning estimate.\n Weight = 20\n\n");
                   
                   //adds to the company rating
                   count = count + 20;
                   
                   
                   }
                   
                   else {
                       
                       BigDecimal forwardpayoutratio3 = new BigDecimal(forwardpayoutratio);
                   forwardpayoutratio3 = forwardpayoutratio3.setScale(2,RoundingMode.DOWN);
                   
                   repvoltext.append("This company does not have a safe forward dividend payout ratio is equal to "+forwardpayoutratio3+"% "
                           + "The forward dividend payout ratio takes into account the most current or quarter 8 "
                           + "dividend value and the forward year earning estimate.\n Weight = 10/n/n");
                   
                   //adds to the company ratiing
                   count = count + 10;
                   
                   
                       
                   }
                   //Calls totalCount for total rating and passes count
                   totalCount(count);
                   
                    //catches any errors not caught by if statements
            } catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
    }
    
    if(cpvg.isSelected()) {
    //if (evt.getSource().equals(graph)) {
        
        try {
            
            //gets volume up and down information
        Double vol2 = Double.parseDouble(cptext2.getText());
    
        Double vol3 = Double.parseDouble(cptext3.getText());
    
        Double vol4 = Double.parseDouble(cptext4.getText());
    
        Double vol5 = Double.parseDouble(cptext5.getText());
    
        Double vol6 = Double.parseDouble(cptext6.getText());
    
        Double vol7 = Double.parseDouble(cptext7.getText());
    
        Double vol8 = Double.parseDouble(cptext8.getText());
    
        Double vol9 = Double.parseDouble(cptext9.getText());
    
        Double vol10 = Double.parseDouble(cptext10.getText());
    
        Double vol11 = Double.parseDouble(cptext11.getText());
    
        Double vol12 = Double.parseDouble(cptext12.getText());
    
        Double vol13 = Double.parseDouble(cptext13.getText());
    
        Double vol14 = Double.parseDouble(cptext14.getText());
    
        Double vol15 = Double.parseDouble(cptext15.getText());
            
            ReportMethods m = new ReportMethods();
               double totalvolup = m.volumeAmountUp(vol2, vol4, vol6,vol8, vol10, vol12, vol14);
                 //calculates total volume down
                 ReportMethods n = new ReportMethods();
                 double totalvoldown = n.volumeAmountDown(vol3, vol5, vol7,  vol9, vol11, vol13, vol15);
                 
                 
                 
                 final String series1 = "Total Volume Up";
        final String series2 = "Total Volume Down";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(totalvolup, series1, category1);
        
        dataset.addValue(totalvoldown, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Stock's Volume Ratio",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setVisible(true);
                 //sets the size and location of the ChartFrame
                 frame.setBounds(60,60,10,10);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        //cash dividend cover ratio graph
        if(cpcashdivcover.isSelected()) {
        
        try {
            
            //gets volume up and down information
        Double cashflowt = Double.parseDouble(cashflow.getText());
        Double netincome = Double.parseDouble(cptextnet8.getText());
        
            
            
                 
                 
                 
                 final String series1 = "Cash Flow";
        final String series2 = "Net Income";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(cashflowt, series1, category1);
        
        dataset.addValue(netincome, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Cash Dividend Cover Ratio",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setVisible(true);
                 frame.setSize(10,10);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
         
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
        
        //cash dividend cover ratio graph
        if(tfpayoutratio.isSelected()) {
        
        try {
            
            Double divQ8 = Double.parseDouble(divvalueQ8.getText());
    
            Double trailpershare = Double.parseDouble(trailpershareearns.getText());
    
            Double fullyrearn = Double.parseDouble(fullyrearnest.getText());
            
                 ReportMethods s = new ReportMethods();
                 double payoutratio = s.payoutRatio(divQ8, trailpershare);
                 
                 ReportMethods o = new ReportMethods();
                 double forwardpayoutratio = o.forwardpayoutRatio(divQ8, fullyrearn);
     
                 
                 final String series1 = "Trailing Payout Ratio";
        final String series2 = "Forward Payout Ratio";
        //final String series3 = "Third";

        // column keys...
        final String category1 = "";
        final String category2 = "";
        //final String category3 = "Category 3";
        //final String category4 = "Category 4";
        //final String category5 = "Category 5";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(payoutratio, series1, category1);
        
        dataset.addValue(forwardpayoutratio, series2, category1);
        

        
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Trailing Payout Ratio to Forward Payout Ratio",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.ORANGE, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.MAGENTA, 
            0.0f, 0.0f, Color.lightGray
        );
        //final GradientPaint gp2 = new GradientPaint(
           // 0.0f, 0.0f, Color.red, 
           // 0.0f, 0.0f, Color.lightGray
        //);
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        //renderer.setItemMargin(0.0);
        //renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
                 ChartFrame frame = new ChartFrame("",chart);
                 frame.setVisible(true);
                 frame.setSize(10,10);
                 frame.repaint();
                 frame.pack();
                 //((JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, frame)).pack();
                 //chartPanel.setVisible(true);
         
                 
        }catch (NumberFormatException ne) {
                System.out.println("Number parsing error " + ne.getMessage());
            }
        
    }
   }
  
    //method for highForpayout forward dividend payout ratio for company summary
    private void totalCount(int count){
        repvoltext.append("The company rating is: " +count+" out of a possible 180\n\n");
    }
    
    //method for total company rating
    private void totalRating(int count1){
        reptext.append("The company's total rating is "+count1+" out of a possible 220\n\n");
    }
   
   //Save method for save button
    public void saveAs() {
      FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text File", "txt");
      final JFileChooser saveAsFileChooser = new JFileChooser();
      saveAsFileChooser.setApproveButtonText("Save");
      saveAsFileChooser.setFileFilter(extensionFilter);
      int actionDialog = saveAsFileChooser.showOpenDialog(this);
      if (actionDialog != JFileChooser.APPROVE_OPTION) {
         return;
      }

      // !! File fileName = new File(SaveAs.getSelectedFile() + ".txt");
      File file = saveAsFileChooser.getSelectedFile();
      if (!file.getName().endsWith(".txt")) {
         file = new File(file.getAbsolutePath() + ".txt");
      }

      BufferedWriter outFile = null;
      try {
         outFile = new BufferedWriter(new FileWriter(file));

         reptext.write(outFile);

      } catch (IOException ex) {
         ex.printStackTrace();
      } finally {
         if (outFile != null) {
            try {
               outFile.close();
            } catch (IOException e) {}
         }
      }
   }
    
    
    
}
        
    


