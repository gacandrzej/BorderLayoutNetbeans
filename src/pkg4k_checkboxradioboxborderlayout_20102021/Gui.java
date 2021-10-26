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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class Gui extends JFrame implements ItemListener,ActionListener{
 String owoce[]={"jabłko","gruszka","kiwi","ananas"};
 JComboBox lista = null;
 JRadioButton radio = null;
 JCheckBox m=null;
 JTextArea area=null;
 JPanel jPanelEast =null;
 JPanel jPanelWest =null;
 JPanel jPanelNorth =null;
 JPanel jPanelSouth =null;
 JPanel jPanelCenter =null;
    public Gui() throws HeadlessException {
        jPanelEast = new JPanel();
        jPanelWest = new JPanel();
        jPanelSouth = new JPanel();
        jPanelNorth = new JPanel();
        jPanelCenter = new JPanel();
       
        setTitle("-----------BorderLayout------");
        setSize(new Dimension(500, 500));
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.CYAN);
        // ---- definicje 
        area=new JTextArea(25, 30);
        radio = new JRadioButton("zaznacz, jeśli idziesz do kina");
        radio.setMnemonic(KeyEvent.VK_P);
        radio.setActionCommand("start");
        area.setBackground(Color.LIGHT_GRAY);
        area.setFont(new Font("Arial", Font.BOLD, 30));
        lista = new JComboBox(owoce);
         m = new JCheckBox("jesteś zapalonym graczem");
        m.setMnemonic(KeyEvent.VK_C); // lewy Alt+C
        m.setSelected(true);
        //c.add(area,BorderLayout.CENTER);
        // 
        jPanelEast.setBackground(Color.YELLOW);
        jPanelWest.setBackground(Color.GREEN);
        jPanelNorth.setBackground(Color.BLUE);
        jPanelSouth.setBackground(Color.RED);
        
        c.add(jPanelEast, BorderLayout.EAST);
        c.add(jPanelWest, BorderLayout.WEST);
        c.add(jPanelNorth, BorderLayout.NORTH);
        c.add(jPanelSouth, BorderLayout.SOUTH);
        c.add(jPanelCenter, BorderLayout.CENTER);
        //------------------------------------
        jPanelEast.add(lista);
        jPanelCenter.add(area);
        jPanelWest.add(radio);
        jPanelSouth.add(m);
        radio.addActionListener(this);
         m.addItemListener(this);
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

    @Override
    public void itemStateChanged(ItemEvent e) {
       if (e.getStateChange() == ItemEvent.SELECTED) {
           area.append("tak \n");
           System.out.println("tak \n");
        } else {
           area.append("nie \n");
        }
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
