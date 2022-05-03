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
  Optional<String> id();

  Optional<Timing> timingTiming();

  Optional<Reference> timingReference();

  Optional<String> timingDateTime();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<DataRequirement>> data();

  Optional<Expression> condition();

  Optional<TriggerdefinitionType> type();

  Optional<String> timingDate();

  static ImmutableTriggerDefinition.Builder builder() {
    return ImmutableTriggerDefinition.builder();
  }
}
