const principal = document.getElementById("posts");
async function carregarPosts(qtdPosts) {
    const response = await fetch('https://jsonplaceholder.typicode.com/todos/1')
    const posts = await response.json();
    for (let i = 0; i < qtdPosts; i++){
        adicionaPost(posts[i])
    }
}

function adicionaPost(posts) {
    const postagem =`
    <article>
        <h2>${posts.title}</h2>
        <p>${posts.body}</p>
    </article>
    `;
    principal.innerHTML += postagem;
}

carregarPosts(10);