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
    as = ImmutableObservationDefinition_QualifiedInterval.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ObservationDefinition_QualifiedInterval {
  Optional<Range> range();

  Optional<String> condition();

  Optional<List<Extension>> modifierExtension();

  Optional<Observationdefinition_qualifiedintervalGender> gender();

  Optional<List<Extension>> extension();

  Optional<Range> gestationalAge();

  Optional<Observationdefinition_qualifiedintervalCategory> category();

  Optional<List<CodeableConcept>> appliesTo();

  Optional<CodeableConcept> context();

  Optional<Range> age();

  Optional<String> id();

  static ImmutableObservationDefinition_QualifiedInterval.Builder builder() {
    return ImmutableObservationDefinition_QualifiedInterval.builder();
  }
}
