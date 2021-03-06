/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quvizo.ui.misc;

import com.quvizo.Log;
import com.quvizo.config.EpicSettings;
import com.quvizo.data.SettingTypes;
import com.quvizo.data.entity.Asset;
import com.quvizo.data.entity.PresentationAssets;
import com.quvizo.data.entity.Setting;
import com.quvizo.projector.DynamicBackground;
import com.quvizo.universal.EntityOverlord;
import com.quvizo.universal.EpicOverlord;
import com.quvizo.universal.UI;
import com.quvizo.util.PropUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.persistence.EntityManager;
import javax.swing.SwingUtilities;

/**
 *
 * @author owner
 */
public class OptionsDialog extends javax.swing.JDialog
{
    public static OptionsDialog instance;
    public static void init()
    {
        if(instance==null)
            instance = new OptionsDialog(null, false);
    }
    public static void open()
    {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                   if(instance==null)
                instance = new OptionsDialog(null, false);
           
            instance.load();
            instance.setVisible(true);
            instance.toFront();
                }
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(OptionsDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(OptionsDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Creates new form OptionsDialog
     */
    public OptionsDialog(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        //vidcount_daycombo.setModel();
        initComponents();
        //vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.none"));        
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.sun"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.mon"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.tue"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.wed"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.thu"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.fri"));
        vidcount_daycombo.addItem(EpicSettings.bundle.getString("week.sat"));
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/media/logo.png")).getImage());
//      load
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vidcount_daycombo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vidcount_hourcombo = new javax.swing.JComboBox();
        vidcount_minutecombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vidcount_timelabel = new javax.swing.JLabel();
        vidcount_secondscombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vidcount_videolabel = new javax.swing.JLabel();
        vidcount_browsebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        okbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.title"), new Object[] {})); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.bordervideo"), new Object[] {}))); // NOI18N

        vidcount_daycombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { EpicSettings.bundle.getString("week.none") }));
        vidcount_daycombo.setSelectedIndex(0);
        vidcount_daycombo.setSelectedItem(EpicSettings.bundle.getString("week.none"));
        vidcount_daycombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidcount_daycomboActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Time"));

        jLabel2.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.hour"), new Object[] {})); // NOI18N

        vidcount_hourcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        vidcount_hourcombo.setSelectedIndex(9);
        vidcount_hourcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidcount_hourcomboActionPerformed(evt);
            }
        });

        vidcount_minutecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        vidcount_minutecombo.setSelectedIndex(25);
        vidcount_minutecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidcount_minutecomboActionPerformed(evt);
            }
        });

        jLabel3.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.minute"), new Object[] {})); // NOI18N

        jLabel5.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.intruction2"), new Object[] {})); // NOI18N

        vidcount_timelabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vidcount_timelabel.setText("__");

        vidcount_secondscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        vidcount_secondscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidcount_secondscomboActionPerformed(evt);
            }
        });

        jLabel4.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.seconds"), new Object[] {})); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vidcount_hourcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(vidcount_timelabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vidcount_secondscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vidcount_minutecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(vidcount_timelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vidcount_hourcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vidcount_minutecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vidcount_secondscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.dayofweek"), new Object[] {})); // NOI18N

        jLabel1.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.video"), new Object[] {})); // NOI18N

        vidcount_videolabel.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.none"), new Object[] {})); // NOI18N
        vidcount_videolabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        vidcount_browsebtn.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.browse"), new Object[] {})); // NOI18N
        vidcount_browsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidcount_browsebtnActionPerformed(evt);
            }
        });

        jLabel6.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.instruction1"), new Object[] {})); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vidcount_daycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vidcount_videolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vidcount_browsebtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vidcount_daycombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vidcount_videolabel)
                    .addComponent(vidcount_browsebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        okbtn.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.set"), new Object[] {})); // NOI18N
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("countdown.cancel"), new Object[] {})); // NOI18N
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 367, Short.MAX_VALUE)
                        .addComponent(cancelbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okbtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtn)
                    .addComponent(cancelbtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okbtnActionPerformed
    {//GEN-HEADEREND:event_okbtnActionPerformed
        save();
        this.setVisible(false);
    }//GEN-LAST:event_okbtnActionPerformed

    private void vidcount_browsebtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vidcount_browsebtnActionPerformed
    {//GEN-HEADEREND:event_vidcount_browsebtnActionPerformed
        FileChooser chooser = new FileChooser();
        
        chooser.getExtensionFilters().setAll(new FileChooser.ExtensionFilter("Video File", "*.mp4","*.MP4","*.avi","*.AVI","*.flv","*.FLV"));
		File file = chooser.showOpenDialog(null);

		if (file != null)
		{
		    vidcount_videolabel.setText(file.getName());
                    videoSetting.setStringData(file.getAbsolutePath());
		}
    }//GEN-LAST:event_vidcount_browsebtnActionPerformed

    private void vidcount_daycomboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vidcount_daycomboActionPerformed
    {//GEN-HEADEREND:event_vidcount_daycomboActionPerformed
        // TODO add your handling code here:
        //PropUtils.getInstance().setProperty("vidcount_day", vidcount_daycombo.getSelectedItem().toString());
        daySetting.setStringData(vidcount_daycombo.getSelectedItem().toString());
    }//GEN-LAST:event_vidcount_daycomboActionPerformed

    private void vidcount_hourcomboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vidcount_hourcomboActionPerformed
    {//GEN-HEADEREND:event_vidcount_hourcomboActionPerformed
        // TODO add your handling code here:
        //PropUtils.getInstance().setProperty("vidcount_hour", vidcount_hourcombo.getSelectedItem().toString());
        hourSetting.setIntData(Integer.parseInt(vidcount_hourcombo.getSelectedItem().toString()));
    }//GEN-LAST:event_vidcount_hourcomboActionPerformed

    private void vidcount_minutecomboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vidcount_minutecomboActionPerformed
    {//GEN-HEADEREND:event_vidcount_minutecomboActionPerformed
        // TODO add your handling code here:
        //PropUtils.getInstance().setProperty("vidcount_minute", vidcount_minutecombo.getSelectedItem().toString());
         minuteSetting.setIntData(Integer.parseInt(vidcount_minutecombo.getSelectedItem().toString()));
    }//GEN-LAST:event_vidcount_minutecomboActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelbtnActionPerformed
    {//GEN-HEADEREND:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        load();
        this.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void vidcount_secondscomboActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vidcount_secondscomboActionPerformed
    {//GEN-HEADEREND:event_vidcount_secondscomboActionPerformed
        // TODO add your handling code here:
        secondsSetting.setIntData(Integer.parseInt(vidcount_secondscombo.getSelectedItem().toString()));
    }//GEN-LAST:event_vidcount_secondscomboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton okbtn;
    private javax.swing.JButton vidcount_browsebtn;
    private javax.swing.JComboBox vidcount_daycombo;
    private javax.swing.JComboBox vidcount_hourcombo;
    private javax.swing.JComboBox vidcount_minutecombo;
    private javax.swing.JComboBox vidcount_secondscombo;
    private javax.swing.JLabel vidcount_timelabel;
    private javax.swing.JLabel vidcount_videolabel;
    // End of variables declaration//GEN-END:variables

    public Setting daySetting;
    public Setting hourSetting;
    public Setting minuteSetting;
    public Setting videoSetting;
    public Setting secondsSetting;
    
    private void load()
    {
        try{
        //load settings from DB
        EntityManager em = EntityOverlord.getInstance().getEm();
        em.getTransaction().begin();
        daySetting = em.find(Setting.class, "countdown.day");
        if(daySetting==null)
        {
            daySetting = new Setting("countdown.day", "Sunday");
            //em.persist(daySetting);
        }
        
        hourSetting = em.find(Setting.class, "countdown.hour");
        if(hourSetting==null)
        {
            hourSetting = new Setting("countdown.hour", 9);
            //em.persist(hourSetting);
        }
        minuteSetting = em.find(Setting.class, "countdown.minute");
        if(minuteSetting==null)
        {
            minuteSetting = new Setting("countdown.minute", 26);
           // em.persist(minuteSetting);
        }
        secondsSetting = em.find(Setting.class, "countdown.seconds");
        if(secondsSetting==null)
        {
            secondsSetting = new Setting("countdown.seconds", 40);
           // em.persist(minuteSetting);
        }
        videoSetting = em.find(Setting.class, "countdown.video");
        if(videoSetting==null)
        {
            videoSetting = new Setting("countdown.video", "");
            //em.persist(videoSetting);
        }
        em.getTransaction().commit();
        //populate UI
        vidcount_daycombo.setSelectedItem(daySetting.getStringData());
        vidcount_hourcombo.setSelectedItem(Integer.toString(hourSetting.getIntData()));
        vidcount_minutecombo.setSelectedItem(Integer.toString(minuteSetting.getIntData()));
        vidcount_secondscombo.setSelectedItem(Integer.toString(secondsSetting.getIntData()));
        vidcount_videolabel.setText(new File(videoSetting.getStringData()).getName());
        }
        catch(Exception e)
        {
            Log.log(this, e);
        }
    }
    
    private void save()
    {
        try{
        //persist all settings
        EntityManager em = EntityOverlord.getInstance().getEm();
        em.getTransaction().begin();
        daySetting = em.merge(daySetting);
        hourSetting = em.merge(hourSetting);
        minuteSetting = em.merge(minuteSetting);
        secondsSetting = em.merge(secondsSetting);
        videoSetting = em.merge(videoSetting);
        em.getTransaction().commit();
        
        load(); //reflect what we currently have saved
        EpicOverlord.getInstance().restartCounter();
        refreshCountdown = true;
        }catch(Exception e)
        {
            Log.log(this, e);
        }
    }
    
    public static boolean refreshCountdown = true;
}
