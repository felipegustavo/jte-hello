@param gg.jte.Content content
@param edu.ifba.hello.dto.Page page = null

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${page == null ? "Página Inícial" : page.title()}</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
  
    <header>
        <h1>Header site</h1>
    </header>

    <main>
        ${content}
    </main>

    <footer>
        <h2>Rodapé site</h2>
    </footer>

</body>
</html>
    
