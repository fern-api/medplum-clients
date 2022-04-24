package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTiming_Repeat.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Timing_Repeat {
  Optional<decimal> duration();

  Optional<String> id();

  Optional<positiveInt> frequency();

  Optional<Timing_repeatPeriodunit> periodUnit();

  Optional<positiveInt> count();

  Optional<List<code>> dayOfWeek();

  Optional<List<Extension>> modifierExtension();

  Optional<unsignedInt> offset();

  Optional<List<Timing_repeatWhenItem>> when();

  Optional<decimal> periodMax();

  Optional<Range> boundsRange();

  Optional<positiveInt> countMax();

  Optional<Duration> boundsDuration();

  Optional<Period> boundsPeriod();

  Optional<decimal> durationMax();

  Optional<Timing_repeatDurationunit> durationUnit();

  Optional<positiveInt> frequencyMax();

  Optional<List<Extension>> extension();

  Optional<decimal> period();

  Optional<List<time>> timeOfDay();

  static ImmutableTiming_Repeat.Builder builder() {
    return ImmutableTiming_Repeat.builder();
  }
}
