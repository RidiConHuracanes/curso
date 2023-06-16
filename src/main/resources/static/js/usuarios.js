// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){
     const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const usuarios = await request.json();

      console.log(usuarios);

    let usuario = '<tr><td>123</td><td>Rene Osorio</td><td>a@gmail.com</td><td>44867451</td><td>Salary</td><td><a href="a" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
    let a = "a";
    
document.querySelector('#usuarios tbody').outerHTML = a;

}
