package hei.tp03.controller;

import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/clients")
public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    @Override
    public void init() throws ServletException {
        context = new AnnotationConfigApplicationContext("hei.tp03.config");
        clientService = context.getBean(ClientService.class);
    }

// On veut pouvoir trouver un client par nom, une commande par son nom et par son client, un produit par son nom et sa commande.
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        clientService.findAll();
    }

    @Override
    public void destroy() {
        context.close();
    }
}

