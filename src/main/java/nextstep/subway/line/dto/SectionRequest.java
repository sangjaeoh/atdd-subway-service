package nextstep.subway.line.dto;

import nextstep.subway.line.domain.Section;
import nextstep.subway.station.domain.Station;

public class SectionRequest {

    private Long upStationId;
    private Long downStationId;
    private int distance;

    public SectionRequest() {
    }

    public SectionRequest(Long upStationId, Long downStationId, int distance) {
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }

    public Section toSection(Station upStation, Station downStation) {
        return new Section.Builder()
                .upStation(upStation)
                .downStation(downStation)
                .distance(distance)
                .build();
    }
}
