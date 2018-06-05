/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behindnumbers;

/**
 *
 * @author shaun smith
 */
public class ReportMethods {
    
    
    ReportMethods(){
    
    }
    
    //calculates Change in Deffered Revenue
    public double deffRev( double arg17, double arg18) {
            
    return((arg18 - arg17)/arg17)*100;
    }
    
    //Change in Days in Deferred Revenue
    public double cdaysDefrev(double txt11,double txt12,double txt13,double txt14,
            double txt17,double txt18){
                        
                      double c = 0;
                      double d = 0;
                      double x = 0;
                      double y = 0;
                      double z = 0;
                      double e = 0;
                      double f = 0;
                      
                      //calculates Days in Deferred Revenue for Quaters 1
                      c = (91.25 * txt17)/txt13;
                      //calculates Days in Deferred Revenue for Quaters 8
                      d = (91.25 * txt18)/txt14;
                      //calculates Daily Salies Outstanding for Quaters 1
                      x = 91.25 * (txt11/txt13);
                      //calculates Daily Salies Outstanding for Quaters 8
                      y = 91.25 * (txt12/txt14);
                      //Subtracting Days in Deferred Revenue from Daily Sales Outstanding
                      //in Quarter 1
                      e = x - c;
                      //Subtracting Days in Deferred Revenue from Daily Sales Outstanding
                      //in Quarter 8
                      z = y - d;
                      //calculates the percentage increase or decrease in 
                      //Days in Deferred Revenue subtracted from Daily Sales Outstanding
                      f = ((z-e)/e)*100;
                      
                      //returns the percentage increase or decrease in 
                      //Days in Deferred Revenue subtracted from Daily Sales Outstanding 
                      //to variable cdaysdefrev
                      return(f);
        
    }
    //calculates Days in Deferred Revenue for Quaters 8
    public double daysDefrev8(double txt14, double txt18) {
        
                      double x = 0;
                      double z = 0;
                      
                      
                      //calculates Days in Deferred Revenue for Quaters 8
                      x = (91.25 * txt18)/txt14;
                      
                    
                      return(x);
        
    }
    //calculates the Daily Sales Outstanding Average percentage of change
    public double daysSalOutAvg(double txt11,double txt12,double txt13,
            double txt14) {
                      
        
                      double x = 0;
                      double y = 0;
                      double z = 0;
                      
                      //calculates Daily Salies Outstanding for Quaters 1
                      x = 91.25 * (txt11/txt13);
                      //calculates Daily Salies Outstanding for Quaters 8
                      y = 91.25 * (txt12/txt14);
                      
                      z = ((y - x)/x)*100;
                      
                      //returns the percentage increase or decrease in 
                      //Daily Sales Outstanding to variable dsoav
                      return(z);
                  }
    //calculates the Daily Sales Inventory Average percentage of change
    public double daysSalInvAvg(double txt1, double txt2,double txt3,double txt4) {
            
            double x = 0;
            double y = 0;
            double z = 0;
            //calculates Daily Sales Inventory for Quarter 1
            x = 91.25 * (txt1/txt3);
            //calculates Daily Sales Inventory for Quarter 8
            y = 91.25 * (txt2/txt4);
            
            z = ((y - x)/x)*100;
            //returns the percentage increase or decrease in 
            //Daily Sales Inventory to variable dsiav
            return(z);
    }
    //calls the ReportMethods() to calculate Days Payables Outstanding
   //Average
    public double dayspayOutavg(double txt3, double txt4, double txt21, double txt22) {
        
        double x = 0;
        double y = 0;
        double z = 0;
        
        x = txt21/(txt3/91);
        y = txt22/(txt4/91);
        
        z = x + y/2;
        
        return(z); 
    }
    //calls the ReportMethods() to calculate Cash Conversion Cycle
    public double cashconCycle(double dayspayoutavg,double dsoav,double dsiav) {
        
            double z = 0;
            
            z = (dsoav + dsiav) - dayspayoutavg;
            
            return(z);
        
    }
    //calls the ReportMethods() to calculate Allowance for Doubtful
   //Accounts
    public double allowDoubtful(double txt19, double txt20,double txt11,
            double txt12) {
        
            double x = 0;
            double y = 0;
            double z = 0;
            //calculates Allowance for Doubtful Accounts for Quarter 1
            x = txt19/(txt19 + txt11);
            //calculates Allowance for Doubtful Accounts for Quarter 8
            y = txt20/(txt20 + txt12);
            
            z = ((y - x)/x)*100;
            //returns the percentage increase or decrease in 
            //Allowance for Doubtful Accounts to variable allowdoubtful
            return(z);
    }
    //calculates the percentage of change for Sales
    public double salesAvg(double txt15, double txt16 ) {
        
        double x = 0;
        
        x = ((txt16 - txt15)/txt15)*100;
        //returns value to variable salav
        return(x);
    }
    //calculates Owner's Earnings for Quarter 8
    public double ownerEarnings8(double txt23, 
            double txt24, double txt25, double txt26) {
        
        double z = 0;
        
        z = (txt23 + txt24 + txt25) - txt26;
        
        return(z);
    }
    
    //calculates Owner's Earnings for Quarter 1
    public double ownerEarnings1(double txt27, 
            double txt28, double txt29, double txt30) {
        
        double z = 0;
        
        z = (txt27 + txt28 + txt29) - txt30;
        
        return(z);
    }
    
    //calculates the precentage of change for Daily Sales Inventory Raw Materials
    public double rawmatAvg(double txt5,double txt6,double txt3,double txt4) {
        
        double x = 0;
        double y = 0;
        double z =0;
        
        //calculates the Daily Sales Inventory for Raw Materials Quarter 1
        x = 91.25 * (txt5/txt3);
        //calculates the Daily Sales Inventory for Raw Materials Quarter 8
        y = 91.25 * (txt6/txt4);
        
        z = ((y - x)/x)*100;
        //returns value to variable rawmatavg
        return(z);
    }
    
    
    //calculates the precentage of change for Daily Sales in Inventory for Work
    //in Progress
    public double workInProgAvg(double txt7,double txt8,double txt3,double txt4) {
        
        double x = 0;
        double y = 0;
        double z = 0;
        
        //calculates the Daily Sales Inventory for Work In Progress Quarter 1
        x = 91.25 * (txt7/txt3);
        //calculates the Daily Sales Inventory for Work In Progress Quarter 8
        y  = 91.25 * (txt8/txt4);
        
       z = ((y - x)/x)*100;
       //returns value to variable workinprogavg
       return(z);
    }
    
    
    
    
    
    //calculates the precentage of change for Daily Sales in Inventory for Work
    //in Progress
    public double finishGoodsAvg(double txt10,double txt4,double txt9,
    double txt3) {
        
        double z = 0;
        double y = 0;
        double x = 0;
        //calculates the Daily Sales Inventory for Finished Goods Quarter 8
        y = 91.25 * (txt10/txt4);
        //calculates the Daily Sales Inventory for Finished Goods Quarter 1
        x = 91.25 * (txt9/txt3);
        //calculates the precentage of change for Daily Sales in Inventory for
        //Finished Goods
       z = ((y - x)/x)*100;
       //returns value to variable finishgoodsavg
       return(z);
    }
    //calculates Inventory Days
    public double invDays(double txt3,double txt4,double txt1,double txt2) {
        
        double x = 0;
        
        x = 365/(((txt3 + txt4)/2)/((txt1 + txt2)/2));
        
        return(x);
    }
    //calculates Recievables Days
    public double recdays(double txt13,double txt14,double txt11,double txt12) {
        
        double y = 0;
        
        y = 365/(((txt13 + txt14)/2)/((txt11 + txt12)/2));
        
        return(y);
    }
    //calculates the Volume Ratio
    public double volRatio(double vol2, double txt3, double txt4,
    double txt5, double txt6, double txt7, double txt8, double txt9, double txt10,
    double txt11, double txt12, double txt13, double txt14, double txt15) {
    
    double x = 0;
    double y = 0;
    
        x = vol2 + txt4 + txt6 + txt8 + txt10 + txt12 + txt14;
        y = txt3 + txt5 + txt7 + txt9 + txt11 + txt13 + txt15;
            
    return(x/y);
    }
    
    //calculates the comparison of the amount of Short Interest to the amount
    //of shares Floated
    public double compShorFlo(double sharSh, double flo) {
        return(sharSh/flo);
    }
    
    //calculates the comparison of amount of Shorted Shares to the Average Daily
    //Share Volume Traded
    public double compShorAvgD(double sharSh, double adsvt) {
        return(sharSh/adsvt);
    }
    //calculates and returns the Market Value Average and just calculates the 
    //Market Value
    public double markValAve(double outstanshare, double curshareprice,
            double investcap) {
        
        double mv = 0;
        double mva = 0;
        
        mv = outstanshare * curshareprice;
        
        return(mv - investcap);
        
    }
    //calculates and returns Economic Value Added 
    public double econValAdd(double txt23, double afttaxinex, double afttaxinin, 
            double cap, double costofcap, double reqminret) {
        
        double nopat = 0;
        double rona = 0;
        
        nopat = (txt23 + afttaxinex) - afttaxinin;
        rona = nopat/cap;
        
        
        return(rona - reqminret)*afttaxinin;
    }
    //calculates the stocks Dividend Yield
    public double divYield(double sharprice, double stockdivpayout) {
        
        return(stockdivpayout/sharprice);
        
    }
    //calculates the time it will take to double your money via dividend
    public double timedoubleMoney(double divyield) {
        
        return(72/divyield);
    }
    //calculates the Coverage Ratio
    public double coverageRatio(double netincome, double stockdivpayout) {
        
        return(netincome/stockdivpayout);
    }
    
    //calculates the Dividend Cover
    public double divCover(double cashflowt, double netincome) {
        
        return(cashflowt/netincome);
    }
    
    public double princeIndebt(double inexpenset,double ebitdat,double leasepayt,
                  double principalt, double taxratet) {
        
        return(ebitdat + leasepayt)/(inexpenset + leasepayt + (principalt/(1 - taxratet ))); 
    }
    
    public double volumeAmountUp(double vol2, double vol4, double vol6,
            double vol8, double vol10, double vol12, double vol14) {
        
        double a = 0;
        double b = 0;
        
        a = vol2 + vol4 + vol6 + vol8 + vol10 + vol12 + vol14;
        
        
        return(a);
    }
    
    public double volumeAmountDown(double vol3, double vol5, double vol7, double vol9, double vol11,
            double vol13, double vol15) {
        
        double b = 0;
        
        b = vol3 + vol5 + vol7 + vol9 + vol11 + vol13 + vol15;
        
        return(b);
    }
    
    public double payoutRatio(double divQ8, double trailpershare) {
        
        return(divQ8 * 4)/trailpershare;
    }
    
    public double forwardpayoutRatio(double divQ8, double fullyrearn) {
        
        return(divQ8 * 4)/fullyrearn;
    }
}  