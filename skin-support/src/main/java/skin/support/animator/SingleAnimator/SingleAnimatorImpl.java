package skin.support.animator.SingleAnimator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import skin.support.animator.Action;
import skin.support.animator.SkinAnimator;

/**
 * Created by erfli on 2/25/17.
 */

public abstract class SingleAnimatorImpl implements SkinAnimator {
    @Override
    public abstract SkinAnimator apply(@NonNull View view, @Nullable Action action);

    @Override
    public SkinAnimator setPreDuration() {
        return this;
    }

    @Override
    public SkinAnimator setAfterDuration() {
        return this;
    }

    @Override
    public SkinAnimator setDuration() {
        return this;
    }

    @Override
    public abstract void start();
}
