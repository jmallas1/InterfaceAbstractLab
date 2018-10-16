package org.jrm.util;

import javax.swing.*;

/**
 * Implementation of an "outputter" leveraging JOptionPane
 * @author Jared Mallas
 * @version 1.0
 */
public class PopOutputter implements Outputter
{

    @Override
    public void report(String text)
    {
        JOptionPane.showMessageDialog(null, text);
    }
}
