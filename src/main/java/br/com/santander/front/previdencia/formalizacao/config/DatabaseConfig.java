package br.com.santander.front.previdencia.formalizacao.config;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.santander.front.previdencia.simulacao.common.utils.StringsUteis;
import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class DatabaseConfig {
	
    /** Charset dos arquivos de credenciais. */
    private static final String DEFAULT_CHARSET = "UTF-8";

    /** URL de conexão à base de dados. */
    //@Value("${santander.zurich.renda.database.url}")
    private String url  = System.getenv().get("DATABASE_URL");

    /** Diretório com as credenciais do usuário. */
    @Value("${santander.zurich.renda.database.credenciais.diretorio}")
    private String diretorioCredenciais;

    /** Arquivo com o usuário para acesso à base de dados. */
    @Value("${santander.zurich.renda.database.credenciais.us}")
    private String arquivoUsuario;

    /** Arquivo com a senha do usuário para acesso à base de dados. */
    @Value("${santander.zurich.renda.database.credenciais.senha}")
    private String arquivoSenha;
    
    
    private String usuario; 
    private String senha;
    

    @Bean
    DataSource dataSource() throws SQLException, IOException {
        File dirCredenciais = new File(diretorioCredenciais);
        if (!dirCredenciais.exists()) {
            throw new IllegalStateException(
                    "Diretório com os arquivos de usuário e senha não encontrado. [" + diretorioCredenciais + "]");
        }

        File fileUsuario = new File(dirCredenciais, arquivoUsuario);
        if (!fileUsuario.exists()) {
            throw new IllegalStateException("Arquivo com o usuário não encontrado. [" + fileUsuario + "]");
        }

        File fileSenha = new File(dirCredenciais, arquivoSenha);
        if (!fileSenha.exists()) {
            throw new IllegalStateException("Arquivo com a senha não encontrado. [" + fileSenha + "]");
        }

        usuario = FileUtils.readFileToString(fileUsuario, DEFAULT_CHARSET);
        senha = FileUtils.readFileToString(fileSenha, DEFAULT_CHARSET);
        String strClazz = getClass().getCanonicalName();
        //
        usuario = StringsUteis.FormatStringDefault(usuario, strClazz);
        senha   = StringsUteis.FormatStringDefault(senha  , strClazz);
        url     = StringsUteis.FormatStringDefault(url    , strClazz);
        //
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(usuario) ; // nxbatchre
        dataSource.setPassword(senha); // homologa
        dataSource.setURL(url); // "jdbc:oracle:thin:@oraho022.santander.com.br:1529:oraho022";

        //dataSource.setUser("kiprevproc"); // nxbatch
        //dataSource.setPassword("kiprevproc"); // homologa
        //dataSource.setURL("jdbc:oracle:thin:@orapi114.santander.com.br:1521:orapi114"); // "jdbc:oracle:thin:@oraho022.santander.com.br:1529:oraho022";
                         
        
        return dataSource;
    }

    
}
