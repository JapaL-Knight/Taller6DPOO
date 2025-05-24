package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel {
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante() {
    	
        setLayout(new GridLayout(3, 1));
        
        JPanel panel1 = new JPanel();
        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        add(panel1);
        
        JPanel panel2 = new JPanel();
        
        JLabel lblCalificacion = new JLabel("Calificación:");
        String[] calificaciones = {"1", "2", "3", "4", "5"};
        cbbCalificacion = new JComboBox<>(calificaciones);
        panel2.add(lblCalificacion);
        panel2.add(cbbCalificacion);
        add(panel2);

        JPanel panel3 = new JPanel();

        JLabel lblVisitado = new JLabel("Visitado:");
        String[] opcionesVisitado = {"Sí", "No"};
        cbbVisitado = new JComboBox<>(opcionesVisitado);
        panel3.add(lblVisitado);
        panel3.add(cbbVisitado);
        add(panel3);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return true si fue visitado, false en caso contrario
     */
    public boolean getVisitado() {
        return cbbVisitado.getSelectedItem().equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return la calificación seleccionada
     */
    public int getCalificacion() {
        String calif = (String) cbbCalificacion.getSelectedItem();
        return Integer.parseInt(calif);
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return el nombre del restaurante
     */
    public String getNombre() {
        return txtNombre.getText();
    }
}
