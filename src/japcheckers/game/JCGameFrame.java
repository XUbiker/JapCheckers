package japcheckers.game;

import japcheckers.Pair;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Александр
 */
@SuppressWarnings("serial")
public class JCGameFrame extends javax.swing.JFrame {
	private GameHandler handler;
	private int row, col, cell_size = 35, left_spc = 10, up_spc = 10;
	private static Random rnd;

	public JCImageLabel getImageLabel () {
		return imageLabel1;
	}

	public void setHandler (GameHandler gh) {
		handler = gh;
	}

	public JCGameFrame(int row, int col) {
		this.row = row;
		this.col = col;
		rnd = new Random();
		initComponents();
		int width = col * cell_size + left_spc * 2;
		int height = row * cell_size + up_spc * 2;
		this.setSize(width + 300, height + 100);
		jPanel1.setPreferredSize(new Dimension(width, height));
		imageLabel1.setSize(width, height);
		imageLabel1.setGridParams(row, col, cell_size, left_spc, up_spc);
		setLocationRelativeTo(null);
	}

	public void printLog (String str) {
		jTextArea1.append(str);
	}

	public void showDialog (String content) {
		JCResultFrame rFrame = new JCResultFrame();
		rFrame.setVisible(true);
		rFrame.setLocationRelativeTo(null);
		rFrame.setContent(content);
	}

	public void updateScore (ArrayList<Pair<String, Integer>> gamers_scores, int turn) {
		String str = "   Score:\r\n";
		for (int i = 0; i < gamers_scores.size(); i++) {
			if (i == turn)
				str += "->";
			else
				str += "  ";
			str += " " + gamers_scores.get(i).x + " - " + gamers_scores.get(i).y.toString() + "\r\n";
			jScoreArea.setText(str);
		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLabel1 = new japcheckers.game.JCImageLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScoreArea = new javax.swing.JTextArea();
        jFinishButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        imageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imageLabel1.setAlignmentY(0.0F);
        imageLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.setMaximumSize(null);
        jButton1.setMinimumSize(null);
        jButton1.setPreferredSize(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setAlignmentX(0.0F);
        jTextArea1.setAlignmentY(0.0F);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setToolTipText("");

        jScoreArea.setEditable(false);
        jScoreArea.setColumns(20);
        jScoreArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScoreArea.setRows(5);
        jScoreArea.setText("   Score:");
        jScoreArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScoreArea.setFocusable(false);
        jScoreArea.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jScoreArea);

        jFinishButton.setText("Finish Game!");
        jFinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFinishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jFinishButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFinishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
		int x, y, cnt = 0, breakcounter = 0;
		while (cnt < 16) {
			x = rnd.nextInt(col + 1);
			y = rnd.nextInt(row + 1);
			if (handler.coordIsEmpty(x, y)) {
				handler.newChecker(x, y);
				cnt++;
			} else {
				if (breakcounter++ > 1000)
					break;
			}
		}
    }//GEN-LAST:event_jButton1MouseClicked

    private void imageLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabel1MouseClicked
		int x = Math.round((float)(evt.getPoint().x - left_spc) / cell_size);
		int y = Math.round((float)(evt.getPoint().y - up_spc) / cell_size);
		handler.newChecker(x, y);
    }//GEN-LAST:event_imageLabel1MouseClicked

    private void jFinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFinishButtonActionPerformed
		handler.finishGame();
    }//GEN-LAST:event_jFinishButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private japcheckers.game.JCImageLabel imageLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jFinishButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jScoreArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}