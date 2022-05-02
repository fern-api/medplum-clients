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
  Optional<List<Extension>> extension();

  Optional<PositiveInt> count();

  Optional<Decimal> durationMax();

  Optional<Decimal> duration();

  Optional<List<Code>> dayOfWeek();

  Optional<Duration> boundsDuration();

  Optional<PositiveInt> frequencyMax();

  Optional<Decimal> periodMax();

  Optional<UnsignedInt> offset();

  Optional<List<Time>> timeOfDay();

  Optional<String> id();

  Optional<Period> boundsPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Timing_repeatDurationunit> durationUnit();

  Optional<Range> boundsRange();

  Optional<PositiveInt> frequency();

  Optional<PositiveInt> countMax();

  Optional<Decimal> period();

  Optional<Timing_repeatPeriodunit> periodUnit();

  Optional<List<Timing_repeatWhenItem>> when();

  static ImmutableTiming_Repeat.Builder builder() {
    return ImmutableTiming_Repeat.builder();
  }
}
