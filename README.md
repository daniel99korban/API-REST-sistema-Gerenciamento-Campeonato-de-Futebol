# API-REST-sistema-Gerenciamento-Campeonato-de-Futebol
Desenvolvimento de uma API REST para um fragmento de um sistema de Gerenciamento de Campeonato de Futebol

validations no dto
input/ClienteRequest.java
output/ClienteResponse.java
<!-- 
// usarmapping, e mapper(exemplo adapter, @component) uma dependencia externa para o dto(expor apenas algumas informações) converter dto em entidade e entidade em dto
como o modelMappwer não pertence ao spring
temos que criar uma classe para poder configurar a injeção do adapter @Bean
fica em config/ModelMapperConfig.java

bivalidation dependencia para validação tratar validation nos dtos ex.: @NotBlank 

ver jackson e swagger do spring
pasta onde fica o dto
api/dto
pastas dentro do dto
dt/input
  exemploRequest.java
dto/output
  exemploResponse.java

cache: feito a nivel de serviços
é aplicada com biblioteca
-->
