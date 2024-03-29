import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterView extends javax.swing.JFrame {
    public RegisterView() {
        initComponents();
        setSize(1000, 600);
        setResizable(false);
        setVisible(false);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        carNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dmy3 = new javax.swing.JComboBox<>();
        dmy = new javax.swing.JComboBox<>();
        dmy2 = new javax.swing.JComboBox<>();
        success = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        ColorCar = new javax.swing.JComboBox<>();
        TypeCar = new javax.swing.JComboBox<>();
        TimeInHour = new javax.swing.JComboBox<>();
        TimeInMin = new javax.swing.JComboBox<>();
//        TimeInAMPM = new javax.swing.JComboBox<>();


        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title1.png"))); //ป้ายประกาศ
        
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("สีรถ");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 67, 151));

        label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("วัน / เดือน / ปี");

        label2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("ป้ายทะเบียน");

        Label4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label4.setForeground(new java.awt.Color(255, 255, 255));
        Label4.setText("ประเภทรถ");

        Label3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label3.setForeground(new java.awt.Color(255, 255, 255));
        Label3.setText("สีรถ");

        Label5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label5.setForeground(new java.awt.Color(255, 255, 255));
        Label5.setText("เวลาเข้า");

        carNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNumActionPerformed(evt);
            }
        });

        dmy3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015" }));

        dmy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        dmy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dmy.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmyActionPerformed(evt);
            }
        });

        dmy2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        success.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        success.setText("สำเร็จ");

        cancel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cancel.setText("ยกเลิก");

        ColorCar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ColorCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ขาว", "ดำ", "บรอนซ์ทอง", "บรอนซ์เงิน", "แดง", "เขียว", "น้ำเงิน", "เหลือง", "อื่น ๆ " }));

        TypeCar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TypeCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 ล้อ", "4 ล้อ", "6 ล้อ", "8 ล้อ" }));

        TimeInHour.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TimeInHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", 
                                                                                    "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        TimeInMin.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TimeInMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Label3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Label5))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Label4)))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carNum, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dmy, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(dmy2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dmy3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ColorCar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TypeCar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(success, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(TimeInHour, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addComponent(TimeInMin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                    .addComponent(TimeInAMPM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))))
                .addGap(86, 246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dmy3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dmy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dmy2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carNum))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3)
                    .addComponent(ColorCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4)
                    .addComponent(TypeCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label5)
                    .addComponent(TimeInHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeInMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addComponent(TimeInAMPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(success, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNumActionPerformed

    private void dmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmyActionPerformed

    public JComboBox<String> getColorCar() {
        return ColorCar;
    }

    public void setColorCar(JComboBox<String> ColorCar) {
        this.ColorCar = ColorCar;
    }

    public JLabel getLabel3() {
        return Label3;
    }

    public void setLabel3(JLabel Label3) {
        this.Label3 = Label3;
    }

    public JLabel getLabel4() {
        return Label4;
    }

    public void setLabel4(JLabel Label4) {
        this.Label4 = Label4;
    }

    public JLabel getLabel5() {
        return Label5;
    }

    public void setLabel5(JLabel Label5) {
        this.Label5 = Label5;
    }

    public JComboBox<String> getTimeInHour() {
        return TimeInHour;
    }

    public void setTimeInHour(JComboBox<String> TimeInHour) {
        this.TimeInHour = TimeInHour;
    }

    public JComboBox<String> getTimeInMin() {
        return TimeInMin;
    }

    public void setTimeInMin(JComboBox<String> TimeInMin) {
        this.TimeInMin = TimeInMin;
    }

    public JComboBox<String> getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(JComboBox<String> TypeCar) {
        this.TypeCar = TypeCar;
    }

    public JButton getCancel() {
        return cancel;
    }

    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    public JTextField getCarNum() {
        return carNum;
    }

    public void setCarNum(JTextField carNum) {
        this.carNum = carNum;
    }

    public JComboBox<String> getDmy() {
        return dmy;
    }

    public void setDmy(JComboBox<String> dmy) {
        this.dmy = dmy;
    }

    public JComboBox<String> getDmy2() {
        return dmy2;
    }

    public void setDmy2(JComboBox<String> dmy2) {
        this.dmy2 = dmy2;
    }

    public JComboBox<String> getDmy3() {
        return dmy3;
    }

    public void setDmy3(JComboBox<String> dmy3) {
        this.dmy3 = dmy3;
    }

    public JFrame getjFrame1() {
        return jFrame1;
    }

    public void setjFrame1(JFrame jFrame1) {
        this.jFrame1 = jFrame1;
    }

    public JFrame getjFrame2() {
        return jFrame2;
    }

    public void setjFrame2(JFrame jFrame2) {
        this.jFrame2 = jFrame2;
    }

    public JFrame getjFrame3() {
        return jFrame3;
    }

    public void setjFrame3(JFrame jFrame3) {
        this.jFrame3 = jFrame3;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JButton getSuccess() {
        return success;
    }

    public void setSuccess(JButton success) {
        this.success = success;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ColorCar;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JComboBox<String> TimeInAMPM;
    private javax.swing.JComboBox<String> TimeInHour;
    private javax.swing.JComboBox<String> TimeInMin;
    private javax.swing.JComboBox<String> TypeCar;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField carNum;
    private javax.swing.JComboBox<String> dmy;
    private javax.swing.JComboBox<String> dmy2;
    private javax.swing.JComboBox<String> dmy3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton success;
    // End of variables declaration//GEN-END:variables
}
