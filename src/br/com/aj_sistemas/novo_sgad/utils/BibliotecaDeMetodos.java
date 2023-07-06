package br.com.aj_sistemas.novo_sgad.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Esta classe fornece diversos métodos estáticos para as mais variadas
 * funções, como tratamento de datas, busca de ceps, entre outros.
 * 
 * @author Alisson Jaques
 */
public class BibliotecaDeMetodos { // declara a classe
    
    public static String gerarHash(String senha){
        String senhaCriptografa = BCrypt.hashpw(senha, BCrypt.gensalt());
        return senhaCriptografa;
    }
    
    /**
     * Recebe como argumento uma data, no formatodo yyyy-MM-dd e retorna uma data
     * no formato dd/MM/yyyy.
     * 
     * @param data a data a ser formatada
     * @return uma data no formato dd/MM/yyyy correspondente à data passada como
     * argumento
     */
    public static String getData(String data){
        String[] separaCampos = data.split("-");
        return separaCampos[2] + "/" + separaCampos[1] + "/" + separaCampos[0];
    }
    
    /**
     * Recebe como argumento um texto e retorna esse texto com apenas números.
     * @param texto um texto
     * @return o mesmo texto com apenas números
     */
    public static String formataTextoNumero(String texto){
        return texto.replaceAll("[^0-9]+", "");
    }
    
    /**
     * @return a data atual do sistema no formato horas:minutos:segundos
     */
    public static String getHoraAtual(){
        return ZonedDateTime.now().toString().substring(11,19);
    }
    
    /**
     * Este método recebe como argumento um campo texto, com um valor em reais, e retorna o valor
     * em moeda, com duas casas decimais.
     * @param campoTexto uma instância da classe JTextField que encapsula um valor em reais
     * @return o valor com duas duas casas decimais correspondente ao valor passado como argumento
     */
    public static String valorComDuasCasasDecimais(JTextField campoTexto){
        double valorEstimado = Double.parseDouble(campoTexto.getText().replace(".", "").replace(",", ".").replace("R","").replace("$", ""));
        return retornaValorComDuasCasas(valorEstimado);
    }
    
    /**
     * Este método recebe como argumento um texto e retorna esse texto sem
     * acentos.
     * 
     * @param str o texto a ser modificado
     * @return o texto passado como argumento, sem acentos
     */
    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
    
    /**
     * Este método retorna um cep, consultando a API do site viacep.com.br.
     * 
     * @param uf o uf do endereço
     * @param cidade a cidade do endereço
     * @param logradouro o logradouro do endereço
     * @param bairro o bairro do endereço
     * @return o cep do endereço
     */
    public static String getCep(String uf, String cidade, String logradouro, String bairro) {
        String json; // representa o arquivo json retornado pela api
      
        try {
            URL url = new URL("https://viacep.com.br/ws/" + uf + "/" + deAccent(cidade) + "/" + deAccent(logradouro) + "/json");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestProperty("accept", "application/json");
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            json = json.replace("{", "");
            json = json.replaceAll("\"", "");
            json = json.replaceAll(" ", "");
            json = json.replaceAll(":", "");

            json = json.replaceAll("cep", "");
            json = json.replaceAll("logradouro", "");
            json = json.replaceAll("complemento", "");
            json = json.replaceAll("bairro", "");
            json = json.replaceAll("localidade", "");
            json = json.replaceAll("uf", "");
            json = json.replaceAll("ibge", "");
            json = json.replaceAll("gia", "");
            json = json.replaceAll("ddd", "");
            json = json.replaceAll("siafi", "");

            String[] ceps;
            ceps = json.split("},");
                   
            for (String cep : ceps) {
                String[] endereco;
                endereco = cep.split(",");
                String texto1 = endereco[3].toLowerCase().replaceAll("[^\\p{ASCII}]", "");
                String texto2 = bairro.toLowerCase().replaceAll("[^\\p{ASCII}]", ""); 
                if (texto1.equals(texto2)) {
                    return endereco[0].replace("[", "");
                }
            }
        } catch (IOException | java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());            
        } 
        return "     -   ";
    }
    
    /**
     * @return um número flutuante aletório entre 0 e 100
     */
    public static double getAleatorio() {
        Random random = new Random();
        return random.nextDouble() * 100;
    }
    
    /**
     * Recebe como argumento uma String representando um data e retorna um tipo
     * Date correspondente a essa data.
     * @param date a data em formato de texto
     * @return a mesma data no formato Date
     * @throws java.text.ParseException se não for possível fazer o parse, ParseException
     * será lançada.
     */
    public static Date stringDateForDate(String date) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatadaAbertura = formato.parse(date);
        return dataFormatadaAbertura;
    }
    
    /**
     * Recebe como argumento um valor flutuante e retorna uma String, representando
     * esse valor com duas casas decimais (o arrendondamento segue o padrão da
     * calculadora do windows).
     * @param valor o valor a ser arrendodado
     * @return uma string representando o valor com duas casas decimais
     */
    public static String retornaValorComDuasCasas(double valor) {
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        return String.format("%.2f", bd.doubleValue());
    }
    
    /**
     * Verifica se o dia da semana atual é segunda-feira.
     * @return retorna true se hoje for segunda feira, false caso contrário
     */
    public static boolean isMonday() {
        return Calendar.DAY_OF_WEEK == Calendar.MONDAY;
    }
    
    /**
     * Soma um dia data passada como argumento e retorna essa nova data.
     * @param data a data que se deseja somar um dia
     * @return uma nova data, representando o dia seguinte ao passado como argumento
     */
    public static java.util.Date somaUmDiaData(java.util.Date data) {
        String dataFormatada = formataData(data);
        String[] diaMesAno = dataFormatada.split("/");
        LocalDate data1 = LocalDate.of(Integer.parseInt(diaMesAno[2]), Integer.parseInt(diaMesAno[1]), Integer.parseInt(diaMesAno[0])); // ou LocalDate.now() para a data atual
        data1 = data1.plusDays(1);
        return Date.from(data1.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    /**
     * Retorna o dia útil anterior à data passada como argumento.
     * 
     * @param data a data para o cálculo do dia útil anterior
     * @return uma data representando o dia útil anterior à data passada como argumento
     */
    public static java.util.Date retornaPenultimoDiaUtil(java.util.Date data) {
        String dataFormatada = formataData(data);
        String[] diaMesAno = dataFormatada.split("/");

        LocalDate data1 = LocalDate.of(Integer.parseInt(diaMesAno[2]), Integer.parseInt(diaMesAno[1]), Integer.parseInt(diaMesAno[0])); // ou LocalDate.now() para a data atual

        if (isMonday()) { // se dia atual for segunda-feira
            data1 = data1.plusDays(-3);
        } else {
            data1 = data1.plusDays(-1);
        }

        return Date.from(data1.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    /**
     * Recebe como argumento uma string e retorna o número de linhas dessa string.
     * @param texto o texto que se deseja saber o número de linhas
     * @return o número de linhas do texto passado como argumento
     */
    public static int contaLinhasTexto(String texto) {
        char array[] = new char[texto.length()];
        texto.getChars(0, array.length, array, 0);
        int linhas = 0, colunas = 0, aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '\n') {
                linhas++;
                if (aux > colunas) {
                    colunas = aux;
                }
                aux = 0;
            } else {
                aux++;
            }
        }
        return linhas;
    }
    
    /**
     * Recebe uma data do tipo Date e retorna uma String, correspondente a essa
     * data, no formato dd/MM/yyyy.
     * 
     * @param data a data que se deseja formatar
     * @return uma string correspondente à data passada como argumento, no formato
     * dd/MM/yyyy
     */
    public static String formataData(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(data);
        return dataFormatada;
    }
    
    /**
     * Recebe como argumento uma data do tipo Date e retorna uma String, correspondente
     * a essa data, no formato yyyy-MM-dd (banco de dados)
     * @param data
     * @return 
     */
    public static String formataDataBanco(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = dateFormat.format(data);
        return dataFormatada;
    }
    
    /**
     * Recebe uma string representando um cpf ou cnpj e retorna esse cpf ou cnpj
     * formatado com pontos e traços.
     * @param cpf o cpf ou cnpj a ser formatado
     * @return o cpf ou cnpj formatado com pontos e traços
     * @throws java.text.ParseException se não for possível possível fazer o parser
     * será lançada a exceção ParseException.
     */
    public static String formataCpf(String cpf) throws ParseException {
        MaskFormatter mask = new MaskFormatter("###.###.###-##");
        MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
        mask.setValueContainsLiteralCharacters(false);
        maskCnpj.setValueContainsLiteralCharacters(false);
        if (cpf.length() == 11) { // se for cpf
            return mask.valueToString(cpf);
        } else { // senão, será cnpj
            return maskCnpj.valueToString(cpf);
        }
    }
    
    /**
     * Rebece como argumento uma data e retorna true, se a data for futura, ou false
     * caso contrário.
     * @param systemDate a data que queremos verificar se é futura
     * @return true se data for futura (ainda não ocorreu) ou false, caso contrário
     */
    public static boolean isFutureDate(String systemDate) {
        String currentDate = retornaDataAtual();

        int currentMonth = Integer.parseInt(currentDate.substring(3, 5));
        int currentDay = Integer.parseInt(currentDate.substring(0, 2));

        int systemMonth = Integer.parseInt(systemDate.substring(3, 5));
        int systemDay = Integer.parseInt(systemDate.substring(0, 2));

        if (currentMonth < systemMonth) {
            return true;
        } else if (currentDay < systemDay) {
            return true;
        }

        return false;
    }
    
    /**
     * @return Retorna uma String que corresponde à data atual do sistema, no formato
     * dd/MM/yyyy
     */
    public static String retornaDataAtual() {
        Date dataAtual = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataAtual);
        return dataFormatada;
    }
    
    /**
     * Recebe como argumento uma data do tipo Date e retorna uma String, correspondente 
     * a essa data, no formato dd/MM/yyyy.
     * @param date a data no formato Date
     * @return uma String correspondente à data passada como argumento, no padrão
     * dd/MM/yyyy
     */
    public static String dateForStringDate(Date date) {
        String dataFormatada = "";
        if(date!=null){ // formata a data que não seja nula
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataFormatada = dateFormat.format(date);
        }
        return dataFormatada;
    }
    
    /**
     * Recebe como argumento a idade de uma pessoa e retorna o ano de nascimento
     * dessa pessoa.
     * @param idade a idade da pessoa
     * @return uma string correspondendo ao ano de nascimento da pessoa
     */
    public static String anoDeNascimento(int idade) {
        GregorianCalendar hoje = new GregorianCalendar();
        int anoAtual = hoje.get(Calendar.YEAR);
        return (anoAtual - idade) + "";
    }
    
    /**
     * Recebe como argumento um número, correspondente a um posto de atendimento da
     * Credinova, e retorna o nome da cidade que contém esse posto de atendimento.
     * @param pa o posto de atendimento
     * @return o nome da cidade que contém o posto de atendimento informado
     */
    public static String cidadeExtenso(int pa) {
        String cidadeExtenso = "Nova Serrana, ";
        switch (pa) {
            case 1:
                cidadeExtenso = "Perdigão, ";
                break;
            case 3:
                cidadeExtenso = "Papagaios, ";
                break;
            case 6:
                cidadeExtenso = "Paraopeba, ";
                break;
            case 7:
                cidadeExtenso = "Sete Lagoas, ";
                break;
            case 8:
                cidadeExtenso = "Juazeiro do Norte, ";
                break;
        }
        return cidadeExtenso;
    }
  
    
    /**
     * @return retorna a data por extenso correspondente ao dia atual e à cidade de Nova
     * Serrana.
     */
    public static String dataPorExtenso() {
        Date dataAtual = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataAtual);
        String mes = dataFormatada.substring(3, 5);

        switch (mes) {
            case "01":
                mes = "janeiro";
                break;
            case "02":
                mes = "fevereiro";
                break;
            case "03":
                mes = "março";
                break;
            case "04":
                mes = "abril";
                break;
            case "05":
                mes = "maio";
                break;
            case "06":
                mes = "junho";
                break;
            case "07":
                mes = "julho";
                break;
            case "08":
                mes = "agosto";
                break;
            case "09":
                mes = "setembro";
                break;
            case "10":
                mes = "outubro";
                break;
            case "11":
                mes = "novembro";
                break;
            case "12":
                mes = "dezembro";
                break;
        }

        return cidadeExtenso((int) 0) + dataFormatada.substring(0, 2) + " de " + mes + " de " + dataFormatada.substring(6, 10);
    }
}
