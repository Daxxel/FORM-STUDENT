package views.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Register {
   private static final String[] careers = new String[] {
         "Selecciona una carrera",
         "Ing. Sistemas Computacionales",
         "Ing. Industrial",
         "Ing. Macarrónica",
         "Ing. Empresas"
   };

   private static final String[] semesters = new String[] {
         "Selecciona un semestre",
         "1", "2", "3", "4", "5",
         "6", "7", "8", "9", "10",
         "11", "12", "13", "14", "15"
   };

   private Register() {
   }

   private static JPanel component;

   private static void buildComponent() {
      component = new JPanel();
      component.setOpaque(false);
      component.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

      TextInput nameField = new TextInput("Nombre", true);
      TextInput fathersField = new TextInput("Apellido", true);
      TextInput mothersField = new TextInput("Apellido (opcional)", false);

      GroupLayout layout = new GroupLayout(component);
      component.setLayout(layout);


      JPanel namPanel = nameField.getComponent();
      JPanel fathersPanel = fathersField.getComponent();
      JPanel mothersPanel = mothersField.getComponent();

      JPanel selectWrapper = new JPanel();
      selectWrapper.setOpaque(false);
      selectWrapper.setLayout(
            new BoxLayout(selectWrapper, BoxLayout.X_AXIS));

      Select careerSelect = new Select("Carrera", careers);
      Select semesterSelect = new Select("Semestre", semesters);

      selectWrapper.add(careerSelect.getComponent());
      selectWrapper.add(semesterSelect.getComponent());

      JPanel buttonsWrapper = new JPanel();

      FlowLayout buttonsLayout = new FlowLayout(FlowLayout.RIGHT);
      buttonsWrapper.setLayout(buttonsLayout);
      buttonsWrapper.setOpaque(false);

      JButton addButton = new JButton("w");
      JButton watchListButton = new JButton("w");

      buttonsWrapper.add(addButton);
      buttonsWrapper.add(watchListButton);

      layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(namPanel, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(fathersPanel, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(layout.createSequentialGroup()
                    .addComponent(mothersPanel, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(selectWrapper, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                )
                .addGroup(layout.createSequentialGroup()
                    .addComponent(buttonsWrapper, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addGap(530) // <- el espacio vacío
                )
        );
      layout.setVerticalGroup(
            layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(namPanel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fathersPanel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE ))
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(mothersPanel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectWrapper, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonsWrapper, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)));

   }

   public static JPanel getComponent() {
      if (component == null) {
         buildComponent();
      }

      return component;
   }
}
