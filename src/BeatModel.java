import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;

// NOSSO MODELO CONCRETO 

public class BeatModel implements BeatModelInterface, MetaEventListener {

	private  Sequencer sequencer;
	private ArrayList<BeatObserver> beatObservers;
	private ArrayList<BPMObserver> bpmObservers ;
	
	private int bpm = 90;
	
	public BeatModel() {
		beatObservers = new ArrayList<BeatObserver>();
		bpmObservers = new ArrayList<BPMObserver>();
	}
	
	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() {
		/*setUpMidi();
		buildTrackAndStart();*/
	}

	@Override
	public void on() {
		sequencer.start();		
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(bpm);
		 notifyBPMObserver();
	}

	public void notifyBPMObserver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBPM() {
		return this.bpm;
	}

	@Override
	public void registerObserver(BeatObserver beatObserver) {
		this.beatObservers.add(beatObserver);		
	}

	@Override
	public void removeObserver(BeatObserver beatObserver) {
		this.beatObservers.remove(beatObserver);
	}

	@Override
	public void registerObserver(BPMObserver bpmObserver) {
		this.bpmObservers.add(bpmObserver);
	}

	@Override
	public void removeObserver(BPMObserver bpmObserver) {
		this.bpmObservers.remove(bpmObserver);
	}

	public Sequencer getSequencer() {
		return sequencer;
	}

	public void setSequencer(Sequencer sequencer) {
		this.sequencer = sequencer;
	}

	public ArrayList<BeatObserver> getBeatObservers() {
		return beatObservers;
	}

	public void setBeatObservers(ArrayList<BeatObserver> beatObservers) {
		this.beatObservers = beatObservers;
	}

	public ArrayList<BPMObserver> getBpmObservers() {
		return bpmObservers;
	}

	public void setBpmObservers(ArrayList<BPMObserver> bpmObservers) {
		this.bpmObservers = bpmObservers;
	}
	
	public void beatEvent(){
		// notifyBeatObserver();
	}

}
