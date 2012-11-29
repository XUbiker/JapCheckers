package japcheckers.accounts;

import java.awt.Component;

/**
 *
 * @author Александр
 */
@SuppressWarnings("serial")
public class AccountsFrame extends javax.swing.JFrame {

	private AccountsManager handler;

	private static boolean user1FieldEnabled = true, user2FieldEnabled = true;

	public AccountsFrame() {
		initComponents();
		setLocationRelativeTo(null);
		RegisterPanel.setVisible(false);
		StartButton.setVisible(false);
		pack();
	}

	public void setHandler (AccountsManager accHandler) {
		handler = accHandler;
	}

	public void AllowGame () {
		RegisterPanel.setVisible(false);
		for (Component c : LoginPanel.getComponents()) {
			c.setEnabled(false);
		}
		LoginPanel.setEnabled(false);
		StartButton.setVisible(true);
		pack();
	}

	public void displayMessage (String str) {
		InfoLabel.setText("  " + str);
	}

	public void enableUser1Field (boolean val) {
		UserLabel1.setEnabled(val);
		LoginField1.setEnabled(val);
		PswdField1.setEnabled(val);
		LoginButton1.setEnabled(val);
		user1FieldEnabled = val;
	}

	public void enableUser2Field (boolean val) {
		UserLabel2.setEnabled(val);
		LoginField2.setEnabled(val);
		PswdField2.setEnabled(val);
		LoginButton2.setEnabled(val);
		user2FieldEnabled = val;
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        RegisterPanel = new javax.swing.JPanel();
        RegisterLoginLabel = new javax.swing.JLabel();
        RegisterPswdLabel = new javax.swing.JLabel();
        RegisterLogin = new javax.swing.JTextField();
        RegisterPswd = new javax.swing.JPasswordField();
        RegisterAttemptBtn = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        UserLabel1 = new javax.swing.JLabel();
        LoginField1 = new javax.swing.JTextField();
        LoginButton1 = new javax.swing.JButton();
        PswdField1 = new javax.swing.JPasswordField();
        LoginButton2 = new javax.swing.JButton();
        UserLabel2 = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        PswdLabel = new javax.swing.JLabel();
        LoginField2 = new javax.swing.JTextField();
        PswdField2 = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JToggleButton();
        StartButton = new javax.swing.JButton();
        InfoLabel = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Accounts Manager");
        setName("AccountsFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                WindowClosing(evt);
            }
        });

        RegisterPanel.setEnabled(false);

        RegisterLoginLabel.setText("Login");

        RegisterPswdLabel.setText("Password");

        RegisterLogin.setNextFocusableComponent(RegisterPswd);
        RegisterLogin.setPreferredSize(new java.awt.Dimension(131, 22));

        RegisterPswd.setNextFocusableComponent(RegisterAttemptBtn);
        RegisterPswd.setPreferredSize(new java.awt.Dimension(131, 22));

        RegisterAttemptBtn.setText("Go!");
        RegisterAttemptBtn.setNextFocusableComponent(RegisterButton);
        RegisterAttemptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAttemptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addComponent(RegisterPswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegisterPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addComponent(RegisterLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegisterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterAttemptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegisterLoginLabel)
                            .addComponent(RegisterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegisterPswdLabel)
                            .addComponent(RegisterPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(RegisterAttemptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        UserLabel1.setText("User #1");

        LoginField1.setNextFocusableComponent(PswdField1);

        LoginButton1.setText("Enter!");
        LoginButton1.setNextFocusableComponent(LoginField2);
        LoginButton1.setPreferredSize(new java.awt.Dimension(131, 25));
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });

        PswdField1.setNextFocusableComponent(LoginButton1);

        LoginButton2.setText("Enter!");
        LoginButton2.setPreferredSize(new java.awt.Dimension(131, 25));
        LoginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton2ActionPerformed(evt);
            }
        });

        UserLabel2.setText("User #2");

        LoginLabel.setText("    - Login -");
        LoginLabel.setToolTipText("");

        PswdLabel.setText(" - Password -");

        LoginField2.setNextFocusableComponent(PswdField2);

        PswdField2.setNextFocusableComponent(LoginButton2);

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(UserLabel1))
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LoginField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PswdField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LoginButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UserLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PswdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PswdField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(UserLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PswdField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(UserLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PswdField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PswdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterButton))))
                .addContainerGap())
        );

        StartButton.setText("Start game.");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        InfoLabel.setPreferredSize(new java.awt.Dimension(0, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(InfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
		handler.loginAttempt(1, LoginField1.getText(), new String(PswdField1.getPassword()));
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowClosing
		handler.finishXML();
    }//GEN-LAST:event_WindowClosing

    private void LoginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton2ActionPerformed
		handler.loginAttempt(2, LoginField2.getText(), new String(PswdField2.getPassword()));
    }//GEN-LAST:event_LoginButton2ActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
		if (RegisterButton.isSelected()) {
			for (Component c : LoginPanel.getComponents()) {
				if (c != RegisterButton)
				c.setEnabled(false);
			}
			LoginPanel.setEnabled(false);
			RegisterPanel.setVisible(true);
			pack();
		} else {
			RegisterPanel.setVisible(false);
			LoginLabel.setEnabled(true);
			PswdLabel.setEnabled(true);
			enableUser1Field(user1FieldEnabled);
			enableUser2Field(user2FieldEnabled);
//			for (Component c : LoginPanel.getComponents()) {
//				c.setEnabled(true);
//			}
			LoginPanel.setEnabled(true);
			pack();
		}
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void RegisterAttemptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAttemptBtnActionPerformed
		String new_login = RegisterLogin.getText();
		String new_pswd = new String(RegisterPswd.getPassword());
		if (new_login.isEmpty() || new_pswd.isEmpty()) {
			displayMessage("Fill in all fields, please");
			return;
		}
		handler.registerAttempt(new_login, new_pswd);
    }//GEN-LAST:event_RegisterAttemptBtnActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        dispose();
		handler.finishXML();
		handler.startGame();
    }//GEN-LAST:event_StartButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JButton LoginButton2;
    private javax.swing.JTextField LoginField1;
    private javax.swing.JTextField LoginField2;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PswdField1;
    private javax.swing.JPasswordField PswdField2;
    private javax.swing.JLabel PswdLabel;
    private javax.swing.JButton RegisterAttemptBtn;
    private javax.swing.JToggleButton RegisterButton;
    private javax.swing.JTextField RegisterLogin;
    private javax.swing.JLabel RegisterLoginLabel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JPasswordField RegisterPswd;
    private javax.swing.JLabel RegisterPswdLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel UserLabel1;
    private javax.swing.JLabel UserLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
