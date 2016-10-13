package br.com.ericksprengel.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class ArrayAdapterActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        List<Contato> contatos = Contato.getContatos();

        ArrayAdapter adapter = new ArrayAdapter<Contato>(this, R.layout.array_adapter_activity_item, R.id.nome, contatos);
        setListAdapter(adapter);

        // adicionando um contato dinamicamente.
        adapter.add(Contato.gerarContato());
    }
}
