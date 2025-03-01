@param edu.ifba.hello.dto.Page page

@template.layout.main(content = @`
    <h1>Teste</h1>
`, 
page = page)


<!--
    <ul>
    @for (int i = 1; i < 21; i++)
    
      <li>${i} é ${i % 2 == 0 ? "Par" : "Impar"}</li>

      <li>${i} é @if (i % 2 == 0) Par @else Impar @endif</li>

    @endfor
    </ul>
-->