import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
	public static void main(String[] args) {
		MusicTest1 mt=new MusicTest1();
		mt.play();
	}
	private void play() {
		Sequencer sequencer=null;
		try {
			sequencer=MidiSystem.getSequencer();
			System.out.println("음악 재생 장치를 구했습니다.");
		} catch(MidiUnavailableException e) {
			System.out.println("음악 재생 장치를 얻지 못했습닏.");
			e.printStackTrace();
		} 
		finally {
			if (sequencer !=null) {
				sequencer.close();
			}
			System.out.println("음악 재생 장치를 종료했습니다.");
		}
	}
}
