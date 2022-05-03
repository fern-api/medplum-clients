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
    as = ImmutableSpecimenDefinition_Additive.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_Additive {
  Optional<Reference> additiveReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> additiveCodeableConcept();

  Optional<String> id();

  static ImmutableSpecimenDefinition_Additive.Builder builder() {
    return ImmutableSpecimenDefinition_Additive.builder();
  }
}
