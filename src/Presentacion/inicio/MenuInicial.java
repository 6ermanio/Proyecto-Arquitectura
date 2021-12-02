/**
 * MenuInicial.java
 */
package presentacion.inicio;

import Dominio.Jugador;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Galindo, Francisco Felix
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Instancia de jugador registrado.
     */
    private Jugador jugador;

    /**
     * Instancia de si mismo.
     */
    private static MenuInicial instance;

    /**
     * Crea MenuInicial.
     */
    private MenuInicial(Jugador jugador) {
        initComponents();
        this.setResizable(false);
        this.setSize(new Dimension(540, 400));
        this.setPreferredSize(new Dimension(540, 400));
        this.setLocationRelativeTo(null);
        this.setTitle("Timbiriche.");

        if (jugador == null) {
            DlgRegistrarJugador pnlreg = new DlgRegistrarJugador(this, true);
            pnlreg.setVisible(true);
        } else {
            this.jugador = jugador;
        }
    }

    /**
     * Metodo estatico que regresa la instancia de MenuInicial. Si la instancia
     * es nula, la inicializa.
     *
     * @param jugador
     * @return
     */
    public static MenuInicial getInstance(Jugador jugador) {
        if (instance == null) {
            instance = new MenuInicial(jugador);
        }
        instance.setJugador(jugador);
        return instance;
    }

    /**
     * Retorna el jugador ingresado.
     *
     * @return
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Establece el jugador ingresado. Su avatar y su nombre.
     *
     * @param jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
        this.avatarIcon.setIcon(new ImageIcon("src\\Avatares\\" + jugador.getRutaAvatar()));
//        this.nombreJugador.setText(jugador.getNombre());
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        crearSala = new javax.swing.JButton();
        configurarTablero = new javax.swing.JButton();
        cerrarTimbiriche = new javax.swing.JButton();
        avatarIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel3.setText("Timbiriche");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        crearSala.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        crearSala.setText("Unirse a la partida");
        crearSala.setToolTipText("Únete a la partida del servidor local");
        crearSala.setMaximumSize(new java.awt.Dimension(180, 180));
        crearSala.setMinimumSize(new java.awt.Dimension(180, 180));
        crearSala.setPreferredSize(new java.awt.Dimension(180, 180));
        crearSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSalaActionPerformed(evt);
            }
        });

        configurarTablero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        configurarTablero.setText("Configurar Tablero");
        configurarTablero.setToolTipText("Configura los colores de los demás jugadores en el tablero");
        configurarTablero.setMaximumSize(new java.awt.Dimension(180, 180));
        configurarTablero.setMinimumSize(new java.awt.Dimension(180, 180));
        configurarTablero.setPreferredSize(new java.awt.Dimension(180, 180));
        configurarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurarTableroActionPerformed(evt);
            }
        });

        cerrarTimbiriche.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cerrarTimbiriche.setText("Salir");
        cerrarTimbiriche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarTimbiricheActionPerformed(evt);
            }
        });

        avatarIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        avatarIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        avatarIcon.setMinimumSize(new java.awt.Dimension(50, 50));
        avatarIcon.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(configurarTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(cerrarTimbiriche))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(crearSala, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(avatarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(avatarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearSala, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(configurarTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrarTimbiriche)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    /**
     * ActionEvent de JButton configurarTablero. Configura las preferencias del
     * jugador ingresado.
     *
     * @param evt
     */
    private void configurarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurarTableroActionPerformed
        FrmPreferencias conf = FrmPreferencias.getInstance(this);
        conf.setVisible(true);
    }//GEN-LAST:event_configurarTableroActionPerformed

    /**
     * ActionEvent de JButton cerrarTimbiriche. Cierra el sistema despues de
     * confirmar la accion.
     *
     * @param evt
     */
    private void cerrarTimbiricheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarTimbiricheActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere cerrar el juego?", "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_cerrarTimbiricheActionPerformed

    /**
     * ActionEvent de JButton crearSala. Llama a FrmCreadorSala.
     *
     * @param evt
     */
    private void crearSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSalaActionPerformed
        String ip = null, port = null;

        ip = JOptionPane.showInputDialog(this, "Dirección IP", "¿A donde te quieres conectar?", JOptionPane.OK_CANCEL_OPTION);
        port = JOptionPane.showInputDialog(this, "Puerto", "¿A donde quieres llegar?", JOptionPane.OK_CANCEL_OPTION);

        SalaEspera se = SalaEspera.getInstance();
        if(se.ejecutarConexion(jugador, ip, Integer.valueOf(port))){
            se.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"No se pudo realizar la conexión con el servidor", "Fallo de Conexión", JOptionPane.ERROR_MESSAGE);
            se = null;
        }
    }//GEN-LAST:event_crearSalaActionPerformed

    /**
     * Metodo principal
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Establece Look and Feel del sistema */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y despliega MenuInicial*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatarIcon;
    private javax.swing.JButton cerrarTimbiriche;
    private javax.swing.JButton configurarTablero;
    private javax.swing.JButton crearSala;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
