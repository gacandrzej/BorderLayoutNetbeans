# BorderLayoutNetbeans
netbeans
![image](https://user-images.githubusercontent.com/82050305/197350260-2ea2d310-1cd0-499b-bb6f-a830b3ba5911.png)
Klasa Gui
```java
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
import javax.swing.JToggleButton;


public class Gui extends JFrame implements ItemListener,ActionListener{
    
 String owoce[]={"jabłko","gruszka","kiwi","ananas"};
 JComboBox lista = null;
 JRadioButton radio = null;
 JCheckBox jCheckBox=null;
 JToggleButton jToggleButton = null;
 JTextArea area=null;
 JPanel jPanelEast =null;
 JPanel jPanelWest =null;
 JPanel jPanelNorth =null;
 JPanel jPanelSouth =null;
 JPanel jPanelCenter =null;
    public Gui() throws HeadlessException {
        setTitle("-----------BorderLayout------");
        setSize(new Dimension(800, 500));
        
        jPanelEast = new JPanel();
        jPanelWest = new JPanel();
        jPanelSouth = new JPanel();
        jPanelNorth = new JPanel();
        jPanelCenter = new JPanel();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.CYAN);
        // ---- definicje 
        area=new JTextArea(25, 30);
        radio = new JRadioButton("zaznacz, jeśli idziesz do kina");
        radio.setMnemonic(KeyEvent.VK_P);
        radio.setActionCommand("start");
        jToggleButton = new JToggleButton("OFF");
        
        area.setBackground(Color.LIGHT_GRAY);
        area.setFont(new Font("Arial", Font.BOLD, 10));
        lista = new JComboBox(owoce);
         jCheckBox = new JCheckBox("jesteś zapalonym graczem");
        jCheckBox.setMnemonic(KeyEvent.VK_C); // lewy Alt+C
        jCheckBox.setSelected(true);
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
        jPanelSouth.add(jCheckBox);
        jPanelNorth.add(jToggleButton);
        
        jToggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jToggleButton.isSelected()==true){
                    area.setText("");
                    jToggleButton.setText("ON");
                }
                else {
                    area.setBackground(Color.ORANGE);
                     jToggleButton.setText("OFF");
                }
            }
        });
        
        radio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radio.isSelected() == true) {
                    area.append("radio zaznaczone \n");
                    System.out.println("tak \n");
                } else {
                    area.append("radio nie \n");
                }
               
            }
        });
        
         jCheckBox.addItemListener(this);
         
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            area.append(lista.getSelectedItem()+" "
                       +lista.getSelectedIndex()+"\n");
            }
        });
        
        setVisible(true);
        setDefaultCloseOperation(3);
    } // koniec konstruktora

    @Override
    public void itemStateChanged(ItemEvent e) {
       if (e.getStateChange() == ItemEvent.SELECTED) {
           area.append("tak \n");
           System.out.println("tak \n");
        } else {
           area.append("nie \n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
} // koniec klasy Gui
```
