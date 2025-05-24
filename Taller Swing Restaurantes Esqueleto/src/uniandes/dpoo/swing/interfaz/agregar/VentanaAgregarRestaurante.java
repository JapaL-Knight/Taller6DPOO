package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar
        
        panelMapa = new PanelMapaAgregar();
        add(panelMapa);
        
        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar


        panelDetalles = new PanelEditarRestaurante();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(panelDetalles);
        
        panelBotones = new PanelBotonesAgregar(this);
        
        panel.add(panelBotones, BorderLayout.SOUTH);
        
        add(panel, BorderLayout.SOUTH);
        // Termina de configurar la ventana
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        // TODO completar
    	//  String nombre, int calificacion, int x, int y, boolean visitado 
    	ventanaPrincipal.agregarRestaurante(panelDetalles.getNombre(),panelDetalles.getCalificacion(), panelMapa.getCoordenadas()[0], panelMapa.getCoordenadas()[1], panelDetalles.getVisitado());
    	
    	cerrarVentana();
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
