/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmi.models;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author David
 */
public class CodeLang {
	
	private int questionID;
	private int highLevelLandID;
	private String programCode;
    
    
public CodeLang(String data) {
        //Transforma a string recebida pelo pedido http para json
        JsonParser jsonParser = new JsonParser();
        JsonObject CodeLang = (JsonObject) jsonParser.parse(data);
        //Exibe os dados, em formato json
        System.out.println(CodeLang.entrySet());
        /**
         *
         * Revalidar TUDO, formatos, campos vazios, TUDO!!
         *
         */
        validateData();
        //Associa os dados ao objecto Question
        this.questionID = CodeLang.get("questionID").getAsInt(); //ir buscar o max id da bd + 1 
        this.highLevelLandID = CodeLang.get("highLevelLandID").getAsInt();
        this.programCode = CodeLang.get("programCode").getAsString();
        
		}


    // converts a java object to JSON format,
    // and returned as JSON formatted string
    @Override
    public String toString() {
        Gson gson = new Gson();

        String json = gson.toJson(this);
        System.out.println("json \n" + json);
        return json;
    }

    private void validateData() {
        /**
         * Se estiver tudo OK, inserer na BD,
         */
        }

    
    
    
}
