<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Msepulvedas curriculum</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Custom Google font-->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@100;200;300;400;500;600;700;800;900&amp;display=swap" rel="stylesheet" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" />
    </head>
    <body class="d-flex flex-column h-100 bg-light">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-light bg-white py-3">
                <div class="container px-5">
                    <a class="navbar-brand"><span class="fw-bolder text-primary">Msepulvedas web</span></a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0 small fw-bolder">
                            <li class="nav-item"><a class="nav-link" href=<c:url value="/"/>>Inicio</a></li>
                            <li class="nav-item"><a class="nav-link" href=<c:url value="/curriculum"/>>Curriculum</a></li>
                            <li class="nav-item"><a class="nav-link" href=<c:url value="/proyectos"/>>Proyectos</a></li>
                            <li class="nav-item"><a class="nav-link" href="mailto:moisessepseg@gmail.com">Contacto</a></li>
                    </div>
                </div>
            </nav>
            <!-- Page Content-->
            <div class="container px-5 my-5">
                <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Curriculum</span></h1>
                </div>
                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-11 col-xl-9 col-xxl-8">
                        <!-- Experience Section-->
                        <section>
                            <div class="d-flex align-items-center justify-content-between mb-4">
                                <h2 class="text-primary fw-bolder mb-0">Experiencia laboral</h2>
                                <!-- Download resume button-->
                                <!-- Note: Set the link href target to a PDF file within your project-->
                                <a class="btn btn-primary px-4 py-3" href="#!">
                                    <div class="d-inline-block bi bi-download me-2"></div>
                                    Descargar CV pdf
                                </a>
                            </div>
                            <!-- Experience Card 1-->
                            <c:forEach var="experienciaTemp" items="${experiencia}">
                            <div class="card shadow border-0 rounded-4 mb-5">
                                <div class="card-body p-5">
                                    <div class="row align-items-center gx-5">
                                        <div class="col text-center text-lg-start mb-4 mb-lg-0">
                                            <div class="bg-light p-4 rounded-4">
                                                <div class="text-primary fw-bolder mb-2">${experienciaTemp.fecha}</div>
                                                <div class="small fw-bolder">${experienciaTemp.puesto}</div>
                                                <div class="small text-muted">${experienciaTemp.localizacion}</div>
                                            </div>
                                        </div>
                                        <div class="col-lg-8"><div>${experienciaTemp.descripcion}</div></div>
                                    </div>
                                </div>
                            </div>
                            </c:forEach>
                        </section>
                        <!-- Education Section-->
                        <section>
                            <h2 class="text-primary fw-bolder mb-4">Estudios</h2>
                            <c:forEach var="estudioTemp" items="${estudio}">
                            <!-- Education Card 1-->
                            <div class="card shadow border-0 rounded-4 mb-5">
                                <div class="card-body p-5">
                                    <div class="row align-items-center gx-5">
                                        <div class="col text-center text-lg-start mb-4 mb-lg-0">
                                            <div class="bg-light p-4 rounded-4">
                                                <div class="text-primary fw-bolder mb-2">${estudioTemp.fecha}</div>
                                                <div class="mb-2">
                                                    <div class="small fw-bolder">${estudioTemp.centro}</div>
                                                    <div class="small text-muted">${estudioTemp.localizacion}</div>
                                                </div>
                                                <div class="fst-italic">
                                                    <div class="small text-muted">${estudioTemp.titulo}</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-8"><div>${estudioTemp.descripcion}</div></div>
                                    </div>
                                </div>
                            </div>
                             </c:forEach>
                        </section>
                        <!-- Divider-->
                        <div class="pb-5"></div>
                        <!-- Skills Section-->
                        <section>
                            <!-- Skillset Card-->
                            <div class="card shadow border-0 rounded-4 mb-5">
                                <div class="card-body p-5">
                                    <!-- Professional skills list-->
                                    <div class="mb-5">
                                        <div class="d-flex align-items-center mb-4">
                                            <div class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 me-3"><i class="bi bi-tools"></i></div>
                                            <h3 class="fw-bolder mb-0"><span class="text-gradient d-inline">Habilidades</span></h3>
                                        </div>                   
                                        <div class="row row-cols-1 row-cols-md-3 mb-4">
                                            <c:forEach var="habilidadTemp" items="${habilidad}">
                                            	<div class="col mb-4 mb-md-0"><div class="d-flex align-items-center bg-light rounded-4 p-3 h-100">${habilidadTemp.habilidad}</div></div>
                                           	</c:forEach>
                                        </div>                              
                                    </div>
                                    <!-- Languages list-->
                                    <div class="mb-0">
                                        <div class="d-flex align-items-center mb-4">
                                            <div class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 me-3"><i class="bi bi-code-slash"></i></div>
                                            <h3 class="fw-bolder mb-0"><span class="text-gradient d-inline">Tecnologias</span></h3>
                                        </div>
                                        <div class="row row-cols-1 row-cols-md-3 mb-4">
                                            <c:forEach var="tecnologiaTemp" items="${tecnologia}">
                                            	<div class="col mb-4 mb-md-0"><div class="d-flex align-items-center bg-light rounded-4 p-3 h-100">${tecnologiaTemp.tecnologia}</div></div>
                                        	</c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </main>
        <!-- Footer-->
        <footer class="bg-white py-4 mt-auto">
        <div class="container px-5">
                <div class="row align-items-center justify-content-between flex-column flex-sm-row">
                    <div class="col-auto"><div class="small m-0">&copy; Msepulvedas Web</div></div>
                    <div class="col-auto">
                        <a class="small" href="mailto:moisessepseg@gmail.com">Contacto</a>
                    </div>
                </div>
            </div>
        </footer>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
