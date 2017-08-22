
public class PlusTenObserver extends Observer {
	public PlusTenObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	
	}

	@Override
	public void update() {
		System.out.println("Plus Ten : "+(10+(subject.getState())));
	}
}
