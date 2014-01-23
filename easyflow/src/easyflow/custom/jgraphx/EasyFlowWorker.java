package easyflow.custom.jgraphx;

import java.util.List;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

import easyflow.ui.DefaultProject;

public class EasyFlowWorker extends SwingWorker<Integer, String> {

	DefaultProject defaultProject = null;	
	JProgressBar progressBar = null;
	private final Informable informable;
	
	public EasyFlowWorker(DefaultProject defaultProject, Informable informable) {
		super();
		this.informable = informable;
		this.defaultProject = defaultProject;
	}

	public EasyFlowWorker(Informable informable) {
		super();
		this.informable = informable;
	}
	
	public DefaultProject getDefaultProject() {
		return defaultProject;
	}

	public void setDefaultProject(DefaultProject defaultProject) {
		this.defaultProject = defaultProject;
	}

	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}

	public Informable getInformable() {
		return informable;
	}

	@Override
	public Integer doInBackground() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected void process(List<String> chunks) {
		for(String message : chunks){
			informable.messageChanged(message);
		}
	}
	
	public interface Informable {
	    void messageChanged(String message);
	}
}
