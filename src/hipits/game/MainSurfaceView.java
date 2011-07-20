package hipits.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainSurfaceView extends SurfaceView implements SurfaceHolder {

	public MainSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCallback(Callback callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Surface getSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rect getSurfaceFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCreating() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Canvas lockCanvas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canvas lockCanvas(Rect dirty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCallback(Callback callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFixedSize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFormat(int format) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSizeFromLayout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setType(int type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unlockCanvasAndPost(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
