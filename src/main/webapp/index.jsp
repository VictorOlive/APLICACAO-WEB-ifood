<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html lang="PT-BR">

<head>
    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
    <link rel="stylesheet" href="css/index.css">
    <title>Challenge - iFood</title>
</head>

<body>
    <header class=" container-fluid navbar navbar-light">
        <a class="navbar-brand" href="#">
            <img src="assets/ifood-logo.svg" alt="">
        </a>
        <nav class="menu-item">
            <a href="https://portal.ifood.com.br/login">Portal do Parceiro</a>
        </nav>
    </header>
    
    <main class="bg-main">
        <div class="container-fluid h-100">
            <div class="row align-items-center h-100">
                <div class="col-12 col-md-6 mx-auto styleMax">
                    <h1>
                        60 milhões de
                        pedidos em 
                        apenas um mês
                    </h1>
                    <p>
                        Esse é o alcance das lojas parceiras do iFood.
                        Faça parte e alavanque suas vendas em São Paulo.
                    </p>
                </div>

                <div class="col-12 col-md-6 centerForm">
                    <form action="/challenge-ifood/endereco" method="get">
                        <div class="form-group">
                            <div class="formStyle">
                                <h3>Cadastre sua loja</h3>
                                <h4>Entre e ganhe 1 mês de mensalidade grátis!</h4>
                                <label for="name">Nome completo</label>
                                <input type="text" class="form-control">
                                <label for="email">E-mail</label>
                                <input type="email" class="form-control">
                                <label for="telefone">Celular (com DDD)</label>
                                <input type="tel" class="form-control">
                                <button> Cadastrar agora</button>
                                <h6>Esse site é protegido pelo reCAPTCHA e está sujeito à
                                    Política de Privacidade e aos Termos de Serviço do Google.
                                </h6>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </main>

</body>

</html>