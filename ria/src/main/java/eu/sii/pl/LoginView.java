package eu.sii.pl;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;

/**
 *
 */
@SpringView(name = "")
public class LoginView extends VerticalLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        TextField username = new TextField("Username:");

        addComponent(username);
        addComponent(new PasswordField("Password:"));
        Button okButton = new Button("Login");
        okButton.addClickListener(e -> Notification.show("Hello " + username.getValue()));
        addComponent(okButton);
    }
}
