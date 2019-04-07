# DataLattesAPI

Repositório oficial do DataLattesAPI

O DataLattesAPI é uma biblioteca desenvolvida em Java responsável por extrair informações do Currículo Lattes extraído da Plataforma Lattes.

Ao baixar o currículo na plataforma Lattes ele possui o formato .zip, na sua extração é mostrado um arquivo .xml. Tanto o .zip quanto o .xml e suportado pelo DataLattesAPI

#### Exemplo de Codigo para buscar Artigos:

```java
import java.io.File;
import java.util.ArrayList;
import javax.xml.xpath.XPathExpressionException;

public class main {
	public static void main(String[] args) throws XPathExpressionException {
		// formato .zip
		File file = new File("home/0375745110240885.zip");
		// ou em formato .xml extraido do .zip
		File file2 = new File("home/curriculo.xml");
		//inicializa objeto
		DTapi dtapi = new DTapi(file);
		ArrayList<ArtigoPublicado> result = dtapi.getProducaoBibliograficaDao().ArtigoPublicado();
	}
}
```

#### Importando biblioteca via Maven:

```xml
<repositories>
   <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
   </repository>
</repositories>

<dependency>
   <groupId>com.github.weltonah</groupId>
      <artifactId>DataLattesAPI</artifactId>
   <version>43deb58db7</version>
</dependency>


```

#### Itens que podem ser extraidos utilizando DataLattesAPI:

###### Formação Profissional
```java
		result = dtapi.GeralDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .CurriculoLattes();  | Dados gerais do dono do curriculo, como nome, resumo, id cnpq, data de nascimento e etc.  | 

###### Atuação Profissional
```java
		result = dtapi.AtuacaoProfissionalDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .Vinculo();  | Vinculos profissionais com instituições, docência é incluida nesse item | 
| .DirecaoAdministracao();  | Cargos administrativos e de gestão  | 
| .Estagio();  | Experiência com Estagio | 
| .ServicoTecnicoEspecializado();  | Experiência em serviços tecnicos  | 
| .ExtensaoUniversitaria();  | Participação em projetos de extenso universitaria  | 
| .ConselhoComissaoConsultoria();  | Participação em conselhos e comissões  | 
| .Ensino();  | Atividades de ensino como por exemplo disciplinas ministradas  | 
| .TreinamentoMinistrado();  | Treinamentos ministrados | 
| .PesquisaDesenvolvimento();  | Pesquisas desenvolvidas  | 
| .ParticipacaoProjeto();  | Participação em projetos de pesquisas  | 

###### Participação de Banca
```java
		result = dtapi.BancaDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .BancaProfessorTitular();  | Participação de Banca de qualificação para professor titular  | 
| .BancaConcursoPublico();  | Participação de Banca de concurso publicos  | 
| .BancaAvaliacaoCurso();  | Participação de Banca de avaliação de curso  | 
| .BancaLivreDocencia();  | Participação de Banca de qualificação para livre docência  | 
| .BancaMestrado();  | Participação de Banca de Mestrado  | 
| .BancaDoutorado();  | Participação de Banca de Doutorado  | 
| .BancaQualificacaoDoutorado();  | Participação de Banca de qualificação para doutorado  | 
| .BancaQualificacaoMestrado();  | Participação de Banca de qualificação para Mestrado  | 
| .BancaGraduacao();  | Participação de Banca de graduação  | 
| .BancaAperfeicoamentoEspecializacao();  | Participação de Banca de formação em aperfeiçoamento ou especialização  | 

###### Participação de Evento
```java
		result = dtapi.EventoDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .EventoCongresso();  | Participação de Congresso  | 
| .EventoFeira();  | Participação de Feira  | 
| .EventoSeminario();  | Participação de Seminario  | 
| .EventoSimposio();  | Participação de Simposio  | 
| .EventoOficina();  | Participação de Oficina  | 
| .EventoEncontro();  | Participação de Encontro  | 
| .EventoExposicao();  | Participação de Exposição  | 
| .EventoOlimpiada();  | Participação de Olimpiadas  | 

###### Formação Profissional
```java
		result = dtapi.FormacaoDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .FormacaoGraduacao();  | Formação em andamento ou concluida de Graduação  | 
| .FormacaoEspecializacao();  | Formação em andamento ou concluida de Especialização  | 
| .FormacaoAperfeicoamento();  | Formação em andamento ou concluida de Aperfeiçoamento  | 
| .FormacaoCursoTecnico();  | Formação em andamento ou concluida de Curso Tecnico  | 
| .FormacaoEnsinoFundamental();  | Formação concluida de Ensino fundamental  | 
| .FormacaoEnsinoMedio();  | Formação concluida de Ensino medio | 
| .FormacaoMestrado();  | Formação em andamento ou concluida de Mestrado  | 
| .FormacaoDoutorado();  | Formação em andamento ou concluida de Doutorado  | 
| .FormacaoLivreDocencia();  | Titulo de Livre Docencia  | 
| .FormacaoPosDoutorado();  | Formação em andamento ou concluida de Pós-Doutorado  | 
| .FormacaoMestradoProfissionalizante();  | Formação em andamento ou concluida de Mestrado Profissionalizante  | 
| .FormacaoResidenciaMedica();  | Experiência em andamento ou concluida de Residencia Medica  | 

###### Orientação de alunos
```java
	  result = dtapi.OrientacaoDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .OrientacaoMestradoConcluido();  | Orientação de Mestrado Concluida  | 
| .OrientacaoDoutoradoConcluido();  | Orientação de Doutorado Concluida  | 
| .OrientacaoPosDoutoradoConcluido();  | Orientação de Pós-Doutorado Concluida  | 
| .OrientacaoGraduacaoConcluido();  | Orientação de Graduação Concluida  | 
| .OrientacaoAperfeicoamentoEspecializacaoConcluido();  | Orientação de Aperfeiçoamento e especialização Concluida | 
| .OrientacaoIniciacaoCientificaConcluido();  | Orientação de Iniciação ciêntifica Concluida  | 
| .OrientacaoMestradoAndamento();  | Orientação de Mestrado em andamento  | 
| .OrientacaoDoutoradoAndamento();  | Orientação de Doutorado em andamento  | 
| .OrientacaoPosDoutoradoAndamento();  | Orientação de Pós-Doutorado em andamento  | 
| .OrientacaoGraduacaoAndamento();  | Orientação de Graduação em andamento  | 
| .OrientacaoAperfeicoamentoEspecializacaoAndamento();  | Orientação de Aperfeiçoamento e especialização em andamento  | 
| .OrientacaoIniciacaoCientificaAndamento();  | Orientação de Iniciação ciêntifica em andamento  | 

###### Produção Artistica
```java
		result = dtapi.ProducaoArtisticaDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .PartituraMusical();  | Criação de Partitura Musical  | 
| .ApresentacaoDeObraArtistica();  | Apresentação de Obra Artistica   |
| .ApresentacaoEmRadioOuTv();  | Apresentação em radio ou Tv  |
| .ArranjoMusical();  | Criação de Arranjo musical   |
| .ComposicaoMusical();  | Criação de composição Musical   |
| .CursoDeCurtaDuracao();  | Ministração de curso de curta duração  |
| .ObraDeArtesVisuais();  | Criação de obra de artes vizuais   |
| .OutraProducaoArtisticaCultural();  | outros itens  |
| .Sonoplastia();  | Criação de sonoplastia  |
| .ArtesCenicas();  | Criação de Artes Cenicas   |
| .ArtesVisuais();  | Criação de Artes Visuais  |
| .Musica();  | Criação de Musica  |

###### Produção Bibliografica
```java
		result = dtapi.ProducaoBibliograficaDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .ArtigoPublicado();  | Produção de Artigo Publicado em Revista | 
| .ArtigoAceitoParaPublicacao();  | Produção de Artigo  aceito para publicação em Revista  | 
| .TrabalhoEmEventos();  | Apresentação de Trabalho em Evento  | 
| .LivroPublicadoOuOrganizado();  | Criação ou organização de livro  | 
| .CapituloDeLivroPublicado();  | Criação de capitulo de livro  | 
| .TextoEmJornalOuRevista();  | Publicação de texto em jornais ou revistas  | 
| .PrefacioPosfacio();  | Criação de pósfacio ou préfacio  | 
| .Traducao();  | Tradução de textos  | 

###### Produção Tecnica
```java
		result = dtapi.ProducaoTecnicaDao().// restante do codigo
```
| Codigo  | Item/Descrição |
| ------------- | ------------- |
| .CultivarRegistrada();  | Cultivação Registrada  | 
| .Software();  | Criação de Software  | 
| .Patente();  | Autoria de Patente  | 
| .CultivarProtegida();  | Cultivação Protegida  | 
| .DesenhoIndustrial();  | Criação de Desenho industrial | 
| .Marca();  | Criação de Marca  | 
| .TopografiaDeCircuitoIntegrado();  | Criação de topografia de circuito  | 
| .ProdutoTecnologico();  | Criação de produto tecnologico | 
| .ProcessosOuTecnicas();  | Criação de processo ou tecnica | 
| .TrabalhoTecnico();  | Criação de Trabalho tecnico  | 
| .ApresentacaoDeTrabalho();  | Apresentação de Trabalho  | 
| .CartaMapaOuSimilar();  | Criação de Carta ou Mapa  | 
| .CursoDeCurtaDuracaoMinistrado();  | Ministração de Curso de curta duração  | 
| .DesenvolvimentoDeMaterialDidaticoOuInstrucional();  | Criaço de material didatico | 
| .Editoracao();  | Processo de Editoração  | 
| .ManutencaoDeObraArtistica();  | Manutenção de Obra Artistica  | 
| .Maquete();  | Criação de Maquete  | 
| .OrganizacaoDeEvento();  | Organização de Evento | 
| .ProgramaDeRadioOuTv();  | Participação em programa de Radio ou Tv | 
| .RelatorioDePesquisa();  | Criação de Relatorio de Pesquisa | 
| .MidiaSocialWebsiteBlog();  | Publicação em midia social  | 





