package br.com.aj_sistemas.novo_sgad.dao;

import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.utils.BibliotecaDeMetodos;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Alisson Jaques
 */
public class RelatorioDAO {    
      
    public static void gerarRelatorio(String nomeDoArquivo, List<String> parametros,
            List<String> valores) throws IOException, JRException {
        Connection connection = new ConnectionFactory().con;
        
        Map<String, Object> parameters = new HashMap<>();
        String nomeRelatorio = "src\\br\\com\\aj_sistemas\\novo_sgad\\relatorio\\" + nomeDoArquivo;
        
        int i = 0;
        for(String parametro: parametros){
            parameters.put(parametro, valores.get(i));
            i++;
        }

        JasperCompileManager.compileReportToFile(nomeRelatorio + ".jrxml");
        JasperPrint print = JasperFillManager.fillReport(nomeRelatorio + ".jasper", parameters, connection);
        
        String aleatorio = System.getProperty("java.io.tmpdir") + "\\"+ nomeDoArquivo + BibliotecaDeMetodos.getAleatorio() + ".pdf";
        JasperExportManager.exportReportToPdfFile(print, aleatorio);

        Desktop desktop = Desktop.getDesktop();
        File file = new File(aleatorio);
        desktop.open(file);
    }
}
