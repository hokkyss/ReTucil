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
import java.awt.Dimension;

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
    private JPanel panel;
    private Dimension appSize;
    
    private File inputFile;
    private Scanner fileInput;
    
    // user's choice
    private boolean isAddingFirstNode;
    private String firstNodeChosen;
    private int firstNodeIndex;
    private boolean isAddingSecondNode;
    private String secondNodeChosen;
    private int secondNodeIndex;
    
    // Keperluan algoritma
    // private double[][] adjacencyMatrix;
    private int[][] adjacencyMatrix;
    private double[][] SLD;
    private ArrayList<Trituple> nodes;
    private int numOfNodes;
    private int numOfEdges;
    /**
     * Creates new form App
     */
    
    private ArrayList<Integer> path;
    
    public App(){
        initComponents();
        loadMaps();
        this.inputFile = null;
        this.fileInput = null;
        this.firstNodeChosen = Constants.emptyString;
        this.firstNodeIndex = -1;
        this.secondNodeChosen = Constants.emptyString;
        this.secondNodeIndex = -1;
        this.adjacencyMatrix = null;
        this.nodes = new ArrayList<>();
        this.path = new ArrayList<>();
        this.numOfNodes = 0;
        this.numOfEdges = 0;
        this.panel = new JPanel(new BorderLayout());
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
        mapsPanel = new javax.swing.JPanel();
        parent = new javax.swing.JPanel();
        ReTucil = new javax.swing.JLabel();
        chooseFirstNode = new javax.swing.JComboBox<>();
        firstNodeWarning = new javax.swing.JLabel();
        fileNameLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        chooseSecondNode = new javax.swing.JComboBox<>();
        secondNodeWarning = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultBox = new javax.swing.JTextArea();
        answer = new javax.swing.JLabel();

        browseDialog.setAcceptAllFileFilterUsed(false);
        browseDialog.setCurrentDirectory(new java.io.File("C:\\Users\\PERSONAL\\Desktop\\KULIAH\\IF2211 STIMA\\Tugas Kecil 3\\test"));
        browseDialog.setName("browseDialog"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        mapsPanel.setAlignmentX(0.0F);
        mapsPanel.setAlignmentY(0.0F);
        mapsPanel.setPreferredSize(new java.awt.Dimension(506, 551));

        javax.swing.GroupLayout mapsPanelLayout = new javax.swing.GroupLayout(mapsPanel);
        mapsPanel.setLayout(mapsPanelLayout);
        mapsPanelLayout.setHorizontalGroup(
            mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        mapsPanelLayout.setVerticalGroup(
            mapsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        parent.setBackground(new java.awt.Color(0, 137, 190));
        parent.setPreferredSize(new java.awt.Dimension(216, 548));

        ReTucil.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        ReTucil.setForeground(new java.awt.Color(255, 255, 255));
        ReTucil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReTucil.setText("Re:Tucil");

        chooseFirstNode.setAutoscrolls(true);
        chooseFirstNode.setEnabled(false);
        chooseFirstNode.setName("chooseFirstNode"); // NOI18N
        chooseFirstNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseFirstNodeItemStateChanged(evt);
            }
        });

        firstNodeWarning.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        firstNodeWarning.setForeground(new java.awt.Color(255, 255, 255));
        firstNodeWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNodeWarning.setText(Constants.chooseFileMessage);

        fileNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fileNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fileNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileNameLabel.setText("File not found!");

        browseButton.setLabel("Browse");
        browseButton.setName("browseButton"); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        chooseSecondNode.setAutoscrolls(true);
        chooseSecondNode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chooseSecondNode.setEnabled(false);
        chooseSecondNode.setName("chooseSecondNode"); // NOI18N
        chooseSecondNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseSecondNodeItemStateChanged(evt);
            }
        });

        secondNodeWarning.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        secondNodeWarning.setForeground(new java.awt.Color(255, 255, 255));
        secondNodeWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondNodeWarning.setText(Constants.chooseFileMessage);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        resultBox.setEditable(false);
        resultBox.setColumns(20);
        resultBox.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        resultBox.setRows(5);
        resultBox.setEnabled(false);
        resultBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane1.setViewportView(resultBox);

        answer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        answer.setForeground(new java.awt.Color(255, 255, 255));
        answer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answer.setText("The solution will appear here!");
        answer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout parentLayout = new javax.swing.GroupLayout(parent);
        parent.setLayout(parentLayout);
        parentLayout.setHorizontalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secondNodeWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNodeWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReTucil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(fileNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseFirstNode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseSecondNode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        parentLayout.setVerticalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ReTucil)
                .addGap(18, 18, 18)
                .addComponent(fileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseButton)
                .addGap(18, 18, 18)
                .addComponent(firstNodeWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseFirstNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondNodeWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseSecondNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(answer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            .addComponent(mapsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(this.firstNodeIndex == -1 || this.secondNodeIndex == -1)
        {
            resultBox.setText(Constants.emptyString);
            if(this.inputFile == null)
            {
                answer.setText(Constants.chooseFile);
            }
            else
            {
                answer.setText(Constants.chooseTwoNodes);
            }
            return;
        }

        this.path.clear();
        AStarAlgorithm();

        printPathJS();
        browser.navigation().loadUrl("http://localhost:8000/result");
        
        String s = Constants.emptyString;
        double sum = 0;
        for(int i = 0; i < path.size() - 1; i++)
        {
            s = s + nodes.get(path.get(i)).toStringVer2() + " -> " + nodes.get(path.get(i + 1)).toStringVer2() + " = " + SLD[i][i + 1] + "\n";
            sum += SLD[i][i + 1];
        }
        
        if(s.equals(Constants.emptyString))
        {
            resultBox.setText(Constants.noPath);
        }
        else
        {
            resultBox.setText(s);
        }
        answer.setText("Jarak : " + String.valueOf(sum) + " meter.");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void chooseSecondNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseSecondNodeItemStateChanged
        if(this.isAddingSecondNode) return;

        this.secondNodeChosen = this.chooseSecondNode.getSelectedItem().toString();
        if(this.secondNodeChosen.equals(Constants.emptyString))
        {
            this.secondNodeChosen = null;
            this.secondNodeIndex = -1;
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

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        try
        {
            Trituple.numOfTrituples = 0;
            this.inputFile = null;
            this.fileInput = null;
            this.firstNodeChosen = Constants.emptyString;
            this.firstNodeIndex = -1;
            this.secondNodeChosen = Constants.emptyString;
            this.secondNodeIndex = -1;
            this.adjacencyMatrix = null;
            this.nodes.clear();
            this.numOfNodes = 0;
            this.numOfEdges = 0;
            this.resultBox.setText(Constants.emptyString);
            this.answer.setText(Constants.solution);
        
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
            this.chooseSecondNode.setSelectedItem(Constants.emptyString);
            this.chooseSecondNode.setEnabled(false);

            this.browseButton.setText("Change");
            fileNameLabel.setText(inputFile.getName());

            printGraph();
            browser.navigation().loadUrl("http://localhost:8000");
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

    private void chooseFirstNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseFirstNodeItemStateChanged
        if(this.isAddingFirstNode) return;

        this.firstNodeChosen = this.chooseFirstNode.getSelectedItem().toString();
        if(this.firstNodeChosen.equals(Constants.emptyString))
        {
            this.firstNodeChosen = null;
            this.firstNodeIndex = -1;
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

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        this.mapsPanel.removeAll();
        
        this.appSize = this.getSize();
        
        this.mapsPanel.setSize(appSize.width - this.parent.getWidth(), appSize.height);
        
        this.panel.setSize(this.mapsPanel.getWidth(), this.mapsPanel.getHeight());
        mapsPanel.add(panel);
        mapsPanel.revalidate();
        mapsPanel.repaint();
    }//GEN-LAST:event_formWindowStateChanged

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
    private javax.swing.JLabel ReTucil;
    private javax.swing.JLabel answer;
    private javax.swing.JButton browseButton;
    private javax.swing.JFileChooser browseDialog;
    private javax.swing.JComboBox<String> chooseFirstNode;
    private javax.swing.JComboBox<String> chooseSecondNode;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel firstNodeWarning;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mapsPanel;
    private javax.swing.JPanel parent;
    private javax.swing.JTextArea resultBox;
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
        
        // adjacencyMatrix = new double[N][N];
        SLD = new double[N][N];
        adjacencyMatrix = new int[N][N];
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                adjacencyMatrix[i][j] = fileInput.nextInt();
                SLD[i][j] = nodes.get(i).straightLineDistance(nodes.get(j));
            }
        }
    }
    
    private void AStarAlgorithm()
    {
        PriorityQueue<PriorityQueueEntry> queue = new PriorityQueue<>(new PriorityQueueEntryComparator());
        boolean[] visited = new boolean[numOfNodes];
        
        queue.add(new PriorityQueueEntry(0, 0, firstNodeIndex, new ArrayList<>()));
        
        PriorityQueueEntry top = null;
        Double currentDistance = null;
        Double estimatedDistance = null;
        int currentNodeIndex = -1;
        ArrayList<Integer> paths = null;
        
        while(!queue.isEmpty())
        {
            top = queue.poll();
            currentDistance = top.distanceSoFar;
            estimatedDistance = top.sum;
            currentNodeIndex = top.nodeIndex;
            paths = top.path;
            
            if(visited[currentNodeIndex]) continue;
            
            if(currentNodeIndex == secondNodeIndex)
            {
                paths.add(currentNodeIndex);
                break;
            }
            
            visited[currentNodeIndex] = true;
            for(int i = 0; i < numOfNodes; i++)
            {
                if(i == currentNodeIndex) continue;
                if(this.adjacencyMatrix[currentNodeIndex][i] == 0) continue;
                
                double nextDistance = currentDistance + SLD[currentNodeIndex][i];
                double nextEstimatedDistance = nextDistance + SLD[i][secondNodeIndex];
                int nextNode = i;
                
                ArrayList<Integer> newPath = new ArrayList<>();
                // copy semua paths ke dalam newPath
                for(int passedNodes : paths)
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
        for(Integer i : paths)
        {
            this.path.add(i);
        }
    }
    
    Engine engine = Engine.newInstance(
        EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                .licenseKey("1BNDHFSC1FYNQ0G0I8NSW5HX5CAC271M98DIQCD0NF84MDN82Z3XELT23S4LRUXFZG51X0")
                .build());
        Browser browser = engine.newBrowser();
    
    private void loadMaps(){

        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);
            
            panel = new JPanel(new BorderLayout());
            panel.add(view);
            panel.setSize(this.mapsPanel.getSize());
            
            mapsPanel.add(panel);
            mapsPanel.revalidate();
            mapsPanel.repaint();
            
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
            FileWriter file = new FileWriter("./../../bin/public/nodes.js");
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
            FileWriter file = new FileWriter("./../../bin/public/firstNode.js");
            file.write("var firstNode = ");
            if(this.firstNodeIndex == -1)
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
            FileWriter file = new FileWriter("./../../bin/public/secondNode.js");
            file.write("var secondNode = ");
            if(this.secondNodeIndex == -1)
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
    
    private void printPathJS()
    {
        try
        {
            FileWriter file = new FileWriter("./../../bin/public/path.js");
            file.write("var path = [");
            for(Integer i : this.path)
            {
                file.write(this.nodes.get(i).toString());
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
    
    private void printGraph()
    {
        try{
            FileWriter file = new FileWriter("./../../bin/public/graph.js");
            file.write("var graph = [");
            for(int i = 0; i < numOfNodes; i++){
                for(int j = i+1; j < numOfNodes; j++){
                    if(adjacencyMatrix[i][j] != 0){
                        file.write("[");
                        file.write(this.nodes.get(i).toString());
                        file.write(", ");
                        file.write(this.nodes.get(j).toString());
                        file.write("], ");
                    }
                }
            }
            file.write("];");
            file.close();
        }
        catch(IOException e)
        {
            // do nothing
        }
    }
}
