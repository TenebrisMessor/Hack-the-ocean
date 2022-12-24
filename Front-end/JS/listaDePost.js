var listaPost = [];

function addPost(titulo,lugar,personas,descripcion){

    var newPost = {
        tit: titulo,
        place: lugar,
        people: personas,
        desc: descripcion
    };

    console.log(newPost)

    listaPost.push(newPost);
}