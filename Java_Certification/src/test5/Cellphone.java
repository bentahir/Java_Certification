package test5;

public class Cellphone {
	String mName;
	String mModel;
	Battery mBattery;
	
		
	public Cellphone(String name, String model, Battery battery) {
		mName = name;
		mModel = model;
		mBattery = battery;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getModel() {
		return mModel;
	}

	public void setModel(String model) {
		mModel = model;
	}

	public Battery getBattery() {
		return mBattery;
	}

	public void setmBattery(Battery battery) {
		mBattery = battery;
	}

	public static class Battery{
		int mDuration;

		public Battery(int duration) {
			mDuration = duration;
		}

		public int getDuration() {
			return mDuration;
		}

		public void setDuration(int duration) {
			mDuration = duration;
		}
	}
}
