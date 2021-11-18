<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

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
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/entregas.css">

    <title>Entregas</title>
</head>

<body>
    <div class="dashboard-container">
        <header id="header">
            <!-- Navbar mobile -->
            <nav class="navbar-mobile">
                <div class="bx" id="bx"></div>
                <div class="nav-mobile-logo">
                    <img src="../assets/ifood-logo.svg" alt="">
                </div>
            </nav>

            <!-- Menu mobile -->
            <nav class="menu-mobile" id="menu-mobile">
                <ul class="nav-list-mobile">
                    <li><a href="" class="nav-link-mobile">Pedidos</a></li>
                    <li><a href="" class="nav-link-mobile">Fornecedores</a></li>
                    <li><a href="" class="nav-link-mobile">Entregas</a></li>
                </ul>
            </nav>
        </header>

        <aside>
            <div class="aside-container">
                <img class="aside-logo" src="../assets/ifood-logo.svg" alt="">
            </div>

            <nav class="aside-menu">
                <div class="aside-menu-items">
                    <div class="aside-menu-items-icon">
                        <svg width="22" height="26" viewBox="0 0 22 26" fill="#3E3E3E" xmlns="http://www.w3.org/2000/svg">
                            <path d="M11 0.8125C8.42554 0.8125 6.3125 2.92554 6.3125 5.5V6.4375H1.68359L1.625 7.31641L0.6875 24.1914L0.628906 25.1875H21.3711L21.3125 24.1914L20.375 7.31641L20.3164 6.4375H15.6875V5.5C15.6875 2.92554 13.5745 0.8125 11 0.8125ZM11 2.6875C12.5527 2.6875 13.8125 3.94727 13.8125 5.5V6.4375H8.1875V5.5C8.1875 3.94727 9.44727 2.6875 11 2.6875ZM3.44141 8.3125H6.3125V11.125H8.1875V8.3125H13.8125V11.125H15.6875V8.3125H18.5586L19.3789 23.3125H2.62109L3.44141 8.3125Z"/>
                            </svg>
                    </div>
                    <a href="/challenge-ifood/dashboard">Pedidos</a>
                </div>

                <div class="aside-menu-items">
                    <div class="aside-menu-items-icon">
                        <svg width="30" height="22" viewBox="0 0 30 22" fill="#3E3E3E" xmlns="http://www.w3.org/2000/svg">
                            <path d="M0 0.625V2.5H17.8125V16.5625H12.041C11.6235 14.9512 10.1733 13.75 8.4375 13.75C6.70166 13.75 5.25147 14.9512 4.83398 16.5625H3.75V11.875H1.875V18.4375H4.83398C5.25147 20.0488 6.70166 21.25 8.4375 21.25C10.1733 21.25 11.6235 20.0488 12.041 18.4375H19.834C20.2515 20.0488 21.7017 21.25 23.4375 21.25C25.1733 21.25 26.6235 20.0488 27.041 18.4375H30V10.791L29.9414 10.6445L28.0664 5.01953L27.8613 4.375H19.6875V0.625H0ZM0.9375 4.375V6.25H9.375V4.375H0.9375ZM19.6875 6.25H26.5137L28.125 11.0547V16.5625H27.041C26.6235 14.9512 25.1733 13.75 23.4375 13.75C21.7017 13.75 20.2515 14.9512 19.834 16.5625H19.6875V6.25ZM1.875 8.125V10H7.5V8.125H1.875ZM8.4375 15.625C9.48486 15.625 10.3125 16.4526 10.3125 17.5C10.3125 18.5474 9.48486 19.375 8.4375 19.375C7.39014 19.375 6.5625 18.5474 6.5625 17.5C6.5625 16.4526 7.39014 15.625 8.4375 15.625ZM23.4375 15.625C24.4849 15.625 25.3125 16.4526 25.3125 17.5C25.3125 18.5474 24.4849 19.375 23.4375 19.375C22.3901 19.375 21.5625 18.5474 21.5625 17.5C21.5625 16.4526 22.3901 15.625 23.4375 15.625Z"/>
                            </svg>
                    </div>
                    <a href="fornecedores.jsp">Fornecedores</a>
                </div>

                <div class="aside-menu-items menu-active">
                    <div class="aside-menu-items-icon">
                        <svg class="menu-icon-active" width="30" height="21" viewBox="0 0 30 21" fill="#3E3E3E" xmlns="http://www.w3.org/2000/svg">
                            <path d="M17.8125 0.625V1.97266L17.9004 2.14844L18.8672 4.375H10.7227L10.4297 4.78516L7.88086 8.38867C7.31323 8.21289 6.71631 8.125 6.09375 8.125C2.7356 8.125 0 10.8569 0 14.2188C0 17.5806 2.73193 20.3125 6.09375 20.3125C9.29443 20.3125 11.9128 17.8259 12.1582 14.6875H15.3809L15.6738 14.2773L20.2441 7.53906L20.8594 8.94531C19.0393 10.0037 17.8125 11.9775 17.8125 14.2188C17.8125 17.5659 20.5591 20.3125 23.9062 20.3125C27.2534 20.3125 30 17.5659 30 14.2188C30 10.8716 27.2534 8.125 23.9062 8.125C23.4558 8.125 23.0127 8.17627 22.5879 8.27148L20.0684 2.5H22.9688C23.2361 2.5 23.4375 2.70142 23.4375 2.96875C23.4375 3.23608 23.2361 3.4375 22.9688 3.4375V5.3125C24.2505 5.3125 25.3125 4.25049 25.3125 2.96875C25.3125 1.68701 24.2505 0.625 22.9688 0.625H17.8125ZM7.5 1.5625V3.4375H13.125L12.1875 1.5625H7.5ZM12.627 6.25H18.8672L15.0879 11.8164L12.627 6.25ZM10.9863 7.1875L13.4473 12.8125H5.625V14.6875H10.2539C10.0159 16.7896 8.25806 18.4375 6.09375 18.4375C3.76831 18.4375 1.875 16.5442 1.875 14.2188C1.875 11.8933 3.76831 10 6.09375 10C7.55493 10 8.85132 10.7471 9.60938 11.875H11.7188C11.2683 10.7947 10.5286 9.86816 9.58008 9.20898L10.9863 7.1875ZM23.9062 10C26.2317 10 28.125 11.8933 28.125 14.2188C28.125 16.5442 26.2317 18.4375 23.9062 18.4375C21.5808 18.4375 19.6875 16.5442 19.6875 14.2188C19.6875 12.7429 20.4675 11.4575 21.6211 10.7031L23.5254 15.0684L25.2246 14.3066L23.3789 10.0586C23.5547 10.0366 23.7268 10 23.9062 10Z"/>
                            </svg>
                    </div>
                    <a href="entregas.jsp">Entregas</a>
                </div>
            </nav>
        </aside>

        <main class="main">
            <h1>Entregas</h1>
            <p>Confira no mapa abaixo as regiões que estão com maior demanda de pedidos.</p>

            <section class="card-beneficios">
                <div class="card-beneficios-infos">
                    <div class="row">
                        <div class="col-2">
                            <div class="card-beneficios-ilustracao">
                                <img src="../assets/delivery_illustration.png" alt="">
                            </div>
                        </div>
                        <div class="col-8">
                            <p>Ganhe benefícios ao fazer entregas fora da sua área de cobertura em regiões com alta demanda de pedidos.</p>
                        </div>
                        <div class="col-2">
                            <button class="btn btn-light button-align">Saiba mais</button>
                        </div>
                    </div>
                </div>
            </section>
            <section class="img-style">
                <img src="../assets/mapa.png" alt="">
            </section>
        </main>
    
</body>
</html>