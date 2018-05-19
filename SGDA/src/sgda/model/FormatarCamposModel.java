package sgda.model;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatter;

public class FormatarCamposModel {
    
    public static void formatarData(JFormattedTextField campo, java.awt.event.KeyEvent evento) {        
        if ((evento.getKeyCode() != KeyEvent.VK_BACKSPACE) && (evento.getKeyCode() != KeyEvent.VK_DELETE) && (evento.getKeyCode() != KeyEvent.VK_LEFT) && (evento.getKeyCode() != KeyEvent.VK_RIGHT)) {
            switch (campo.getText().length()) {
                case 4: {
                    campo.setText(campo.getText() + "-");
                    break;
                }
                case 7: {
                    campo.setText(campo.getText() + "-");
                    break;
                }
                case 10: {
                    evento.setKeyCode(KeyEvent.VK_BACKSPACE);
                }
            }
        }
    }
    
    public static void filtrarSpinner(JSpinner campo) {
        JSpinner.NumberEditor jsEditor = (JSpinner.NumberEditor)campo.getEditor();
        DefaultFormatter formato = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formato.setAllowsInvalid(false);
    }

    public static TableModel colocarDadosTabela(ResultSet resultado) {  
        try {
            ResultSetMetaData metaData = resultado.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1).toUpperCase());
            }

            Vector rows = new Vector();

            while (resultado.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(resultado.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames) {
                
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
        } catch (SQLException ex) {
            System.out.println("Exceção: " + ex);
            return null;
        }
    }  
}
