/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stima.tucil3;
// java
import java.util.*;
import java.io.*;

// java and browser
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;

// java UI
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileFilter;

import stima.constants.Constants;
/**
 *
 * @author Re:Tucil
 */
public class App extends javax.swing.JFrame
{
    private File inputFile;
    private Scanner fileInput;
    
    // user's choice
    private boolean isAddingFirstNode;
    private String firstNodeChosen;
    private Integer firstNodeIndex;
    private boolean isAddingSecondNode;
    private String secondNodeChosen;
    private Integer secondNodeIndex;
    
    // Keperluan algoritma
    private Double[][] adjacencyMatrix;
    private ArrayList<Trituple> nodes;
    private Integer numOfNodes;
    /**
     * Creates new form App
     */
    public App(){
        initComponents();
        this.inputFile = null;
        this.fileInput = null;
        this.firstNodeChosen = null;
        this.firstNodeIndex = null;
        this.secondNodeChosen = null;
        this.secondNodeIndex = null;
        this.adjacencyMatrix = null;
        this.nodes = null;
        this.numOfNodes = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browseDialog = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        mapsPanel = new javax.swing.JPanel();
        chooseFirstNode = new javax.swing.JComboBox<>();
        firstNodeWarning = new javax.swing.JLabel();
        secondNodeWarning = new javax.swing.JLabel();
        chooseSecondNode = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();

        browseDialog.setAcceptAllFileFilterUsed(false);
        browseDialog.setCurrentDirectory(new java.io.File("C:\\Users\\PERSONAL\\Desktop\\KULIAH\\IF2211 STIMA\\Tugas Kecil 3\\test"));
        browseDialog.setName("browseDialog"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Re:Tucil");

        browseButton.setLabel("Browse");
        browseButton.setName("browseButton"); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileNameLabel.setText("File not found!");

        mapsPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mapsPanelLayout = new javax.swing.GroupLayout(mapsPanel);
        mapsPanel.setLayout(mapsPanelLayout);
        mapsPanelLayout.setHorizontalGroup(
            mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        mapsPanelLayout.setVerticalGroup(
            mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        chooseFirstNode.setAutoscrolls(true);
        chooseFirstNode.setEnabled(false);
        chooseFirstNode.setName("chooseFirstNode"); // NOI18N
        chooseFirstNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseFirstNodeItemStateChanged(evt);
            }
        });

        firstNodeWarning.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        firstNodeWarning.setText(Constants.chooseFileMessage);

        secondNodeWarning.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        secondNodeWarning.setText(Constants.chooseFileMessage);

        chooseSecondNode.setAutoscrolls(true);
        chooseSecondNode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chooseSecondNode.setEnabled(false);
        chooseSecondNode.setName("chooseSecondNode"); // NOI18N
        chooseSecondNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseSecondNodeItemStateChanged(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooseFirstNode, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondNodeWarning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseSecondNode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNodeWarning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(mapsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseButton)
                .addGap(65, 65, 65)
                .addComponent(firstNodeWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseFirstNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(secondNodeWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseSecondNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(mapsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        try
        {   
            FileFilter filter = new FileNameExtensionFilter("Text files", "txt");
            this.browseDialog.setFileFilter(filter);
            this.browseDialog.showOpenDialog(this);
            
            inputFile = browseDialog.getSelectedFile();
            fileInput = new Scanner(inputFile);
            convertFileToGraph();
            populateFirstNodeChoice();
            printNodesJS();
            
            this.firstNodeWarning.setText(Constants.canChooseFirstNodeMessage);
            this.chooseFirstNode.setEnabled(true);
            
            this.secondNodeWarning.setText(Constants.cannotChooseSecondNodeMessage);
            this.chooseSecondNode.setEnabled(false);
            
            this.browseButton.setText("Change");
            fileNameLabel.setText(inputFile.getName());
            
            loadMaps();
        }
        catch (Exception e)
        {
            this.browseButton.setText("Browse");
            fileNameLabel.setText(Constants.fileNotFoundMessage);
            
            firstNodeWarning.setText(Constants.chooseFileMessage);
            chooseFirstNode.setEnabled(false);
            secondNodeWarning.setText(Constants.chooseFileMessage);
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void chooseSecondNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseSecondNodeItemStateChanged
        if(this.isAddingSecondNode) return;
        
        this.secondNodeChosen = this.chooseSecondNode.getSelectedItem().toString();
        if(this.secondNodeChosen.equals(Constants.emptyString))
        {
            this.secondNodeChosen = null;
            this.secondNodeIndex = null;
            return;
        }
        
        for(Trituple t : this.nodes)
        {
            if(t.name.equals(this.secondNodeChosen))
            {
                this.secondNodeIndex = t.index;
                break;
            }
        }
        printSecondNodeJS();
    }//GEN-LAST:event_chooseSecondNodeItemStateChanged

    private void chooseFirstNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseFirstNodeItemStateChanged
        if(this.isAddingFirstNode) return;

        this.firstNodeChosen = this.chooseFirstNode.getSelectedItem().toString();
        if(this.firstNodeChosen.equals(Constants.emptyString))
        {
            this.firstNodeChosen = null;
            this.firstNodeIndex = null;
            secondNodeWarning.setText(Constants.cannotChooseSecondNodeMessage);
            chooseSecondNode.setSelectedItem(Constants.emptyString);
            chooseSecondNode.setEnabled(false);
            return;
        }
        
        for(Trituple t : this.nodes)
        {
            if(t.name.equals(this.firstNodeChosen))
            {
                this.firstNodeIndex = t.index;
                break;
            }
        }
        
        printFirstNodeJS();
        populateSecondNodeChoice();
        this.secondNodeWarning.setText(Constants.canChooseSecondNodeMessage);
        this.chooseSecondNode.setEnabled(true);
    }//GEN-LAST:event_chooseFirstNodeItemStateChanged

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(this.firstNodeIndex == null || this.secondNodeIndex == null) return;
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JFileChooser browseDialog;
    private javax.swing.JComboBox<String> chooseFirstNode;
    private javax.swing.JComboBox<String> chooseSecondNode;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel firstNodeWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mapsPanel;
    private javax.swing.JLabel secondNodeWarning;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    
    private void convertFileToGraph()
    {
        int N = fileInput.nextInt();
        this.numOfNodes = N;
        // dummy untuk memindahkan baris
        fileInput.nextLine();
        
        nodes = new ArrayList<>();
        
        Double lat, lng;
        String name;
        
        for(int i = 1; i <= N; i++)
        {
            lat = fileInput.nextDouble();
            lng = fileInput.nextDouble();
            name = fileInput.nextLine().trim();
            nodes.add(new Trituple(lat, lng, name));
        }
        
        adjacencyMatrix = new Double[N][N];
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                adjacencyMatrix[i][j] = fileInput.nextDouble();
            }
        }
    }
    
    private void AStarAlgorithm()
    {
        PriorityQueue<PriorityQueueEntry> queue = new PriorityQueue<>();
        boolean[] visited = new boolean[numOfNodes];
        
        queue.add(new PriorityQueueEntry(0, 0, firstNodeIndex, new ArrayList<>()));
        
        PriorityQueueEntry top = null;
        Double currentDistance = null;
        Double estimatedDistance = null;
        Integer currentNodeIndex = null;
        ArrayList<Integer> paths = null;
        
        while(!queue.isEmpty())
        {
            top = queue.poll();
            currentDistance = top.distanceSoFar;
            estimatedDistance = top.sum;
            currentNodeIndex = top.nodeIndex;
            paths = top.path;
            
            if(visited[currentNodeIndex]) continue;
            
            if(currentNodeIndex == secondNodeIndex) break;
            
            visited[currentNodeIndex] = true;
            for(int i = 0; i <= numOfNodes; i++)
            {
                if(i == currentNodeIndex) continue;
                
                Double nextDistance = currentDistance + adjacencyMatrix[currentNodeIndex][i];
                Double nextEstimatedDistance = currentDistance + nodes.get(i).straightLineDistance(nodes.get(currentNodeIndex));
                Integer nextNode = i;
                
                ArrayList<Integer> newPath = new ArrayList<>();
                // copy semua paths ke dalam newPath
                for(Integer passedNodes : paths)
                {
                    newPath.add(passedNodes);
                }
                newPath.add(currentNodeIndex);
                
                queue.add(new PriorityQueueEntry(nextDistance, nextEstimatedDistance, nextNode, newPath));
            }
        }
        
        // sudah sampai tujuan, atau queue kosong
        if(queue.isEmpty())
        {
            return;
        }
        // sudah pasti sampai tujuan
        
        /* TODO:
            Implementasikan path yang diambil ke MAP API */
    }
    
    private void loadMaps(){
        System.setProperty("jxbrowser.license.key", "1BNDHFSC1FYNQ0G0I8NSW5HX5CAC271M98DIQCD0NF84MDN82Z3XELT23S4LRUXFZG51X0");
        EngineOptions options = EngineOptions.newBuilder(HARDWARE_ACCELERATED).build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);
            
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(view);
            panel.setSize(1200,800); //gmn cara buat size nya dinamis
            mapsPanel.add(panel);
            mapsPanel.revalidate();
            mapsPanel.repaint();
            
            /* Sesuaikan letak file HTML nya */
            browser.navigation().loadUrl("C:\\Users\\chris\\Desktop\\tucil\\IF2211_Tucil3\\bin\\index.html"); 
        });
    }
    
    private void populateFirstNodeChoice()
    {
        this.isAddingFirstNode = true;
        this.chooseFirstNode.removeAllItems();
        
        this.chooseFirstNode.addItem(Constants.emptyString);
        int i = 1;
        for(Trituple t : this.nodes)
        {
            this.chooseFirstNode.addItem(t.name);
        }
        this.isAddingFirstNode = false;
    }
    
    private void populateSecondNodeChoice()
    {
        this.isAddingSecondNode = true;
        this.chooseSecondNode.removeAllItems();
        
        this.chooseSecondNode.addItem(Constants.emptyString);
        for(Trituple t : this.nodes)
        {
            if(t.name.equals(this.firstNodeChosen))
            {
                continue;
            }
            this.chooseSecondNode.addItem(t.name);
        }
        this.isAddingSecondNode = false;
    }
    
    private void printNodesJS()
    {
        try
        {
            FileWriter file = new FileWriter("./../../bin/nodes.js");
            file.write("var nodes = [");
            for(Trituple t : this.nodes)
            {
                file.write(t.toString());
                file.write(", ");
            }
            file.write("];");
            file.close();
        }
        catch (IOException e)
        {
            // do nothing
        }
    }
    
    private void printFirstNodeJS()
    {
        try
        {
            FileWriter file = new FileWriter("./../../bin/firstNode.js");
            file.write("var firstNode = ");
            if(this.firstNodeIndex == null)
            {
                file.write("{}");
            }
            else
            {
                file.write(nodes.get(firstNodeIndex).toString());
            }
            file.write(";");
            file.close();
        }
        catch (IOException e)
        {
            // do nothing
        }
    }
    
    private void printSecondNodeJS()
    {
        try
        {
            FileWriter file = new FileWriter("./../../bin/secondNode.js");
            file.write("var secondNode = ");
            if(this.secondNodeIndex == null)
            {
                file.write("{}");
            }
            else
            {
                file.write(nodes.get(secondNodeIndex).toString());
            }
            file.write(";");
            file.close();
        }
        catch (IOException e)
        {
            // do nothing
        }
    }
}
