package br.com.ericksprengel.listview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BaseAdapterActivity extends ListActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    ContatoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        List<Contato> contatos = Contato.getContatos();

        mAdapter = new ContatoAdapter(contatos, this);

        getListView().setOnItemClickListener(this);
        setListAdapter(mAdapter);

        findViewById(R.id.adicionar_contato_button).setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Contato contato = (Contato) getListAdapter().getItem(position);
        Snackbar.make(getListView(), contato.email, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.adicionar_contato_button:
                Contato contato = Contato.gerarContato();
                mAdapter.add(contato);
                Snackbar.make(getListView(), "TODO: crie um contato e adicione na lista.", Snackbar.LENGTH_LONG).show();
        }
    }

    class ContatoAdapter extends BaseAdapter {

        private final List<Contato> mContatos;
        private final LayoutInflater mInflater;


        public ContatoAdapter(List<Contato> contatos, Activity activity) {
            this.mContatos = contatos;
            this.mInflater = activity.getLayoutInflater();
        }

        @Override
        public int getCount() {
            return mContatos.size();
        }

        @Override
        public Object getItem(int pos) {
            return mContatos.get(pos);
        }

        @Override
        public long getItemId(int pos) {
            return 0;
        }

        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {

            ViewHolder holder;
            if(convertView == null) {
                convertView = mInflater.inflate(R.layout.base_adapter_activity_item, parent, false);
                holder = new ViewHolder();
                holder.nome = (TextView) convertView.findViewById(R.id.nome);
                holder.foto = (ImageView) convertView.findViewById(R.id.foto_imageview);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Contato contato = mContatos.get(pos);
            holder.nome.setText(contato.nome);
            holder.foto.setImageResource(contato.foto);
            // TODO: nome e foto? Está faltando atualizar outras informações: idade, email e telefone.

            return convertView;
        }

        public void add(Contato contato) {
            //  TODO: ao clicar no botão "Adicionar Contato" deve-se adicionar um novo contato na lista.
            //       Para isto será necessário criar o método "void add(Contato contato)"
            //       na classe ContatoAdapter e adicionar o novo contato na lista
            //       IMPORTANTE: chame o método "notifyDataSetChanged" para notificar o adapter que
            //           o conjunto de dados foi alterado.
        }
    }

    static class ViewHolder {
        TextView nome;
        ImageView foto;
    }
}