package com.design.pattern.adapter;

/**
 * Adapter class. Adapts the interface of device ({@link FishingBoat}) into {@link RowingBoat}
 * interface expected by the client ({@link Captain}).
 *
 * @author zhangwei151
 * @date 2022/9/24 23:33
 */
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat fishingBoat;

    public FishingBoatAdapter(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
