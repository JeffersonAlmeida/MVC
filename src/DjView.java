import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// NOSS CONTROLADOR 

public class DjView implements ActionListener, BeatObserver, BPMObserver{

	private BeatModelInterface model;
	private ControllerInterface controller;
	
	private JFrame view;
	private JPanel viewPanel;
	//private BeatBar beatBar;
	private JLabel bpmOutPutLabel;
	
	public void createView(){
		// criar todos os componentes aqui
	}
	
	public DjView(ControllerInterface controllerInterface, BeatModelInterface beatModelInterface) {
		this.controller = controllerInterface;
		this.model = beatModelInterface;
	}
	
	public void updateBPM(){
		int bpm = model.getBPM();
		if(bpm==0){
			bpmOutPutLabel.setText("Offline");
		}else{
			bpmOutPutLabel.setText("Current BPM : " + model.getBPM());
		}
	}
	
	public void updateBeat(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public BeatModelInterface getModel() {
		return model;
	}

	public void setModel(BeatModelInterface model) {
		this.model = model;
	}

	public ControllerInterface getController() {
		return controller;
	}

	public void setController(ControllerInterface controller) {
		this.controller = controller;
	}
	public JFrame getView() {
		return view;
	}
	public void setView(JFrame view) {
		this.view = view;
	}
	public JPanel getViewPanel() {
		return viewPanel;
	}
	public void setViewPanel(JPanel viewPanel) {
		this.viewPanel = viewPanel;
	}
	public JLabel getBpmOutPutLabel() {
		return bpmOutPutLabel;
	}
	public void setBpmOutPutLabel(JLabel bpmOutPutLabel) {
		this.bpmOutPutLabel = bpmOutPutLabel;
	}
	
	
}
