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
  Optional<Decimal> durationMax();

  Optional<Timing_repeatPeriodunit> periodUnit();

  Optional<UnsignedInt> offset();

  Optional<PositiveInt> frequency();

  Optional<Decimal> periodMax();

  Optional<String> id();

  Optional<Duration> boundsDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Code>> dayOfWeek();

  Optional<PositiveInt> countMax();

  Optional<Period> boundsPeriod();

  Optional<Decimal> duration();

  Optional<List<Timing_repeatWhenItem>> when();

  Optional<Range> boundsRange();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> count();

  Optional<PositiveInt> frequencyMax();

  Optional<List<Time>> timeOfDay();

  Optional<Decimal> period();

  Optional<Timing_repeatDurationunit> durationUnit();

  static ImmutableTiming_Repeat.Builder builder() {
    return ImmutableTiming_Repeat.builder();
  }
}
