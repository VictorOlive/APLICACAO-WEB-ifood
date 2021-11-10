<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>  
<%@ page import="br.com.fiap.ifood.entities.Plano" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
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
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/informacoes.css">

    <title>Informações </title>
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
        <form action="/challenge-ifood/loja" method="post">
            <div class="form-group">
                <div class="formStyle">
                    <h1>Informações loja</h1>
                    <h4>Preencha abaixo as informações sobre a sua futura loja no iFood com os dados do seu negócio</h4>
                    <label for="cnpj">CNPJ</label>
                    <input type="text" class="form-control" placeholder="XX.XXX.XXX/XXXX-XX" name="cnpj">
                    <label for="razaoSocial">Razão Social</label>
                    <input type="text" class="form-control" placeholder="Razão Social" name="razaoSocial">
                    <label for="nomeLoja">Nome da Loja (como aparecerá no app)</label>
                    <input type="text" class="form-control" placeholder="Nome" name="nome">
                    <label for="telefone">Telefone ou celular da loja</label>
                    <input type="tel" class="form-control" placeholder="Telefone" name="celularOuTelefone">
                    <label for="sspecialidade">Especialidade</label>
                    <select class="selectStyle "name="cdEspecialidade">
                        <c:forEach items="${especialidades}" var="e">
                            <option value="<c:out value='${e.cdEspecialidade}'/>"><c:out value="${e.nmEspecialidade}" /></option>
                        </c:forEach>
                    </select>
                    <label for="pedidos">Quantos pedidos, em média, seu restaurante suporta atender simultaneamente em 1h?</label>
                    <input type="number" class="form-control" placeholder="20" name="mediaPedidoPorHora">
                    <label for="ingredientes">Insira os ingredientes que mais utiliza em seu cardápio</label>
                    <textarea class="textAreaStyle" name="ingredientes" cols="78" rows="6" placeholder="Tomate, Arroz, Feijão, Queijo"></textarea>
                    <br>
                    <button>Continuar</button>

                </div>
            </div>
        </form>
    </div>
</body>

</html>