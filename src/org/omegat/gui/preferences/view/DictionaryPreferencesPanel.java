/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: https://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <https://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;

import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class DictionaryPreferencesPanel extends JPanel {

    /** Creates new form DictionaryPanel */
    public DictionaryPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        autoCheckSegmentsCheckBox = new javax.swing.JCheckBox();
        fuzzyMatchingCheckBox = new javax.swing.JCheckBox();
        condensedViewCheckBox = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(autoCheckSegmentsCheckBox, OStrings.getString("PREFS_DICTIONARY_AUTO_SEARCH")); // NOI18N
        add(autoCheckSegmentsCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(fuzzyMatchingCheckBox, OStrings.getString("PREFS_DICTIONARY_FUZZY")); // NOI18N
        add(fuzzyMatchingCheckBox);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/omegat/Bundle"); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(condensedViewCheckBox, bundle.getString("PREFS_DICTIONARY_CONDENSED")); // NOI18N
        add(condensedViewCheckBox);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox autoCheckSegmentsCheckBox;
    javax.swing.JCheckBox condensedViewCheckBox;
    javax.swing.JCheckBox fuzzyMatchingCheckBox;
    // End of variables declaration//GEN-END:variables
}
