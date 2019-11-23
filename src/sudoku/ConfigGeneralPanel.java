/*
 * Copyright (C) 2008-12  Bernhard Hobiger
 *
 * This file is part of HoDoKu.
 *
 * HoDoKu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HoDoKu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HoDoKu. If not, see <http://www.gnu.org/licenses/>.
 */
package sudoku;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author  hobiwan
 */
public class ConfigGeneralPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;

    private String language;
    private String laf;

    /** All available languages as Locale; synchronized with {@link #availableIsoLanguages} */
    private List<Locale> availableLocales = new ArrayList<Locale>();
    /** All available Languages as ISO 639 2-letter codes. The first item is always "", the second is always "en" */
    private List<String> availableIsoLanguages = new ArrayList<String>();
    /** All available LAFs (first entry is system default); synchronized with {@link #availableLafClassNames) */
    private List<String> availableLafs = new ArrayList<String>();
    /** the class anems of all available LAFs */
    private List<String> availableLafClassNames = new ArrayList<String>();
    
    private Frame mainFrame;

    /**
     * Creates new form ConfigGeneralPanel
     * @param mainFrame 
     */
    public ConfigGeneralPanel(Frame mainFrame) {
        this.mainFrame = mainFrame;
        
        initComponents();

        // get all available languages
        initLanguages();
        // and all LAFs
        initLafs();

        deleteCursorAfterMsTextField.setDocument(new NumbersOnlyDocument());
        fontSizeTextField.setDocument(new NumbersOnlyDocument());
        
        initAll(false);
        deleteCursorAfterMsTextField.setEnabled(deleteCursorAfterCheckBox.isSelected());
        fontSizeTextField.setEnabled(! defaultSizeCheckBox.isSelected());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        showCandidatesCheckBox = new javax.swing.JCheckBox();
        showWrongValuesCheckBox = new javax.swing.JCheckBox();
        showDeviationsCheckBox = new javax.swing.JCheckBox();
        saveWindowLayoutCheckBox = new javax.swing.JCheckBox();
        localLabel = new javax.swing.JLabel();
        localComboBox = new javax.swing.JComboBox<String>();
        lookAndFeelComboBox = new javax.swing.JComboBox<String>();
        lookAndFeelLabel = new javax.swing.JLabel();
        fontSizeLabel = new javax.swing.JLabel();
        fontSizeTextField = new javax.swing.JTextField();
        showColorKuCheckBox = new javax.swing.JCheckBox();
        defaultSizeCheckBox = new javax.swing.JCheckBox();
        resetButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        shiftKeyCheckBox = new javax.swing.JCheckBox();
        onlySmallCursorsCheckBox = new javax.swing.JCheckBox();
        colorValuesCheckBox = new javax.swing.JCheckBox();
        showSudokuSolvedCheckBox = new javax.swing.JCheckBox();
        deleteCursorAfterCheckBox = new javax.swing.JCheckBox();
        deleteCursorAfterMsTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        toggleFilterAndOrCheckBox = new javax.swing.JCheckBox();
        singleClickModeCheckBox = new javax.swing.JCheckBox();
        onlySmallFiltersCheckBox = new javax.swing.JCheckBox();
        editModeAutoAdvanceCheckBox = new javax.swing.JCheckBox();
        drawExtraBoxesCheckBox = new javax.swing.JCheckBox();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel"); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ConfigGeneralPanel.jPanel2.border.title"))); // NOI18N

        showCandidatesCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.showCandidatesCheckBox.mnemonic").charAt(0));
        showCandidatesCheckBox.setText(bundle.getString("ConfigGeneralPanel.showCandidatesCheckBox.text")); // NOI18N
        showCandidatesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        showCandidatesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        showWrongValuesCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.showWrongValuesCheckBox.mnemonic").charAt(0));
        showWrongValuesCheckBox.setText(bundle.getString("ConfigGeneralPanel.showWrongValuesCheckBox.text")); // NOI18N
        showWrongValuesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        showWrongValuesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        showDeviationsCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.showDeviationsCheckBox.mnemonic").charAt(0));
        showDeviationsCheckBox.setText(bundle.getString("ConfigGeneralPanel.showDeviationsCheckBox.text")); // NOI18N
        showDeviationsCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        showDeviationsCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        saveWindowLayoutCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.saveWindowLayoutCheckBox.mnemonic").charAt(0));
        saveWindowLayoutCheckBox.setText(bundle.getString("ConfigGeneralPanel.saveWindowLayoutCheckBox.text")); // NOI18N
        saveWindowLayoutCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        saveWindowLayoutCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        localLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.localLabel.mnemonic").charAt(0));
        localLabel.setLabelFor(localComboBox);
        localLabel.setText(bundle.getString("ConfigGeneralPanel.localLabel.text")); // NOI18N

        lookAndFeelLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.lookAndFeelLabel.mnemonic").charAt(0));
        lookAndFeelLabel.setLabelFor(lookAndFeelComboBox);
        lookAndFeelLabel.setText(bundle.getString("ConfigGeneralPanel.lookAndFeelLabel.text")); // NOI18N

        fontSizeLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.fontSizeLabel.mnemonic").charAt(0));
        fontSizeLabel.setLabelFor(fontSizeTextField);
        fontSizeLabel.setText(bundle.getString("ConfigGeneralPanel.fontSizeLabel.text")); // NOI18N

        showColorKuCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.showColorKuCheckBox.mnemonic").charAt(0));
        showColorKuCheckBox.setText(bundle.getString("ConfigGeneralPanel.showColorKuCheckBox.text")); // NOI18N
        showColorKuCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        showColorKuCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        defaultSizeCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.defaultSizeCheckBox.mnemonic").charAt(0));
        defaultSizeCheckBox.setText(bundle.getString("ConfigGeneralPanel.defaultSizeCheckBox.text")); // NOI18N
        defaultSizeCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        defaultSizeCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        defaultSizeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultSizeCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localLabel)
                    .addComponent(lookAndFeelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localComboBox, 0, 120, Short.MAX_VALUE)
                    .addComponent(lookAndFeelComboBox, 0, 120, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(defaultSizeCheckBox))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showCandidatesCheckBox)
                            .addComponent(showWrongValuesCheckBox)
                            .addComponent(showDeviationsCheckBox)
                            .addComponent(saveWindowLayoutCheckBox)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fontSizeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(showColorKuCheckBox))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localLabel)
                    .addComponent(localComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lookAndFeelLabel)
                    .addComponent(lookAndFeelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(defaultSizeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSizeLabel)
                    .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCandidatesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showWrongValuesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showDeviationsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveWindowLayoutCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showColorKuCheckBox)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        resetButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.resetButton.mnemonic").charAt(0));
        resetButton.setText(bundle.getString("ConfigGeneralPanel.resetButton.text")); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ConfigGeneralPanel.jPanel4.border.title"))); // NOI18N

        shiftKeyCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.shiftKeyCheckBox.mnemonic").charAt(0));
        shiftKeyCheckBox.setText(bundle.getString("ConfigGeneralPanel.shiftKeyCheckBox.text")); // NOI18N

        onlySmallCursorsCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.onlySmallCursorsCheckBox.mnemonic").charAt(0));
        onlySmallCursorsCheckBox.setText(bundle.getString("ConfigGeneralPanel.onlySmallCursorsCheckBox.text")); // NOI18N

        colorValuesCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.colorValuesCheckBox.mnemonics").charAt(0));
        colorValuesCheckBox.setText(bundle.getString("ConfigGeneralPanel.colorValuesCheckBox.text")); // NOI18N

        showSudokuSolvedCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.showSudokuSolvedCheckBox.mnemonic").charAt(0));
        showSudokuSolvedCheckBox.setText(bundle.getString("ConfigGeneralPanel.showSudokuSolvedCheckBox.text")); // NOI18N

        deleteCursorAfterCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.deleteCursorAfterCheckBox.mnemonic").charAt(0));
        deleteCursorAfterCheckBox.setText(bundle.getString("ConfigGeneralPanel.deleteCursorAfterCheckBox.text")); // NOI18N
        deleteCursorAfterCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCursorAfterCheckBoxActionPerformed(evt);
            }
        });

        deleteCursorAfterMsTextField.setText(bundle.getString("ConfigGeneralPanel.deleteCursorAfterMsTextField.text")); // NOI18N

        jLabel1.setText(bundle.getString("ConfigGeneralPanel.jLabel1.text")); // NOI18N

        toggleFilterAndOrCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.toggleFilterAndOrCheckBox.mnemonic").charAt(0));
        toggleFilterAndOrCheckBox.setText(bundle.getString("ConfigGeneralPanel.toggleFilterAndOrCheckBox.text")); // NOI18N

        singleClickModeCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.singleClickModeCheckBox.mnemonic").charAt(0));
        singleClickModeCheckBox.setText(bundle.getString("ConfigGeneralPanel.singleClickModeCheckBox.text")); // NOI18N
        singleClickModeCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = (MainFrame) mainFrame;
				mf.setSingleClickMode(singleClickModeCheckBox.isSelected());
			}        	
        });
        
        onlySmallFiltersCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.onlySmallFiltersCheckBox.mnemonic").charAt(0));
        onlySmallFiltersCheckBox.setText(bundle.getString("ConfigGeneralPanel.onlySmallFiltersCheckBox.text")); // NOI18N

        editModeAutoAdvanceCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.editModeAutoAdvanceCheckBox.mnemonic").charAt(0));
        editModeAutoAdvanceCheckBox.setText(bundle.getString("ConfigGeneralPanel.editModeAutoAdvanceCheckBox.text")); // NOI18N

        drawExtraBoxesCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("ConfigGeneralPanel.drawExtraBoxesCheckBox.mnemonic").charAt(0));
        drawExtraBoxesCheckBox.setText(bundle.getString("ConfigGeneralPanel.drawExtraBoxesCheckBox.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawExtraBoxesCheckBox)
                    .addComponent(showSudokuSolvedCheckBox)
                    .addComponent(colorValuesCheckBox)
                    .addComponent(onlySmallCursorsCheckBox)
                    .addComponent(shiftKeyCheckBox)
                    .addComponent(toggleFilterAndOrCheckBox)
                    .addComponent(deleteCursorAfterCheckBox)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(deleteCursorAfterMsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(singleClickModeCheckBox)
                    .addComponent(onlySmallFiltersCheckBox)
                    .addComponent(editModeAutoAdvanceCheckBox))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawExtraBoxesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftKeyCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onlySmallCursorsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorValuesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showSudokuSolvedCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toggleFilterAndOrCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCursorAfterCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCursorAfterMsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singleClickModeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onlySmallFiltersCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editModeAutoAdvanceCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(resetButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(resetButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jPanel4});

    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        initAll(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void deleteCursorAfterCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCursorAfterCheckBoxActionPerformed
        deleteCursorAfterMsTextField.setEnabled(deleteCursorAfterCheckBox.isSelected());
    }//GEN-LAST:event_deleteCursorAfterCheckBoxActionPerformed

    private void defaultSizeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultSizeCheckBoxActionPerformed
        fontSizeTextField.setEnabled(! defaultSizeCheckBox.isSelected());
    }//GEN-LAST:event_defaultSizeCheckBoxActionPerformed
    
    public void okPressed() {
        boolean oldUseDefaultFontSize = Options.getInstance().isUseDefaultFontSize();
        Options.getInstance().setUseDefaultFontSize(defaultSizeCheckBox.isSelected());
        int oldFontSize = Options.getInstance().getCustomFontSize();
        Options.getInstance().setCustomFontSize(Integer.parseInt(fontSizeTextField.getText()));
        Options.getInstance().setShowCandidates(showCandidatesCheckBox.isSelected());
        Options.getInstance().setShowWrongValues(showWrongValuesCheckBox.isSelected());
        Options.getInstance().setShowDeviations(showDeviationsCheckBox.isSelected());
        Options.getInstance().setShowColorKu(showColorKuCheckBox.isSelected());
        Options.getInstance().setSaveWindowLayout(saveWindowLayoutCheckBox.isSelected());
        Options.getInstance().setSingleClickMode(singleClickModeCheckBox.isSelected());
        Options.getInstance().setOnlySmallFilters(onlySmallFiltersCheckBox.isSelected());
        Options.getInstance().setEditModeAutoAdvance(editModeAutoAdvanceCheckBox.isSelected());
        Options.getInstance().setDrawMode(drawExtraBoxesCheckBox.isSelected() ? 0 : 1);
        
        if ((! Options.getInstance().isUseDefaultFontSize() && (oldUseDefaultFontSize || oldFontSize != Options.getInstance().getCustomFontSize())) ||
                (Options.getInstance().isUseDefaultFontSize() && ! oldUseDefaultFontSize)) {
            JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("GeneralConfigPanel.restart_program2"));
        }
        
        language = availableIsoLanguages.get(localComboBox.getSelectedIndex());
        if (! language.equals(Options.getInstance().getLanguage())) {
            JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("GeneralConfigPanel.restart_program"));
        }
        Options.getInstance().setLanguage(language);
        
        laf = availableLafClassNames.get(lookAndFeelComboBox.getSelectedIndex());
        if (! laf.equals(Options.getInstance().getLaf())) {
            Options.getInstance().setLaf(laf);
            try {
//                if (laf.equals("")) {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                } else {
//                    UIManager.setLookAndFeel(laf);
//                }
                SudokuUtil.setLookAndFeel();
                SwingUtilities.updateComponentTreeUI(this);
                SwingUtilities.updateComponentTreeUI(mainFrame);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Error setting LAF", ex);
            }
        }

        Options.getInstance().setUseShiftForRegionSelect(shiftKeyCheckBox.isSelected());
        Options.getInstance().setOnlySmallCursors(onlySmallCursorsCheckBox.isSelected());
        Options.getInstance().setColorValues(colorValuesCheckBox.isSelected());
        Options.getInstance().setShowSudokuSolved(showSudokuSolvedCheckBox.isSelected());
        Options.getInstance().setDeleteCursorDisplay(deleteCursorAfterCheckBox.isSelected());
        String number = deleteCursorAfterMsTextField.getText();
        if (number == null || number.isEmpty()) {
            number = "0";
        }
        Options.getInstance().setDeleteCursorDisplayLength(Integer.parseInt(number));
        Options.getInstance().setUseOrInsteadOfAndForFilter(toggleFilterAndOrCheckBox.isSelected());
    }
    
    private void initAll(boolean setDefault) {
        if (setDefault) {
            defaultSizeCheckBox.setSelected(Options.USE_DEFAULT_FONT_SIZE);
            fontSizeTextField.setText(String.valueOf(Options.CUSTOM_FONT_SIZE));
            showCandidatesCheckBox.setSelected(Options.SHOW_CANDIDATES);
            showWrongValuesCheckBox.setSelected(Options.SHOW_WRONG_VALUES);
            showDeviationsCheckBox.setSelected(Options.SHOW_DEVIATIONS);
            showColorKuCheckBox.setSelected(Options.SHOW_COLORKU);
            saveWindowLayoutCheckBox.setSelected(Options.SAVE_WINDOW_LAYOUT);
            singleClickModeCheckBox.setSelected(Options.SINGLE_CLICK_MODE);
            onlySmallFiltersCheckBox.setSelected(Options.ONLY_SMALL_FILTERS);
            drawExtraBoxesCheckBox.setSelected(Options.DRAW_MODE == 0);
            
            language = Options.DEFAULT_LANGUAGE;
            laf = Options.DEFAULT_LAF;
            shiftKeyCheckBox.setSelected(Options.USE_SHIFT_FOR_REGION_SELECT);
            onlySmallCursorsCheckBox.setSelected(Options.ONLY_SMALL_CURSORS);
            editModeAutoAdvanceCheckBox.setSelected(Options.EDIT_MODE_AUTO_ADVANCE);

            colorValuesCheckBox.setSelected(Options.COLOR_VALUES);
            showSudokuSolvedCheckBox.setSelected(Options.SHOW_SUDOKU_SOLVED);
            deleteCursorAfterCheckBox.setSelected(Options.DELETE_CURSOR_DISPLAY);
            deleteCursorAfterMsTextField.setText(String.valueOf(Options.DELETE_CURSOR_DISPLAY_LENGTH));
            toggleFilterAndOrCheckBox.setSelected(Options.USE_OR_INSTEAD_OF_AND_FOR_FILTER);
        } else {
            defaultSizeCheckBox.setSelected(Options.getInstance().isUseDefaultFontSize());
            fontSizeTextField.setText(String.valueOf(Options.getInstance().getCustomFontSize()));
            showCandidatesCheckBox.setSelected(Options.getInstance().isShowCandidates());
            showWrongValuesCheckBox.setSelected(Options.getInstance().isShowWrongValues());
            showDeviationsCheckBox.setSelected(Options.getInstance().isShowDeviations());
            showColorKuCheckBox.setSelected(Options.getInstance().isShowColorKu());
            saveWindowLayoutCheckBox.setSelected(Options.getInstance().isSaveWindowLayout());
            singleClickModeCheckBox.setSelected(Options.getInstance().isSingleClickMode());
            onlySmallFiltersCheckBox.setSelected(Options.getInstance().isOnlySmallFilters());
            drawExtraBoxesCheckBox.setSelected(Options.getInstance().getDrawMode() == 0);
            editModeAutoAdvanceCheckBox.setSelected(Options.getInstance().isEditModeAutoAdvance());
            
            language = Options.getInstance().getLanguage();
            laf = Options.getInstance().getLaf();
            shiftKeyCheckBox.setSelected(Options.getInstance().isUseShiftForRegionSelect());
            onlySmallCursorsCheckBox.setSelected(Options.getInstance().isOnlySmallCursors());
            colorValuesCheckBox.setSelected(Options.getInstance().isColorValues());
            showSudokuSolvedCheckBox.setSelected(Options.getInstance().isShowSudokuSolved());
            deleteCursorAfterCheckBox.setSelected(Options.getInstance().isDeleteCursorDisplay());
            deleteCursorAfterMsTextField.setText(String.valueOf(Options.getInstance().getDeleteCursorDisplayLength()));
            toggleFilterAndOrCheckBox.setSelected(Options.getInstance().isUseOrInsteadOfAndForFilter());
        }
        
        // set the language combo box
        localComboBox.removeAllItems();
        localComboBox.addItem(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("GeneralConfigPanel.automatic"));
        int languageIndex = 0;
        for (int i = 1; i < availableLocales.size(); i++) {
            localComboBox.addItem(availableLocales.get(i).getDisplayLanguage());
            if (language.equalsIgnoreCase(availableIsoLanguages.get(i))) {
                languageIndex = i;
            }
        }
        localComboBox.setSelectedIndex(languageIndex);
        
        // set laf combo box
        lookAndFeelComboBox.removeAllItems();
        int lafIndex = 0;
        for (int i = 0; i < availableLafs.size(); i++) {
            lookAndFeelComboBox.addItem(availableLafs.get(i));
            if (laf.equals(availableLafClassNames.get(i))) {
                lafIndex = i;
            }
        }
        lookAndFeelComboBox.setSelectedIndex(lafIndex);
    }
    
    /**
     * Fills {@link #availableIsoLanguages} and {@link #availableLocales} with all
     * languages, that are available as property files. The first entry is always "", which
     * means "use system default". The second entry is always "en" (english is our default language).
     */
    private void initLanguages() {
        availableIsoLanguages.clear();
        availableLocales.clear();
        availableIsoLanguages.add("");
        availableLocales.add(null);
        availableIsoLanguages.add("en");
        availableLocales.add(Locale.ENGLISH);

        // try to load bundles for all existing languages, log those, for which an actual bundle exists
        Locale oldDefault = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLang : isoLanguages) {
            Locale locale = new Locale(isoLang);
            ResourceBundle bundle = ResourceBundle.getBundle("intl/MainFrame", locale);
            if (bundle.getLocale().getLanguage().equals(isoLang)) {
                availableIsoLanguages.add(locale.getLanguage());
                availableLocales.add(bundle.getLocale());
            }
        }
        Locale.setDefault(oldDefault);
    }
    
    /**
     * Fills {@link #availableLafs} and {@link #availableLafClassNames}. The first entry
     * stands for "system default".
     */
    private void initLafs() {
        UIManager.LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        availableLafs.clear();
        availableLafClassNames.clear();
        availableLafs.add(java.util.ResourceBundle.getBundle("intl/ConfigGeneralPanel").getString("GeneralConfigPanel.system_default"));
        availableLafClassNames.add("");
        for (int i = 0; i < lafs.length; i++) {
            availableLafs.add(lafs[i].getName());
            availableLafClassNames.add(lafs[i].getClassName());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox singleClickModeCheckBox;
    private javax.swing.JCheckBox colorValuesCheckBox;
    private javax.swing.JCheckBox defaultSizeCheckBox;
    private javax.swing.JCheckBox deleteCursorAfterCheckBox;
    private javax.swing.JTextField deleteCursorAfterMsTextField;
    private javax.swing.JCheckBox drawExtraBoxesCheckBox;
    private javax.swing.JCheckBox editModeAutoAdvanceCheckBox;
    private javax.swing.JLabel fontSizeLabel;
    private javax.swing.JTextField fontSizeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> localComboBox;
    private javax.swing.JLabel localLabel;
    private javax.swing.JComboBox<String> lookAndFeelComboBox;
    private javax.swing.JLabel lookAndFeelLabel;
    private javax.swing.JCheckBox onlySmallCursorsCheckBox;
    private javax.swing.JCheckBox onlySmallFiltersCheckBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JCheckBox saveWindowLayoutCheckBox;
    private javax.swing.JCheckBox shiftKeyCheckBox;
    private javax.swing.JCheckBox showCandidatesCheckBox;
    private javax.swing.JCheckBox showColorKuCheckBox;
    private javax.swing.JCheckBox showDeviationsCheckBox;
    private javax.swing.JCheckBox showSudokuSolvedCheckBox;
    private javax.swing.JCheckBox showWrongValuesCheckBox;
    private javax.swing.JCheckBox toggleFilterAndOrCheckBox;
    // End of variables declaration//GEN-END:variables
    
    public static void main(String[] args) {
        
        Locale oldDefault = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
        List<String> availableLanguages = new ArrayList<String>();
        List<Locale> availableLocales = new ArrayList<Locale>();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLang : isoLanguages) {
            Locale locale = new Locale(isoLang);
            String lang = locale.getDisplayLanguage();
            System.out.println("Locale: " + locale.toString() + " (" + lang + ")");
            ResourceBundle bundle = ResourceBundle.getBundle("intl/MainFrame", locale);
            System.out.println("  Returned: " + bundle.getLocale().toString() + " (" + bundle.getLocale().getDisplayLanguage() + " - " + bundle.getString("MainFrame.error") + ")");
            if (bundle.getLocale().getLanguage().equals(isoLang)) {
                availableLanguages.add(locale.getDisplayLanguage());
                availableLocales.add(locale);
                System.out.println("  ADDED");
            }
        }
        System.out.println();
        System.out.println("Sprachen:");
        for (int i = 0; i < availableLanguages.size(); i++) {
            String la = availableLanguages.get(i);
            Locale lo = availableLocales.get(i);
            System.out.println("  " + la + " (" + lo + ")");
        }
        Locale.setDefault(oldDefault);
    }
}
    
