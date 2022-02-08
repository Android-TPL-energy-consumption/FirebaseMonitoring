package tpl.monitoring.template.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import tpl.monitoring.template.R;
import tpl.monitoring.template.databinding.FragmentScreenSlidePageBinding;

public class ScreenSlidePageFragment extends Fragment {
    private final int _position;

    public ScreenSlidePageFragment(int position) {
        this._position = position;
    }

    public int _getFragmentIcon() {
        switch (this._position) {
            case 0:
                return R.drawable.ic_baseline_home_24;
            case 1:
                return R.drawable.ic_baseline_star_24;
            case 2:
                return R.drawable.ic_baseline_airplanemode_active_24;
            case 3:
                return R.drawable.ic_baseline_favorite_24;
            case 4:
                return R.drawable.ic_baseline_battery_charging_full_24;
            default:
                return R.drawable.ic_launcher_background;
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentScreenSlidePageBinding binding = FragmentScreenSlidePageBinding.inflate(inflater);
        binding.slideLogo.setImageResource(_getFragmentIcon());
        return binding.getRoot();
    }
}
