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
    as = ImmutableImmunization_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Immunization_Performer {
  Optional<CodeableConcept> function();

  Reference actor();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableImmunization_Performer.ActorBuildStage builder() {
    return ImmutableImmunization_Performer.builder();
  }
}
