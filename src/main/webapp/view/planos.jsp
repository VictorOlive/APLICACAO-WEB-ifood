<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>  
<%@ page import="br.com.fiap.ifood.entities.Plano" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

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
    <link rel="stylesheet" href="css/planos.css">

    <title>Plano Cadastro</title>
</head>

<body>
    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="assets/ifood-logo.svg" alt="">
        </a>
    </nav>
    <nav class="redBar">
    </nav>
    <div class="planosStyle">
        <div>
            <h1>Planos iFood</h1>
            <h3>Seleciona o plano ideal para sua loja.</h3>
        </div>
    </div>
    <div class="container">
        <form action="/challenge-ifood/planos" method="post">
            <div class="row justify-content-center">
                <c:forEach items="${planos}" var="p">
                    <div class="col-6 col-xl-6 cardStyle">
                        <h1><img src="/assets/basic_plan.png" alt=""><c:out value="${p.nmPlano}" /></h1>
                        <h2><img src="/assets/check.png" alt="">Sua loja no app do iFood</h2>
                        <h2><img src="/assets/check.png" alt="">Entrega feita peal sua loja</h2>
                        <h2><img src="/assets/check.png" alt="">Vantagens do Chef: descontos e benefícios exclusivos</h2>
                        <div class="linhaStyle">
                        </div>
                        <h3><c:out value="${p.vlComisao}" />%</h3>
                        <h4>Comissão sobre pedidos</h4>
                        <h3><c:out value="${p.vlTaxa}" />%</h3>
                        <h4>Taxa para pedidos pagos via iFood</h4>
                        <h3>R$<c:out value="${p.vlMensalidade}" />/mês </h3>
                        <h5>1° mês grátis</h5>
                        <h4>Mensalidade para faturamento acima de R$1800</h4>
                        <input type="hidden" name="idPlano" value="<c:out value='${p.cdPlano}'/>">
                        <button type="submit">Selecionar</button>
                    </div>
                </c:forEach>
            </div>
        </form>
    </div>

</body>

</html>