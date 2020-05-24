/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeSystem;

import Transactions.HomePage;
import java.awt.Color;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaseminturhan
 */
public class SeatSelected extends javax.swing.JFrame {

    /**
     * Creates new form SeatSelected
     */
    public SeatSelected() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2 , size.height/2-getHeight()/2);
        
        
        
    }
    
  
    
    
     int q;
     int price;
     
     DefaultTableModel model = new DefaultTableModel();

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seating = new javax.swing.JPanel();
        seat2 = new javax.swing.JLabel();
        seat3 = new javax.swing.JLabel();
        seat5 = new javax.swing.JLabel();
        seat1 = new javax.swing.JLabel();
        seat4 = new javax.swing.JLabel();
        seat6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        teaCheck = new javax.swing.JCheckBox();
        cokeCheck = new javax.swing.JCheckBox();
        juiceCheck = new javax.swing.JCheckBox();
        filterCheck = new javax.swing.JCheckBox();
        espressoCheck = new javax.swing.JCheckBox();
        icedCheck = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        mantıCheck = new javax.swing.JCheckBox();
        kebabCheck = new javax.swing.JCheckBox();
        donerCheck = new javax.swing.JCheckBox();
        saladCheck = new javax.swing.JCheckBox();
        lambCheck = new javax.swing.JCheckBox();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        steakCheck = new javax.swing.JCheckBox();
        schnitzelCheck = new javax.swing.JCheckBox();
        burgerCheck = new javax.swing.JCheckBox();
        doubleCheck = new javax.swing.JCheckBox();
        hotdogCheck = new javax.swing.JCheckBox();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeTable = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        seatcombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        seating.setBackground(new java.awt.Color(238, 234, 234));
        seating.setPreferredSize(new java.awt.Dimension(1100, 700));
        seating.setRequestFocusEnabled(false);

        seat2.setBackground(java.awt.Color.white);
        seat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat2.setText(" ");
        seat2.setOpaque(true);
        seat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat2MouseClicked(evt);
            }
        });

        seat3.setBackground(java.awt.Color.white);
        seat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat3.setText(" ");
        seat3.setOpaque(true);
        seat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seat3MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat3MouseClicked(evt);
            }
        });

        seat5.setBackground(java.awt.Color.white);
        seat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat5.setText(" ");
        seat5.setOpaque(true);
        seat5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat5MouseClicked(evt);
            }
        });

        seat1.setBackground(java.awt.Color.white);
        seat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat1.setText(" ");
        seat1.setOpaque(true);
        seat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat1MouseClicked(evt);
            }
        });

        seat4.setBackground(java.awt.Color.white);
        seat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat4.setText(" ");
        seat4.setOpaque(true);
        seat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat4MouseClicked(evt);
            }
        });

        seat6.setBackground(java.awt.Color.white);
        seat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/eating.png"))); // NOI18N
        seat6.setText(" ");
        seat6.setOpaque(true);
        seat6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seat6MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 234, 234));

        teaCheck.setText("Tea");
        teaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaCheckActionPerformed(evt);
            }
        });

        cokeCheck.setText("Coke");

        juiceCheck.setText("Juice");

        filterCheck.setText("Filter Coffee");

        espressoCheck.setText("Espresso");

        icedCheck.setText("Iced Coffee");

        jLabel1.setBackground(new java.awt.Color(148, 121, 82));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(148, 121, 82));
        jLabel1.setText("DRINKS");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(148, 121, 82));
        jLabel2.setText("FOOD");

        mantıCheck.setText("Mantı");

        kebabCheck.setText("Kebab");

        donerCheck.setText("Döner");

        saladCheck.setText("C. Salad");

        lambCheck.setText("Lamb");

        steakCheck.setText("Steak");

        schnitzelCheck.setText("Schnitzel");

        burgerCheck.setText("C. Burger");

        doubleCheck.setText("D. Burger");

        hotdogCheck.setText("Hot Dog");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lambCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saladCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(donerCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kebabCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mantıCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(teaCheck)
                                .addGap(56, 56, 56)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cokeCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(juiceCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(espressoCheck)
                                    .addComponent(icedCheck))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filterCheck)
                                    .addComponent(steakCheck)
                                    .addComponent(schnitzelCheck)
                                    .addComponent(burgerCheck)
                                    .addComponent(doubleCheck)
                                    .addComponent(hotdogCheck))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(teaCheck))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(espressoCheck)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cokeCheck)
                                .addComponent(icedCheck))
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(juiceCheck)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filterCheck)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mantıCheck)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(steakCheck)
                                .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kebabCheck)
                            .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schnitzelCheck)
                            .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(donerCheck)
                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(burgerCheck)
                            .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saladCheck)
                            .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doubleCheck)
                            .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lambCheck))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hotdogCheck)
                                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        tableOrder.setBackground(new java.awt.Color(238, 234, 234));
        tableOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 234, 234)));
        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table", "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        addButton.setBackground(new java.awt.Color(238, 234, 234));
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeTable.setBackground(new java.awt.Color(238, 234, 234));
        removeTable.setText("REMOVE");
        removeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTableActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(238, 234, 234));
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 222, 174));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeSystem/multimedia-option.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        seatcombo.setBackground(new java.awt.Color(148, 121, 82));
        seatcombo.setForeground(new java.awt.Color(148, 121, 82));
        seatcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        seatcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatcomboActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(148, 121, 82));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(148, 121, 82));
        jLabel4.setText("TABLE");

        javax.swing.GroupLayout seatingLayout = new javax.swing.GroupLayout(seating);
        seating.setLayout(seatingLayout);
        seatingLayout.setHorizontalGroup(
            seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatingLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seat4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatcombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(seat5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatingLayout.createSequentialGroup()
                        .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatingLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seatingLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35))))
        );
        seatingLayout.setVerticalGroup(
            seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatingLayout.createSequentialGroup()
                .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(seatingLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatingLayout.createSequentialGroup()
                                .addComponent(seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(seat5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seatingLayout.createSequentialGroup()
                                .addComponent(seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(seat6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(seatingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(seatingLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(removeTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(seatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seatingLayout.createSequentialGroup()
                                .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(seat4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seating, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(seating, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
   
    private void seat6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat6MouseClicked
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 
    }//GEN-LAST:event_seat6MouseClicked

    private void seat4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat4MouseClicked
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 
    }//GEN-LAST:event_seat4MouseClicked

    private void seat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat1MouseClicked
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 
        
    }//GEN-LAST:event_seat1MouseClicked

    private void seat5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat5MouseClicked
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 
    }//GEN-LAST:event_seat5MouseClicked

    private void seat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat3MouseClicked
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 
    }//GEN-LAST:event_seat3MouseClicked

    private void seat3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seat3MousePressed

    }//GEN-LAST:event_seat3MousePressed

    private void seat2MouseClicked(java.awt.event.MouseEvent evt) {                                   
        int x = seating.getMousePosition().x;
        int y = seating.getMousePosition().y;
        Component a = seating.getComponentAt(x,y);
        Color bg = a.getBackground();
        if(bg==Color.WHITE)
        a.setBackground(Color.red);
        else
        a.setBackground(Color.WHITE);
        teaCheck.setEnabled(true);  
        cokeCheck.setEnabled(true);  
        juiceCheck.setEnabled(true);
        filterCheck.setEnabled(true); 
        espressoCheck.setEnabled(true); 
        icedCheck.setEnabled(true); 
        jSpinner1.setEnabled(true); 
        jSpinner2.setEnabled(true); 
        jSpinner3.setEnabled(true);
        jSpinner4.setEnabled(true); 
        jSpinner5.setEnabled(true); 
        jSpinner6.setEnabled(true); 
        mantıCheck.setEnabled(true); 
        kebabCheck.setEnabled(true); 
        donerCheck.setEnabled(true);
        saladCheck.setEnabled(true); 
        lambCheck.setEnabled(true); 
        jSpinner7.setEnabled(true); 
        jSpinner8.setEnabled(true); 
        jSpinner9.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true); 
        steakCheck.setEnabled(true);
        schnitzelCheck.setEnabled(true); 
        burgerCheck.setEnabled(true); 
        doubleCheck.setEnabled(true); 
        hotdogCheck.setEnabled(true); 
        jSpinner12.setEnabled(true); 
        jSpinner13.setEnabled(true);
        jSpinner14.setEnabled(true);
        jSpinner15.setEnabled(true); 
        jSpinner16.setEnabled(true);
        addButton.setEnabled(true); 
        removeTable.setEnabled(true); 

                                 

    }  
    
    Integer tableNo;

  
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
              if(teaCheck.isSelected()){
                  
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner1.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
               
                model.addRow(new Object[]{
                
                tableNo,
                teaCheck.getText(),
                q,
            });
                
              } 
              
            if(cokeCheck.isSelected()){
                
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner2.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                tableNo,
                cokeCheck.getText(),
                q,
                
             }); 
                
            }
            
             
            if(juiceCheck.isSelected() ){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner3.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                juiceCheck.getText(),
                q,
            });
                
            } 
            
            if(espressoCheck.isSelected()){
                
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner4.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                espressoCheck.getText(),
                q,
            });
                
            } 
            
            if(icedCheck.isSelected()){
                
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner5.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                icedCheck.getText(),
                q,
            });

            }
            
            if(filterCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner6.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                filterCheck.getText(),
                q,
            });

            }
            
            if(mantıCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner7.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                mantıCheck.getText(),
                q,
            });

            
            }
            if(kebabCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner8.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                kebabCheck.getText(),
                q,
            });

            }
            
            if(donerCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner9.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                donerCheck.getText(),
                q,
            });

            }
            
             if(saladCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner10.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                saladCheck.getText(),
                q,
            });

             }
             
             
            if(lambCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner11.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                lambCheck.getText(),
                q,
            });

            }
             
            if(steakCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner12.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                steakCheck.getText(),
                q,
            });

            }
            
            if(schnitzelCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner13.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                schnitzelCheck.getText(),
                q,
            });

            
            }
            if(burgerCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner14.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                burgerCheck.getText(),
                q,
            });

            }
            
            if(doubleCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner15.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                doubleCheck.getText(),
                q,
            });

            }
            
            if(hotdogCheck.isSelected()){
                tableNo = Integer.parseInt(seatcombo.getSelectedItem().toString());
                q = Integer.parseInt(jSpinner16.getValue().toString());
                model = (DefaultTableModel)tableOrder.getModel();
            
                model.addRow(new Object[]{
                
                tableNo,
                hotdogCheck.getText(),
                q,
            });

            }
            
              
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
             
    }//GEN-LAST:event_addButtonMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        teaCheck.setEnabled(false);  
        cokeCheck.setEnabled(false);  
        juiceCheck.setEnabled(false);
        filterCheck.setEnabled(false); 
        espressoCheck.setEnabled(false); 
        icedCheck.setEnabled(false); 
        jSpinner1.setEnabled(false); 
        jSpinner2.setEnabled(false); 
        jSpinner3.setEnabled(false);
        jSpinner4.setEnabled(false); 
        jSpinner5.setEnabled(false); 
        jSpinner6.setEnabled(false); 
        mantıCheck.setEnabled(false); 
        kebabCheck.setEnabled(false); 
        donerCheck.setEnabled(false);
        saladCheck.setEnabled(false); 
        lambCheck.setEnabled(false); 
        jSpinner7.setEnabled(false); 
        jSpinner8.setEnabled(false); 
        jSpinner9.setEnabled(false);
        jSpinner10.setEnabled(false);
        jSpinner11.setEnabled(false); 
        steakCheck.setEnabled(false);
        schnitzelCheck.setEnabled(false); 
        burgerCheck.setEnabled(false); 
        doubleCheck.setEnabled(false); 
        hotdogCheck.setEnabled(false); 
        jSpinner12.setEnabled(false); 
        jSpinner13.setEnabled(false);
        jSpinner14.setEnabled(false);
        jSpinner15.setEnabled(false); 
        jSpinner16.setEnabled(false);
        addButton.setEnabled(false); 
        removeTable.setEnabled(false); 
    }//GEN-LAST:event_formWindowActivated

    private void removeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTableActionPerformed
       DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
       int selectedro= tableOrder.getSelectedRow();
       model.removeRow(selectedro);
    }//GEN-LAST:event_removeTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage homeVisible = new HomePage();
        homeVisible.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        HomePage homeVisible = new HomePage();
        homeVisible.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void teaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teaCheckActionPerformed
    
    private void seatcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatcomboActionPerformed
       
            
        
    }//GEN-LAST:event_seatcomboActionPerformed
        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeatSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatSelected().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JCheckBox burgerCheck;
    private javax.swing.JCheckBox cokeCheck;
    private javax.swing.JCheckBox donerCheck;
    private javax.swing.JCheckBox doubleCheck;
    private javax.swing.JCheckBox espressoCheck;
    private javax.swing.JCheckBox filterCheck;
    private javax.swing.JCheckBox hotdogCheck;
    private javax.swing.JCheckBox icedCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JCheckBox juiceCheck;
    private javax.swing.JCheckBox kebabCheck;
    private javax.swing.JCheckBox lambCheck;
    private javax.swing.JCheckBox mantıCheck;
    private javax.swing.JButton removeTable;
    private javax.swing.JCheckBox saladCheck;
    private javax.swing.JCheckBox schnitzelCheck;
    private javax.swing.JLabel seat1;
    private javax.swing.JLabel seat2;
    private javax.swing.JLabel seat3;
    private javax.swing.JLabel seat4;
    private javax.swing.JLabel seat5;
    private javax.swing.JLabel seat6;
    private javax.swing.JComboBox<String> seatcombo;
    private javax.swing.JPanel seating;
    private javax.swing.JCheckBox steakCheck;
    private javax.swing.JTable tableOrder;
    private javax.swing.JCheckBox teaCheck;
    // End of variables declaration//GEN-END:variables

    
}
