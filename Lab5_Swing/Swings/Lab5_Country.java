// 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display the capital of the countries on console whenever the countries are selected on the list.

package Swing5.Swings;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class  Lab5_Country extends JFrame {
    private JList<String> countryList;
    private Map<String, String> countryCapitalMap;
    public  Lab5_Country() {
        countryCapitalMap = new HashMap<>();
        countryList = new JList<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Addis Ababa");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String country : countryCapitalMap.keySet()) {
            listModel.addElement(country);
        }
        countryList.setModel(listModel); 
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        if (capital != null) {
                            System.out.println("Capital of " + country + " is: " + capital);
                        }
                    }
                }
            }
        });
        add(new JScrollPane(countryList));
        setTitle("Country List");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  Lab5_Country();
    }
}
