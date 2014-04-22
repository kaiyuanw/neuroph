package org.neuroph.netbeans.classificationsample;

import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.datasetgenerator.base.DataSetGenerator;
import org.neuroph.datasetgenerator.brain.CircleGenerator;
import org.neuroph.datasetgenerator.brain.DiamondGenerator;
import org.neuroph.datasetgenerator.brain.ElipseGenerator;
import org.neuroph.datasetgenerator.brain.MoonGenerator;
import org.neuroph.datasetgenerator.brain.RandomPolynomialGenerator;
import org.neuroph.datasetgenerator.brain.RingGenerator;
import org.neuroph.datasetgenerator.brain.SquareGenerator;
import org.neuroph.datasetgenerator.brain.XORGenerator;
import org.neuroph.netbeans.project.NeurophProjectFilesFactory;
import org.neuroph.util.NeuralNetworkFactory;
import org.neuroph.util.TransferFunctionType;
import org.openide.windows.IOProvider;

/**
 *
 * @author Marko
 */
public class MultiLayerPerceptronClassificationSamplesPanel extends javax.swing.JPanel {

    int netCode = 1;
    int tansfCode = 1;
    int netCount = 0; // number of created networks
    String neuronsCount;
    NeuralNetwork neuralNet;
    TransferFunctionType funct;  
    private DataSetGenerator[] shapes;
    
    public DataSetGenerator getSelectedShape() {
        initShapes(comboShapes.getSelectedIndex(), slideNumberOfPoints.getValue());
        return shapes[comboShapes.getSelectedIndex()];
    }
     private void initShapes(int shapeIndex, int numberOfPoints) {
        shapes = new DataSetGenerator[8];
        shapes[0] = new ElipseGenerator(numberOfPoints, 0, 0, 1, 0.5);//0.5, 0.5, 0.5, 0.25
        shapes[1] = new CircleGenerator(numberOfPoints, 0, 0, 0.5);//0.5, 0.5, 0.125
        shapes[2] = new RingGenerator(numberOfPoints, 0, 0, 0.125, 0.5);//0.5, 0.5, 0.0625, 0.25
        shapes[3] = new MoonGenerator(numberOfPoints, 0, 0, 0.5);//0.5, 0.5, 0.125
        shapes[4] = new SquareGenerator(numberOfPoints, 1.25);
        shapes[5] = new DiamondGenerator(numberOfPoints, 1);
        shapes[6] = new XORGenerator(numberOfPoints);
        shapes[7] = new RandomPolynomialGenerator(numberOfPoints);
        comboShapes.setModel(new DefaultComboBoxModel(shapes));
        comboShapes.setSelectedIndex(shapeIndex);
    }
    public static MultiLayerPerceptronSampleTopComponent mlpSampleTc;
    
    public MultiLayerPerceptronClassificationSamplesPanel(MultiLayerPerceptronSampleTopComponent bs) {
        
        initComponents();         
        setSize(new Dimension(415, 454)); 
        initComp();
        initShapes(0, 0);
        MultiLayerPerceptronClassificationSamplesPanel.mlpSampleTc = bs;
    }

    private void initComp()
    {
        jcbTransferFunction.addItem("Tanh");
        jcbTransferFunction.addItem("Sigmoid");       
        neuronsCount = "2 1";
        funct = TransferFunctionType.SIGMOID;
        neuralNet = NeuralNetworkFactory.createMLPerceptron(neuronsCount, funct);     
  }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jlTransferFunction = new javax.swing.JLabel();
        jcbTransferFunction = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboNetworkStructure = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radioAnswer = new javax.swing.JRadioButton();
        radioAreas = new javax.swing.JRadioButton();
        radioLines = new javax.swing.JRadioButton();
        checkPoints = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        checkPositiveInputs = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboShapes = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        slideNumberOfPoints = new javax.swing.JSlider();
        labNumberOfPoints = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labNeuralNetwork = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labDataSet = new javax.swing.JLabel();
        jbClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(415, 454));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Neural Network:"));

        jlTransferFunction.setText("Transfer function:");

        jcbTransferFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTransferFunctionActionPerformed(evt);
            }
        });

        jLabel4.setText("Network structure:");

        comboNetworkStructure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:1:2", "2:2:2", "2:3:2", "2:4:2", "2:5:2", "2:6:2", "2:7:2", "2:8:2", "2:9:2", "2:10:2", "2:11:2", "2:13:2", "2:14:2", "2:15:2", "2:20:2", "2:25:2", "2:50:2", "2:100:2", "2:2:2:2", "2:3:3:2", "2:4:4:2", "2:5:5:2", "2:10:10:2", "2:3:4:2", "2:4:3:2", "2:3:5:2", "2:5:3:2", "2:4:5:2", "2:5:4:2", "2:3:10:2", "2:10:3:2", "2:4:10:2", "2:10:4:2", "2:5:10:2", "2:2:2:2:2", "2:3:3:3:2", "2:3:4:3:2", "2:4:3:4:2", "2:4:4:4:2", "2:3:4:5:2", "2:5:4:3:2", "2:4:5:4:2", "2:5:4:5:2", "2:5:5:5:2" }));
        comboNetworkStructure.setSelectedIndex(9);

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jlTransferFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTransferFunction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboNetworkStructure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboNetworkStructure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTransferFunction)
                    .addComponent(jcbTransferFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualization Settings:"));

        radioAnswer.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioAnswer);
        radioAnswer.setSelected(true);
        radioAnswer.setText("Network Answer");
        radioAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAnswerActionPerformed(evt);
            }
        });

        radioAreas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioAreas);
        radioAreas.setText("Areas");
        radioAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAreasActionPerformed(evt);
            }
        });

        radioLines.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioLines);
        radioLines.setText("Lines");
        radioLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLinesActionPerformed(evt);
            }
        });

        checkPoints.setBackground(new java.awt.Color(255, 255, 255));
        checkPoints.setSelected(true);
        checkPoints.setText("Show points");
        checkPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPointsActionPerformed(evt);
            }
        });

        checkPositiveInputs.setBackground(new java.awt.Color(255, 255, 255));
        checkPositiveInputs.setText("Range [0,1]");
        checkPositiveInputs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPositiveInputsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPositiveInputs)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(radioAreas)
                        .addComponent(radioLines)
                        .addComponent(checkPoints)
                        .addComponent(radioAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(checkPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkPositiveInputs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioAnswer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioAreas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioLines)
                .addGap(11, 11, 11))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Data Set:"));

        jLabel2.setText("Choose shape:");

        jLabel1.setText("Number of points:");

        slideNumberOfPoints.setBackground(new java.awt.Color(255, 255, 255));
        slideNumberOfPoints.setMaximum(2000);
        slideNumberOfPoints.setToolTipText("");
        slideNumberOfPoints.setValue(1000);
        slideNumberOfPoints.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideNumberOfPointsStateChanged(evt);
            }
        });

        labNumberOfPoints.setText("1000");

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slideNumberOfPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNumberOfPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(comboShapes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slideNumberOfPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labNumberOfPoints)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Information:"));

        jLabel3.setText("Network:");

        labNeuralNetwork.setText("Not selected");

        jLabel5.setText("Data Set:");

        labDataSet.setText("Not selected");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labDataSet)
                    .addComponent(labNeuralNetwork))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labNeuralNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labDataSet))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jbClear.setBackground(new java.awt.Color(255, 255, 255));
        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbClear)))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static int VISUALIZATION_OPTION;
    public static boolean SHOW_POINTS;
    
    public void checkVisualizationOption(){
        if (radioAnswer.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(1);
        } else if (radioAreas.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(2);
        } else if (radioLines.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(3);
        }
    }
    public void visualizationPreprocessing(){
        checkVisualizationOption();
        if (checkPoints.isSelected()) {
            SHOW_POINTS = true;
            mlpSampleTc.getInputSpacePanel().prepareDrawing();
        } else {
            SHOW_POINTS = false;
            clear();
        }
    }
    
    public void setNeuralNetworkInformation(String info){
        labNeuralNetwork.setText(info);
    }
    
    public void setDataSetInformation(String info){
        labDataSet.setText(info);
    }
    
    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        labDataSet.setText("Not selected");
        labNeuralNetwork.setText("Not selected");
        clear();
        mlpSampleTc.getInputSpacePanel().setDrawingLocked(false);
        mlpSampleTc.setPointDrawed(false);    
        mlpSampleTc.removeNetworkAndDataSetFromContent();
    }//GEN-LAST:event_jbClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        neuralNet = createNeuralNetwork();
        createNeuralNetworkFile(neuralNet);
        IOProvider.getDefault().getIO("Neuroph", false).getOut().println("Neural network created.");
        comboNetworkStructure.setSelectedIndex(9);
        jcbTransferFunction.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void slideNumberOfPointsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideNumberOfPointsStateChanged
        labNumberOfPoints.setText(String.valueOf(slideNumberOfPoints.getValue()));
    }//GEN-LAST:event_slideNumberOfPointsStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (mlpSampleTc.getInputSpacePanel().isPointDrawed()) {
            mlpSampleTc.customDataSetCheck();
            mlpSampleTc.sampleTrainingSetFileCheck();
            labDataSet.setText(mlpSampleTc.getTrainingSet().getLabel());
        } else {
            DataSet dataSet = getSelectedShape().generate();
            NeurophProjectFilesFactory.getDefault().createTrainingSetFile(dataSet);
            mlpSampleTc.setTrainingSet(dataSet);         
            mlpSampleTc.informationCheck(null, dataSet);
            mlpSampleTc.clear();
            mlpSampleTc.repaint();
            mlpSampleTc.getInputSpacePanel().drawPointsFromTrainingSet(dataSet);
            mlpSampleTc.repaint();
            
        }            
        IOProvider.getDefault().getIO("Neuroph", false).getOut().println("Sample data set created.");
        initShapes(0, 0);
        slideNumberOfPoints.setValue(1000);
        labNumberOfPoints.setText("1000");
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setCheckPoints(boolean flag) {
        checkPositiveInputs.setSelected(flag);
    }
    
    private void checkPositiveInputsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPositiveInputsActionPerformed
        if (checkPositiveInputs.isSelected()) {
            mlpSampleTc.initializePanel(true);
        } else {
            mlpSampleTc.initializePanel(false);
        }
        
        mlpSampleTc.getInputSpacePanel().repaint();
    }//GEN-LAST:event_checkPositiveInputsActionPerformed

    private void radioAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAnswerActionPerformed
        drawCheck();
    }//GEN-LAST:event_radioAnswerActionPerformed

    private void radioAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAreasActionPerformed
        drawCheck();
    }//GEN-LAST:event_radioAreasActionPerformed

    private void radioLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLinesActionPerformed
        drawCheck();
    }//GEN-LAST:event_radioLinesActionPerformed

    private void checkPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPointsActionPerformed
        
    }//GEN-LAST:event_checkPointsActionPerformed

    private void jcbTransferFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTransferFunctionActionPerformed
        setTranseCode();
    }//GEN-LAST:event_jcbTransferFunctionActionPerformed

    public void checkPositive(){
        if (mlpSampleTc.getInputSpacePanel().isPositive()){
            checkPositiveInputs.setSelected(true);
            comboShapes.setEnabled(true);
            slideNumberOfPoints.setEnabled(true);
        }else{
            checkPositiveInputs.setSelected(false);
            comboShapes.setEnabled(false);
            slideNumberOfPoints.setEnabled(false);
        }
    }
    
    public void drawCheck(){
        if (radioAnswer.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(1);
        } else if (radioAreas.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(2);
        } else if (radioLines.isSelected()) {
            mlpSampleTc.getInputSpacePanel().setVisualizationOption(3);
        }
    }
    
    
    public void createNeuralNetworkFile(NeuralNetwork neuralNetwork){
        NeurophProjectFilesFactory.getDefault().createNeuralNetworkFile(neuralNetwork);
    }
    
   
    public void clear() {
        mlpSampleTc.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkPoints;
    private javax.swing.JCheckBox checkPositiveInputs;
    private javax.swing.JComboBox comboNetworkStructure;
    private javax.swing.JComboBox comboShapes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbClear;
    private javax.swing.JComboBox jcbTransferFunction;
    private javax.swing.JLabel jlTransferFunction;
    private javax.swing.JLabel labDataSet;
    private javax.swing.JLabel labNeuralNetwork;
    private javax.swing.JLabel labNumberOfPoints;
    private javax.swing.JRadioButton radioAnswer;
    private javax.swing.JRadioButton radioAreas;
    private javax.swing.JRadioButton radioLines;
    private javax.swing.JSlider slideNumberOfPoints;
    // End of variables declaration//GEN-END:variables

    @Action
    public void enableSetIterations()
    {
        
    }

    public void setNetCode()
    {
        netCode = 1;
     }

    public void setTranseCode()
    {
       String net = (String) jcbTransferFunction.getSelectedItem();

       if(net.equals("Sigmoid"))   netCode = 1;
       if(net.equals("Tanh"))   netCode = 2;
     }


    public void getNeuronsCount() {

        String structure = comboNetworkStructure.getSelectedItem().toString().replace(':', ' ');
        String hiddenNeurons = structure.substring(1, structure.length() - 1);

        try {
            neuronsCount = "2 " + hiddenNeurons + " 1";
        } catch (Exception e) {
            neuronsCount = "2 1";
        }

    }



   public NeuralNetwork createNeuralNetwork()
   {
       getNeuronsCount();
        
        switch(tansfCode)
        {
            case 1: funct = TransferFunctionType.SIGMOID; break;
            case 2: funct = TransferFunctionType.TANH; break;
        }

        neuralNet = NeuralNetworkFactory.createMLPerceptron(neuronsCount, funct);

        // set network name
        netCount++;
        neuralNet.setLabel("MlpSampleNet" + netCount);
        return neuralNet;

   }

   public double getLearningRate()
   {

       return 0.7;
   }

   public double getMaxError()
   {
       
       return 0.01;
   }

   public double getMomentum()
   {
       
       return 0.2;
   }

   public int getMaxIteration()
   {
       return new Integer(0);
   }



}



    


