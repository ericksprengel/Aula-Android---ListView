# Aula Android - ListView

1. BaseAdapterActivity está exibindo apenas o nome e foto do contato. Os outros campos (telefone, email e idade) estão errados.
  1. Por quê? 
  2. Altere o código para exibir o telefone, email e idade do contato corretamente.
2. BaseAdapterActivity possui um botão "ADICIONAR CONTATO", no entanto esta ação não está funcionando.
  1. Procure o método "void add(Contato contato)" no ContatoBaseAdapter e implemente-o para que um novo contato seja adicionado ao clicar no botão
  2. O método "public void onClick(View v)" é chamado ao clicar no botão "ADICIONAR CONTATO". Altere a chamada para "Snackbar.make" para exibir o nome do contato criado ao invés da mensagem de TODO.
3. Entendendo os clicks.
  1. Qual a diferença dos métodos "onItemClick" e "onClick" encontrados na BaseAdapterActivity?
  2. Estes métodos pertencem à class BaseAdapterActivity, à interface AdapterView.OnItemClickListener ou à interface View.OnClickListener?
