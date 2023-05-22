package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Formatador {

    /**
     * Garante que mesmo se o usuário utilizar uma vírgula em vez do ponto no valor do produto
     *
     * @param pString
     * @return double
     */
    public double converterVirgulaParaPonto(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
    
    /**
     * Garante que mesmo se o usuário usar a barra errada, o código ainda funcionará
     * @param pString
     * @return 
     */
    public String inverteBarra(String pString) {
        String retorno = new String();
        if (pString != null) {
            for (int i = 0; i < pString.length(); i++) {
                if (pString.charAt(i) == '\\') {
                    retorno += '/';
                } else {
                    retorno += pString.charAt(i);
                }
            }
        }
        return retorno;
    }

    /**
     * Garante que a data esteja em "Dia/Mes/Ano"
     *
     * @param pData
     * @return
     * @throws Exception
     */
    public java.sql.Date formatarData(Date pData) throws Exception {
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = formatarDate.format(pData);
        if (pData == null || pData.equals("")) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(dataString)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     * Formatar data brasil
     * @param pData
     * @return 
     */
    public String formatarDataBR(Date pData) {
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        return formatarDate.format(pData);
    }
    
    /**
     * Formatar data para salvar no banco
     * @param pData
     * @return 
     */
    public String formatarDataBanco(Date pData) {
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");
        return formatarDate.format(pData);
    }
    
    /**
     * Formatar data string para data date
     * @param data
     * @return
     * @throws Exception 
     */
    public java.sql.Date converterDataStringParaDate(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }
}
