
package lukesalesapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * date: 08/23/2017
 * @author Luke Yaegel
 */
public class LukeSalesApp extends javax.swing.JFrame {
 private final static String newline = "\n";
  
    public LukeSalesApp() {
        //Initialize Components
        initComponents();
        this.setTitle("Office Supplies Sales Tracker");
    }

    @SuppressWarnings("unchecked")
    // Initialize components method                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea("Please enter the reps info and sales numbers.\nNote: All files saved to C:\\ folder.\n\n");
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        
        jButton3.setText("Evaluate");

        //Exit on close
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Set Text for First Name label
        jLabel1.setText("First Name");
        //Set Text for Last Name label
        jLabel2.setText("Last Name");
        //Set Size of Text Area - width
        jTextArea1.setColumns(20);
        //Set Size of Text Area - height
        jTextArea1.setRows(5);
        //Make Text Area Non-Editable
        jTextArea1.setEditable(false);
        //Add Text Area object to Scroll Panel
        jScrollPane1.setViewportView(jTextArea1);
        //Set Label for Personal Info
        jLabel3.setText("Personal Info ------ ");
        //Set Label for Rep ID
        jLabel4.setText("Rep Id.");
        //Set Label for Books
        jLabel5.setText("Books");
        //Set Label for Office Supplies
        jLabel6.setText("Office Supplies");
        //Set Label for Paper
        jLabel7.setText("Paper");
        //Set Label for Sales
        jLabel8.setText("Sales ----------------");
        //Set Label for District
        jLabel9.setText("District");
        //Set Label for Contact preferences 
        jLabel10.setText("Contact ------------");
        //Set Label for Preferred contact info
        jLabel11.setText("Preferred");
        //Set text for radio button
        jRadioButton1.setText("Phone");
        //Set text for radio button
        jRadioButton2.setText("Email");
         //Set text for radio button
        jRadioButton3.setText("Visit");
         //Add choices to Choice object
        choice1.add("North");
        choice1.add("South");
        choice1.add("East");
        choice1.add("West");
        //Set text for Enter button
        jButton1.setText("Add");
        //Add Action Listeer to button
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LukeSalesApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        //Set text for Quit button
        jButton2.setText("Quit");
         //Add Action Listeer to button
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LukeSalesApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LukeSalesApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jButton4.setText("Display");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton4ActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LukeSalesApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //Layout Code Generated Using Tool
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane1)))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>                          

                                             
    //When button "Enter" is clicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {
        String salesRepID;
        String firstName;
        String lastName;
        String supplies = "SUPPLIES ";
        String totalAmountSuppliesSold;
        String books = "BOOKS ";
        String totalAmountBooksSold;
        String paper = "PAPER ";
        String totalAmountPaperSold;
        String district;
        String contactMeans;
       
        
        //Get text from field and store it in a variable 
        String text = jTextField1.getText();
        //Set firstName plus white space
        firstName = text + " ";
        
        //Get text from field and store it in a variable
        String text2 = jTextField2.getText();
        //Set lastName plus white space
        lastName = text2 + " ";
        
        //Get text from field and store it in a variable
        String text3 = jTextField3.getText();
        //Set salesRepID plus white space
        salesRepID = text3 + " ";
        
        //Get text from field and store it in a variable
        String text4 = jTextField4.getText();
        //Set totalAmountSuppliesSOld by adding category name and white space
        totalAmountSuppliesSold = supplies + text4 + " ";
        
        //Get text from field and store it in a variable
        String text5 = jTextField5.getText();
        //Set totalAmountBooksSold by adding category name and white space
        totalAmountBooksSold = books + text5 + " ";
                
        //Get text from field and store it in a variable
        String text6 = jTextField6.getText();
        //Set totalAmountPaperSold by adding category name and white space
        totalAmountPaperSold = paper + text6 + " ";
        
        //Store choice of district in choose variable 
        String choose = choice1.getItem(choice1.getSelectedIndex());
        //Set contactMeans and make it uppercase 
        district = choose.toUpperCase() + " ";
        
        
        
        //Radio Buttton Choice with condition for contactMeans
        if(jRadioButton1.isSelected()){
        contactMeans = "Phone";
        }else if(jRadioButton2.isSelected()){
        contactMeans = "Email";
        }else if(jRadioButton3.isSelected()){
        contactMeans = "Visit";
        }else{
        contactMeans = "No contact preference";
        }
        
       
        //PrintWriter to print output to a file. Reopen and append if file already exists. 
     try (PrintWriter writer = new PrintWriter( new FileOutputStream(new File("C:\\salesrep.txt"), true))) {
         writer.append(salesRepID + firstName + lastName + totalAmountSuppliesSold + totalAmountBooksSold + totalAmountPaperSold + district + contactMeans);
         writer.write(System.lineSeparator());
         writer.flush();
         writer.close();
     }
        //Print out that the file has been saved    
        jTextArea1.append("Saved. Press the 'Evaluate' button to add top sales \nreps to the stars file.\n\n");
    }                                        

    //Quit button logic
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
        //Exit the application when pushed
        System.exit(0);
    }                  
    
    //Evaluate button logic
     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {  
      
         jTextArea1.append("Finished... If rep had total sales of $8,000" + "\n");
         jTextArea1.append("or more they will be added to the stars file.\n\n"
                 + "Press 'Diplay' to show the STARS.\n\n");
//Create stars.txt to write to
     try (PrintWriter writer = new PrintWriter(new File("C:\\stars.txt"))) {
         //Open salesrep file
        File readme = new File("C:\\salesrep.txt");
         //Read in salesrep data
        Scanner scanner = new Scanner(readme);
        // List that will hold the data
        List<String> text = new <String>ArrayList();
        //Interator for the line print
        int i = 0;
       // Loop through each element
          while (scanner.hasNext()){   
              //Add each element to the List
              text.add(scanner.next());
             //If the iterator reaches 10 - calculate total from list
             //There are 11 pieces of text per line in the sales rep file.
             //We need to feed in each piece, e.g. first name, last name,etc. to the text array list.
             //This is why we iterate to 10 -> for each piece.
              if(i == 10){
                  //Parse doubles from the list
                  double a = Double.parseDouble(text.get(4));
                  double b = Double.parseDouble(text.get(6));
                  double c = Double.parseDouble(text.get(8));
                  //Add and store the totals
                  double totalSales = a + b + c;
                  //Check to see if the total is greater than or equal to 8000
                   if(totalSales >= 8000.00) {
                     
                     //String that will hold the line to be created from the list
                     String listString = "";
                     //For each element in the list add it to the listString to make one row
                     for(String s : text){
                         listString += s + " ";
                     }
                     // Write the line of data to the file
                      writer.append(listString);
                      writer.write(System.lineSeparator());
                   }
                 // Clear the list and start on the next line
                  text.clear();
                 //Set interator to zero so we can feed the next line info into the list
                  i = 0;
                  
              }else{
               //Iterate until 10
               i++;
              }
              
            }    
          //Close the writer
            writer.flush();
            writer.close();
           
         
         
     }
      
    } 
     
     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {                                         
      
         
        //Open stars file
        File readme = new File("C:\\stars.txt");
         //Read in stars data
        Scanner scanner = new Scanner(readme);
        // Collection that will hold the objects
        Collection<SalesRepresentative> Representative = new <SalesRepresentative>ArrayList();
        
       // Loop through each element
          while (scanner.hasNext()){   
              //Add each element to the List
              String salesRepID = scanner.next();
              String firstName = scanner.next();
              String lastName = scanner.next();
              String supplies = scanner.next();
              String totalAmountSuppliesSold = scanner.next();
              String books = scanner.next();
              String totalAmountBooksSold = scanner.next();
              String paper = scanner.next();
              String totalAmountPaperSold = scanner.next();
              String district = scanner.next();
              String contactMeans = scanner.next();
              //Add each object to the collection
              Representative.add(new SalesRepresentative(salesRepID, firstName, lastName, totalAmountSuppliesSold, totalAmountBooksSold, totalAmountPaperSold, district, contactMeans));
              
            } 
          //Print out header with size of collection
          jTextArea1.append("TOTAL TOP SALES REPS: " + Representative.size() + "\n" + "\n");
          
         
                     
                     //Convert each object using toString and append it to the text area
                     for(SalesRepresentative s : Representative){
                         String convertedToString = s.toString();
                          jTextArea1.append(convertedToString);
                     }
         
        
    }  

   //Main Method
    public static void main(String args[]) {
     
        //Create app and display form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LukeSalesApp().setVisible(true);
                
            }
        });
    }

    // Variables declaration                    
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;                  
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    
}
