<<<<<<< HEAD
package compsci290.edu.duke.imageviewer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;


/**
 * Created by LinLin on 1/14/2017.
 */

public class ImageGridActivity extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_imagegrid);

        // Get GridView from xml
        GridView gridView = (GridView) findViewById (R.id.grid_view);

        // Set Adapter for GridView
        gridView.setAdapter (new ImageAdapter (this));
    }

}
=======
package compsci290.edu.duke.imageviewer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by wendylau on 1/18/17.
 */

public class ImageGridActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_imagegrid);

        // Get GridView from xml
        GridView gridView = (GridView) findViewById (R.id.grid_view);

        // Set Adapter for GridView
        gridView.setAdapter (new ImageAdapter (this));
    }
}
>>>>>>> fa4a574a4b75d0444d386e12b96ccd177a1a4388
