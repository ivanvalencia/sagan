package sagan.guides;

import lombok.Data;

@Data
public class Tutorial extends AbstractGuide {

    private final int page;

    public Tutorial(GuideMetadata metadata, ContentProvider<Tutorial> contentProvider, ImageProvider imageProvider) {
        this(metadata, contentProvider, imageProvider, 0);
    }

    public Tutorial(GuideMetadata metadata, ContentProvider<Tutorial> contentProvider, ImageProvider imageProvider,
                    int page) {
        super(metadata, contentProvider, imageProvider);
        this.page = page;
    }

}
