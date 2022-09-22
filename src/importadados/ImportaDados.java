package importadados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ImportaDados {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Cadastro> bd = new ArrayList<Cadastro>();

        //ler arquivo
        ler_arquivo_gerar_bd("dados_novos.csv",bd);
        bd.sort(null);
        Interface t = new Interface(bd);
        t.setVisible(true);
        
       

    }

    private static void ler_arquivo_gerar_bd(String arqLeitura, ArrayList<Cadastro> bd) throws FileNotFoundException, IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura,StandardCharsets.ISO_8859_1)); 

        String linha = buffRead.readLine();
        
        //linha = buffRead.readLine();
        while (linha != null) {
            String vet[] = linha.split(",");
            bd.add(new Cadastro(vet[0],  vet[1],  vet[2],  vet[3],  vet[4],
                                vet[5],  vet[6]));
            
        linha = buffRead.readLine();  
        }
        buffRead.close();
    }

    private static void escrever_arquivo(String arquivo, ArrayList<Cadastro> bd) throws IOException {

        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, true));

        for (int i = 0; i < bd.size(); i++) {
            buffWrite.append(bd.get(i).toString()+"\n");
        }
          
        buffWrite.close();
    }

}
