package hei.tp03.controller;

import hei.tp03.entity.Client;
import hei.tp03.entity.Commande;
import hei.tp03.entity.Produit;
import hei.tp03.service.ClientService;
import hei.tp03.service.CommandeService;
import hei.tp03.service.ProduitService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/ClientServlet")
public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;
    private CommandeService commandeService;
    private ProduitService produitService;

    @Override
    public void init() throws ServletException {
        context = new AnnotationConfigApplicationContext("hei.tp03.config");
        clientService = context.getBean(ClientService.class);
        commandeService = context.getBean(CommandeService.class);
        produitService = context.getBean(ProduitService.class);
    }

// On veut pouvoir trouver un client par nom, une commande par son id et par son client, un produit par son nom et sa commande.
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        List<Client> lstClient = clientService.findAll();

        final PrintWriter printWriter = resp.getWriter();
        for(Client client: lstClient){
            printWriter.println("Identifiant du client : " +client.getId()+ "/ Nom du client : " +client.getNom()+ "/ Prenom du client : " +client.getPrenom());
            List<Commande> lstCommande = commandeService.findByClient((int) client.getId());
            for(Commande commande:lstCommande){
                printWriter.println("Identifiant de la commande : " +commande.getId()+ "/ Commande Validée : " +commande.getValidee());
                List<Produit> lstProduit = produitService.findByCommande((int) commande.getId());
                for(Produit produit:lstProduit){
                    printWriter.println("Identifiant du produit : " +produit.getId()+ "/ Nom du produit : " +produit.getNom());
                }
            }
        }
    }

    @Override
    public void destroy() {
        context.close();
    }
}

