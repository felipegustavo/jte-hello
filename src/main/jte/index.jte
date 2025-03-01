@param java.util.List<String> items

@template.layout.main(content = @`
    @if (items.isEmpty())
    
        <p>A lista de itens está vazia</p>

    @else 
        <p>Lista de Itens contém ${items.size()} itens</p>
        <ul>
            @for (String item : items)
                <li>${item}</li>
            @endfor
        </ul>
    
    @endif
`)


<!--
    <ul>
    @for (int i = 1; i < 21; i++)
    
      <li>${i} é ${i % 2 == 0 ? "Par" : "Impar"}</li>

      <li>${i} é @if (i % 2 == 0) Par @else Impar @endif</li>

    @endfor
    </ul>
-->