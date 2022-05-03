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
  Optional<Timing_repeatDurationunit> durationUnit();

  Optional<PositiveInt> countMax();

  Optional<Decimal> duration();

  Optional<List<Timing_repeatWhenItem>> when();

  Optional<List<Time>> timeOfDay();

  Optional<UnsignedInt> offset();

  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> frequency();

  Optional<PositiveInt> frequencyMax();

  Optional<Period> boundsPeriod();

  Optional<Decimal> durationMax();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Duration> boundsDuration();

  Optional<Range> boundsRange();

  Optional<Decimal> period();

  Optional<Timing_repeatPeriodunit> periodUnit();

  Optional<PositiveInt> count();

  Optional<Decimal> periodMax();

  Optional<List<Code>> dayOfWeek();

  static ImmutableTiming_Repeat.Builder builder() {
    return ImmutableTiming_Repeat.builder();
  }
}
