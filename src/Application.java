import Android.AndroidSuperAction;
import Factories.AndroidFactory;
import Factories.IOSFactory;
import Interfaces.Interfaces;

public class Application {
    public void configApplication(String str) {
        Interfaces.Factory factory;

        if (str.toLowerCase().equals("ios")) {
            factory = new IOSFactory();
        }
        else if (str.toLowerCase().equals("android")) {
            factory = new AndroidFactory();
        }
        else {
            System.out.println("unknown");
            return;
        }

        Interfaces.Action action;
        Interfaces.Option option;
        Interfaces.SuperAction superAction;

        action = factory.action();
        option = factory.option();
        superAction = factory.superAction();

        action.getAction();
        option.getOption();
        superAction.getSuperAction();
    }
}