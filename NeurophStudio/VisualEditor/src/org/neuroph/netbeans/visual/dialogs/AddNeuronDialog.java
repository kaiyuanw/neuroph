package org.neuroph.netbeans.visual.dialogs;

import java.awt.Frame;
import java.util.ArrayList;
import org.neuroph.core.Layer;
import org.neuroph.core.Neuron;
import org.neuroph.core.input.InputFunction;
import org.neuroph.core.transfer.TransferFunction;
import org.neuroph.netbeans.visual.widgets.NeuralNetworkScene;
import org.neuroph.util.NeuronFactory;
import org.neuroph.util.NeuronProperties;
import org.neuroph.util.Neuroph;
import org.openide.util.Exceptions;

/**
 *
 * @author hrza
 */
public class AddNeuronDialog extends javax.swing.JDialog {

    Layer layer;
    NeuralNetworkScene scene;

    public AddNeuronDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillCombos();
    }

    public AddNeuronDialog(Frame parent, boolean modal, Layer layer, NeuralNetworkScene scene) {
        super(parent, modal);
        initComponents();
        this.layer = layer;
        this.scene = scene;
        fillCombos();
    }

    public final void fillCombos() {
        ArrayList inputFuncs = Neuroph.getInstance().getInputFunctions();
        javax.swing.DefaultComboBoxModel inputFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(inputFuncs.toArray()));
        inputFunctionComboBox.setModel(inputFunctionComboBoxModel);
        
        ArrayList transferFuncs = Neuroph.getInstance().getTransferFunctions();
        javax.swing.DefaultComboBoxModel transferFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(transferFuncs.toArray()));
        transferFunctionComboBox.setModel(transferFunctionComboBoxModel);        

        ArrayList neuronClasses = Neuroph.getInstance().getNeurons();
        javax.swing.DefaultComboBoxModel neuronsComboBoxModel = (new javax.swing.DefaultComboBoxModel(neuronClasses.toArray()));
        neuronTypeComboBox.setModel(neuronsComboBoxModel);                   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        transferFunctionLabel = new javax.swing.JLabel();
        transferFunctionComboBox = new javax.swing.JComboBox();
        neuronCountsLabel = new javax.swing.JLabel();
        neuronNumberTextField = new javax.swing.JTextField();
        createNeuronsButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        neuronTypeLabel = new javax.swing.JLabel();
        neuronTypeComboBox = new javax.swing.JComboBox();
        inputFunctionLabel = new javax.swing.JLabel();
        inputFunctionComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.title")); // NOI18N
        setResizable(false);

        transferFunctionLabel.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.transferFunctionLabel.text_1")); // NOI18N

        neuronCountsLabel.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.neuronCountsLabel.text_1")); // NOI18N

        neuronNumberTextField.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.neuronNumberTextField.text")); // NOI18N

        createNeuronsButton.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.createNeuronsButton.text")); // NOI18N
        createNeuronsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNeuronsButtonActionPerformed(evt);
            }
        });

        cancelButton.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        neuronTypeLabel.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.neuronTypeLabel.text")); // NOI18N

        neuronTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neuronTypeComboBoxActionPerformed(evt);
            }
        });

        inputFunctionLabel.setText(org.openide.util.NbBundle.getMessage(AddNeuronDialog.class, "AddNeuronDialog.inputFunctionLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(neuronCountsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(neuronNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(neuronTypeLabel)
                                .addGap(45, 45, 45)
                                .addComponent(neuronTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(createNeuronsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inputFunctionLabel)
                        .addGap(33, 33, 33)
                        .addComponent(inputFunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transferFunctionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(transferFunctionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuronTypeLabel)
                    .addComponent(neuronTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFunctionLabel)
                    .addComponent(inputFunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferFunctionLabel)
                    .addComponent(transferFunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuronNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neuronCountsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNeuronsButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void createNeuronsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        try {

            Class<? extends Neuron> neuronClass = ((String) neuronTypeComboBox.getSelectedItem()).equals("Neuron")
                    ? (Class<? extends Neuron>) Class.forName("org.neuroph.core." + ((String) neuronTypeComboBox.getSelectedItem()).trim())
                    : (Class<? extends Neuron>) Class.forName("org.neuroph.nnet.comp.neuron." + ((String) neuronTypeComboBox.getSelectedItem()).trim());
            Class<? extends TransferFunction> transferFunctionClass = (Class<? extends TransferFunction>) Class.forName("org.neuroph.core.transfer." + ((String) transferFunctionComboBox.getSelectedItem()).trim());
            Class<? extends InputFunction> inputFunctionClass = (Class<? extends InputFunction>) Class.forName("org.neuroph.core.input." + ((String) inputFunctionComboBox.getSelectedItem()).trim());
           
            NeuronProperties props = new NeuronProperties(neuronClass, inputFunctionClass, transferFunctionClass);
            int numberOfNeurons = Integer.parseInt(neuronNumberTextField.getText().trim());

            for (int i = 0; i < numberOfNeurons; i++) {
                Neuron neuron = NeuronFactory.createNeuron(props);
                layer.addNeuron(neuron);
            }

            this.dispose();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }                                                   

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
    }                                            

    private void neuronTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNeuronDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNeuronDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNeuronDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNeuronDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNeuronDialog dialog = new AddNeuronDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createNeuronsButton;
    private javax.swing.JComboBox inputFunctionComboBox;
    private javax.swing.JLabel inputFunctionLabel;
    private javax.swing.JLabel neuronCountsLabel;
    private javax.swing.JTextField neuronNumberTextField;
    private javax.swing.JComboBox neuronTypeComboBox;
    private javax.swing.JLabel neuronTypeLabel;
    private javax.swing.JComboBox transferFunctionComboBox;
    private javax.swing.JLabel transferFunctionLabel;
    // End of variables declaration                   
}
