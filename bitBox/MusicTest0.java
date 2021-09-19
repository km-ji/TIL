package bitBox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest0 {
	public static void main(String[] args) {
		MusicTest0 mt=new MusicTest0();
		mt.play();
	}
	private void play() {
		Sequencer sequencer=null;
		sequencer=MidiSystem.getSequencer();
		System.out.println("음악 재생 장치를 구했습니다.");
		
		if (sequencer !=null) {
			sequencer.close();
		}
	} 
}
