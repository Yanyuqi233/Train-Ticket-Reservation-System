/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mysql.cj.protocol.Resultset;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Administrator
 */
public class 火车车次详情JFrame1 extends javax.swing.JFrame {
    database database= new database();
    control co=new control();
    
    public train train;
    private int T_number;
   
    private String T_seattype;
    private String T_name;
    public static passenger currentP_id;
    train_price train_price = new train_price();
    private String P_id;
    public static String getname;
    public static String gettype;
    private Timestamp Nowtime;
    public static String T_date;

    /**
     * Creates new form 车次详情JFrame
     * @throws java.lang.Exception
     */
    public 火车车次详情JFrame1() throws Exception {
        initComponents();
        System.out.println(主页和查询JFrame.T_date);
        System.out.println(主页和查询JFrame.T_departure);
        System.out.println(主页和查询JFrame.T_destination);
        fillTable(train,主页和查询JFrame.T_departure,主页和查询JFrame.T_destination,主页和查询JFrame.T_date);
        int windowWidth = this.getWidth(); //获得窗口宽
        int windowHeight = this.getHeight(); //获得窗口高
        Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
        Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
        int screenWidth = screenSize.width; //获取屏幕的宽
        int screenHeight = screenSize.height; //获取屏幕的高
        this.setLocation(screenWidth / 2 - 1000 / 2, screenHeight / 2 - 500 / 2);
        this.setExtendedState(JFrame.NORMAL);
        this.setSize(1000,500);
        this.setTitle("火车车次详情");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("黑体", 1, 36)); // NOI18N
        jLabel1.setText("火车车次详情");

        jButton1.setBackground(new java.awt.Color(1, 9, 41));
        jButton1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("< 返回");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(1, 9, 41));
        jButton2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("个人中心");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(89, 94, 115));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "车次", "出发时间", "到达时间", "出发地", "到达地", "出发日期", "座位类型", "价格", "车票余量"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(1, 9, 41));
        jButton3.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("预订");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(1, 9, 41));
        jButton4.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("全部火车信息");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/photos/火车1_加蓝色边框830×380.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
        this.dispose();
        new 乘客个人中心JFrame().setVisible(true);        // TODO add your handling code here:
    } catch (Exception ex) {
        Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    fillTable1(train);        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.dispose();
            new 主页和查询JFrame().setVisible(true);            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

            // TODO add your handling code here:
            Timestamp Nowtime =new Timestamp(System.currentTimeMillis());
            if (T_name== "" && T_seattype=="") {
                JOptionPane.showMessageDialog(this, "请选择一个车次！");
                return;
            }
            
            if (T_number== 0) {
                JOptionPane.showMessageDialog(this, "该车次没有票了！");
                return;
            }
            
            int n = JOptionPane.showConfirmDialog(this, "确定要选择这个车次吗?");
            if (n == 0) {  
                Connection con = null;
                String currentP_id = 登录.currentpassenger.GetP_id();
                torder sc=new torder();
                sc.setT_name(T_name);
                sc.setT_seattype(T_seattype);
                sc.setNowtime(Nowtime);
                sc.setT_date(T_date);
                sc.setP_id(currentP_id);
                
                try {
                    con = database.getCon();
                    ResultSet rs = sc.isExisted(con);
                    while (rs.next()) {
                        JOptionPane.showMessageDialog(this, "你已经选过这个车次，不能重复选择！");
                        return;
                    }
                    int selectionNum = sc.SelectionAdd(con);
                    
                    int selectedNum = sc.T_numberMinus(con,T_name,T_seattype,T_date);
                    System.out.println(selectionNum);
                    System.out.println(selectedNum);
                    if (selectionNum == 1 && selectedNum >=  1) {
                        JOptionPane.showMessageDialog(this, "预订成功!");
                        
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "预订失败!");
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "预订失败!");
                } finally {
                    try {
                        database.closeCon(con);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
            Connection con = null;
            try {
                con=database.getCon();
            } catch (Exception ex) {
                Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Boolean rs = null;
            try {
                rs = Queryage(con,登录.P_id);
                System.out.println(rs);
            } catch (Exception ex) {
                Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(rs != false){
                Boolean modifyseattype1 = null;
                Boolean modifyseattype2 = null;
                try {
                    modifyseattype1 = co.Modifyseattype1(con,登录.P_id);
                    modifyseattype2 = co.Modifyseattype2(con,登录.P_id);
                } catch (SQLException ex) {
                    Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
                }
               //int row=jTable1.getSelectedRow();
        //gettype=jTable1.getValueAt(row, 5).toString();
      //  getname=jTable1.getValueAt(row, 0).toString();
        System.out.println(T_seattype);
        System.out.println("车次为："+getname);
       
        if(gettype.equals("硬卧")){
                if(modifyseattype1 == true){
                    老年人硬卧 a = new 老年人硬卧();
        a.setVisible(true);
                    
                }
        }
        if(gettype.equals("软卧")){
                if(modifyseattype2 == true){
                    老年人软卧 b = new 老年人软卧();
        b.setVisible(true);
            }
            }
            }
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
	T_name = (String) this.jTable1.getValueAt(row, 0);
        T_seattype = (String) this.jTable1.getValueAt(row, 6);
        T_date = (String) jTable1.getValueAt(row, 5);
	T_number = Integer.parseInt((String) this.jTable1.getValueAt(row, 8));
	gettype=(String) this.jTable1.getValueAt(row, 6);
        System.out.println(gettype);
        getname=(String) this.jTable1.getValueAt(row, 0);
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseReleased
private void fillTable(train train, String T_departure, String T_destination,String T_date) {
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = database.getCon();
         try {
         
        } catch (Exception ex){
            Logger.getLogger(主页和查询JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
			ResultSet rs = co.Querytrain(con,T_departure,T_destination,T_date);
			while (rs.next()) {
				Vector v = new Vector();
                                v.add(rs.getString(1));
                                v.add(rs.getString(2));
                                v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
                                v.add(rs.getString(7));
				v.add(rs.getString(8));
                                v.add(rs.getString(9));
				dtm.addRow(v);

			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				database.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    /**
     * @param args the command line arguments
     */
private void fillTable1(train train){
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = database.getCon();
			ResultSet rs = co.Queryalltrain(con);
			while (rs.next()) {
				Vector v = new Vector();
                                v.add(rs.getString(1));
                                v.add(rs.getString(2));
                                v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
                                v.add(rs.getString(7));
				v.add(rs.getString(8));
                                v.add(rs.getString(9));
				dtm.addRow(v);

			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				database.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public Boolean Queryage(Connection con,String P_id) throws Exception{
        String sql="";
	sql="select timestampdiff(year,str_to_date(substring(P_id,7,8),\"%Y%m%d\"),str_to_date(now(),\"%Y-%m-%d\"))>= 60 as P_age from passenger where timestampdiff(year,str_to_date(substring(P_id,7,8),\"%Y%m%d\"),str_to_date(now(),\"%Y-%m-%d\"))>= 60 and P_id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);         
        System.out.println(pstmt.toString());
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
   }
    
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
            java.util.logging.Logger.getLogger(火车车次详情JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(火车车次详情JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(火车车次详情JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(火车车次详情JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new 火车车次详情JFrame1().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(火车车次详情JFrame1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
