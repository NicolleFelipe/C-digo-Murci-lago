/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolle
 */
public class frm_Murcielago extends javax.swing.JFrame {

    int longitud,a=0,e=0,i=0,o=0,u=0;
     String palabra,murcielago="",mostrar="",lugar="";
    
    /**
     * Creates new form frm_Murcielago
     */
    public frm_Murcielago() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t_longitud = new javax.swing.JTextField();
        t_palabras = new javax.swing.JTextField();
        t_primera = new javax.swing.JTextField();
        t_ultima = new javax.swing.JTextField();
        t_central = new javax.swing.JTextField();
        t_ppalabra = new javax.swing.JTextField();
        t_pcentral = new javax.swing.JTextField();
        t_upalabra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        t_a = new javax.swing.JTextField();
        t_e = new javax.swing.JTextField();
        t_i = new javax.swing.JTextField();
        t_o = new javax.swing.JTextField();
        t_u = new javax.swing.JTextField();
        t_cantidadpar = new javax.swing.JTextField();
        t_cantidadimpar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_traduccion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        t_archivo = new javax.swing.JMenu();
        t_abrir = new javax.swing.JMenuItem();
        t_guardar = new javax.swing.JMenuItem();
        t_gc = new javax.swing.JMenuItem();
        t_editar = new javax.swing.JMenu();
        t_copiar = new javax.swing.JMenuItem();
        t_cortar = new javax.swing.JMenuItem();
        t_pegar = new javax.swing.JMenuItem();
        t_buscar = new javax.swing.JMenuItem();
        t_reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("Manejo de Cadenas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Ingrese un texto o abra un archivo.");

        t_datos.setColumns(20);
        t_datos.setRows(5);
        jScrollPane1.setViewportView(t_datos);

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Longitud del texto:");

        jLabel4.setText("Total de palabras:");

        jLabel5.setText("Primer letra del texto:");

        jLabel6.setText("Última letra del texto:");

        jLabel7.setText("Letra central del texto:");

        jLabel8.setText("Primera palabra:");

        jLabel9.setText("Palabra central:");

        jLabel10.setText("Última palabra:");

        jLabel11.setText("Repeticiones de \"A\", \"a\" ó \"á\":");

        jLabel12.setText("Repeticiones de \"E\", \"e\" ó \"é\":");

        jLabel13.setText("Repeticiones de \"I\", \"i\" ó \"í\":");

        jLabel14.setText("Repeticiones de \"O\", \"o\" ó \"ó\":");

        jLabel15.setText("Repeticiones de \"U\", \"u\" ó \"ú\":");

        jLabel16.setText("Palabras con cantidad de caracteres par:");

        jLabel17.setText("Palabras con cantidad de caracteres impar:");

        t_traduccion.setColumns(20);
        t_traduccion.setRows(5);
        jScrollPane2.setViewportView(t_traduccion);

        jLabel18.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel18.setText("Traducción a clave Murciélago");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_procesar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_longitud, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_palabras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_primera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_ultima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_central, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_ppalabra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_pcentral, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_upalabra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_a, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_e, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_i, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_o, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_u, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_cantidadpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(t_cantidadimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(62, 62, 62)
                                .addComponent(t_upalabra))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(t_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50)
                                .addComponent(t_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(t_primera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addComponent(t_ultima, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addComponent(t_central, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(56, 56, 56)
                                .addComponent(t_ppalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(61, 61, 61)
                                .addComponent(t_pcentral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(t_cantidadimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(31, 31, 31)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_u)
                                    .addComponent(t_cantidadpar)
                                    .addComponent(t_a)
                                    .addComponent(t_e)
                                    .addComponent(t_i)
                                    .addComponent(t_o)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(t_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(t_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_primera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(t_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_ultima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(t_o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_central, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(t_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t_ppalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(t_cantidadpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(t_pcentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(t_cantidadimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(t_upalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        t_archivo.setText("Archivo");

        t_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_abrir.setText("Abrir");
        t_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_abrirActionPerformed(evt);
            }
        });
        t_archivo.add(t_abrir);

        t_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_guardar.setText("Guardar");
        t_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_guardarActionPerformed(evt);
            }
        });
        t_archivo.add(t_guardar);

        t_gc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        t_gc.setText("Guardar como");
        t_gc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_gcActionPerformed(evt);
            }
        });
        t_archivo.add(t_gc);

        jMenuBar1.add(t_archivo);

        t_editar.setText("Editar");

        t_copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_copiar.setText("Copiar");
        t_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_copiarActionPerformed(evt);
            }
        });
        t_editar.add(t_copiar);

        t_cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_cortar.setText("Cortar");
        t_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cortarActionPerformed(evt);
            }
        });
        t_editar.add(t_cortar);

        t_pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_pegar.setText("Pegar");
        t_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pegarActionPerformed(evt);
            }
        });
        t_editar.add(t_pegar);

        t_buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_buscar.setText("Buscar");
        t_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscarActionPerformed(evt);
            }
        });
        t_editar.add(t_buscar);

        t_reemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        t_reemplazar.setText("Reemplazar");
        t_reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_reemplazarActionPerformed(evt);
            }
        });
        t_editar.add(t_reemplazar);

        jMenuBar1.add(t_editar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_gcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_gcActionPerformed
    JFileChooser jfc= new JFileChooser(); 
            String direc = ""; 
            try{ 
            if(jfc.showSaveDialog(null)==jfc.APPROVE_OPTION){ 
            direc = jfc.getSelectedFile().getAbsolutePath();
            lugar=direc;
                File archivo = new File(direc);
                 FileWriter ec = new FileWriter(archivo);
                 ec.write("Palabra ingresada: ");
                 ec.write(t_datos.getText());   
                 ec.write("\r\n");
                 ec.write("Clave Murcielago: ");
                 ec.write(btn_procesar.getText()); 
                 ec.close();
                 JOptionPane.showMessageDialog(null,"Archivo guardado con exito!! ");
 
            } 
            }catch (Exception ex){ 
            ex.printStackTrace(); 
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_t_gcActionPerformed

    private void t_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cortarActionPerformed
    t_datos.cut();
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cortarActionPerformed

    private void t_reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_reemplazarActionPerformed
        String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar.. ");
        String cambio = JOptionPane.showInputDialog("Digite la palabra para reemplazar..");
        
        String temporal = palabra.replace(buscar, cambio);
        
        JOptionPane.showMessageDialog(null,"La palabra "+buscar+" fue reemplazada por "+cambio +" con éxito!!");
        
        reiniciar();
        palabra = temporal;
        t_datos.setText(palabra);
        // TODO add your handling code here:
    }//GEN-LAST:event_t_reemplazarActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        btn_procesar.setText("Procesar");
palabra = t_datos.getText();
longitud = palabra.length(); 

t_longitud.setText(String.valueOf(longitud));

StringTokenizer contador = new StringTokenizer(palabra);
int totalPalabras = contador.countTokens(); // Número total de palabras
t_palabras.setText(String.valueOf(totalPalabras));

t_primera.setText(String.valueOf(palabra.charAt(0)));
t_ultima.setText(String.valueOf(palabra.charAt(longitud - 1)));
t_central.setText(String.valueOf(palabra.charAt((longitud - 1) / 2)));

t_ppalabra.setText(String.valueOf(contador.nextToken()));
t_a.setText(String.valueOf(contarA()));
t_e.setText(String.valueOf(contarE()));
t_i.setText(String.valueOf(contarI()));
t_o.setText(String.valueOf(contarO()));
t_u.setText(String.valueOf(contarU()));

String ultimaPalabra = "";
while (contador.hasMoreTokens()) { 
    ultimaPalabra = String.valueOf(contador.nextToken());
}
t_upalabra.setText(ultimaPalabra);

int pares = 0;
int impares = 0;

StringTokenizer contador2 = new StringTokenizer(palabra);
while (contador2.hasMoreTokens()) {
    String token = contador2.nextToken();
    if (token.length() % 2 == 0) {
        pares++;
    } else {
        impares++;
    }
}
t_cantidadpar.setText(String.valueOf(pares));
t_cantidadimpar.setText(String.valueOf(impares));

// Obtener la palabra central
StringTokenizer contador3 = new StringTokenizer(palabra);
String palabraCentral = "";
int posicionCentral = totalPalabras / 2; // Posición de la palabra central (redondeo hacia abajo)
for (int i = 0; i <= posicionCentral; i++) {
    palabraCentral = contador3.nextToken();
}
t_pcentral.setText(palabraCentral); // Mostrar la palabra central

t_traduccion.setText(ClaveMurcielago());

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void t_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_abrirActionPerformed
    try {
             String contenido="";
            File archivo;
           String ruta;

           JFileChooser buscarArchivo;

           buscarArchivo= new JFileChooser();

           buscarArchivo.showOpenDialog(null);

           archivo = buscarArchivo.getSelectedFile();
           ruta = archivo.getAbsolutePath();
           FileReader leer = new FileReader(ruta);
           BufferedReader lectura = new BufferedReader(leer);
           lugar= ruta;
           
             while(contenido != null){
                
                
               
                    mostrar+=contenido;
                 contenido= lectura.readLine();
                 mostrar+="\n";
           
             }
            
         } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
         }catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
             }
         
         t_datos.setText(mostrar);
        // TODO add your handling code here:
    }//GEN-LAST:event_t_abrirActionPerformed

    private void t_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_guardarActionPerformed
    JFileChooser jfc= new JFileChooser(); 
            String direc = ""; 
            try{ 
            if(jfc.showSaveDialog(null)==jfc.APPROVE_OPTION){ 
            direc = jfc.getSelectedFile().getAbsolutePath();
            lugar=direc;
                File archivo = new File(direc);
                 FileWriter ec = new FileWriter(archivo);
                 ec.write("Palabra ingresada: ");
                 ec.write(t_datos.getText());   
                 ec.write("\r\n");
                 ec.write("Clave Murcielago: ");
                 ec.write(btn_procesar.getText()); 
                 ec.close();
                 JOptionPane.showMessageDialog(null,"Archivo guardado con exito!! ");
 
            } 
            }catch (Exception ex){ 
            ex.printStackTrace(); 
            }   
        // TODO add your handling code here:
    }//GEN-LAST:event_t_guardarActionPerformed

    private void t_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_copiarActionPerformed
    t_datos.copy();
        // TODO add your handling code here:
    }//GEN-LAST:event_t_copiarActionPerformed

    private void t_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscarActionPerformed
    // Solicitar al usuario que ingrese la palabra a buscar
String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar..");

// Verificar si la palabra ingresada está contenida en la cadena palabra
if (palabra.contains(buscar)) {
    JOptionPane.showMessageDialog(null, "La palabra " + buscar + " sí se encuentra en el texto");
} else {
    JOptionPane.showMessageDialog(null, "La palabra " + buscar + " no se encuentra en el texto");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_t_buscarActionPerformed

    private void t_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pegarActionPerformed
    t_datos.paste();
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pegarActionPerformed

    /**
     * @param args the command line arguments
     */
     public void reiniciar(){
     a=e=i=o=u=0;
     t_datos.setText("");
     btn_procesar.setText("");
     t_longitud.setText("");
     t_palabras.setText("");
     t_primera.setText("");
     t_ultima.setText("");
     t_pcentral.setText("");
     t_ppalabra.setText("");
     t_upalabra.setText("");
     t_a.setText("");
     t_e.setText("");
     t_i.setText("");
     t_o.setText("");
     t_u.setText("");
     t_cantidadpar.setText("");
     t_cantidadimpar.setText("");
     
 }
    
    public int contarA(){
        
        for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'A':  
                case 'a': 
                case 'á': a++; break;
            }  
        }
      
        return a;
    }
    
    public int contarE(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'E' :
                case 'e' :
                case 'é' : e++; break;
            }  
            
        }
        
        return e;
    }
    
    public int contarI(){
        
         for(int j=0; j<longitud;j++){
           
            char letra = palabra.charAt(j);
            
            switch(letra){
                case 'I' :
                case 'i' :
                case 'í' : i++; break;
            }  
        }
        return i;
    }
    
    public int contarO(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'O' :
                case 'o' :
                case 'ó' : o++; break;
            }   
        }
        return o;
    }
    
    public int contarU(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'U' :
                case 'u' :
                case 'ú' : u++; break;
            }  
        }
        return u;
    }
    
    
    public String ClaveMurcielago( ){
        for(int J =0; J<longitud;J++){
           
            char letra = palabra.charAt(J);
            
            switch(letra){
                
                case 'M':  
                case 'm': murcielago += "0"; break;
                
                case 'U' :
                case 'u' :
                case 'ú' : murcielago += "1"; break;
                
                case 'R':  
                case 'r': murcielago += "2"; break;
                
                case 'C':  
                case 'c': murcielago += "3"; break;
                
                case 'I' :
                case 'i' :
                case 'í' : murcielago += "4"; break;
                
                case 'E' :
                case 'e' :
                case 'é' : murcielago += "5"; break;
                
                case 'L':  
                case 'l': murcielago += "6"; break;
                
                case 'A':  
                case 'a': 
                case 'á': murcielago += "7"; break;
                
                case 'G':  
                case 'g': murcielago += "8"; break;
               
                case 'O' :
                case 'o' :
                case 'ó' : murcielago += "9"; break;
                
                
                default : murcielago += String.valueOf(letra); break;
                
            }  
        }
        
        return murcielago;
    }
    
  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Murcielago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t_a;
    private javax.swing.JMenuItem t_abrir;
    private javax.swing.JMenu t_archivo;
    private javax.swing.JMenuItem t_buscar;
    private javax.swing.JTextField t_cantidadimpar;
    private javax.swing.JTextField t_cantidadpar;
    private javax.swing.JTextField t_central;
    private javax.swing.JMenuItem t_copiar;
    private javax.swing.JMenuItem t_cortar;
    private javax.swing.JTextArea t_datos;
    private javax.swing.JTextField t_e;
    private javax.swing.JMenu t_editar;
    private javax.swing.JMenuItem t_gc;
    private javax.swing.JMenuItem t_guardar;
    private javax.swing.JTextField t_i;
    private javax.swing.JTextField t_longitud;
    private javax.swing.JTextField t_o;
    private javax.swing.JTextField t_palabras;
    private javax.swing.JTextField t_pcentral;
    private javax.swing.JMenuItem t_pegar;
    private javax.swing.JTextField t_ppalabra;
    private javax.swing.JTextField t_primera;
    private javax.swing.JMenuItem t_reemplazar;
    public javax.swing.JTextArea t_traduccion;
    private javax.swing.JTextField t_u;
    private javax.swing.JTextField t_ultima;
    private javax.swing.JTextField t_upalabra;
    // End of variables declaration//GEN-END:variables
}
