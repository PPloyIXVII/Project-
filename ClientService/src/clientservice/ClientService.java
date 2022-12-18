/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientservice;

/**
 *
 * @author benjawan
 */
public class ClientService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Covid str = findByYear(2022);
        System.out.println(str);
    }

    private static Covid findByYear(int year) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findByYear(year);
    }
    
}
