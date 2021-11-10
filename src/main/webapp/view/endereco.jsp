<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>  
<%@ page import="br.com.fiap.ifood.entities.Plano" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/endereco.css">

    <title>Endereço Cadastro</title>
</head>

<body>
    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="assets/ifood-logo.svg" alt="">
        </a>
    </nav>
    <nav class="redBar">
    </nav>
    <div class="conteinerForm">
        <form action="/challenge-ifood/endereco" method="post">
            <div class="form-group">
                <div class="formStyle">
                    <h1>Endereço da loja</h1>
                    <h4>Preencha as informações de endereço da sua loja.</h4>
                    <label for="name">CEP</label>
                    <input type="text" class="form-control" placeholder="00000-000" name="cep">
                    <div class="row">
                        <div class="col">
                            <label for="estado">Estado</label>
                            <br>
                            <select class="selectStyle" name="estados-brasil">
                                <option value="AC">Acre</option>
                                <option value="AL">Alagoas</option>
                                <option value="AP">Amapá</option>
                                <option value="AM">Amazonas</option>
                                <option value="BA">Bahia</option>
                                <option value="CE">Ceará</option>
                                <option value="DF">Distrito Federal</option>
                                <option value="ES">Espírito Santo</option>
                                <option value="GO">Goiás</option>
                                <option value="MA">Maranhão</option>
                                <option value="MT">Mato Grosso</option>
                                <option value="MS">Mato Grosso do Sul</option>
                                <option value="MG">Minas Gerais</option>
                                <option value="PA">Pará</option>
                                <option value="PB">Paraíba</option>
                                <option value="PR">Paraná</option>
                                <option value="PE">Pernambuco</option>
                                <option value="PI">Piauí</option>
                                <option value="RJ">Rio de Janeiro</option>
                                <option value="RN">Rio Grande do Norte</option>
                                <option value="RS">Rio Grande do Sul</option>
                                <option value="RO">Rondônia</option>
                                <option value="RR">Roraima</option>
                                <option value="SC">Santa Catarina</option>
                                <option value="SP">São Paulo</option>
                                <option value="SE">Sergipe</option>
                                <option value="TO">Tocantins</option>
                                <option value="EX">Estrangeiro</option>
                            </select>
                        </div>
                        <div class="col">
                            <label for="cidade">Cidade</label>
                            <input type="text" placeholder="Cidade" class="form-control" name="cidade">
                        </div>
                    </div>
                    <label for="bairro">Bairro</label>
                    <input type="text" placeholder="Bairro" class="form-control" name="bairro">
                    <label for="endereco">Endereço</label>
                    <input type="text" placeholder="Endereço" class="form-control" name="endereco">
                    <div class="row">
                        <div class="col">
                            <label for="numero">Numero</label>
                            <input type="number" placeholder="Numero" class="form-control" name="numero">
                        </div>
                        <div class="col">
                            <label for="complemento">Complemento(opcional)</label>
                            <input type="text" placeholder="Complemento" class="form-control" name="complemento">
                        </div>
                    </div>
                    <button type="submit">Continuar</button>

                </div>
            </div>
        </form>
    </div>
</body>

</html>