package uniandes.dpoo.swing.interfaz.mapa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelMapaVisualizar extends JPanel
{
    /**
     * La etiqueta donde se dibuja el mapa y se hacen las señales de los restaurantes
     */
    private JLabel labMapa;

    /**
     * La lista de restaurantes que se están dibujando en el mapa
     */
    private List<Restaurante> restaurantes;

    public PanelMapaVisualizar()
    {
        this.labMapa = new JLabel(new ImageIcon("./imagenes/mapa.png"));
        labMapa.setBorder(new LineBorder(Color.DARK_GRAY));
        setLayout(new BorderLayout());
        add(labMapa, BorderLayout.CENTER);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if (restaurantes != null)
        {
            for (Restaurante restaurante : restaurantes)
            {
                // Suponiendo que Restaurante tiene métodos getX() y getY() para obtener la posición en el mapa
                int x = restaurante.getX();
                int y = restaurante.getY();
                g2d.setColor(Color.RED);
                g2d.fillOval(x, y, 10, 10);
                g2d.setFont(new Font("Arial", Font.BOLD, 12));
                g2d.drawString(restaurante.getNombre(), x + 12, y + 10);

            }
        }
    }

    /**
     * Actualiza la lista de restaurantes y llama al método repaint() para que se actualice el mapa
     * @param nuevosRestaurantes
     */
    public void actualizarMapa(List<Restaurante> nuevosRestaurantes)
    {
        this.restaurantes = nuevosRestaurantes;
        repaint();
    }
}
