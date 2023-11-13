package br.com.fiap.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.fiap.model.UtilizaveisProjeto;

public class API {

    // método para API
    public UtilizaveisProjeto getUtilizaveisProjeto(String cep, double pesoToneladas, double alturaMetros, double comprimentoMetros,
            double larguraMetros, int qtdCargaExtra, String categoriaTarifaria, String tipoProblema,
            String localProblema) throws ClientProtocolException, IOException {

        UtilizaveisProjeto utilizaveis = null;

        // Com o HttpPost fazemos a requisição
        HttpPost request = new HttpPost("https://eduardoshoiti.pythonanywhere.com/api/predict");

        // Adiciona os parâmetros da requisição
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Peso_Toneladas", String.valueOf(pesoToneladas)));
        params.add(new BasicNameValuePair("Altura_Metros", String.valueOf(alturaMetros)));
        params.add(new BasicNameValuePair("Comprimento_Metros", String.valueOf(comprimentoMetros)));
        params.add(new BasicNameValuePair("Largura_Metros", String.valueOf(larguraMetros)));
        params.add(new BasicNameValuePair("Qtd_Carga_Extra", String.valueOf(qtdCargaExtra)));
        params.add(new BasicNameValuePair("Categoria_Tarifaria", categoriaTarifaria));
        params.add(new BasicNameValuePair("Tipo_Problema", tipoProblema));
        params.add(new BasicNameValuePair("Local_Problema", localProblema));

        request.setEntity(new UrlEncodedFormEntity(params));

        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        // Para obter a resposta
        CloseableHttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();

        if (entity != null) {

            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            utilizaveis = gson.fromJson(result, UtilizaveisProjeto.class);
        }

        return utilizaveis;
    }
}

