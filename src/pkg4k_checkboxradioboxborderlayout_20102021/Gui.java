package pkg4k_checkboxradioboxborderlayout_20102021;
/**
 *
 * @author Andrzej Gac <andrzej.gac@zsmeie.torun.pl>
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Gui extends JFrame{
 String owoce[]={"jabłko","gruszka","kiwi","ananas"};
 JComboBox lista = null;
 JTextArea area=null;
 JPanel jPanelRight =null;
    public Gui() throws HeadlessException {
        jPanelRight = new JPanel();
        setTitle("-----------BorderLayout------");
        setSize(new Dimension(500, 500));
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.CYAN);
        // ---- definicje 
        area=new JTextArea(25, 30);
        area.setBackground(Color.LIGHT_GRAY);
        area.setFont(new Font("Arial", Font.BOLD, 30));
        lista = new JComboBox(owoce);
        
        c.add(area,BorderLayout.CENTER);
        // prawa strona
        jPanelRight.setBackground(Color.YELLOW);
        c.add(jPanelRight, BorderLayout.EAST);
        jPanelRight.add(lista);
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            area.append(lista.getSelectedItem()+" "
                       +lista.getSelectedIndex()+"\n");
            }
        });
        setVisible(true);
        setDefaultCloseOperation(3);
    }
    
}
