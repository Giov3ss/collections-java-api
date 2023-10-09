package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaslist;

    public ListaTarefa() {
        this.tarefaslist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaslist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaslist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaslist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaslist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaslist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.obterDescricoesTarefas();
    }
}
