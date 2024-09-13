package exercicio6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String json = "{\"nome\":\"Mirella\",\"idade\":\"20\",\"cidade\":\"São Paulo\"}";

        Gson gson = new Gson();
//      Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}
