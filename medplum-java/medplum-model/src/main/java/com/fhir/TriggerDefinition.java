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
    as = ImmutableTriggerDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TriggerDefinition {
  Optional<Reference> timingReference();

  Optional<Timing> timingTiming();

  Optional<List<DataRequirement>> data();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Expression> condition();

  Optional<String> name();

  Optional<String> timingDate();

  Optional<TriggerdefinitionType> type();

  Optional<String> timingDateTime();

  static ImmutableTriggerDefinition.Builder builder() {
    return ImmutableTriggerDefinition.builder();
  }
}
