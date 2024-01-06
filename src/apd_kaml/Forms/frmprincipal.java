/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apd_kaml.Forms;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
public class frmprincipal extends javax.swing.JFrame {

    /**
     */
    public frmprincipal() {
        Color gris = new Color(153,153,153); 
        this.getContentPane().setBackground(gris);
        initComponents();
        condicion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaConsulta = new javax.swing.JButton();
        btncalcular = new javax.swing.JButton();
        txtcadena = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFuncTrans = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripIns = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpila = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        btnNuevaConsulta.setText("Nueva consulta");
        btnNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsultaActionPerformed(evt);
            }
        });

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        txtFuncTrans.setColumns(20);
        txtFuncTrans.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFuncTrans.setRows(5);
        jScrollPane1.setViewportView(txtFuncTrans);

        txtDescripIns.setColumns(20);
        txtDescripIns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripIns.setRows(5);
        jScrollPane2.setViewportView(txtDescripIns);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"q1", "q2", "--", "--"},
                {"q2", "--", "q3", "--"},
                {"q3", "q4", "q3", "--"},
                {"q4", "q4", "--", "q5"},
                {"q5", "q6", "--", "q5"},
                {"q6", "--", "--", "--"}
            },
            new String [] {
                "Estado", "Z", "X", "Y"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTextField1.setText("conjunto de estados");

        jTextField2.setText("Alfabeto");

        jTextField3.setText("T conjunto de simbolos de la cinta");

        jTextField5.setText("Estados finales qf");

        jTextField6.setText("B = B espacion blanco de la cinta");

        jTextField7.setText("Expresion regular del automata");

        jLabel2.setText("Conjunto de estados");

        jLabel3.setText("Alfabeto");

        jLabel4.setText("Simbolos de la cinta T");

        jLabel5.setText("Estados Iniciales");

        jTextField4.setText("estados iniciales q0");

        jLabel6.setText("Estados finales");

        jLabel7.setText("B espacio de la cinta");

        jLabel8.setText("Expresion Regular");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Funcion de transicion:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Descripcion Instantanea");

        txtpila.setColumns(20);
        txtpila.setRows(5);
        jScrollPane4.setViewportView(txtpila);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Pila");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/automata de pila recuperacion final.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(44, 44, 44)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(61, 61, 61))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField5)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        txtcadena.setText("");
        txtDescripIns.setText("");
        txtFuncTrans.setText("");
               jTextField1.setText("Conjunto de Estados");
       jTextField2.setText("Alfabeto");
       jTextField3.setText("Conjunto de simbolos de la cinta");
       jTextField4.setText("Estados iniciales de la maquina");
       jTextField5.setText("Estados finales de la maquina");
       jTextField6.setText("simbolo de blanco de la cinta");
       jTextField7.setText("Expresion regular");
       txtcadena.setEditable(true);
       txtpila.setText("");
       
       
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        llenartxt();
        functrans();
        txtcadena.setEditable(false);
        txtpila.append("z"+"\n");
        
        
        
        String cadena = txtcadena.getText();
        // variables que afectan el estado de la decripcion, como estado, tamaño de la cadena y cantidad de 1s apilados
        int nestado = 1;
        int j = 0;
        StringBuilder pila = new StringBuilder("z");
        boolean yEncontrada = false;
        String Cadenatot = cadena;
        int contX = 0;

        
        
        txtDescripIns.append("("+ "q"+nestado +" , "+Cadenatot+" , "+pila+")"+"  ﹁"+"\n");
        while (j < cadena.length()) {
  
            char caracter = cadena.charAt(j);
            char caracterAnterior;
            
            if (j>= 1){
             caracterAnterior= cadena.charAt(j -1);
             
            if( caracter != caracterAnterior){
            nestado ++;

            }
            } 
            if( j == 0){
                nestado++;
            }
            // proceso donde se imprime la descripcion instantanea
            // nombre del estado
            // pila 
            if (caracter == 'y') {
            yEncontrada = true;
            }
            
            if(caracter == 'y'){
                pila.delete(pila.length() - 2, pila.length());
            }else
            if (yEncontrada == true) {
                // Comienza a quitar "1" de la pila
                if (pila.length() > 0) {
                    pila.deleteCharAt(pila.length() - 1 );
                }
            } 
            else  {
                // Añade "1" a la pila
                pila.append("1");
            }
            // Proceso de pila
             // Si encuentras 'y', marca la bandera xEncontrada como true

            txtpila.append(pila+"\n");
            txtDescripIns.append("("+ "q"+nestado +" , "+Cadenatot+" , "+pila+")"+"  ﹁"+"\n");
            //bucle para obtener la cadena completa e ir quitando caracter a caracter 
            Cadenatot = cadena.substring(j + 1);  // Obtén la subcadena a partir del índice i+1 hasta el final                      
            
            j++;
        }  
            String valorpila = obtenerUltimaLinea();
            if(!"z".equals(valorpila)){
                 JOptionPane.showMessageDialog(null, "la cadena ingresada no es aceptada por el automata",
                         "por favor ingrese una cadena aceptable", JOptionPane.ERROR_MESSAGE);
            }
            if (valorpila == ""){
                 JOptionPane.showMessageDialog(null, "la cadena ingresada no es aceptada por el automata",
                         "por favor ingrese una cadena aceptable", JOptionPane.ERROR_MESSAGE);
            }
            
        
        
        
    }//GEN-LAST:event_btncalcularActionPerformed

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
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frmprincipal().setVisible(true);
           
            }     
        });
    }
    
    
    // void para verificar si la cadena es aceptada o no 
        private String obtenerUltimaLinea() {
        // Obtiene el contenido completo del JTextArea
        String todoElTexto = txtpila.getText();

        // Divide el contenido en líneas utilizando el carácter de nueva línea ("\n")
        String[] lineas = todoElTexto.split("\n");

        // Obtiene la última línea (si hay al menos una línea)
        if (lineas.length > 0) {
            return lineas[lineas.length - 1];
        } else {
            return ""; // Retorna una cadena vacía si no hay líneas
        }
    }
   
    
    // void que me enseña la septupla
    public void llenartxt(){
       jTextField1.setText("Q = {q1 , q2 , q3 , q4 , q5 , q6}");
       jTextField2.setText("Σ = { X , Y , Z }");
       jTextField3.setText("T = { z , 1 }");
       jTextField4.setText("Q0 = { q1 }");
       jTextField5.setText("Qf = { q6 }");
       jTextField6.setText("T0 = { Z }");
       jTextField7.setText(" L = { Z X^2a Z^b Y^b Z^b+1 | a ∧ b ≥ 1 } ");
    } 

    //funcion de trancision
    public void functrans(){
                       txtFuncTrans.setText("δ (q1,z,λ)=(q2,1)\n" +
"δ (q2,x,1)=(q3,11)\n" +
"δ (q3,x,1)=(q3,11)\n" +
"δ (q3,z,1)=(q4,11)\n" +
"δ (q4,z,1)=(q4,11)\n" +
"δ (q4,y,11)=(q5, λ)\n" +
"δ (q5,y,11)=(q5, λ)\n" +
"δ (q5,z,1)=(q6, λ)\n" +
"δ (q6,z,1)=(q6,λ)\n" 
);
    }
    
    //condiciona los valores ingresados 
       public  void condicion(){

        txtcadena.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Verificar si el caracter ingresado es 'A', 'B', 'X' o un espacio en blanco
                if (!(Character.toString(e.getKeyChar()).matches("[XYZxyz]"))) {
                    // Mostrar un JOptionPane con un mensaje de error si se ingresa un caracter no válido
                    JOptionPane.showMessageDialog(null, """
                                                        Solo se permiten Xs, Ys y Zs 
                                                        porfavor ingrese una cadena valida""", "Error", JOptionPane.ERROR_MESSAGE);
                    e.consume(); // Cancelar el evento actual para evitar que se agregue el caracter no válido al textfield
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JButton btncalcular;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextArea txtDescripIns;
    private javax.swing.JTextArea txtFuncTrans;
    private javax.swing.JTextField txtcadena;
    private javax.swing.JTextArea txtpila;
    // End of variables declaration//GEN-END:variables
}
