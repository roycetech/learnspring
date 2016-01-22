package ph.rye.spring1521.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import ph.rye.spring1521.server.config.JavaConfig;


public class ServerApp {

    final AbstractApplicationContext appContext =
            new AnnotationConfigApplicationContext(JavaConfig.class);

    public static void main(final String... args) throws RemoteException {
        LocateRegistry.createRegistry(2020);

        new ServerApp();
    }

}
