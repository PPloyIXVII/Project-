/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import model.Covid;
/**
 *
 * @author benjawan
 */
@WebService(serviceName = "covidWebService")
public class covidWebService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoapServicePU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByYear")
    public String findByYear(@WebParam(name = "year") int year) {
        //TODO write your implementation code here:
        EntityManager em = emf.createEntityManager();
        //Covid cov = em.find(Covid.class, year);
        return "covid";
    }
    
    /**
     * This is a sample web service operation
     */
    
}