@import edu.ifba.hello.dto.UserDTO
@import java.util.List
@import edu.ifba.hello.dto.ErrorResponse

@param UserDTO user = new UserDTO()
@param List<ErrorResponse> errors = null

@template.layout.main(content = @`
<form action="/user/save" method="post">

    <label for="name">Nome: </label>
    <input type="text" name="name" id="name" value="${user.getName()}">

    <label for="email">Email: </label>
    <input type="text" name="email" id="email" value="${user.getEmail()}">

    <!--<input type="hidden" name="id" value="${user.getId()}">-->

    <button type="submit">Enviar</button>

</form>

@if (errors != null)

<ul>
    @for (ErrorResponse e : errors)
        <li><b>Campo ${e.getField()}</b> teve o erro 
        <span style="color: red;">${e.getMessage()}</span></li>        
    @endfor
</ul>

@endif

`)