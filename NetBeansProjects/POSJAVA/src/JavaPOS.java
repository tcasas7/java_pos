import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JavaPOS extends javax.swing.JFrame {

    private POSLogic posLogic;

    public JavaPOS(POSLogic posLogic) {
        this.posLogic = posLogic;
        initComponents();
        DatabaseInitializer.initializeDatabase();
    }

    public JavaPOS() {
        this.posLogic = new POSLogic();
        initComponents();
        DatabaseInitializer.initializeDatabase();
    }

    public void setTableName(String tableName) {
        setTitle("JavaPOS - " + tableName);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        
        

        jPanel1 = new javax.swing.JPanel();
        jbtnLevainCookies = new javax.swing.JButton();
        jbtnDBLCheeseBurger = new javax.swing.JButton();
        jbtnFriedChickenSandwich = new javax.swing.JButton();
        jbtnPizza = new javax.swing.JButton();
        jbtnIceCream = new javax.swing.JButton();
        jbtnMilkShake = new javax.swing.JButton();
        jbtnFries = new javax.swing.JButton();
        jbtnBaconCheeseFries = new javax.swing.JButton();
        jbtnOnionRings = new javax.swing.JButton();
        jbtnMozzarellaSticks = new javax.swing.JButton();
        jbtnNuggs = new javax.swing.JButton();
        jbtnCheeseBurger = new javax.swing.JButton();
        jbtnWatter = new javax.swing.JButton();
        jbtnCoke = new javax.swing.JButton();
        jbtnDietCoke = new javax.swing.JButton();
        jbtnFanta = new javax.swing.JButton();
        jbtnSprite = new javax.swing.JButton();
        jbtnLemonade = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtn9 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jtxtBarCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnLevainCookies.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnLevainCookies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/galles.jpeg"))); // NOI18N
        jbtnLevainCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLevainCookiesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLevainCookies, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 100, 120));

        jbtnDBLCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDBLCheeseBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Double CB.jpeg"))); // NOI18N
        jbtnDBLCheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDBLCheeseBurgerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDBLCheeseBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 120));

        jbtnFriedChickenSandwich.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFriedChickenSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chiken sand.jpeg"))); // NOI18N
        jbtnFriedChickenSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFriedChickenSandwichActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFriedChickenSandwich, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 100, 120));

        jbtnPizza.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pizza.jpeg"))); // NOI18N
        jbtnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPizzaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 120));

        jbtnIceCream.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/helad.jpeg"))); // NOI18N
        jbtnIceCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIceCreamActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIceCream, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 100, 120));

        jbtnMilkShake.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnMilkShake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MilkShake.jpeg"))); // NOI18N
        jbtnMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMilkShakeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMilkShake, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, 120));

        jbtnFries.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fries.jpg"))); // NOI18N
        jbtnFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFriesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFries, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 120));

        jbtnBaconCheeseFries.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnBaconCheeseFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BCFRIES.jpeg"))); // NOI18N
        jbtnBaconCheeseFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBaconCheeseFriesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBaconCheeseFries, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 120));

        jbtnOnionRings.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnOnionRings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OnionRings.jpeg"))); // NOI18N
        jbtnOnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOnionRingsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnOnionRings, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, 120));

        jbtnMozzarellaSticks.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnMozzarellaSticks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Muzzas.jpeg"))); // NOI18N
        jbtnMozzarellaSticks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMozzarellaSticksActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMozzarellaSticks, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 100, 120));

        jbtnNuggs.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnNuggs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nuggets.jpeg"))); // NOI18N
        jbtnNuggs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuggsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuggs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, 120));

        jbtnCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnCheeseBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cheeseBurga.jpeg"))); // NOI18N
        jbtnCheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheeseBurgerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCheeseBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 100, 120));

        jbtnWatter.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnWatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aguita.jpeg"))); // NOI18N
        jbtnWatter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnWatterActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnWatter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 120));

        jbtnCoke.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coca vidrio.jpeg"))); // NOI18N
        jbtnCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCokeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 120));

        jbtnDietCoke.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDietCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/diet-coke-bottle-8oz-3_1.jpg"))); // NOI18N
        jbtnDietCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDietCokeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDietCoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, 120));

        jbtnFanta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fanta.jpeg"))); // NOI18N
        jbtnFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFantaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 120));

        jbtnSprite.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sprite.jpeg"))); // NOI18N
        jbtnSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSpriteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 100, 120));

        jbtnLemonade.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnLemonade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lemonade.jpeg"))); // NOI18N
        jbtnLemonade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLemonadeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 690, 440));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 90));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 90));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 90));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 90));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, 90));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 70, 90));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 90));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 70, 90));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 70, 90));

        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 70, 90));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 70, 90));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 310, 360));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SubTotal");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Tax");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, -1));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 180));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 180));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cash");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Payment Method");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Change");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jPanel9.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 170, -1));

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChangeActionPerformed(evt);
            }
        });
        jPanel9.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, -1));

        jcboPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Visa Card", "Master Card", " " }));
        jcboPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboPaymentActionPerformed(evt);
            }
        });
        jPanel9.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 440, 180));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 170, 50));

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 50));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 50));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 390, 60));

        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, 50));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 440, 180));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 230));

        jtxtBarCode.setFont(new java.awt.Font("Code39", 0, 48)); // NOI18N
        jtxtBarCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 310, 80));

        pack();
        setLocationRelativeTo(null);
    }

    private void Change() {
        double sum = 0;
        String input = jtxtDisplay.getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Err: Se necesita ingresar un monto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            double cash = Double.parseDouble(input);
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                sum += Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            }
            double cTax = posLogic.calculateTax(sum);
            double cChange = posLogic.calculateChange(cash, posLogic.calculateTotal(sum, cTax));
            if (cChange < 0) {
                double falta = posLogic.calculateTotal(sum, cTax) - cash;
                JOptionPane.showMessageDialog(null, "Err: monto insuficiente. Faltan $" + String.format("%.2f", falta), "Advertencia", JOptionPane.WARNING_MESSAGE);
                jtxtChange.setText(""); 
            } else {
                jtxtChange.setText(String.format("$ %.2f", cChange));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Err: El monto ingresado no es válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ItemCost() {
        double sum = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum += Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        double cTax = posLogic.calculateTax(sum);
        double cTotal = posLogic.calculateTotal(sum, cTax);
        jtxtSubTotal.setText(String.format("$ %.2f", sum));
        jtxtTax.setText(String.format("$ %.2f", cTax));
        jtxtTotal.setText(String.format("$ %.2f", cTotal));
    }

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn3.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn3.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn6.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn6.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jtxtDisplay.setText("");
        jtxtChange.setText("");
    }                                         

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
   String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn5.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn5.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jcboPaymentActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jtxtChangeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn1.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn1.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (! jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText( jtxtDisplay.getText() + jbtnDot.getText());
        }
    }                                       

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn2.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn2.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    posLogic.clearDatabase();  // Eliminar todos los productos de la base de datos
    jtxtChange.setText("");
    jtxtTax.setText("");
    jtxtTotal.setText("");
    jtxtSubTotal.setText("");
    jtxtDisplay.setText("");
    jtxtBarCode.setText("");
}
           


/*
private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {
    if (jcboPayment.getSelectedItem().equals("Cash")) {
        Change();
    } else {
        jtxtChange.setText("");
        jtxtDisplay.setText("");
    }
    posLogic.saveOrderToDatabase(jTable1, getTitle());  // Save order to the database
}
 */                                 

private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {
    String paymentMethod = jcboPayment.getSelectedItem().toString();
    
    if (paymentMethod.equals("Cash")) {
        Change();
    } else {
        jtxtChange.setText("");
        jtxtDisplay.setText("");
    }

    // Guardar la orden en la base de datos
    posLogic.saveOrderToDatabase(jTable1, getTitle());

    // Generar el recibo de la orden
    Double subTotal = Double.parseDouble(jtxtSubTotal.getText().replace("$", "").replace(",", ".").trim());
    Double tax = Double.parseDouble(jtxtTax.getText().replace("$", "").replace(",", ".").trim());
    Double total = Double.parseDouble(jtxtTotal.getText().replace("$", "").replace(",", ".").trim());

    try {
        htmlPrint.generateHtmlFile(jTable1, "table.html", subTotal, tax, total, paymentMethod);
        Desktop.getDesktop().browse(new File("table.html").toURI());
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {
    String paymentMethod = jcboPayment.getSelectedItem().toString();

    Double subTotal = Double.parseDouble(jtxtSubTotal.getText().replace("$", "").replace(",", ".").trim());
    Double tax = Double.parseDouble(jtxtTax.getText().replace("$", "").replace(",", ".").trim());
    Double total = Double.parseDouble(jtxtTotal.getText().replace("$", "").replace(",", ".").trim());

    try {
        htmlPrint.generateHtmlFile(jTable1, "table.html", subTotal, tax, total, paymentMethod);
        Desktop.getDesktop().browse(new File("table.html").toURI());
    } catch (IOException e) {
        e.printStackTrace();
    }
}




    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Point of Sale", 
                                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
            
    }                                        

private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {                                           
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        String itemName = model.getValueAt(selectedRow, 0).toString();
        posLogic.removeItemFromDatabase(itemName);  // Eliminar de la base de datos
        posLogic.removeItem(model, selectedRow);    // Eliminar de la tabla
        ItemCost();
        if (jcboPayment.getSelectedItem().equals("Cash")) {
            Change();
        } else {
            jtxtChange.setText("");
            jtxtDisplay.setText("");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No item selected", "Error", JOptionPane.ERROR_MESSAGE);
    }
}                                         

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn7.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn7.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn8.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn8.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn9.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn9.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn4.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn4.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
         String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber == "")
        {
            jtxtDisplay.setText(jbtn0.getText());
        }
        else 
        {
           Enternumber = jtxtDisplay.getText() + jbtn0.getText();
           jtxtDisplay.setText(Enternumber);
        }
    }                                     

    private void jbtnWatterActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
   double PriceOfItem = 4.00;
    String itemName = "Watter";
    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }   
    ItemCost();
    }                                          

    private void jbtnLevainCookiesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        double PriceOfItem = 4.50;
        String itemName = "Cookies";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
        
        
    ItemCost();    
    }                                                 

    private void jbtnDietCokeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        double PriceOfItem = 3.50;
        String itemName = "DietCoke";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
        
        
    ItemCost(); 
        
    }                                            

    private void jbtnCokeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double PriceOfItem = 3.50;
        String itemName = "Coke";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                        

    private void jbtnFantaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double PriceOfItem = 3.50;
        String itemName = "Fanta";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                         

    private void jbtnSpriteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        double PriceOfItem = 3.50;
        String itemName = "Sprite";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
    }                                          

    private void jbtnLemonadeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        double PriceOfItem = 3.50;
        String itemName = "Lemonade";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                            

    private void jbtnFriesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double PriceOfItem = 5.00;
        String itemName = "Fries";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                          

    private void jbtnBaconCheeseFriesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       double PriceOfItem = 6.50;
        String itemName = "BC Fries";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                                    

    private void jbtnOnionRingsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        double PriceOfItem = 6.00;
        String itemName = "Onion Rings";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost(); 
        
    }                                              

    private void jbtnMozzarellaSticksActionPerformed(java.awt.event.ActionEvent evt) {                                                     
         double PriceOfItem = 6.00;
        String itemName = "Mozzarella Sticks";
         
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                                    

    private void jbtnNuggsActionPerformed(java.awt.event.ActionEvent evt) {                                          
         double PriceOfItem = 6.50;
        String itemName = "Nuggets";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                         

    private void jbtnCheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {                                                 
         double PriceOfItem = 7.50;
        String itemName = "Cheese Burger";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                                

    private void jbtnDBLCheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        double PriceOfItem = 9.50;
        String itemName = "DBL Cheese Burger";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                                   

    private void jbtnFriedChickenSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                                         
       double PriceOfItem = 9.00;
       String itemName = "Fried Chicken Sandwich";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                                        

    private void jbtnPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double PriceOfItem = 15.00;
        String itemName = "Pizza";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                         

    private void jbtnIceCreamActionPerformed(java.awt.event.ActionEvent evt) {                                             
       double PriceOfItem = 10.00;
       String itemName = "Ice-Cream"; 
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                            

    private void jbtnMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {                                              
         double PriceOfItem = 12.75;
         String itemName = "MilkShake";
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        boolean itemExists = false;
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if (model.getValueAt(i, 0).equals(itemName)) { 
            int currentQuantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double currentPrice = Double.parseDouble(model.getValueAt(i, 2).toString());
            currentQuantity++; 
            currentPrice += PriceOfItem; 
            model.setValueAt(currentQuantity, i, 1);
            model.setValueAt(currentPrice, i, 2);
            itemExists = true;
            break;
        }
    }
    
    if (!itemExists) {
        model.addRow(new Object[]{itemName, "1", PriceOfItem});
    }
    
    
    ItemCost();
        
    }                                             

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jtxtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBaconCheeseFries;
    private javax.swing.JButton jbtnCheeseBurger;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCoke;
    private javax.swing.JButton jbtnDBLCheeseBurger;
    private javax.swing.JButton jbtnDietCoke;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnFanta;
    private javax.swing.JButton jbtnFriedChickenSandwich;
    private javax.swing.JButton jbtnFries;
    private javax.swing.JButton jbtnIceCream;
    private javax.swing.JButton jbtnLemonade;
    private javax.swing.JButton jbtnLevainCookies;
    private javax.swing.JButton jbtnMilkShake;
    private javax.swing.JButton jbtnMozzarellaSticks;
    private javax.swing.JButton jbtnNuggs;
    private javax.swing.JButton jbtnOnionRings;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPizza;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSprite;
    private javax.swing.JButton jbtnWatter;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration                   
}
























    /*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnLevainCookies = new javax.swing.JButton();
        jbtnDBLCheeseBurger = new javax.swing.JButton();
        jbtnFriedChickenSandwich = new javax.swing.JButton();
        jbtnPizza = new javax.swing.JButton();
        jbtnIceCream = new javax.swing.JButton();
        jbtnMilkShake = new javax.swing.JButton();
        jbtnFries = new javax.swing.JButton();
        jbtnBaconCheeseFries = new javax.swing.JButton();
        jbtnOnionRings = new javax.swing.JButton();
        jbtnMozzarellaSticks = new javax.swing.JButton();
        jbtnNuggs = new javax.swing.JButton();
        jbtnCheeseBurger = new javax.swing.JButton();
        jbtnWatter = new javax.swing.JButton();
        jbtnCoke = new javax.swing.JButton();
        jbtnDietCoke = new javax.swing.JButton();
        jbtnFanta = new javax.swing.JButton();
        jbtnSprite = new javax.swing.JButton();
        jbtnLemonade = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtn9 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jtxtBarCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnLevainCookies.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnLevainCookies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/galles.jpeg"))); // NOI18N
        jbtnLevainCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLevainCookiesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLevainCookies, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 100, 120));

        jbtnDBLCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDBLCheeseBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Double CB.jpeg"))); // NOI18N
        jbtnDBLCheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDBLCheeseBurgerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDBLCheeseBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 120));

        jbtnFriedChickenSandwich.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFriedChickenSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chiken sand.jpeg"))); // NOI18N
        jbtnFriedChickenSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFriedChickenSandwichActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFriedChickenSandwich, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 100, 120));

        jbtnPizza.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pizza.jpeg"))); // NOI18N
        jbtnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPizzaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 120));

        jbtnIceCream.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/helad.jpeg"))); // NOI18N
        jbtnIceCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIceCreamActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIceCream, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 100, 120));

        jbtnMilkShake.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnMilkShake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MilkShake.jpeg"))); // NOI18N
        jbtnMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMilkShakeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMilkShake, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, 120));

        jbtnFries.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fries.jpg"))); // NOI18N
        jbtnFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFriesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFries, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 120));

        jbtnBaconCheeseFries.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnBaconCheeseFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BCFRIES.jpeg"))); // NOI18N
        jbtnBaconCheeseFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBaconCheeseFriesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBaconCheeseFries, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 120));

        jbtnOnionRings.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnOnionRings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OnionRings.jpeg"))); // NOI18N
        jbtnOnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOnionRingsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnOnionRings, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, 120));

        jbtnMozzarellaSticks.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnMozzarellaSticks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Muzzas.jpeg"))); // NOI18N
        jbtnMozzarellaSticks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMozzarellaSticksActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMozzarellaSticks, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 100, 120));

        jbtnNuggs.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnNuggs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nuggets.jpeg"))); // NOI18N
        jbtnNuggs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuggsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuggs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, 120));

        jbtnCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnCheeseBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cheeseBurga.jpeg"))); // NOI18N
        jbtnCheeseBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheeseBurgerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCheeseBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 100, 120));

        jbtnWatter.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnWatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aguita.jpeg"))); // NOI18N
        jbtnWatter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnWatterActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnWatter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 120));

        jbtnCoke.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coca vidrio.jpeg"))); // NOI18N
        jbtnCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCokeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 120));

        jbtnDietCoke.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDietCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/diet-coke-bottle-8oz-3_1.jpg"))); // NOI18N
        jbtnDietCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDietCokeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDietCoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, 120));

        jbtnFanta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fanta.jpeg"))); // NOI18N
        jbtnFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFantaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 120));

        jbtnSprite.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sprite.jpeg"))); // NOI18N
        jbtnSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSpriteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 100, 120));

        jbtnLemonade.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnLemonade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lemonade.jpeg"))); // NOI18N
        jbtnLemonade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLemonadeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 690, 440));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 90));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 90));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 70, 90));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 90));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, 90));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 70, 90));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 90));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 70, 90));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 70, 90));

        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 70, 90));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 70, 90));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 310, 360));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SubTotal");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Tax");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, -1));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 180));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 180));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cash");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Payment Method");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Change");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jPanel9.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 170, -1));

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChangeActionPerformed(evt);
            }
        });
        jPanel9.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, -1));

        jcboPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Visa Card", "Master Card", " " }));
        jcboPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboPaymentActionPerformed(evt);
            }
        });
        jPanel9.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 440, 180));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 130));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 170, 50));

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 50));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 50));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 390, 60));

        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel11.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, 50));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 440, 180));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 230));

        jtxtBarCode.setFont(new java.awt.Font("Code39", 0, 48)); // NOI18N
        jtxtBarCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBarCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 310, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//============================================FUNCION COSTO===============================================
 */
 
  /*
    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed

    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
    
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
  
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
 
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jcboPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboPaymentActionPerformed

    }//GEN-LAST:event_jcboPaymentActionPerformed

    private void jtxtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChangeActionPerformed
        
    }//GEN-LAST:event_jtxtChangeActionPerformed

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalActionPerformed
      
    }//GEN-LAST:event_jtxtTotalActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
  
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
 
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
 
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
    
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
  
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed



    }//GEN-LAST:event_jbtnPrintActionPerformed
    
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed

            
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed


    }//GEN-LAST:event_jbtnRemoveActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
  
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed

    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
 jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
  
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed

    }//GEN-LAST:event_jbtn0ActionPerformed
//Objetos del menu//
    private void jbtnWatterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnWatterActionPerformed
        
 
    }//GEN-LAST:event_jbtnWatterActionPerformed

    private void jbtnLevainCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLevainCookiesActionPerformed
   
    }//GEN-LAST:event_jbtnLevainCookiesActionPerformed

    private void jbtnDietCokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDietCokeActionPerformed
  
        
        
  
        
    }//GEN-LAST:event_jbtnDietCokeActionPerformed

    private void jbtnCokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCokeActionPerformed

    }//GEN-LAST:event_jbtnCokeActionPerformed

    private void jbtnFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFantaActionPerformed
    
 
    }//GEN-LAST:event_jbtnFantaActionPerformed

    private void jbtnSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSpriteActionPerformed
   
    }//GEN-LAST:event_jbtnSpriteActionPerformed

    private void jbtnLemonadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLemonadeActionPerformed
 
    }//GEN-LAST:event_jbtnLemonadeActionPerformed

    private void jbtnFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFriesActionPerformed
  
        
    }//GEN-LAST:event_jbtnFriesActionPerformed

    private void jbtnBaconCheeseFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBaconCheeseFriesActionPerformed
   
        
    }//GEN-LAST:event_jbtnBaconCheeseFriesActionPerformed

    private void jbtnOnionRingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOnionRingsActionPerformed
  
        
    }//GEN-LAST:event_jbtnOnionRingsActionPerformed

    private void jbtnMozzarellaSticksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMozzarellaSticksActionPerformed
     
        
    }//GEN-LAST:event_jbtnMozzarellaSticksActionPerformed

    private void jbtnNuggsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuggsActionPerformed
    
    
   
    }//GEN-LAST:event_jbtnNuggsActionPerformed

    private void jbtnCheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheeseBurgerActionPerformed
         double PriceOfItem = 7.50;
      
    
 
    }//GEN-LAST:event_jbtnCheeseBurgerActionPerformed

    private void jbtnDBLCheeseBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDBLCheeseBurgerActionPerformed
 
        
    }//GEN-LAST:event_jbtnDBLCheeseBurgerActionPerformed

    private void jbtnFriedChickenSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFriedChickenSandwichActionPerformed
  
        
    }//GEN-LAST:event_jbtnFriedChickenSandwichActionPerformed

    private void jbtnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPizzaActionPerformed
  
        
    }//GEN-LAST:event_jbtnPizzaActionPerformed

    private void jbtnIceCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIceCreamActionPerformed

        
    }//GEN-LAST:event_jbtnIceCreamActionPerformed

    private void jbtnMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMilkShakeActionPerformed
     
    
   
    }//GEN-LAST:event_jbtnMilkShakeActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
    
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jtxtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBarCodeActionPerformed
      
    }//GEN-LAST:event_jtxtBarCodeActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
       
    }//GEN-LAST:event_jtxtSubTotalActionPerformed
/*
 

/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBaconCheeseFries;
    private javax.swing.JButton jbtnCheeseBurger;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCoke;
    private javax.swing.JButton jbtnDBLCheeseBurger;
    private javax.swing.JButton jbtnDietCoke;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnFanta;
    private javax.swing.JButton jbtnFriedChickenSandwich;
    private javax.swing.JButton jbtnFries;
    private javax.swing.JButton jbtnIceCream;
    private javax.swing.JButton jbtnLemonade;
    private javax.swing.JButton jbtnLevainCookies;
    private javax.swing.JButton jbtnMilkShake;
    private javax.swing.JButton jbtnMozzarellaSticks;
    private javax.swing.JButton jbtnNuggs;
    private javax.swing.JButton jbtnOnionRings;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPizza;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSprite;
    private javax.swing.JButton jbtnWatter;
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
*/
