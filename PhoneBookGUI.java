// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class PhoneBook {
//     private HashMap<String, String> phoneBook;

//     public PhoneBook() {
//         phoneBook = new HashMap<>();
//     }

   
//     public void addContact(String name, String phoneNumber) {
//         phoneBook.put(name, phoneNumber);
//         System.out.println("Contact added: " + name + " - " + phoneNumber);
//     }

//     public void searchContact(String name) {
//         if (phoneBook.containsKey(name)) {
//             System.out.println("Contact found: " + name + " - " + phoneBook.get(name));
//         } else {
//             System.out.println("Contact not found: " + name);
//         }
//     }


//     public void updateContact(String name, String newPhoneNumber) {
//         if (phoneBook.containsKey(name)) {
//             phoneBook.put(name, newPhoneNumber);
//             System.out.println("Contact updated: " + name + " - " + newPhoneNumber);
//         } else {
//             System.out.println("Contact not found: " + name);
//         }
//     }


//     public void deleteContact(String name) {
//         if (phoneBook.containsKey(name)) {
//             phoneBook.remove(name);
//             System.out.println("Contact deleted: " + name);
//         } else {
//             System.out.println("Contact not found: " + name);
//         }
//     }


//     public void displayContacts() {
//         if (phoneBook.isEmpty()) {
//             System.out.println("No contacts in the phonebook.");
//         } else {
//             for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//                 System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
//             }
//         }
//     }

//     public static void main(String[] args) {
//         PhoneBook phoneBook = new PhoneBook();
//         Scanner scanner = new Scanner(System.in);
//         int choice;

//         do {
//             System.out.println("\nPhoneBook Menu:");
//             System.out.println("1. Add Contact");
//             System.out.println("2. Search Contact");
//             System.out.println("3. Update Contact");
//             System.out.println("4. Delete Contact");
//             System.out.println("5. Display All Contacts");
//             System.out.println("6. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();
//             scanner.nextLine();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter name: ");
//                     String name = scanner.nextLine();
//                     System.out.print("Enter phone number: ");
//                     String phoneNumber = scanner.nextLine();
//                     phoneBook.addContact(name, phoneNumber);
//                     break;
//                 case 2:
//                     System.out.print("Enter name to search: ");
//                     name = scanner.nextLine();
//                     phoneBook.searchContact(name);
//                     break;
//                 case 3:
//                     System.out.print("Enter name to update: ");
//                     name = scanner.nextLine();
//                     System.out.print("Enter new phone number: ");
//                     phoneNumber = scanner.nextLine();
//                     phoneBook.updateContact(name, phoneNumber);
//                     break;
//                 case 4:
//                     System.out.print("Enter name to delete: ");
//                     name = scanner.nextLine();
//                     phoneBook.deleteContact(name);
//                     break;
//                 case 5:
//                     phoneBook.displayContacts();
//                     break;
//                 case 6:
//                     System.out.println("Exiting PhoneBook...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         } while (choice != 6);

//         scanner.close();
//     }
// }
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.HashMap;
// import java.util.Map;

// public class PhoneBookGUI { 
//     private JFrame frame;
//     private JTextField nameField;
//     private JTextField phoneField;
//     private JTextArea displayArea;
//     private HashMap<String, String> phoneBook;

//     public PhoneBookGUI() {
//         phoneBook = new HashMap<>();
//         initialize();
//     }

//     private void initialize() {
//         frame = new JFrame("PhoneBook");
//         frame.setBounds(100, 100, 500, 400);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.getContentPane().setLayout(new BorderLayout(0, 0));

//         JPanel panel = new JPanel();
//         frame.getContentPane().add(panel, BorderLayout.NORTH);
//         panel.setLayout(new GridLayout(2, 2, 5, 5));

//         JLabel nameLabel = new JLabel("Name:");
//         panel.add(nameLabel);

//         nameField = new JTextField();
//         panel.add(nameField);
//         nameField.setColumns(10);

//         JLabel phoneLabel = new JLabel("Phone Number:");
//         panel.add(phoneLabel);

//         phoneField = new JTextField();
//         panel.add(phoneField);
//         phoneField.setColumns(10);

//         JPanel buttonPanel = new JPanel();
//         frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
//         buttonPanel.setLayout(new GridLayout(5, 1, 5, 5));

//         JButton addButton = new JButton("Add Contact");
//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 addContact();
//             }
//         });
//         buttonPanel.add(addButton);

//         JButton searchButton = new JButton("Search Contact");
//         searchButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 searchContact();
//             }
//         });
//         buttonPanel.add(searchButton);

//         JButton updateButton = new JButton("Update Contact");
//         updateButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 updateContact();
//             }
//         });
//         buttonPanel.add(updateButton);

//         JButton deleteButton = new JButton("Delete Contact");
//         deleteButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 deleteContact();
//             }
//         });
//         buttonPanel.add(deleteButton);

//         JButton displayButton = new JButton("Display All Contacts");
//         displayButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 displayContacts();
//             }
//         });
//         buttonPanel.add(displayButton);

//         displayArea = new JTextArea();
//         displayArea.setEditable(false);
//         JScrollPane scrollPane = new JScrollPane(displayArea);
//         frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);
//     }

//     private void addContact() {
//         String name = nameField.getText();
//         String phoneNumber = phoneField.getText();
//         if (!name.isEmpty() && !phoneNumber.isEmpty()) {
//             phoneBook.put(name, phoneNumber);
//             displayArea.setText("Contact added: " + name + " - " + phoneNumber);
//             clearFields();
//         } else {
//             displayArea.setText("Please enter both name and phone number.");
//         }
//     }

//     private void searchContact() {
//         String name = nameField.getText();
//         if (phoneBook.containsKey(name)) {
//             displayArea.setText("Contact found: " + name + " - " + phoneBook.get(name));
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void updateContact() {
//         String name = nameField.getText();
//         String newPhoneNumber = phoneField.getText();
//         if (phoneBook.containsKey(name)) {
//             phoneBook.put(name, newPhoneNumber);
//             displayArea.setText("Contact updated: " + name + " - " + newPhoneNumber);
//             clearFields();
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void deleteContact() {
//         String name = nameField.getText();
//         if (phoneBook.containsKey(name)) {
//             phoneBook.remove(name);
//             displayArea.setText("Contact deleted: " + name);
//             clearFields();
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void displayContacts() {
//         if (phoneBook.isEmpty()) {
//             displayArea.setText("No contacts in the phonebook.");
//         } else {
//             StringBuilder contacts = new StringBuilder();
//             for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//                 contacts.append("Name: ").append(entry.getKey()).append(", Phone Number: ").append(entry.getValue()).append("\n");
//             }
//             displayArea.setText(contacts.toString());
//         }
//     }

//     private void clearFields() {
//         nameField.setText("");
//         phoneField.setText("");
//     }

//     public static void main(String[] args) {
//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 try {
//                     PhoneBookGUI window = new PhoneBookGUI();
//                     window.frame.setVisible(true);
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         });
//     }
// }
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.HashMap;

// public class PhoneBookGUI{
//     private JFrame frame;
//     private JTextField nameField;
//     private JTextField phoneField;
//     private JTextField addressField;
//     private JTextField emailField;
//     private JTextArea displayArea;
//     private HashMap<String, Contact> phoneBook;

//     public PhoneBookGUI() {
//         phoneBook = new HashMap<>();
//         initialize();
//     }

//     private void initialize() {
//         frame = new JFrame("PhoneBook");
//         frame.setBounds(100, 100, 600, 600);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.getContentPane().setLayout(new BorderLayout(10, 10));

//         JPanel panel = new JPanel();
//         frame.getContentPane().add(panel, BorderLayout.NORTH);
//         panel.setLayout(new GridLayout(4, 2, 10, 10));
//         panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

//         JLabel nameLabel = new JLabel("Name:");
//         nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
//         panel.add(nameLabel);

//         nameField = new JTextField();
//         panel.add(nameField);
//         nameField.setColumns(10);

//         JLabel phoneLabel = new JLabel("Phone Number:");
//         phoneLabel.setFont(new Font("Arial", Font.BOLD, 14));
//         panel.add(phoneLabel);

//         phoneField = new JTextField();
//         panel.add(phoneField);
//         phoneField.setColumns(10);

//         JLabel addressLabel = new JLabel("Address:");
//         addressLabel.setFont(new Font("Arial", Font.BOLD, 14));
//         panel.add(addressLabel);

//         addressField = new JTextField();
//         panel.add(addressField);
//         addressField.setColumns(10);

//         JLabel emailLabel = new JLabel("Email:");
//         emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
//         panel.add(emailLabel);

//         emailField = new JTextField();
//         panel.add(emailField);
//         emailField.setColumns(10);

//         JPanel buttonPanel = new JPanel();
//         frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
//         buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
//         buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

//         JButton addButton = new JButton("Add Contact");
//         addButton.setFont(new Font("Arial", Font.PLAIN, 12));
//         addButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 addContact();
//             }
//         });
//         buttonPanel.add(addButton);

//         JButton searchButton = new JButton("Search Contact");
//         searchButton.setFont(new Font("Arial", Font.PLAIN, 12));
//         searchButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 searchContact();
//             }
//         });
//         buttonPanel.add(searchButton);

//         JButton updateButton = new JButton("Update Contact");
//         updateButton.setFont(new Font("Arial", Font.PLAIN, 12));
//         updateButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 updateContact();
//             }
//         });
//         buttonPanel.add(updateButton);

//         JButton deleteButton = new JButton("Delete Contact");
//         deleteButton.setFont(new Font("Arial", Font.PLAIN, 12));
//         deleteButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 deleteContact();
//             }
//         });
//         buttonPanel.add(deleteButton);

//         JButton displayButton = new JButton("Display All Contacts");
//         displayButton.setFont(new Font("Arial", Font.PLAIN, 12));
//         displayButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 displayContacts();
//             }
//         });
//         buttonPanel.add(displayButton);

//         displayArea = new JTextArea();
//         displayArea.setFont(new Font("Arial", Font.PLAIN, 14));
//         displayArea.setEditable(false);
//         displayArea.setBorder(BorderFactory.createCompoundBorder(
//                 BorderFactory.createTitledBorder("Contacts"),
//                 BorderFactory.createEmptyBorder(10, 10, 10, 10)));
//         JScrollPane scrollPane = new JScrollPane(displayArea);
//         frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);
//     }

//     private void addContact() {
//         String name = nameField.getText();
//         String phoneNumber = phoneField.getText();
//         String address = addressField.getText();
//         String email = emailField.getText();

//         if (!name.isEmpty() && !phoneNumber.isEmpty() && !address.isEmpty() && !email.isEmpty()) {
//             Contact contact = new Contact(name, phoneNumber, address, email);
//             phoneBook.put(name, contact);
//             displayArea.setText("Contact added: " + contact);
//             clearFields();
//         } else {
//             displayArea.setText("Please enter name, phone number, address, and email.");
//         }
//     }

//     private void searchContact() {
//         String name = nameField.getText();
//         if (phoneBook.containsKey(name)) {
//             Contact contact = phoneBook.get(name);
//             displayArea.setText("Contact found: " + contact);
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void updateContact() {
//         String name = nameField.getText();
//         String newPhoneNumber = phoneField.getText();
//         String newAddress = addressField.getText();
//         String newEmail = emailField.getText();

//         if (phoneBook.containsKey(name)) {
//             Contact contact = phoneBook.get(name);
//             contact.setPhoneNumber(newPhoneNumber);
//             contact.setAddress(newAddress);
//             contact.setEmail(newEmail);
//             displayArea.setText("Contact updated: " + contact);
//             clearFields();
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void deleteContact() {
//         String name = nameField.getText();
//         if (phoneBook.containsKey(name)) {
//             phoneBook.remove(name);
//             displayArea.setText("Contact deleted: " + name);
//             clearFields();
//         } else {
//             displayArea.setText("Contact not found: " + name);
//         }
//     }

//     private void displayContacts() {
//         if (phoneBook.isEmpty()) {
//             displayArea.setText("No contacts in the phonebook.");
//         } else {
//             StringBuilder contacts = new StringBuilder();
//             for (Contact contact : phoneBook.values()) {
//                 contacts.append(contact).append("\n");
//             }
//             displayArea.setText(contacts.toString());
//         }
//     }

//     private void clearFields() {
//         nameField.setText("");
//         phoneField.setText("");
//         addressField.setText("");
//         emailField.setText("");
//     }

//     public static void main(String[] args) {
//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 try {
//                     PhoneBookGUI window = new PhoneBookGUI();
//                     window.frame.setVisible(true);
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         });
//     }
// }

// class Contact {
//     private String name;
//     private String phoneNumber;
//     private String address;
//     private String email;

//     public Contact(String name, String phoneNumber, String address, String email) {
//         this.name = name;
//         this.phoneNumber = phoneNumber;
//         this.address = address;
//         this.email = email;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getPhoneNumber() {
//         return phoneNumber;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setPhoneNumber(String phoneNumber) {
//         this.phoneNumber = phoneNumber;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     @Override
//     public String toString() {
//         return "Name: " + name + ", Phone Number: " + phoneNumber + ", Address: " + address + ", Email: " + email;
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PhoneBookGUI {
    private JFrame frame;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField emailField;
    private JTextArea displayArea;
    private HashMap<String, Contact> phoneBook;

    public PhoneBookGUI() {
        phoneBook = new HashMap<>();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("PhoneBook");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(nameField);
        nameField.setColumns(10);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(phoneField);
        phoneField.setColumns(10);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(addressLabel);

        addressField = new JTextField();
        addressField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(addressField);
        addressField.setColumns(10);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(emailField);
        emailField.setColumns(10);

        JPanel buttonPanel = new JPanel();
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton addButton = createButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });
        buttonPanel.add(addButton);

        JButton searchButton = createButton("Search Contact");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchContact();
            }
        });
        buttonPanel.add(searchButton);

        JButton updateButton = createButton("Update Contact");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateContact();
            }
        });
        buttonPanel.add(updateButton);

        JButton deleteButton = createButton("Delete Contact");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });
        buttonPanel.add(deleteButton);

        JButton displayButton = createButton("Display All Contacts");
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayContacts();
            }
        });
        buttonPanel.add(displayButton);

        displayArea = new JTextArea();
        displayArea.setFont(new Font("Arial", Font.PLAIN, 16));
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Contacts"),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(750, 200));
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setPreferredSize(new Dimension(200, 50));
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        return button;
    }

    private void addContact() {
        String name = nameField.getText();
        String phoneNumber = phoneField.getText();
        String address = addressField.getText();
        String email = emailField.getText();

        if (!name.isEmpty() && !phoneNumber.isEmpty() && !address.isEmpty() && !email.isEmpty()) {
            Contact contact = new Contact(name, phoneNumber, address, email);
            phoneBook.put(name, contact);
            displayArea.setText("Contact added: " + contact);
            clearFields();
        } else {
            displayArea.setText("Please enter name, phone number, address, and email.");
        }
    }

    private void searchContact() {
        String name = nameField.getText();
        if (phoneBook.containsKey(name)) {
            Contact contact = phoneBook.get(name);
            displayArea.setText("Contact found: " + contact);
        } else {
            displayArea.setText("Contact not found: " + name);
        }
    }

    private void updateContact() {
        String name = nameField.getText();
        String newPhoneNumber = phoneField.getText();
        String newAddress = addressField.getText();
        String newEmail = emailField.getText();

        if (phoneBook.containsKey(name)) {
            Contact contact = phoneBook.get(name);
            contact.setPhoneNumber(newPhoneNumber);
            contact.setAddress(newAddress);
            contact.setEmail(newEmail);
            displayArea.setText("Contact updated: " + contact);
            clearFields();
        } else {
            displayArea.setText("Contact not found: " + name);
        }
    }

    private void deleteContact() {
        String name = nameField.getText();
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            displayArea.setText("Contact deleted: " + name);
            clearFields();
        } else {
            displayArea.setText("Contact not found: " + name);
        }
    }

    private void displayContacts() {
        if (phoneBook.isEmpty()) {
            displayArea.setText("No contacts in the phonebook.");
        } else {
            StringBuilder contacts = new StringBuilder();
            for (Contact contact : phoneBook.values()) {
                contacts.append(contact).append("\n");
            }
            displayArea.setText(contacts.toString());
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        addressField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhoneBookGUI window = new PhoneBookGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;

    public Contact(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Address: " + address + ", Email: " + email;
    }
}
