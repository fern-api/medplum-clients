package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<UnsignedInt> offset();

  Optional<List<Timing_repeatWhenItem>> when();

  Optional<String> id();

  Optional<Decimal> durationMax();

  Optional<Decimal> periodMax();

  Optional<List<Time>> timeOfDay();

  Optional<Decimal> duration();

  Optional<Range> boundsRange();

  Optional<Duration> boundsDuration();

  Optional<PositiveInt> frequencyMax();

  Optional<Decimal> period();

  Optional<PositiveInt> countMax();

  Optional<Timing_repeatPeriodunit> periodUnit();

  Optional<List<Code>> dayOfWeek();

  Optional<Timing_repeatDurationunit> durationUnit();

  Optional<PositiveInt> frequency();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Period> boundsPeriod();

  Optional<PositiveInt> count();

  static ImmutableTiming_Repeat.Builder builder() {
    return ImmutableTiming_Repeat.builder();
  }
}
