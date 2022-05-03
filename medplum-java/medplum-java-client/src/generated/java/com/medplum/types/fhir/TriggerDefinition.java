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
    as = ImmutableTriggerDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TriggerDefinition {
  Optional<String> timingDate();

  Optional<TriggerdefinitionType> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> timingReference();

  Optional<String> name();

  Optional<Expression> condition();

  Optional<String> timingDateTime();

  Optional<List<DataRequirement>> data();

  Optional<Timing> timingTiming();

  static ImmutableTriggerDefinition.Builder builder() {
    return ImmutableTriggerDefinition.builder();
  }
}
