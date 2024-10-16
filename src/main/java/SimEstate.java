/*
 *  SimEstate is a GUI based Application that provides a user-led Real Estate Simulation Experience.
 *  Its 3 modes consist of: 1. Buyer who can view valuations of default and user created properties and their impacts,
 *  2. Contractor who dawns the abilities to build properties of their own and see its value change,
 *  and 3. Government who is tasked with shaping the city by adding landmarks and buildings with geographical effects.
 *  The user can take on the role of all 3 to make the simulation truly theirs.
 *
 * 
 * modified     20230725
 * date         20220720
 * @filename    SimEstate.java
 * @author(s)   Gloria Li
                Curtis Wong
                Dawson Xiong
 * @version     1.0.7 
 * @see         N/A
 */

import java.awt.Component;
import java.awt.Dialog;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class SimEstate extends javax.swing.JFrame {

    private Map<Place, List<Road>> adjacencyList; // Create an ArrayList to store non-residential buildings (both houses and other
    public static ArrayList<ResidentialBuilding> residentialBuildings = new ArrayList<>(); // Create an ArrayList to store residential buildings
    public static ArrayList<Place> places = new ArrayList<>(); // Create an ArrayList to store residential buildings
    public static ArrayList<Road> roads = new ArrayList<>(); // Create an ArrayList to store all roads

    // Variables to handle contractor information/input
    String contractAddress;
    int contractDistance;
    Place contractStart;

    // Set components to be initially invisible before input based activation
    String govAddress;
    int govDistance;
    Place govStart;
    String govName;

    public SimEstate() {
        initComponents();

        // Set components to be initially invisible before input based activation
        chkCOne.setVisible(false);
        chkCTwo.setVisible(false);
        chkCThree.setVisible(false);
        cmbFieldFive.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dSimModes = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnGov = new javax.swing.JButton();
        btnBuyer = new javax.swing.JButton();
        btnContractor = new javax.swing.JButton();
        backDropModes = new javax.swing.JLabel();
        dContractDes = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        cmbCDesType = new javax.swing.JComboBox<>();
        cmbCDes = new javax.swing.JComboBox<>();
        txtCDistance = new javax.swing.JTextField();
        txtCAddress = new javax.swing.JTextField();
        btnCDes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cDesFeedback = new javax.swing.JTextArea();
        backdropCDes = new javax.swing.JLabel();
        dContractBuild = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        cmbCBuildType = new javax.swing.JComboBox<>();
        cmbCBedrooms = new javax.swing.JComboBox<>();
        cmbCBathrooms = new javax.swing.JComboBox<>();
        cmbCFloors = new javax.swing.JComboBox<>();
        cmbCParking = new javax.swing.JComboBox<>();
        txtCArea = new javax.swing.JTextField();
        txtCYardArea = new javax.swing.JTextField();
        chkCTwo = new javax.swing.JCheckBox();
        chkCOne = new javax.swing.JCheckBox();
        chkCThree = new javax.swing.JCheckBox();
        lblConfig = new javax.swing.JLabel();
        btnCBuild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cBuildFeedback = new javax.swing.JTextArea();
        backdropCBuild = new javax.swing.JLabel();
        dGovDes = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        cmbGDesType = new javax.swing.JComboBox<>();
        cmbGDes = new javax.swing.JComboBox<>();
        txtGDistance = new javax.swing.JTextField();
        txtGName = new javax.swing.JTextField();
        txtGAddress = new javax.swing.JTextField();
        btnGDes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        gDesFeedback = new javax.swing.JTextArea();
        backdropGDes = new javax.swing.JLabel();
        dGovBuild = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        cmbGBuildType = new javax.swing.JComboBox<>();
        lblFieldOne = new javax.swing.JLabel();
        cmbFieldOne = new javax.swing.JComboBox<>();
        lblFieldTwo = new javax.swing.JLabel();
        cmbFieldTwo = new javax.swing.JComboBox<>();
        lblFieldThree = new javax.swing.JLabel();
        txtFieldThree = new javax.swing.JTextField();
        lblFieldFive = new javax.swing.JLabel();
        cmbFieldFive = new javax.swing.JComboBox<>();
        lblFieldFour = new javax.swing.JLabel();
        cmbFieldFour = new javax.swing.JComboBox<>();
        btnGBuild = new javax.swing.JButton();
        chkGOne = new javax.swing.JCheckBox();
        chkGTwo = new javax.swing.JCheckBox();
        chkGThree = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        gBuildFeedback = new javax.swing.JTextArea();
        backdropGBuild = new javax.swing.JLabel();
        dBuyer = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblYard = new javax.swing.JLabel();
        lblFloors = new javax.swing.JLabel();
        lblBedrooms = new javax.swing.JLabel();
        lblBathrooms = new javax.swing.JLabel();
        lblParking = new javax.swing.JLabel();
        lblUnits = new javax.swing.JLabel();
        lblGym = new javax.swing.JLabel();
        lblBonus = new javax.swing.JLabel();
        btnProximity = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        buyList = new javax.swing.JList<>();
        backdropBuy = new javax.swing.JLabel();
        dProximity = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        lblHP = new javax.swing.JLabel();
        lblCC = new javax.swing.JLabel();
        lblES = new javax.swing.JLabel();
        lblS1 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        lblML = new javax.swing.JLabel();
        lblGS = new javax.swing.JLabel();
        lblPK = new javax.swing.JLabel();
        lblBS = new javax.swing.JLabel();
        lblSW = new javax.swing.JLabel();
        backdropNearest = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBegin = new javax.swing.JButton();
        backDrop = new javax.swing.JLabel();

        jPanel4.setLayout(null);

        btnGov.setBorderPainted(false);
        btnGov.setContentAreaFilled(false);
        btnGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovActionPerformed(evt);
            }
        });
        jPanel4.add(btnGov);
        btnGov.setBounds(500, 135, 165, 185);

        btnBuyer.setBorderPainted(false);
        btnBuyer.setContentAreaFilled(false);
        btnBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuyer);
        btnBuyer.setBounds(67, 135, 165, 185);

        btnContractor.setBorderPainted(false);
        btnContractor.setContentAreaFilled(false);
        btnContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractorActionPerformed(evt);
            }
        });
        jPanel4.add(btnContractor);
        btnContractor.setBounds(270, 135, 190, 185);

        backDropModes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sim Modes.png"))); // NOI18N
        jPanel4.add(backDropModes);
        backDropModes.setBounds(0, 0, 720, 405);

        javax.swing.GroupLayout dSimModesLayout = new javax.swing.GroupLayout(dSimModes.getContentPane());
        dSimModes.getContentPane().setLayout(dSimModesLayout);
        dSimModesLayout.setHorizontalGroup(
                dSimModesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dSimModesLayout.setVerticalGroup(
                dSimModesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel2.setLayout(null);

        cmbCDesType.setBackground(new java.awt.Color(199, 223, 220));
        cmbCDesType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbCDesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Landmark", "Residential"}));
        cmbCDesType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCDesTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cmbCDesType);
        cmbCDesType.setBounds(452, 75, 115, 25);

        cmbCDes.setBackground(new java.awt.Color(199, 223, 220));
        cmbCDes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel2.add(cmbCDes);
        cmbCDes.setBounds(583, 75, 115, 25);
        jPanel2.add(txtCDistance);
        txtCDistance.setBounds(501, 188, 115, 30);
        jPanel2.add(txtCAddress);
        txtCAddress.setBounds(452, 283, 163, 30);

        btnCDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnCDes.setBorderPainted(false);
        btnCDes.setContentAreaFilled(false);
        btnCDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDesActionPerformed(evt);
            }
        });
        jPanel2.add(btnCDes);
        btnCDes.setBounds(570, 350, 140, 40);

        cDesFeedback.setEditable(false);
        cDesFeedback.setColumns(20);
        cDesFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cDesFeedback.setLineWrap(true);
        cDesFeedback.setRows(5);
        cDesFeedback.setBorder(null);
        cDesFeedback.setOpaque(false);
        jScrollPane2.setViewportView(cDesFeedback);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 320, 40);

        backdropCDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contract Destination.png"))); // NOI18N
        jPanel2.add(backdropCDes);
        backdropCDes.setBounds(0, 0, 720, 404);

        javax.swing.GroupLayout dContractDesLayout = new javax.swing.GroupLayout(dContractDes.getContentPane());
        dContractDes.getContentPane().setLayout(dContractDesLayout);
        dContractDesLayout.setHorizontalGroup(
                dContractDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dContractDesLayout.setVerticalGroup(
                dContractDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel3.setLayout(null);

        cmbCBuildType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbCBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"House", "Townhouse", "Apartment Building"}));
        cmbCBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCBuildTypeActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCBuildType);
        cmbCBuildType.setBounds(550, 155, 115, 25);

        cmbCBedrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCBedrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6"}));
        jPanel3.add(cmbCBedrooms);
        cmbCBedrooms.setBounds(560, 204, 115, 24);

        cmbCBathrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCBathrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6"}));
        jPanel3.add(cmbCBathrooms);
        cmbCBathrooms.setBounds(560, 230, 115, 24);

        cmbCFloors.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));
        jPanel3.add(cmbCFloors);
        cmbCFloors.setBounds(560, 260, 115, 24);

        cmbCParking.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCParking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6"}));
        jPanel3.add(cmbCParking);
        cmbCParking.setBounds(560, 290, 115, 24);

        txtCArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel3.add(txtCArea);
        txtCArea.setBounds(560, 335, 115, 24);

        txtCYardArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel3.add(txtCYardArea);
        txtCYardArea.setBounds(570, 370, 105, 24);

        chkCTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCTwo.setForeground(new java.awt.Color(51, 51, 51));
        chkCTwo.setText("Gym");
        jPanel3.add(chkCTwo);
        chkCTwo.setBounds(530, 313, 80, 22);

        chkCOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCOne.setForeground(new java.awt.Color(51, 51, 51));
        chkCOne.setText("Pool");
        jPanel3.add(chkCOne);
        chkCOne.setBounds(460, 313, 80, 22);

        chkCThree.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCThree.setForeground(new java.awt.Color(51, 51, 51));
        chkCThree.setText("Tennis");
        jPanel3.add(chkCThree);
        chkCThree.setBounds(620, 313, 90, 22);

        lblConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png"))); // NOI18N
        jPanel3.add(lblConfig);
        lblConfig.setBounds(450, 200, 250, 200);

        btnCBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnCBuild.setBorderPainted(false);
        btnCBuild.setContentAreaFilled(false);
        btnCBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCBuildActionPerformed(evt);
            }
        });
        jPanel3.add(btnCBuild);
        btnCBuild.setBounds(210, 270, 150, 40);

        cBuildFeedback.setEditable(false);
        cBuildFeedback.setColumns(20);
        cBuildFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cBuildFeedback.setLineWrap(true);
        cBuildFeedback.setRows(5);
        cBuildFeedback.setBorder(null);
        cBuildFeedback.setOpaque(false);
        jScrollPane1.setViewportView(cBuildFeedback);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 320, 40);

        backdropCBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contract-Build.png"))); // NOI18N
        jPanel3.add(backdropCBuild);
        backdropCBuild.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout dContractBuildLayout = new javax.swing.GroupLayout(dContractBuild.getContentPane());
        dContractBuild.getContentPane().setLayout(dContractBuildLayout);
        dContractBuildLayout.setHorizontalGroup(
                dContractBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dContractBuildLayout.setVerticalGroup(
                dContractBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel5.setLayout(null);

        cmbGDesType.setBackground(new java.awt.Color(199, 223, 220));
        cmbGDesType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbGDesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Landmark", "Residential"}));
        cmbGDesType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGDesTypeActionPerformed(evt);
            }
        });
        jPanel5.add(cmbGDesType);
        cmbGDesType.setBounds(452, 75, 115, 25);

        cmbGDes.setBackground(new java.awt.Color(199, 223, 220));
        cmbGDes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel5.add(cmbGDes);
        cmbGDes.setBounds(583, 75, 115, 25);
        jPanel5.add(txtGDistance);
        txtGDistance.setBounds(501, 188, 115, 30);
        jPanel5.add(txtGName);
        txtGName.setBounds(576, 251, 125, 30);
        jPanel5.add(txtGAddress);
        txtGAddress.setBounds(575, 305, 130, 30);

        btnGDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnGDes.setBorderPainted(false);
        btnGDes.setContentAreaFilled(false);
        btnGDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDesActionPerformed(evt);
            }
        });
        jPanel5.add(btnGDes);
        btnGDes.setBounds(570, 350, 140, 40);

        gDesFeedback.setEditable(false);
        gDesFeedback.setColumns(20);
        gDesFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        gDesFeedback.setLineWrap(true);
        gDesFeedback.setRows(5);
        gDesFeedback.setBorder(null);
        gDesFeedback.setOpaque(false);
        jScrollPane3.setViewportView(gDesFeedback);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 320, 40);

        backdropGDes.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        backdropGDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gov Destination.png"))); // NOI18N
        jPanel5.add(backdropGDes);
        backdropGDes.setBounds(0, 0, 720, 404);

        javax.swing.GroupLayout dGovDesLayout = new javax.swing.GroupLayout(dGovDes.getContentPane());
        dGovDes.getContentPane().setLayout(dGovDesLayout);
        dGovDesLayout.setHorizontalGroup(
                dGovDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dGovDesLayout.setVerticalGroup(
                dGovDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel6.setLayout(null);

        cmbGBuildType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbGBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"School", "Store", "Mall", "Hospital", "Emergency Service", "Community Centre", "Park", "Disposal Centre", "Bus Stop", "Subway"}));
        cmbGBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGBuildTypeActionPerformed(evt);
            }
        });
        jPanel6.add(cmbGBuildType);
        cmbGBuildType.setBounds(550, 155, 115, 25);

        lblFieldOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldOne.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldOne.setText("Ranking:");
        jPanel6.add(lblFieldOne);
        lblFieldOne.setBounds(460, 205, 90, 20);

        cmbFieldOne.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"+10", "+20", "+50", "+100"}));
        jPanel6.add(cmbFieldOne);
        cmbFieldOne.setBounds(560, 204, 115, 24);

        lblFieldTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldTwo.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldTwo.setText("Private:");
        jPanel6.add(lblFieldTwo);
        lblFieldTwo.setBounds(460, 230, 90, 20);

        cmbFieldTwo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"true", "false"}));
        jPanel6.add(cmbFieldTwo);
        cmbFieldTwo.setBounds(560, 230, 115, 24);

        lblFieldThree.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldThree.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldThree.setText("Tuition:");
        jPanel6.add(lblFieldThree);
        lblFieldThree.setBounds(460, 260, 90, 20);
        jPanel6.add(txtFieldThree);
        txtFieldThree.setBounds(560, 260, 115, 22);

        lblFieldFive.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblFieldFive.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldFive.setText("Special Programs:");
        jPanel6.add(lblFieldFive);
        lblFieldFive.setBounds(450, 350, 100, 20);

        cmbFieldFive.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel6.add(cmbFieldFive);
        cmbFieldFive.setBounds(560, 350, 115, 24);

        lblFieldFour.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldFour.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldFour.setText("Grade Level:");
        jPanel6.add(lblFieldFour);
        lblFieldFour.setBounds(460, 290, 90, 20);

        cmbFieldFour.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldFour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Elementary", "Secondary", "Post-Secondary"}));
        jPanel6.add(cmbFieldFour);
        cmbFieldFour.setBounds(560, 290, 115, 24);

        btnGBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnGBuild.setBorderPainted(false);
        btnGBuild.setContentAreaFilled(false);
        btnGBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGBuildActionPerformed(evt);
            }
        });
        jPanel6.add(btnGBuild);
        btnGBuild.setBounds(210, 270, 150, 40);

        chkGOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkGOne.setForeground(new java.awt.Color(51, 51, 51));
        chkGOne.setText("IB");
        jPanel6.add(chkGOne);
        chkGOne.setBounds(450, 380, 80, 22);

        chkGTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkGTwo.setForeground(new java.awt.Color(51, 51, 51));
        chkGTwo.setText("Gifted");
        jPanel6.add(chkGTwo);
        chkGTwo.setBounds(530, 380, 80, 22);

        chkGThree.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        chkGThree.setForeground(new java.awt.Color(51, 51, 51));
        chkGThree.setText("French");
        jPanel6.add(chkGThree);
        chkGThree.setBounds(610, 380, 80, 22);

        gBuildFeedback.setEditable(false);
        gBuildFeedback.setColumns(20);
        gBuildFeedback.setLineWrap(true);
        gBuildFeedback.setRows(5);
        gBuildFeedback.setBorder(null);
        gBuildFeedback.setOpaque(false);
        jScrollPane4.setViewportView(gBuildFeedback);

        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(20, 350, 320, 40);

        backdropGBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gov Build.png"))); // NOI18N
        jPanel6.add(backdropGBuild);
        backdropGBuild.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout dGovBuildLayout = new javax.swing.GroupLayout(dGovBuild.getContentPane());
        dGovBuild.getContentPane().setLayout(dGovBuildLayout);
        dGovBuildLayout.setHorizontalGroup(
                dGovBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dGovBuildLayout.setVerticalGroup(
                dGovBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel7.setLayout(null);

        lblPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblPrice);
        lblPrice.setBounds(430, 53, 250, 30);

        lblAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 23)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblAddress);
        lblAddress.setBounds(358, 100, 320, 30);

        lblArea.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        lblArea.setForeground(new java.awt.Color(199, 223, 220));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(lblArea);
        lblArea.setBounds(390, 150, 60, 15);

        lblYard.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        lblYard.setForeground(new java.awt.Color(199, 223, 220));
        lblYard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(lblYard);
        lblYard.setBounds(630, 190, 60, 15);

        lblFloors.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFloors.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblFloors);
        lblFloors.setBounds(417, 190, 30, 15);

        lblBedrooms.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblBedrooms.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblBedrooms);
        lblBedrooms.setBounds(550, 150, 30, 15);

        lblBathrooms.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblBathrooms.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblBathrooms);
        lblBathrooms.setBounds(550, 190, 30, 15);

        lblParking.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblParking.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblParking);
        lblParking.setBounds(650, 150, 30, 15);

        lblUnits.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUnits.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblUnits);
        lblUnits.setBounds(420, 170, 40, 15);

        lblGym.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblGym.setForeground(new java.awt.Color(199, 223, 220));
        jPanel7.add(lblGym);
        lblGym.setBounds(650, 170, 30, 15);

        lblBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxBonus.png"))); // NOI18N
        jPanel7.add(lblBonus);
        lblBonus.setBounds(360, 220, 220, 25);

        btnProximity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        btnProximity.setBorder(null);
        btnProximity.setBorderPainted(false);
        btnProximity.setContentAreaFilled(false);
        btnProximity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximityActionPerformed(evt);
            }
        });
        jPanel7.add(btnProximity);
        btnProximity.setBounds(640, 225, 40, 20);

        jScrollPane6.setBorder(null);

        buyList.setBackground(new java.awt.Color(199, 223, 220));
        buyList.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buyList.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        buyList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        buyList.setFixedCellHeight(35);
        buyList.setFixedCellWidth(200);
        buyList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        buyList.setVerifyInputWhenFocusTarget(false);
        buyList.setVisibleRowCount(2);
        buyList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                buyListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(buyList);

        jPanel7.add(jScrollPane6);
        jScrollPane6.setBounds(140, 290, 440, 90);

        backdropBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buy House.png"))); // NOI18N
        jPanel7.add(backdropBuy);
        backdropBuy.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout dBuyerLayout = new javax.swing.GroupLayout(dBuyer.getContentPane());
        dBuyer.getContentPane().setLayout(dBuyerLayout);
        dBuyerLayout.setHorizontalGroup(
                dBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dBuyerLayout.setVerticalGroup(
                dBuyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setLayout(null);

        lblHP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblHP.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblHP);
        lblHP.setBounds(135, 83, 60, 20);

        lblCC.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblCC.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblCC);
        lblCC.setBounds(375, 83, 60, 20);

        lblES.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblES.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblES);
        lblES.setBounds(230, 123, 110, 20);

        lblS1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblS1.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblS1);
        lblS1.setBounds(270, 160, 110, 20);

        lblS2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblS2.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblS2);
        lblS2.setBounds(270, 183, 110, 20);

        lblS3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblS3.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblS3);
        lblS3.setBounds(300, 206, 110, 20);

        lblML.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblML.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblML);
        lblML.setBounds(100, 246, 60, 20);

        lblGS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblGS.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblGS);
        lblGS.setBounds(240, 246, 60, 20);

        lblPK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPK.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblPK);
        lblPK.setBounds(370, 246, 60, 20);

        lblBS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblBS.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblBS);
        lblBS.setBounds(140, 293, 110, 20);

        lblSW.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblSW.setForeground(new java.awt.Color(199, 223, 220));
        jPanel8.add(lblSW);
        lblSW.setBounds(375, 293, 60, 20);

        backdropNearest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nearest.png"))); // NOI18N
        jPanel8.add(backdropNearest);
        backdropNearest.setBounds(0, 0, 450, 390);

        javax.swing.GroupLayout dProximityLayout = new javax.swing.GroupLayout(dProximity.getContentPane());
        dProximity.getContentPane().setLayout(dProximityLayout);
        dProximityLayout.setHorizontalGroup(
                dProximityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        dProximityLayout.setVerticalGroup(
                dProximityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnBegin.setBackground(new java.awt.Color(189, 215, 203));
        btnBegin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        btnBegin.setForeground(new java.awt.Color(76, 135, 154));
        btnBegin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Begin.png"))); // NOI18N
        btnBegin.setBorderPainted(false);
        btnBegin.setContentAreaFilled(false);
        btnBegin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginActionPerformed(evt);
            }
        });
        jPanel1.add(btnBegin);
        btnBegin.setBounds(550, 10, 110, 30);

        backDrop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backDrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sim Estate.png"))); // NOI18N
        jPanel1.add(backDrop);
        backDrop.setBounds(0, 0, 720, 404);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Action performed when the "Begin" button is clicked
    private void btnBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginActionPerformed
        // Calls the screenRoute method with the parameters dSimModes and jPanel1
        screenRoute(dSimModes, jPanel1);
    }//GEN-LAST:event_btnBeginActionPerformed

    // Action performed when the "Contract Destination" button is clicked
    private void btnCDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDesActionPerformed
        // Checks if the address contains a valid short form address suffix (St, Ave, Rd, Ln, Blvd, Dr)
        if (addressValid(txtCAddress.getText().toLowerCase())) {
            // Checking if the address is already taken in both residentialBuildings and places lists
            if (addressSearch(txtCAddress.getText(), residentialBuildings) != null
                    && addressSearch(String.valueOf(txtCAddress.getText()), places) != null) {
                cDesFeedback.setText("Address has already been taken");
                return;
            }
            contractAddress = txtCAddress.getText(); // set the address of the building/contract to be built

            try {
                Integer.valueOf(txtCDistance.getText());
                if (Integer.parseInt(txtCDistance.getText()) > 0) {
                    contractDistance = Integer.parseInt(txtCDistance.getText());
                    contractStart = String.valueOf(cmbCDesType.getSelectedItem()).equals("Residential") ? addressSearch(String.valueOf(cmbCDes.getSelectedItem()), residentialBuildings) : nameSearch(String.valueOf(cmbCDes.getSelectedItem()), places); // confirm the address or name of the reference location
                    if (contractStart != null) { // if address or name exists, proceed
                        screenRoute(dContractBuild, jPanel2);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                cDesFeedback.setText("Distance must be a positive number");
            }

        } else {
            cDesFeedback.setText("Make sure to include a proper short form address suffix (St, Ave, Rd, Ln, Blvd, Dr)");
        }
    }//GEN-LAST:event_btnCDesActionPerformed

    // When Reference destination type is changed
    private void cmbCDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCDesTypeActionPerformed
        cmbCDes.setModel(desModel(cmbCDesType)); // when the type is switched, change the options (aka model) of the dropdown to that type
    }//GEN-LAST:event_cmbCDesTypeActionPerformed

    // when govern button is pressed (enter government mode)
    private void btnGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovActionPerformed
        dGovDes.setSize(735, 445);
        dGovDes.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        cmbGDes.setModel(desModel(cmbGDesType)); // set the initial model for the dropdown
        dGovDes.setVisible(true);
    }//GEN-LAST:event_btnGovActionPerformed

    // when buyer button is pressed (enter buyer mode)
    private void btnBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerActionPerformed
        DefaultListModel listModel = new DefaultListModel();
        for (ResidentialBuilding rb : residentialBuildings) {
            listModel.addElement(rb.getAddress()); // change residentialBuildings list to list model for display in JList
        }

        buyList.setModel(listModel); // set model created above
        buyList.setSelectedIndex(-1); // have no default selection in the JList
        screenRoute(dBuyer, jPanel4);
    }//GEN-LAST:event_btnBuyerActionPerformed

    // When contractor button is pressed (enter contractor mode)
    private void btnContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractorActionPerformed
        dContractDes.setSize(735, 445);
        dContractDes.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        cmbCDes.setModel(desModel(cmbCDesType)); // set initial model for the dropdown
        dContractDes.setVisible(true);

    }//GEN-LAST:event_btnContractorActionPerformed

    // When build type combobox is changed
    private void cmbCBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCBuildTypeActionPerformed
        String[] floorModel = {"1", "2", "3", "4", "5", "6"}; // create model for floor options
        cmbCFloors.setModel(new DefaultComboBoxModel<>(floorModel));
        chkCOne.setVisible(false);
        chkCTwo.setVisible(false);
        chkCThree.setVisible(false);

        // Checks the selected building type and adjusts the UI accordingly
        if (Objects.equals(cmbCBuildType.getSelectedItem(), "House")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);
        } else if (Objects.equals(cmbCBuildType.getSelectedItem(), "Townhouse")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);

        } else {
            // Array of unique floor options for apartments 
            String[] tempModel = {"10", "20", "30", "50"};
            cmbCFloors.setModel(new DefaultComboBoxModel<>(tempModel));

            // Shows checkboxes for additional amenities (pool, gym, tennis court)
            chkCOne.setVisible(true);
            chkCOne.setText("Pool");
            chkCTwo.setVisible(true);
            chkCTwo.setText("Gym");
            chkCThree.setVisible(true);
            chkCThree.setText("Tennis Court");

            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartmentConfig.png")));
        }
    }//GEN-LAST:event_cmbCBuildTypeActionPerformed

    // Action performed when the "Confirm" button is clicked on the contract build screen
    private void btnCBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCBuildActionPerformed
        try {
            double yardArea = Double.parseDouble(String.valueOf(txtCYardArea.getText()));
            int numBathrooms = comboExtract(cmbCBathrooms);
            int numBedrooms = comboExtract(cmbCBedrooms);
            int parkingSpaces = comboExtract(cmbCParking);
            int numFloors = comboExtract(cmbCFloors);
            double area = Double.parseDouble(String.valueOf(txtCArea.getText()));

            if (yardArea <= 0 || area <= 0) {
                cBuildFeedback.setText("Area must exceed 0");
                return;
            }

            if (yardArea > 5000) {
                cBuildFeedback.setText("Yard area must be under 5000sqft");
                return;
            }

            if (area > 50000) {
                cBuildFeedback.setText("House area must be under 50000sqft");
                return;
            }

            // Creating different types of buildings based on the selected build type
            if (Objects.equals(cmbCBuildType.getSelectedItem(), "House")) {
                House house = new House(contractAddress, "HH-" + nextID("HH", residentialBuildings),
                        yardArea, numBathrooms, numBedrooms, 0, parkingSpaces, numFloors, area);

                house.setPrice(House.calculateHousePrice(yardArea, numBathrooms, numBedrooms, parkingSpaces, area));
                residentialBuildings.add(house); // Adding the new House object to the residentialBuildings and places lists
                places.add(house);

                // Creating two Road objects between the contract start and the new house
                roads.add(new Road(contractStart, house, contractDistance));
                roads.add(new Road(house, contractStart, contractDistance));

                // Calculating distances for the new house and setting a bonus flag if the price increases
                double initialPrice = house.getPrice();
                calculateAllDistancesForAHome(house);
                house.sortDistances();
                house.setBonus(initialPrice < house.getPrice());
            } else if (Objects.equals(cmbCBuildType.getSelectedItem(), "Townhouse")) {
                Townhouse townHouse = new Townhouse(contractAddress, "TH-" + nextID("TH", residentialBuildings),
                        numBathrooms, numBedrooms, 0, parkingSpaces, numFloors, area, yardArea);

                townHouse.setPrice(Townhouse.calculateHousePrice(yardArea, numBathrooms, numBedrooms, parkingSpaces, yardArea));
                residentialBuildings.add(townHouse);
                places.add(townHouse);
                roads.add(new Road(contractStart, townHouse, contractDistance));
                roads.add(new Road(townHouse, contractStart, contractDistance));

                double initialPrice = townHouse.getPrice();
                calculateAllDistancesForAHome(townHouse);
                townHouse.sortDistances();
                townHouse.setBonus(initialPrice < townHouse.getPrice());

            } else {
                int numUnits = Integer.parseInt(txtCYardArea.getText());
                Apartment apartment = new Apartment(contractAddress, "AB-" + nextID("AB", residentialBuildings),
                        numUnits, numBathrooms, numBedrooms, 0, parkingSpaces, numFloors, area, chkCOne.isSelected(),
                        chkCTwo.isSelected(), chkCThree.isSelected());
                apartment.setPrice(Apartment.calculateApartmentPrice(area, numBathrooms, numBedrooms));

                residentialBuildings.add(apartment);
                places.add(apartment);
                roads.add(new Road(contractStart, apartment, contractDistance));
                roads.add(new Road(apartment, contractStart, contractDistance));

                double initialPrice = apartment.getPrice();
                calculateAllDistancesForAHome(apartment);
                apartment.sortDistances();
                apartment.setBonus(initialPrice < apartment.getPrice());
            }

            // Printing the ID of the last added residential building and road added
            System.out.println(residentialBuildings.get(residentialBuildings.size() - 1).getId() +
                    " " + roads.get(roads.size() - 2).toString());

            dContractBuild.dispose(); // Close the Contractor Screens to return to the menu after successful build
            dContractDes.dispose();

        } catch (NumberFormatException e) {
            System.out.println(e);
            cBuildFeedback.setText("Area Input malformed, please retry");
        }
    }//GEN-LAST:event_btnCBuildActionPerformed

    // when reference location type is changed in the government destination screen
    private void cmbGDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGDesTypeActionPerformed
        cmbGDes.setModel(desModel(cmbGDesType));
    }//GEN-LAST:event_cmbGDesTypeActionPerformed

    // When confirm is pressed in the government mode destination screen
    private void btnGDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDesActionPerformed
        // Check if address has the correct format of having a certain street suffix
        if (addressValid(txtGAddress.getText())) {
            govAddress = txtGAddress.getText();

            try {
                Integer.valueOf(txtGDistance.getText());
                if (Integer.parseInt(txtGDistance.getText()) > 0) {
                    govDistance = Integer.parseInt(txtGDistance.getText());
                    govStart = String.valueOf(cmbGDesType.getSelectedItem()).equals("Residential") ? addressSearch(String.valueOf(cmbGDes.getSelectedItem()),
                            residentialBuildings) : nameSearch(String.valueOf(cmbGDes.getSelectedItem()), places);

                    // check if name and address are valid and not taken
                    if (!txtGName.getText().isEmpty() && govStart != null && nameSearch(txtGName.getText(), places) == null && addressSearch(String.valueOf(txtGAddress.getText()), residentialBuildings) == null && addressSearch(String.valueOf(txtGAddress.getText()), places) == null) {
                        govName = txtGName.getText();
                        txtFieldThree.setText(""); // clear text field to be empty when returning to screen later
                        screenRoute(dGovBuild, jPanel5);
                    } else {
                        gDesFeedback.setText("Invalid Name or Address, already taken");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                gDesFeedback.setText("Distance must be a positive Number");
            }
        } else {
            gDesFeedback.setText("Make sure to include a proper short form address suffix (St, Ave, Rd, Ln, Blvd, Dr)");
        }
    }//GEN-LAST:event_btnGDesActionPerformed

    // When confirm is pressed in government build screen
    private void btnGBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGBuildActionPerformed
        String type = String.valueOf(cmbGBuildType.getSelectedItem()); // determines selected building/place
        Place landmark;

        try {
            if (!Objects.equals(lblFieldThree.getText(), "") && txtFieldThree.getText().isEmpty()) { // if a text field is required, check that it is filled in
                gBuildFeedback.setText("Please fill out all fields");
                return;
            }

            // ternary operator to assign and create a new place/landmark object based on the user input
            landmark = type.equals("School") ? new School(govAddress, "SS-" + nextID("SS", places), govName, Integer.valueOf((String.valueOf(cmbFieldOne.getSelectedItem())).substring(1)), Boolean.parseBoolean(String.valueOf(cmbFieldTwo.getSelectedItem())), Integer.valueOf(String.valueOf(txtFieldThree.getText())), String.valueOf(cmbFieldFour.getSelectedItem()), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected())
                    : type.equals("Store") ? new GroceryStore(govAddress, "GS-" + nextID("GS", places), govName, comboExtract(cmbFieldOne), Integer.valueOf(String.valueOf(txtFieldThree.getText())), comboExtract(cmbFieldTwo), Boolean.parseBoolean(String.valueOf(cmbFieldFour)), Boolean.parseBoolean(String.valueOf(cmbFieldFive.getSelectedItem())))
                    : type.equals("Mall") ? new Mall(govAddress, "ML-" + nextID("ML", places), govName, comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), Integer.valueOf(txtFieldThree.getText()), Boolean.parseBoolean(String.valueOf(cmbFieldFour.getSelectedItem())), Boolean.parseBoolean(String.valueOf(cmbFieldFive)))
                    : type.equals("Hospital") ? new Hospital(govAddress, "HP-" + nextID("HP", places), comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), govName, Integer.valueOf(String.valueOf(txtFieldThree.getText())))
                    : type.equals("Emergency Service") ? new EmergencyServiceStation(govAddress, "ES-" + nextID("ES", places), govName, Integer.valueOf(String.valueOf(cmbFieldOne.getSelectedItem())), comboExtract(cmbFieldTwo), String.valueOf(cmbFieldFour.getSelectedItem()))
                    : type.equals("Community Centre") ? new CommunityCentre(govAddress, "CC-" + nextID("CC", places), govName, comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected())
                    : type.equals("Park") ? new Park(govAddress, "PK-" + nextID("PK", places), govName, Double.valueOf(String.valueOf(txtFieldThree.getText())), comboExtract(cmbFieldOne), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected())
                    : type.equals("Disposal Centre") ? new GarbageDisposal(govAddress, "GD-" + nextID("GD", places), govName, comboExtract(cmbFieldOne))
                    : type.equals("Bus Stop") ? new BusStop(govAddress, "BS-" + nextID("BS", places), govName, comboExtract(cmbFieldOne))
                    : new SubwayStation(govAddress, "SW-" + nextID("SW", places), govName, comboExtract(cmbFieldOne));

            places.add(landmark); // add to places list
            roads.add(new Road(govStart, landmark, govDistance)); // create roads from and to the location 
            roads.add(new Road(landmark, govStart, govDistance));

            System.out.println(places.get(places.size() - 1).getId() + " " + roads.get(roads.size() - 2).toString());
            screenRoute(dSimModes, jPanel6);
            dGovBuild.dispose(); // close government screens to return to menu after a success build
            dGovDes.dispose();
        } catch (NumberFormatException e) {
            System.out.println(e);
            gBuildFeedback.setText("Please input numbers only");
        }
    }//GEN-LAST:event_btnGBuildActionPerformed

    // when building type is changed in government build screen
    private void cmbGBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGBuildTypeActionPerformed
        cmbFieldTwo.setVisible(true);
        txtFieldThree.setVisible(true);
        cmbFieldFour.setVisible(false);
        cmbFieldFive.setVisible(false);
        chkGOne.setVisible(false);
        chkGTwo.setVisible(false);
        chkGThree.setVisible(false);

        // adjust UI based on user selected build type
        if (cmbGBuildType.getSelectedItem().equals("School")) { // set labels and dropdown options (via string arrays) different in each case
            cmbFieldFour.setVisible(true);
            govConfig("Ranking:", "Private:", "Tuition:", "Grade Level", "Special Programs:",
                    new String[]{"+10", "+20", "+50", "+100"},
                    new String[]{"true", "false"},
                    new String[]{"Elementary", "Secondary", "Post-Secondary"},
                    new String[]{"IB", "Gifted", "French Immersion"});
            amentitySet("IB", "Gifted", "French");
        } else if (cmbGBuildType.getSelectedItem().equals("Store")) {
            cmbFieldFour.setVisible(true);
            cmbFieldFive.setVisible(true);
            govConfig("Floors", "Affordability", "Capacity", "Pharmacy", "Bakery",
                    new String[]{"1", "2", "3"},
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{"true", "false"},
                    new String[]{"true", "false"});
        } else if (cmbGBuildType.getSelectedItem().equals("Mall")) {
            cmbFieldFour.setVisible(true);
            cmbFieldFive.setVisible(true);
            govConfig("Floors", "Capacity", "Stores", "Cinema", "Food Court",
                    new String[]{"1", "2", "3"},
                    new String[]{"100", "200", "300", "400", "500"},
                    new String[]{"true", "false"}, new String[]{"true", "false"});
        } else if (cmbGBuildType.getSelectedItem().equals("Hospital")) {
            govConfig("Sustainability", "Floors", "Capacity", "", "",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{"1", "2", "3", "4", "5"},
                    new String[]{},
                    new String[]{});
        } else if (cmbGBuildType.getSelectedItem().equals("Emergency Service")) {
            txtFieldThree.setVisible(false);
            cmbFieldFour.setVisible(true);
            govConfig("Sustainability", "Floors", "", "Service Type", "",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{"1", "3", "10", "20"},
                    new String[]{"Police", "Fire"},
                    new String[]{});
        } else if (cmbGBuildType.getSelectedItem().equals("Community Centre")) {
            txtFieldThree.setVisible(false);
            govConfig("Sustainability", "Floors", "", "", "Amenities",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{"1", "2", "3", "4"},
                    new String[]{},
                    new String[]{});
            amentitySet("Pool", "Gym", "Rink");
        } else if (cmbGBuildType.getSelectedItem().equals("Park")) {
            cmbFieldTwo.setVisible(false);
            govConfig("Clean Rating", "", "Area", "", "Amenities",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{},
                    new String[]{},
                    new String[]{});
            amentitySet("Baseball", "Soccer", "Splash Pad");
        } else if (cmbGBuildType.getSelectedItem().equals("Disposal Centre")) {
            cmbFieldTwo.setVisible(false);
            txtFieldThree.setVisible(false);
            govConfig("Pollution", "", "", "", "",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{},
                    new String[]{},
                    new String[]{});
        } else {
            cmbFieldTwo.setVisible(false);
            txtFieldThree.setVisible(false);
            govConfig("Busyness", "", "", "", "",
                    new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"},
                    new String[]{},
                    new String[]{},
                    new String[]{});
        }
    }//GEN-LAST:event_cmbGBuildTypeActionPerformed

    // When an item is selected in the buy list in the buyer mode
    private void buyListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_buyListValueChanged
        if (!evt.getValueIsAdjusting() && buyList.getSelectedIndex() != -1) { // only run on the mouse click release event
            // Get the selected address from the buyList
            String adr = buyList.getSelectedValue();

            // Find the corresponding ResidentialBuilding using the addressSearch function
            ResidentialBuilding openHouse = ((ResidentialBuilding) addressSearch(adr, residentialBuildings));

            // Update the distance & price of the selected ResidentialBuilding
            updateDistance(openHouse);

            // Update the UI elements to display the details of the selected ResidentialBuilding
            lblUnits.setVisible(false);
            lblGym.setVisible(false);
            lblBathrooms.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            lblYard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            lblBonus.setIcon(openHouse.isBonus() ? new javax.swing.ImageIcon(getClass().getResource("/proxBonus.png")) : new javax.swing.ImageIcon(getClass().getResource("/proxPenalty.png")));

            // Check the type of the selected ResidentialBuilding and customize the UI accordingly
            if (openHouse.getId().contains("HH")) {
                backdropBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buy House.png")));
                lblYard.setText(String.valueOf(((House) openHouse).getBackyardSize()) + " sqft");
                lblParking.setText(String.valueOf(openHouse.getParkingSpaces()));
            } else if (openHouse.getId().contains("TH")) {
                backdropBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buy Townhouse.png")));
                lblYard.setText(String.valueOf(((Townhouse) openHouse).getBackyardSize()) + " sqft");
                lblParking.setText(String.valueOf(openHouse.getParkingSpaces()));
            } else {
                backdropBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buy Apartment.png")));
                lblBathrooms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblYard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                lblUnits.setVisible(true);
                lblUnits.setText(String.valueOf(((Apartment) openHouse).getNumUnits()));
                lblGym.setVisible(true);
                lblGym.setText(String.valueOf(((Apartment) openHouse).getHasGym()));
                lblParking.setText(String.valueOf(((Apartment) openHouse).getHasPool()));
                lblYard.setText(String.valueOf(((Apartment) openHouse).getHasTennisCourt()));
            }

            lblPrice.setText("$" + round(openHouse.getPrice()));
            lblAddress.setText(adr.toUpperCase());
            lblArea.setText(openHouse.getSurfaceArea() + " sqft");
            lblFloors.setText(String.valueOf(openHouse.getNumFloors()));
            lblBedrooms.setText(String.valueOf(openHouse.getNumBedrooms()));
            lblBathrooms.setText(String.valueOf(openHouse.getNumBathrooms()));
        }
    }//GEN-LAST:event_buyListValueChanged

    // when the proximity (aka i or info icon) button is hit on the buyer screen
    private void btnProximityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximityActionPerformed
        if (buyList.getSelectedValue() != null) { // Check if an item is selected in the buyList
            String adr = buyList.getSelectedValue(); // Get the selected address from the buyList
            ResidentialBuilding openHouse = (ResidentialBuilding) addressSearch(adr, residentialBuildings); // Find the corresponding ResidentialBuilding using the addressSearch function
            String[] proxArray = openHouse.getNearestDistances(); // Get the array of nearest distances for the selected ResidentialBuilding

            // Set up and display the proximity dialog to show the nearest distances

            dProximity.setSize(465, 430);
            dProximity.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            lblHP.setText(proxArray[0] + " km");
            lblCC.setText(proxArray[1] + " km");
            lblES.setText(proxArray[2] + " km");
            lblS1.setText(proxArray[3] + " km");
            lblS2.setText(proxArray[4] + " km");
            lblS3.setText(proxArray[5] + " km");
            lblML.setText(proxArray[6] + " km");
            lblGS.setText(proxArray[7] + " km");
            lblPK.setText(proxArray[8] + " km");
            lblBS.setText(proxArray[9] + " km");
            lblSW.setText(proxArray[10] + " km");

            dProximity.setVisible(true);
        }
    }//GEN-LAST:event_btnProximityActionPerformed


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimEstate frame = new SimEstate();
                frame.setSize(735, 445);
                frame.setVisible(true);

                // ---------------------------------------------DEFAULT CONFIG--------------------------------------------------------------------------//
                House house1 = new House("141 CAMBRIDGE CRES", "HH-01", 1000, 7, 7, 0, 8, 3, 4000);
                House house2 = new House("88 Briggs Avenue", "HH-02", 400, 3, 4, 0, 5, 4, 2500);
                House house3 = new House("80 Alpine Cres", "HH-03", 350, 3, 3, 0, 3, 3, 2000);
                House house4 = new House("365 Neal Dr", "HH-04", 200, 2, 3, 0, 4, 3, 1800);
                House house5 = new House("11521 95 Avenue", "HH-05", 500, 2, 4, 0, 4, 4, 2200);

                //Create example Places (Parks)
                Park park1 = new Park("133 Main Street", "PK-01", "Central Park", 5000.0, 9, true, true, true);
                Park park2 = new Park("496 Elm Street", "PK-02", "Riverside Park", 3000.0, 8, false, true, false);
                Park park3 = new Park("701 Oak Street", "PK-03", "Greenwood Park", 4000.0, 7, true, false, true);

                //Create example places (Emergency Services)
                // Create two fire stations
                EmergencyServiceStation fireStation1 = new EmergencyServiceStation("658 Bloor Street", "ES-01", "Fire Station 1", 9, 2, "Fire");
                EmergencyServiceStation fireStation2 = new EmergencyServiceStation("2201 Bathurst Street", "ES-02", "Fire Station 2", 8, 3, "Fire");
                // Create one police station
                EmergencyServiceStation policeStation = new EmergencyServiceStation("453 Yonge Street", "ES-03", "Police Station 1", 9, 2, "Police");

                // Create four bus stops and four subway stations with unique addresses
                BusStop busStop1 = new BusStop("9001 Yonge Street", "BS-01", "Bus Stop 1", 8);
                BusStop busStop2 = new BusStop("323 Dundas Street West", "BS-02", "Bus Stop 2", 6);
                BusStop busStop3 = new BusStop("755 College Street", "BS-03", "Bus Stop 3", 7);
                BusStop busStop4 = new BusStop("77 Front Street West", "BS-04", "Bus Stop 4", 5);
                SubwayStation subwayStation1 = new SubwayStation("4242 Broadway", "SW-01", "Station 1", 8);
                SubwayStation subwayStation2 = new SubwayStation("4554 5th Avenue", "SW-02", "Station 2", 6);
                SubwayStation subwayStation3 = new SubwayStation("121 Lexington Avenue", "SW-03", "Station 3", 7);
                SubwayStation subwayStation4 = new SubwayStation("24 Park Avenue", "SW-04", "Station 4", 5);

                // Create an apartment building
                Apartment apartment1 = new Apartment("344 Shepherd Ave", "AB-01", 100, 1, 2, 800000, 100, 6, 800, true, true, true);

                //Create 3 schools
                School elementarySchool = new School("3292 Oak Street", "SS-01", "Oak Elementary School", 8, false, 5000.0, "Elementary", false, false, true);
                School secondarySchool = new School("32 Maple Avenue", "SS-02", "Northern Heights Secondary School", 9, false, 8000.0, "Secondary", true, false, false);
                School uOfT = new School("65 St. George", "SS-03", "University of Toronto", 7, true, 10000.0, "Post-Secondary", true, true, true);

                //Create Other Buildings
                GarbageDisposal garbageDisposal = new GarbageDisposal("10 Keele Avenue", "GD-01", "Recycle Center", 7);
                GroceryStore groceryStore1 = new GroceryStore("139 Orange Street", "GS-01", "SuperMart", 2, 500, 8, true, true);
                GroceryStore groceryStore2 = new GroceryStore("11 Apple Avenue", "GS-02", "FreshGrocers", 1, 300, 7, false, true);
                Mall mall1 = new Mall("365 Bayview Avenue", "ML-01", "Prestige Shopping Centre", 4, 2000, 130, true, true);
                CommunityCentre communityCentre1 = new CommunityCentre("34 Yonge Street", "CC-01", "LiveWell Centre", 8, 3, true, true, true);
                Hospital hospital1 = new Hospital("311 Silver Avenue", "HP-01", 9, 6, "Baywell Hospital", 1000);

                // Add places to the places lists
                Place[] fillArray = {house1, house2, house3, house4, house5, apartment1, park1, park2, park3, fireStation1, fireStation2, policeStation, busStop1, busStop2, busStop3, busStop4,
                        subwayStation1, subwayStation2, subwayStation3, subwayStation4, elementarySchool, secondarySchool, uOfT, garbageDisposal, groceryStore1, groceryStore2, mall1, communityCentre1, hospital1};

                residentialBuildings.add(house1);
                residentialBuildings.add(house2);
                residentialBuildings.add(house3);
                residentialBuildings.add(house4);
                residentialBuildings.add(house5);
                residentialBuildings.add(apartment1);

                Collections.addAll(places, fillArray);

                // Create example Roads
                for (int i = 0; i < places.size(); i++) {
                    for (int j = i + 1; j < places.size(); j++) {
                        Place source = places.get(i);
                        Place destination = places.get(j);
                        int distance = (int) (Math.random() * 100);
                        roads.add(new Road(source, destination, distance));
                    }
                }

                // Create reverse directions of roads and add them to the original list
                ArrayList<Road> reverseRoads = new ArrayList<>();
                for (Road road : roads) {
                    reverseRoads.add(new Road(road.getEnd(), road.getStart(), road.getDistance()));
                }
                roads.addAll(reverseRoads);

                // Each residential building's distance to all other places
                for (ResidentialBuilding rb : residentialBuildings) {
                    calculateAllDistancesForAHome(rb);
                    rb.sortDistances();
                    rb.displayNearestDistances();
                }
            }
        });
    }

    // This method clears all the text fields and resets the combo boxes in a given panel. It then sets the size, modality, and visibility of a dialog window.
    public void screenRoute(javax.swing.JDialog dialog, javax.swing.JPanel panel) {

        for (Component control : panel.getComponents()) { // iterate through all textfields and combo boxes on the last screen and clear them
            if (control instanceof javax.swing.JTextField) {
                javax.swing.JTextField ctrl = (javax.swing.JTextField) control;
                ctrl.setText(""); // clear fields
            } else if (control instanceof javax.swing.JComboBox) {
                javax.swing.JComboBox ctr = (javax.swing.JComboBox) control;
                ctr.setSelectedIndex(0); // reset combo boxes to the first index
            }
        }

        dialog.setSize(735, 445); // set window size
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // set modality to block input from windows other than this one
        dialog.setVisible(true);
    }

    // This method creates and returns a DefaultComboBoxModel based on the selected item in a given combo box.
    // If the selected item is "Residential", it populates the model with addresses of residential buildings.
    // Otherwise, it populates the model with names of places other than residential buildings
    public DefaultComboBoxModel<String> desModel(javax.swing.JComboBox combo) {
        if (Objects.equals(combo.getSelectedItem(), "Residential")) {
            ArrayList<String> resList = new ArrayList<String>();
            for (ResidentialBuilding residentialBuilding : residentialBuildings) {
                resList.add(residentialBuilding.getAddress());
            }

            return new DefaultComboBoxModel<>(resList.toArray((String[]::new)));
        } else {
            ArrayList<String> markList = new ArrayList<String>();
            for (Place place : places) {
                if (!place.getId().contains("HH") && !place.getId().contains("AB") && !place.getId().contains("TH")) { // ignore residential buildings
                    markList.add(place.getName());
                }
            }

            DefaultComboBoxModel markModel = new DefaultComboBoxModel<>(markList.toArray((String[]::new)));

            return markModel;
        }
    }

    // This method configures the labels and combo boxes based on the selected "Build Type" in the GUI.
    // It sets the labels and populates the combo boxes with given arrays.
    public void govConfig(String one, String two, String three, String four, String five,
                          String[] modelOne, String[] modelTwo, String[] modelFour, String[] modelFive) {
        lblFieldOne.setText(one);
        cmbFieldOne.setModel(new DefaultComboBoxModel<>(modelOne));

        lblFieldTwo.setText(two);
        cmbFieldTwo.setModel(new DefaultComboBoxModel<>(modelTwo));

        lblFieldThree.setText(three);

        lblFieldFour.setText(four);
        cmbFieldFour.setModel(new DefaultComboBoxModel<>(modelFour));

        lblFieldFive.setText(five);
        cmbFieldFive.setModel(new DefaultComboBoxModel<>(modelFive));
    }

    // This method sets the visibility and text of three checkboxes representing amenities.
    public void amentitySet(String first, String second, String third) {
        chkGOne.setVisible(true);
        chkGOne.setText(first);
        chkGTwo.setVisible(true);
        chkGTwo.setText(second);
        chkGThree.setVisible(true);
        chkGThree.setText(third);
    }

    // This method returns if address contains the correct suffix
    public boolean addressValid(String address) {
        address = address.toLowerCase();
        return address.contains("st") || address.contains("ave") || address.contains("rd") ||
                address.contains("ln") || address.contains("blvd") || address.contains("dr");
    }

    // This method extracts an integer value from the selected item of a given combo box.
    public int comboExtract(javax.swing.JComboBox combo) {
        return Integer.parseInt(String.valueOf(combo.getSelectedItem()));
    }

    // This method searches for a place in the list based on its name.
    // It compares the given name (case-insensitive) with the names of places in the list and returns the matching place.
    // If no match is found, it returns null.
    public Place nameSearch(String name, ArrayList<Place> places) {
        for (Place place : places) {
            if ((place.getName().toLowerCase()).equals(name.toLowerCase())) {
                return place;
            }
        }
        return null;
    }

    // This method searches for a place in the list based on its address.
    // It compares the given address (case-insensitive) with the addresses of places in the list and returns the matching place.
    // If no match is found, it returns null.
    public Place addressSearch(String address, ArrayList<? extends Place> residences) {
        for (Place residence : residences) {
            if ((residence.getAddress().toLowerCase()).equals(address.toLowerCase())) {
                return residence;
            }
        }
        return null;
    }

    // This method generates the next ID for a new place based on the given placeCode and list of places.
    // It searches for the last ID in the list that starts with the given placeCode and increments it to generate the next ID.
    // If no matching IDs are found, it returns the default ID "01".
    public String nextID(String placeCode, ArrayList<? extends Place> list) {
        String lastID = "";
        for (Place place : list) {
            if (place.getId().substring(0, 2).equals(placeCode)) {
                lastID = (place.getId()).substring(3);
            }
        }

        if (!lastID.isEmpty()) {
            if (Character.getNumericValue(lastID.charAt(0)) == 0) {
                return Integer.valueOf(lastID.charAt(1)) != 9 ? "0" + (Character.getNumericValue(lastID.charAt(1)) + 1) : "10";
            } else {
                return String.valueOf((Integer.valueOf(lastID)) + 1);
            }
        } else {
            return "01";
        }
    }

    // This method rounds a double value to two decimal places.
    public static double round(double number) {
        double roundedValue = number * 100;
        roundedValue = Math.round(roundedValue);
        roundedValue = roundedValue / 100;
        return roundedValue;
    }

    //-------------------------------------ALGORITHMS-------------------------------------------------//

    // Method to calculate the distance between a home to all other places
    public static void calculateAllDistancesForAHome(ResidentialBuilding home) {
        // Create a new adjacency list to store the connections between places and roads
        Map<Place, List<Road>> adjacencyList = new HashMap<>();

        // Build the adjacency list by adding neighbor roads for each place
        for (Place place : places) {
            List<Road> neighborRoads = new ArrayList<>();
            for (Road road : roads) {
                if (road.getStart() == place) {
                    neighborRoads.add(road);
                }
            }
            adjacencyList.put(place, neighborRoads);
        }

        // Run Dijkstra's algorithm with the example adjacency list
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(adjacencyList);
        // Create a distanceMap to store the distances from this house to all places
        Map<Place, Integer> distanceMap = dijkstra.shortestPaths(home);

        double basePrice = home.getPrice();
        // Output the shortest paths from Place A to all other Placesdouble initialPrice = basePrice;
        for (Place place : distanceMap.keySet()) {
            if (place instanceof Hospital) {
                home.addHospitalDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.1 * ((100 - distanceMap.get(place)) / 100.0)); // distance
                home.addPrice(basePrice * 0.0001 * ((Hospital) place).getMaxCapacity()); // capacity
            } else if (place instanceof CommunityCentre) {
                home.addCommunityCentreDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.04 * ((100 - distanceMap.get(place)) / 100.0));
                if (((CommunityCentre) place).hasPool()) {
                    home.addPrice(basePrice * 0.004);
                }
                if (((CommunityCentre) place).hasGym()) {
                    home.addPrice(basePrice * 0.004);
                }
                if (((CommunityCentre) place).hasRink()) {
                    home.addPrice(basePrice * 0.004);
                }
            } else if (place instanceof School) {
                School school = (School) place;
                if (school.getSchoolGrade().equals("Elementary")) {
                    home.addElementaryDistance(distanceMap.get(place));
                } else if (school.getSchoolGrade().equals("Post-Secondary")) {
                    home.addSecondaryDistance(distanceMap.get(place));
                } else {
                    home.addPostSecondaryDistance(distanceMap.get(place));
                }
                home.addPrice(basePrice * 0.1 * ((100 - distanceMap.get(place)) / 100.0));
                if (((School) place).getRanking() == 10) {
                    home.addPrice(basePrice * 0.05);
                } else if (((School) place).getRanking() < 20) {
                    home.addPrice(basePrice * 0.02);
                } else {
                    home.addPrice(basePrice * -0.05);
                }
                if (((School) place).hasIB()) {
                    home.addPrice(basePrice * 0.01);
                }
                if (((School) place).hasGifted()) {
                    home.addPrice(basePrice * 0.01);
                }
                if (((School) place).hasFrench()) {
                    home.addPrice(basePrice * 0.01);
                }
            } else if (place instanceof Mall) {
                home.addMallDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.03 * ((100 - distanceMap.get(place)) / 100.0));
                if (((Mall) place).getNumStores() > 30) {
                    home.addPrice(basePrice * 0.003);
                }
                if (((Mall) place).hasMovieTheater()) {
                    home.addPrice(basePrice * 0.003);
                }
                if (((Mall) place).hasFoodCourt()) {
                    home.addPrice(basePrice * 0.003);
                }
            } else if (place instanceof GroceryStore) {
                home.addGroceryStoreDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.05 * ((100 - distanceMap.get(place)) / 100.0));
                if (((GroceryStore) place).getAffordabilityRating() > 5) {
                    home.addPrice(basePrice * 0.001 * ((GroceryStore) place).getAffordabilityRating());
                } else {
                    home.addPrice(basePrice * -0.01 * ((GroceryStore) place).getAffordabilityRating());
                }
                if (((GroceryStore) place).hasPharmacy()) {
                    home.addPrice(basePrice * 0.005);
                }
                if (((GroceryStore) place).hasBakery()) {
                    home.addPrice(basePrice * 0.005);
                }
            } else if (place instanceof Park) {
                home.addParkDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.03 * ((100 - distanceMap.get(place)) / 100.0));
                if (((Park) place).getSurfaceArea() >= 215278) { // 2 hectares
                    home.addPrice(basePrice * 0.005);
                }
                if (((Park) place).getCleanRating() > 6) {
                    home.addPrice(basePrice * 0.001 * ((Park) place).getCleanRating());
                } else {
                    home.addPrice(basePrice * -0.005 * ((Park) place).getCleanRating());
                }
                if (((Park) place).hasBaseballDiamond()) {
                    home.addPrice(basePrice * 0.005);
                }
                if (((Park) place).hasSoccerField()) {
                    home.addPrice(basePrice * 0.005);
                }
                if (((Park) place).hasSplashPad()) {
                    home.addPrice(basePrice * 0.005);
                }
            } else if (place instanceof BusStop) {
                home.addBusStopDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.05 * ((100 - distanceMap.get(place)) / 100.0));
                if (((BusStop) place).getBusyRating() < 5) {
                    home.addPrice(basePrice * 0.001 * ((BusStop) place).getBusyRating());
                } else {
                    home.addPrice(basePrice * -0.01 * ((BusStop) place).getBusyRating());
                }
            } else if (place instanceof SubwayStation) {
                home.addSubwayStationDistance(distanceMap.get(place));
                home.addPrice(basePrice * 0.05 * ((100 - distanceMap.get(place)) / 100.0));
                if (((SubwayStation) place).getBusyRating() < 5) {
                    home.addPrice(basePrice * 0.001 * ((SubwayStation) place).getBusyRating());
                } else {
                    home.addPrice(basePrice * -0.01 * ((SubwayStation) place).getBusyRating());
                }
            } else if (place instanceof EmergencyServiceStation) {
                home.addEmergencyServiceStationDistance(distanceMap.get(place));
            } else if (place instanceof GarbageDisposal) {
                home.addPrice(basePrice * -0.01 * ((GarbageDisposal) place).getPollution());
            }
        }
        home.setBonus(basePrice < home.getPrice()); // Set a bonus flag for the home if it its value rose from the algorithm
        System.out.println("Valuation: $" + home.getPrice());
    }

    //Method to update all the distances
    public static void updateDistance(ResidentialBuilding rb) {
        if (rb instanceof House) {
            ((House) rb).setPrice(House.calculateHousePrice(rb.getSurfaceArea(), rb.getNumBathrooms(), rb.getNumBedrooms(), rb.getParkingSpaces(), ((House) rb).getBackyardSize()));
        } else if (rb instanceof Townhouse) {
            ((Townhouse) rb).setPrice(Townhouse.calculateHousePrice(rb.getSurfaceArea(), rb.getNumBathrooms(), rb.getNumBedrooms(), rb.getParkingSpaces(), ((House) rb).getBackyardSize()));
        } else {
            ((Apartment) rb).setPrice(Apartment.calculateApartmentPrice(rb.getSurfaceArea(), rb.getNumBathrooms(), rb.getNumBedrooms()));
        }

        rb.clearLists(); // Clear all the lists of distances in the ResidentialBuilding
        calculateAllDistancesForAHome(rb); // Calculate all the distances  from this ResidentialBuilding to all other places and price
        rb.sortDistances(); // Sort the distances for easy access to nearest places
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backDrop;
    private javax.swing.JLabel backDropModes;
    private javax.swing.JLabel backdropBuy;
    private javax.swing.JLabel backdropCBuild;
    private javax.swing.JLabel backdropCDes;
    private javax.swing.JLabel backdropGBuild;
    private javax.swing.JLabel backdropGDes;
    private javax.swing.JLabel backdropNearest;
    private javax.swing.JButton btnBegin;
    private javax.swing.JButton btnBuyer;
    private javax.swing.JButton btnCBuild;
    private javax.swing.JButton btnCDes;
    private javax.swing.JButton btnContractor;
    private javax.swing.JButton btnGBuild;
    private javax.swing.JButton btnGDes;
    private javax.swing.JButton btnGov;
    private javax.swing.JButton btnProximity;
    private javax.swing.JList<String> buyList;
    private javax.swing.JTextArea cBuildFeedback;
    private javax.swing.JTextArea cDesFeedback;
    private javax.swing.JCheckBox chkCOne;
    private javax.swing.JCheckBox chkCThree;
    private javax.swing.JCheckBox chkCTwo;
    private javax.swing.JCheckBox chkGOne;
    private javax.swing.JCheckBox chkGThree;
    private javax.swing.JCheckBox chkGTwo;
    private javax.swing.JComboBox<String> cmbCBathrooms;
    private javax.swing.JComboBox<String> cmbCBedrooms;
    private javax.swing.JComboBox<String> cmbCBuildType;
    private javax.swing.JComboBox<String> cmbCDes;
    private javax.swing.JComboBox<String> cmbCDesType;
    private javax.swing.JComboBox<String> cmbCFloors;
    private javax.swing.JComboBox<String> cmbCParking;
    private javax.swing.JComboBox<String> cmbFieldFive;
    private javax.swing.JComboBox<String> cmbFieldFour;
    private javax.swing.JComboBox<String> cmbFieldOne;
    private javax.swing.JComboBox<String> cmbFieldTwo;
    private javax.swing.JComboBox<String> cmbGBuildType;
    private javax.swing.JComboBox<String> cmbGDes;
    private javax.swing.JComboBox<String> cmbGDesType;
    private javax.swing.JDialog dBuyer;
    private javax.swing.JDialog dContractBuild;
    private javax.swing.JDialog dContractDes;
    private javax.swing.JDialog dGovBuild;
    private javax.swing.JDialog dGovDes;
    private javax.swing.JDialog dProximity;
    private javax.swing.JDialog dSimModes;
    private javax.swing.JTextArea gBuildFeedback;
    private javax.swing.JTextArea gDesFeedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBS;
    private javax.swing.JLabel lblBathrooms;
    private javax.swing.JLabel lblBedrooms;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblES;
    private javax.swing.JLabel lblFieldFive;
    private javax.swing.JLabel lblFieldFour;
    private javax.swing.JLabel lblFieldOne;
    private javax.swing.JLabel lblFieldThree;
    private javax.swing.JLabel lblFieldTwo;
    private javax.swing.JLabel lblFloors;
    private javax.swing.JLabel lblGS;
    private javax.swing.JLabel lblGym;
    private javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblML;
    private javax.swing.JLabel lblPK;
    private javax.swing.JLabel lblParking;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblSW;
    private javax.swing.JLabel lblUnits;
    private javax.swing.JLabel lblYard;
    private javax.swing.JTextField txtCAddress;
    private javax.swing.JTextField txtCArea;
    private javax.swing.JTextField txtCDistance;
    private javax.swing.JTextField txtCYardArea;
    private javax.swing.JTextField txtFieldThree;
    private javax.swing.JTextField txtGAddress;
    private javax.swing.JTextField txtGDistance;
    private javax.swing.JTextField txtGName;
}