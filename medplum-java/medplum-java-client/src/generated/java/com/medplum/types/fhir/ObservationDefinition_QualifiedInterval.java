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
    as = ImmutableObservationDefinition_QualifiedInterval.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ObservationDefinition_QualifiedInterval {
  Optional<List<CodeableConcept>> appliesTo();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> context();

  Optional<Range> age();

  Optional<String> id();

  Optional<Observationdefinition_qualifiedintervalCategory> category();

  Optional<Range> range();

  Optional<Observationdefinition_qualifiedintervalGender> gender();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> gestationalAge();

  Optional<String> condition();

  static ImmutableObservationDefinition_QualifiedInterval.Builder builder() {
    return ImmutableObservationDefinition_QualifiedInterval.builder();
  }
}
