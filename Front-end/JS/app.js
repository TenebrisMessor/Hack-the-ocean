const boton = document.querySelector('#publicar').addEventListener('click',publicarPost)

function publicarPost(){
    let titulo = document.getElementById('titulo').value;
    let lugar = document.getElementById('lugar').value;
    let personas = document.getElementById('cantidadp').value;
    let descripcion = document.getElementById('descripción').value;

    addPost(titulo,lugar,personas,descripcion)
}
