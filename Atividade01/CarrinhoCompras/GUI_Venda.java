package CarrinhoCompras;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class GUI_Venda {
	public void createGUI() {

		ControladorRealizarVenda controller = new ControladorRealizarVenda();

		JFrame frame = new JFrame("Carrinho de Compras");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 100);

		JPanel panel = new JPanel();

		JButton addItemCarrinho = new JButton("Adicionar Item ao Carrinho");
		JButton totalVenda = new JButton("Totalizar Venda");
		JButton addPagamento = new JButton("Adicionar Pagamento");

		panel.add(addItemCarrinho);
		panel.add(totalVenda);
		panel.add(addPagamento);// Adds Button to content pane of frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.setVisible(true);

		// FUNÇÕES DE CLICK DOS BOTÕES.
		addItemCarrinho.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//TODO: FORMA DE SELECIONAR OS ITEMS A SEREM ADICIONADOS.
				//Sale carrinho = controller.adicionartItem(null, 0);
				//System.out.println("Item adicionado ao carrinho: " + carrinho );
			}
		});

		totalVenda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.totalizarVenda();
			}
		});

		addPagamento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.adicionarPagamento();
			}
		});

	}

}