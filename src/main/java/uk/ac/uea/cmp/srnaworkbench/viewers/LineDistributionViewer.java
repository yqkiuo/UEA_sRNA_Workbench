package uk.ac.uea.cmp.srnaworkbench.viewers;

import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import uk.ac.uea.cmp.srnaworkbench.GUIInterface;
import uk.ac.uea.cmp.srnaworkbench.tools.normalise.NormalisationType;
import uk.ac.uea.cmp.srnaworkbench.utils.matrix.SparseExpressionMatrix;

/**
 *
 * @author Matt
 */
public class LineDistributionViewer extends Viewer
{
  SparseExpressionMatrix sem;
  ArrayList<NormalisationType> normTypes;

  /**
   * Creates new form LineDistributionViewer
   */
  public LineDistributionViewer()
  {
    this.setClosable( true );
    this.setDefaultCloseOperation( JInternalFrame.DISPOSE_ON_CLOSE );
    initComponents();
  }
  
    public void setData(SparseExpressionMatrix sem, ArrayList<NormalisationType> normTypes)
    {
      this.sem = sem;
      this.normTypes = normTypes;
    }

    

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jScrollPane1 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();

    jPanel1.setLayout(new java.awt.GridLayout(0, 1));
    jScrollPane1.setViewportView(jPanel1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables

  @Override
  public void runProcedure()
  {
  }

  @Override
  public JPanel getParamsPanel()
  {
    return null;
  }

  @Override
  public void setShowingParams( boolean newState )
  {
  }

  @Override
  public boolean getShowingParams()
  {
    return false;
  }

  @Override
  public void shutdown()
  {
  }
}