package ti.popover;

import android.view.View;
import android.view.ViewGroup;

import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiUIView;

public class PopoverView extends TiUIView {

    TiCompositeLayout tl;
    View popView;

    public PopoverView(PopoverProxy popoverProxy) {
        super(popoverProxy);
        TiCompositeLayout.LayoutArrangement arrangement = TiCompositeLayout.LayoutArrangement.DEFAULT;
        tl = new TiCompositeLayout(proxy.getActivity(), arrangement);
    }

    public View getPopView() {
        return popView;
    }

    @Override
    public void add(TiUIView child) {
        popView = getNativeView(child.getProxy());
    }

    private View getNativeView(TiViewProxy viewProxy) {
        TiUIView view = viewProxy.getOrCreateView();
        View outerView = view.getOuterView();
        View nativeView = outerView != null ? outerView : view.getNativeView();
        ViewGroup parentViewGroup = (ViewGroup) nativeView.getParent();
        if (parentViewGroup != null) {
            parentViewGroup.removeAllViews();
        }
        return nativeView;
    }

}
